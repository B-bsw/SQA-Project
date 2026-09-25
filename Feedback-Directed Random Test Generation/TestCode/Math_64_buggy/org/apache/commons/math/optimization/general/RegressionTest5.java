package org.apache.commons.math.optimization.general;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        levenbergMarquardtOptimizer0.setOrthoTolerance(10.0d);
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double25 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker26);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int20 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 'a');
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray15 = new double[] { (-1.0f), 1.0d };
        double[] doubleArray18 = new double[] { 10.0f, 97 };
        double[] doubleArray20 = new double[] { Double.NaN };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray15, doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 'a');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        int int19 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int20 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int21 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        java.lang.Class<?> wildcardClass25 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int19 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) -1);
        double double21 = levenbergMarquardtOptimizer0.getRMS();
        double double22 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 2147483647);
        java.lang.Class<?> wildcardClass15 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction20 = null;
        double[] doubleArray21 = null;
        double[] doubleArray23 = new double[] { 1.0d };
        double[] doubleArray29 = new double[] { 'a', 100.0f, (byte) 0, 10, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair30 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction20, doubleArray21, doubleArray23, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 97.0d, 100.0d, 0.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(Double.NaN);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass25 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 32);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        java.lang.Class<?> wildcardClass15 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1.0f));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker18);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass10 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0L);
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNull(vectorialConvergenceChecker18);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        int int19 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker20);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = vectorialConvergenceChecker15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        int int23 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray24 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int19 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(32);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 32);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray16 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '#');
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int20 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double21 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int20 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        double double25 = levenbergMarquardtOptimizer0.getChiSquare();
        int int26 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 32);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(1.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10.0f);
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0.0f);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0.0f);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int19 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 52);
        int int20 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 35);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass15 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(10.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray16 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker13);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 10);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray17 = new double[] { (-1.0d), (byte) 1, 0L, 2147483647, 100.0d };
        double[] doubleArray21 = new double[] { 100L, (byte) 10, 100.0d };
        double[] doubleArray24 = new double[] { 1L, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction11, doubleArray17, doubleArray21, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 5 != 3");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 1.0d, 0.0d, 2.147483647E9d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int20 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray21 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        int int21 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int22 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        double double25 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) '4');
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int19 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass20 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int19 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker18);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        int int22 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int25 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(10.0d);
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(vectorialConvergenceChecker20);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int20 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass21 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 32);
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) '#');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1.0f);
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker18);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 2147483647);
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        java.lang.Class<?> wildcardClass23 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1.0f));
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) ' ');
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double18 = levenbergMarquardtOptimizer0.getRMS();
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        int int20 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker12);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        int int20 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        double double18 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1.0f);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction19 = null;
        double[] doubleArray22 = new double[] { Double.NaN, 52 };
        double[] doubleArray24 = new double[] { 'a' };
        double[] doubleArray25 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction19, doubleArray22, doubleArray24, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 2 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { Double.NaN, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 2147483647);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) ' ');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker19);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 35);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray18 = new double[] { (short) 10, 100.0f, (byte) 0, (short) 10, 52 };
        double[] doubleArray25 = new double[] { 97, 0.0d, 1.0f, 0L, (-1.0f), (-1) };
        double[] doubleArray27 = new double[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair28 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray18, doubleArray25, doubleArray27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 5 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 100.0d, 0.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 97.0d, 0.0d, 1.0d, 0.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction15 = null;
        double[] doubleArray20 = new double[] { 52, 100.0d, (short) 1, ' ' };
        double[] doubleArray27 = new double[] { ' ', (byte) 10, (-1), (short) 100, (byte) -1, 1.0f };
        double[] doubleArray28 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair29 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction15, doubleArray20, doubleArray27, doubleArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 4 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 52.0d, 100.0d, 1.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 32.0d, 10.0d, (-1.0d), 100.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        double double18 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setOrthoTolerance(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0.0f);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0.0f);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        double double19 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double21 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        java.lang.Class<?> wildcardClass28 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setMaxIterations(97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double19 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        int int22 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1.0f);
        java.lang.Class<?> wildcardClass27 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        int int20 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 32);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1.0f));
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker2);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 52);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) '4');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        java.lang.Class<?> wildcardClass14 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) -1);
        int int20 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass21 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        int int16 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        int int21 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 'a');
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int17 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(10.0d);
        double double20 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(97);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction17 = null;
        double[] doubleArray18 = null;
        double[] doubleArray23 = new double[] { 1, 1L, 10, '4' };
        double[] doubleArray24 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction17, doubleArray18, doubleArray23, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        double double22 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxEvaluations(32);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        java.lang.Class<?> wildcardClass10 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int16 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray16 = new double[] { (-1L), 52, (short) 1, 52, 100.0d };
        double[] doubleArray19 = new double[] { (byte) 1, '4' };
        double[] doubleArray23 = new double[] { 1L, 'a', 32 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction10, doubleArray16, doubleArray19, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 5 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 52.0d, 1.0d, 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 97.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction19 = null;
        double[] doubleArray24 = new double[] { 1, 100.0d, 2147483647, (byte) -1 };
        double[] doubleArray28 = new double[] { (byte) 10, 10, 10L };
        double[] doubleArray30 = new double[] { Double.NaN };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair31 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction19, doubleArray24, doubleArray28, doubleArray30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 4 != 3");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 100.0d, 2.147483647E9d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray22 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '#');
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int20 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction21 = null;
        double[] doubleArray27 = new double[] { 0L, (byte) 0, 2147483647, 100, 100L };
        double[] doubleArray34 = new double[] { (short) -1, (byte) 100, 100.0f, 1L, (short) 0, (-1.0d) };
        double[] doubleArray40 = new double[] { (byte) 10, 100L, '#', 2147483647, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair41 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction21, doubleArray27, doubleArray34, doubleArray40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 5 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 0.0d, 0.0d, 2.147483647E9d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { (-1.0d), 100.0d, 100.0d, 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d, 100.0d, 35.0d, 2.147483647E9d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1));
        int int20 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray14 = new double[] { ' ', (-1.0d) };
        double[] doubleArray18 = new double[] { 0.0f, 10.0f, 0.0f };
        double[] doubleArray24 = new double[] { 0.0d, 2147483647, '4', 1.0d, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction11, doubleArray14, doubleArray18, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 2 != 3");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 32.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d, 2.147483647E9d, 52.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0.0f);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        java.lang.Class<?> wildcardClass20 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 32);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction15 = null;
        double[] doubleArray22 = new double[] { 32, ' ', (short) -1, (byte) 100, 10.0f, (short) 1 };
        double[] doubleArray28 = new double[] { 100.0d, 0.0d, 10.0d, (byte) 0, (short) 100 };
        double[] doubleArray32 = new double[] { 2147483647, 'a', 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair33 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction15, doubleArray22, doubleArray28, doubleArray32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 6 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 32.0d, 32.0d, (-1.0d), 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d, 0.0d, 10.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 2.147483647E9d, 97.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 52);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray24 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int23 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int24 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 52);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker20);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int19 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        int int24 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 35);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int16 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        double double18 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 52);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        double double18 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0d));
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 10L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 52);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100.0f);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        int int17 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray17 = new double[] { 10.0d, (short) -1, (-1), (short) 1 };
        double[] doubleArray21 = new double[] { 52, '#', (-1L) };
        double[] doubleArray25 = new double[] { 10L, (-1), 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray17, doubleArray21, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 4 != 3");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 52.0d, 35.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker19);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0d));
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        int int18 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double19 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1L);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker13);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        int int21 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int22 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 52);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1L);
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 52);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1L);
        levenbergMarquardtOptimizer0.setMaxEvaluations(52);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        java.lang.Class<?> wildcardClass14 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertNull(vectorialConvergenceChecker12);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 10);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations(97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(vectorialConvergenceChecker18);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100);
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        java.lang.Class<?> wildcardClass19 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker19);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0d));
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int20 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass21 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double19 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        java.lang.Class<?> wildcardClass10 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        double double21 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        int int19 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        int int18 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker19);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100.0f);
        int int23 = levenbergMarquardtOptimizer0.getIterations();
        int int24 = levenbergMarquardtOptimizer0.getEvaluations();
        int int25 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1.0f);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        int int18 = levenbergMarquardtOptimizer0.getIterations();
        int int19 = levenbergMarquardtOptimizer0.getEvaluations();
        int int20 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction15 = null;
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        double[] doubleArray24 = new double[] { 1000, (-1.0d), (-1.0d), (short) 1, 1.0f, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction15, doubleArray16, doubleArray17, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1000.0d, (-1.0d), (-1.0d), 1.0d, 1.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0L);
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray18 = new double[] { 0L, Double.NaN, (short) 100, 'a', 100L };
        double[] doubleArray24 = new double[] { 100.0d, (short) 100, 0, (byte) 0, '#' };
        double[] doubleArray31 = new double[] { 32, 52, (short) 10, 0.0d, 0.0d, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair32 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray18, doubleArray24, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, Double.NaN, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d, 100.0d, 0.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 32.0d, 52.0d, 10.0d, 0.0d, 0.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(1.0d);
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction18 = null;
        double[] doubleArray23 = new double[] { 100.0f, 100.0d, 32, 2147483647 };
        double[] doubleArray25 = new double[] { 1 };
        double[] doubleArray28 = new double[] { (short) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair29 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction18, doubleArray23, doubleArray25, doubleArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 4 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 100.0d, 32.0d, 2.147483647E9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        int int17 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1.0f));
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        int int24 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker19);
        double double21 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass22 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        levenbergMarquardtOptimizer0.setOrthoTolerance(10.0d);
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 'a');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 52);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 52);
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(32);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        int int28 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 35);
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        int int20 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setMaxEvaluations(32);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker19);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1.0f));
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray16 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction13 = null;
        double[] doubleArray19 = new double[] { (-1), 0.0d, Double.NaN, ' ', (-1L) };
        double[] doubleArray22 = new double[] { (short) 0, 1L };
        double[] doubleArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction13, doubleArray19, doubleArray22, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 5 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d), 0.0d, Double.NaN, 32.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0d));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        int int20 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(Double.NaN);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '#');
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair10 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        double double24 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNull(vectorialConvergenceChecker29);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(32);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0d));
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction19 = null;
        double[] doubleArray20 = new double[] {};
        double[] doubleArray27 = new double[] { 0, (-1L), 100, 10.0f, 1, 100.0f };
        double[] doubleArray28 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair29 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction19, doubleArray20, doubleArray27, doubleArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 0 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 0.0d, (-1.0d), 100.0d, 10.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        double double21 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(35);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        java.lang.Class<?> wildcardClass14 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1000 + "'", int16 == 1000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        double[] doubleArray16 = new double[] { 1.0d, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction11, doubleArray12, doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        double double21 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int24 = levenbergMarquardtOptimizer0.getEvaluations();
        int int25 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double26 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction15 = null;
        double[] doubleArray17 = new double[] { (-1.0d) };
        double[] doubleArray20 = new double[] { 52, 10.0f };
        double[] doubleArray22 = new double[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction15, doubleArray17, doubleArray20, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 1 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 52.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray15 = new double[] { 97, 100.0f, (-1.0f) };
        double[] doubleArray20 = new double[] { Double.NaN, (-1L), Double.NaN, (short) 0 };
        double[] doubleArray26 = new double[] { 35, (short) 100, 1.0f, (short) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction11, doubleArray15, doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 3 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 97.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { Double.NaN, (-1.0d), Double.NaN, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 35.0d, 100.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
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
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 32);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double18 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(32);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray16 = new double[] { 1.0d, (byte) 100, 100.0d };
        double[] doubleArray22 = new double[] { (byte) 1, 100.0f, 10.0f, (-1.0f), 1 };
        double[] doubleArray25 = new double[] { 1L, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray16, doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 3 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 1.0d, 100.0d, 10.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int17 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 'a');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(Double.NaN);
        int int22 = levenbergMarquardtOptimizer0.getIterations();
        int int23 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(52);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        double double19 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        int int18 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker19);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction21 = null;
        double[] doubleArray25 = new double[] { 97, 0.0f, 10.0d };
        double[] doubleArray28 = new double[] { 10L, 0.0d };
        double[] doubleArray29 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair30 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction21, doubleArray25, doubleArray28, doubleArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 3 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 97.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        int int16 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1000 + "'", int16 == 1000);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        int int21 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int22 = levenbergMarquardtOptimizer0.getIterations();
        double double23 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setParRelativeTolerance(10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 32);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 32);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker12);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double19 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1.0f));
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((-1.0d));
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int20 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 100);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction25 = null;
        double[] doubleArray27 = new double[] { 2147483647 };
        double[] doubleArray34 = new double[] { (short) 10, (short) 10, 1, (short) 0, 100L, 100 };
        double[] doubleArray40 = new double[] { 100, (short) -1, 0, '4', 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair41 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction25, doubleArray27, doubleArray34, doubleArray40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 1 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 2.147483647E9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d, 10.0d, 1.0d, 0.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, (-1.0d), 0.0d, 52.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker20);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int19 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        int int22 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        int int18 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 'a');
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0.0f);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction23 = null;
        double[] doubleArray26 = new double[] { '#', 10.0f };
        double[] doubleArray27 = new double[] {};
        double[] doubleArray30 = new double[] { (-1), 35 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair31 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction23, doubleArray26, doubleArray27, doubleArray30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 2 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 35.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d), 35.0d }, 1.0E-15);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(10.0d);
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double18 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1L);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray12 = new double[] { 52, (byte) 1 };
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction9, doubleArray12, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 2 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 52.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        int int21 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 52);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1.0f);
        java.lang.Class<?> wildcardClass15 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        int int20 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker17);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        int int16 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(32);
        java.lang.Class<?> wildcardClass18 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1.0f));
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker22);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker21);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 10.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 32);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100);
        java.lang.Class<?> wildcardClass22 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        double double19 = levenbergMarquardtOptimizer0.getChiSquare();
        double double20 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNull(vectorialConvergenceChecker21);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        int int20 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int17 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) ' ');
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int22 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        int int30 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker31);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 1);
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass13 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10L);
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 0);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(10.0d);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 32);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '#');
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 32);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0.0f);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1.0f);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        int int19 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNull(vectorialConvergenceChecker18);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        int int20 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 35);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1.0f);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        int int18 = levenbergMarquardtOptimizer0.getIterations();
        int int19 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray14 = new double[] { 100.0d };
        double[] doubleArray19 = new double[] { (short) -1, (byte) 10, 2147483647, (-1) };
        double[] doubleArray23 = new double[] { (-1.0f), (short) 1, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray14, doubleArray19, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 1 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d), 10.0d, 2.147483647E9d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((-1.0d));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction23 = null;
        double[] doubleArray25 = new double[] { (byte) 100 };
        double[] doubleArray27 = new double[] { 0.0d };
        double[] doubleArray30 = new double[] { '#', 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair31 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction23, doubleArray25, doubleArray27, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 35.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1.0f));
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker19);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        int int18 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray21 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 32);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 32);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(Double.NaN);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int25 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setParRelativeTolerance(10.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 10);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1L);
        double double18 = levenbergMarquardtOptimizer0.getRMS();
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        double double20 = levenbergMarquardtOptimizer0.getChiSquare();
        int int21 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int22 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int24 = levenbergMarquardtOptimizer0.getIterations();
        java.lang.Class<?> wildcardClass25 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        int int21 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 'a');
        java.lang.Class<?> wildcardClass13 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        int int20 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(vectorialConvergenceChecker23);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1.0f);
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(Double.NaN);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((-1.0d));
        int int23 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 32);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        int int24 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1.0f);
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(vectorialConvergenceChecker18);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1.0f);
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(32);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0.0f);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }
}

