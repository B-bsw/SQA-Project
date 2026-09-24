package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 0, pointVectorValuePairConvergenceChecker1, (double) 35, (double) (byte) 0, (double) 10L, (double) 32);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer9 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(0.0d, (double) (short) 0);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep11 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 100);
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray12);
        double[] doubleArray14 = sigma13.getSigma();
        double[] doubleArray15 = sigma13.getSigma();
        double[] doubleArray16 = sigma13.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep18 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        double double19 = bracketingStep18.getBracketingStep();
        double[] doubleArray24 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma25 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray24);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula26 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker27 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver28 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula29 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker30 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver31 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer32 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula29, pointValuePairConvergenceChecker30, univariateSolver31);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker33 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver34 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer35 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula29, pointValuePairConvergenceChecker33, univariateSolver34);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker36 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver37 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner38 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer39 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula29, pointValuePairConvergenceChecker36, univariateSolver37, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner38);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer40 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula26, pointValuePairConvergenceChecker27, univariateSolver28, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner38);
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma42 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray41);
        double[] doubleArray43 = sigma42.getSigma();
        double[] doubleArray44 = sigma42.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula45 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker46 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver47 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula48 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker49 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver50 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer51 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula48, pointValuePairConvergenceChecker49, univariateSolver50);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker52 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver53 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer54 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula48, pointValuePairConvergenceChecker52, univariateSolver53);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker55 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver56 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner57 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer58 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula48, pointValuePairConvergenceChecker55, univariateSolver56, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner57);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer59 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula45, pointValuePairConvergenceChecker46, univariateSolver47, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner57);
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma61 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray60);
        double[] doubleArray62 = sigma61.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner63 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray64 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma65 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray64);
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma67 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray66);
        double[] doubleArray68 = identityPreconditioner63.precondition(doubleArray64, doubleArray66);
        double[] doubleArray69 = identityPreconditioner57.precondition(doubleArray62, doubleArray64);
        double[] doubleArray70 = identityPreconditioner38.precondition(doubleArray44, doubleArray62);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma71 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray62);
        double[] doubleArray72 = sigma71.getSigma();
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray73 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep11, sigma13, bracketingStep18, sigma25, sigma71 };
        simplexOptimizer9.parseOptimizationData(optimizationDataArray73);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.PointVectorValuePair pointVectorValuePair75 = levenbergMarquardtOptimizer6.optimize(optimizationDataArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula26 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula26.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula29 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula29.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula45 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula45.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula48 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula48.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(optimizationDataArray73);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator5, true, pointValuePairConvergenceChecker7);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker9);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep12 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray13 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep12 };
        simplexOptimizer10.parseOptimizationData(optimizationDataArray13);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray13);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer8.getStatisticsDHistory();
        int int17 = cMAESOptimizer8.getMaxEvaluations();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer20 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(0.0d, (double) (byte) -1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker28 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator26, true, pointValuePairConvergenceChecker28);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker30 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer31 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker30);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep33 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray34 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep33 };
        simplexOptimizer31.parseOptimizationData(optimizationDataArray34);
        cMAESOptimizer29.parseOptimizationData(optimizationDataArray34);
        simplexOptimizer20.parseOptimizationData(optimizationDataArray34);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray34);
        double[] doubleArray39 = cMAESOptimizer8.getUpperBound();
        java.util.List<java.lang.Double> doubleList40 = cMAESOptimizer8.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(optimizationDataArray13);
        org.junit.Assert.assertNotNull(realMatrixList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(optimizationDataArray34);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNotNull(doubleList40);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) 10, (double) (byte) 10);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer3.getIterations();
        int int9 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(100.0d, (double) (byte) 1);
        double[] doubleArray3 = simplexOptimizer2.getLowerBound();
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 1, pointVectorValuePairConvergenceChecker1, (double) 10.0f, (double) (byte) 1, (double) 0L, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker7);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getUpperBound();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getUpperBound();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 52, (double) (-1.0f), (double) (short) -1, 0.0d, (double) '4');
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getLowerBound();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getUpperBound();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getLowerBound();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula4 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker5 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver6 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer7 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula4, pointValuePairConvergenceChecker5, univariateSolver6);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker8 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula4, pointValuePairConvergenceChecker8, univariateSolver9);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker11 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver12 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer13 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula4, pointValuePairConvergenceChecker11, univariateSolver12);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker14 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer15 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula4, pointValuePairConvergenceChecker14);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker16 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer17 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula4, pointValuePairConvergenceChecker16);
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer31 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker32 = simplexOptimizer31.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer33 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker32);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(10, (double) 0L, false, (int) (byte) 10, (int) (short) -1, randomGenerator23, true, pointValuePairConvergenceChecker32);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer35 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula4, pointValuePairConvergenceChecker32);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula42 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker43 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver44 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer45 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker43, univariateSolver44);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker46 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver47 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer48 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker46, univariateSolver47);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker49 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver50 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer51 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker49, univariateSolver50);
        org.apache.commons.math3.random.RandomGenerator randomGenerator57 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer65 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker66 = simplexOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer67 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(10, (double) 0L, false, (int) (byte) 10, (int) (short) -1, randomGenerator57, true, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver69 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner70 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray71 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma72 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray71);
        double[] doubleArray73 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma74 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray73);
        double[] doubleArray75 = identityPreconditioner70.precondition(doubleArray71, doubleArray73);
        double[] doubleArray76 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma77 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray76);
        double[] doubleArray78 = sigma77.getSigma();
        double[] doubleArray79 = sigma77.getSigma();
        double[] doubleArray80 = new double[] {};
        double[] doubleArray81 = identityPreconditioner70.precondition(doubleArray79, doubleArray80);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer82 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker66, univariateSolver69, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner70);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer83 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 1, (double) 10L, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer84 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(100.0d, (double) 'a', (double) (byte) 1, (double) (short) 100, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver85 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer86 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula4, pointValuePairConvergenceChecker66, univariateSolver85);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer87 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 100, 1.0d, (double) '#', 35.0d, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer88 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker66);
        org.junit.Assert.assertTrue("'" + formula4 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula4.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker32);
        org.junit.Assert.assertTrue("'" + formula42 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula42.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker66);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double11 = levenbergMarquardtOptimizer5.getChiSquare();
        int int12 = levenbergMarquardtOptimizer5.getIterations();
        int int13 = levenbergMarquardtOptimizer5.getEvaluations();
        int int14 = levenbergMarquardtOptimizer5.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(0.0d, (double) (byte) 10, (double) (short) 1);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker4);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator5, true, pointValuePairConvergenceChecker7);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker9);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep12 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray13 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep12 };
        simplexOptimizer10.parseOptimizationData(optimizationDataArray13);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray13);
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer8.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer8.getStatisticsSigmaHistory();
        int int18 = cMAESOptimizer8.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker19 = cMAESOptimizer8.getConvergenceChecker();
        double[] doubleArray20 = cMAESOptimizer8.getUpperBound();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList21 = cMAESOptimizer8.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(optimizationDataArray13);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(pointValuePairConvergenceChecker19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNotNull(realMatrixList21);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula7 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker8 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker8, univariateSolver9);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker11 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver12 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner13 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray14);
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray16);
        double[] doubleArray18 = identityPreconditioner13.precondition(doubleArray14, doubleArray16);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma20 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray19);
        double[] doubleArray21 = sigma20.getSigma();
        double[] doubleArray22 = sigma20.getSigma();
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = identityPreconditioner13.precondition(doubleArray22, doubleArray23);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer25 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker11, univariateSolver12, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner13);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker26 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer27 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker26);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer34 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker35 = simplexOptimizer34.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer36 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 100.0f, (double) (short) 100, (double) '4', 10.0d, pointValuePairConvergenceChecker35);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer37 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker35);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula38 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker39 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver40 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer41 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula38, pointValuePairConvergenceChecker39, univariateSolver40);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker42 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver43 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner44 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma46 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray45);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma48 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray47);
        double[] doubleArray49 = identityPreconditioner44.precondition(doubleArray45, doubleArray47);
        double[] doubleArray50 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma51 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray50);
        double[] doubleArray52 = sigma51.getSigma();
        double[] doubleArray53 = sigma51.getSigma();
        double[] doubleArray54 = new double[] {};
        double[] doubleArray55 = identityPreconditioner44.precondition(doubleArray53, doubleArray54);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer56 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula38, pointValuePairConvergenceChecker42, univariateSolver43, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner44);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker57 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer58 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula38, pointValuePairConvergenceChecker57);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer65 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker66 = simplexOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer67 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 100.0f, (double) (short) 100, (double) '4', 10.0d, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer68 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula38, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer69 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker70 = nonLinearConjugateGradientOptimizer69.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 100, 0.0d, false, (int) (byte) 100, (-1), randomGenerator5, true, pointValuePairConvergenceChecker70);
        java.lang.Class<?> wildcardClass72 = cMAESOptimizer71.getClass();
        org.junit.Assert.assertTrue("'" + formula7 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula7.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker35);
        org.junit.Assert.assertTrue("'" + formula38 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula38.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker66);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker70);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer25 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker26 = simplexOptimizer25.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer27 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 100.0f, (double) (short) 100, (double) '4', 10.0d, pointValuePairConvergenceChecker26);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (byte) 0, (double) 1, true, (int) (short) 100, (int) (byte) -1, randomGenerator17, true, pointValuePairConvergenceChecker26);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer29 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 10, (double) (short) 100, (double) (byte) 10, (double) (byte) 1, pointValuePairConvergenceChecker26);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer30 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 1, (double) 100L, (double) 10, (double) (short) 1, pointValuePairConvergenceChecker26);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer31 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 'a', 52.0d, (double) ' ', (double) (short) 100, pointValuePairConvergenceChecker26);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker26);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, (double) 0, (double) (-1), 32.0d);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getUpperBound();
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1, pointVectorValuePairConvergenceChecker1, (double) 52, (double) (byte) 1, (double) 10L, (double) (-1L));
        int int7 = levenbergMarquardtOptimizer6.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (short) 0, (double) (byte) 10, 32.0d, (double) (-1.0f));
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer gaussNewtonOptimizer2 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer(false, pointVectorValuePairConvergenceChecker1);
        double[] doubleArray3 = gaussNewtonOptimizer2.getLowerBound();
        double[] doubleArray4 = gaussNewtonOptimizer2.getLowerBound();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator5, true, pointValuePairConvergenceChecker7);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker9);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep12 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray13 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep12 };
        simplexOptimizer10.parseOptimizationData(optimizationDataArray13);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray13);
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer8.getStatisticsSigmaHistory();
        int int17 = cMAESOptimizer8.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer8.getStatisticsDHistory();
        double[] doubleArray19 = cMAESOptimizer8.getUpperBound();
        java.util.List<java.lang.Double> doubleList20 = cMAESOptimizer8.getStatisticsFitnessHistory();
        double[] doubleArray21 = cMAESOptimizer8.getUpperBound();
        java.util.List<java.lang.Double> doubleList22 = cMAESOptimizer8.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList23 = cMAESOptimizer8.getStatisticsMeanHistory();
        org.junit.Assert.assertNotNull(optimizationDataArray13);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(realMatrixList18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleList20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleList22);
        org.junit.Assert.assertNotNull(realMatrixList23);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 'a', pointVectorValuePairConvergenceChecker1, (double) 1.0f, (double) 1, (double) (byte) 100, (double) ' ');
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer6.getMaxEvaluations();
        double[] doubleArray9 = levenbergMarquardtOptimizer6.getLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = levenbergMarquardtOptimizer6.getTargetSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula19 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker20 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver21 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer22 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula19, pointValuePairConvergenceChecker20, univariateSolver21);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker23 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver24 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer25 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula19, pointValuePairConvergenceChecker23, univariateSolver24);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker26 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver27 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer28 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula19, pointValuePairConvergenceChecker26, univariateSolver27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer42 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker43 = simplexOptimizer42.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer44 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker43);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(10, (double) 0L, false, (int) (byte) 10, (int) (short) -1, randomGenerator34, true, pointValuePairConvergenceChecker43);
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver46 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula47 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker48 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver49 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer50 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula47, pointValuePairConvergenceChecker48, univariateSolver49);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker51 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver52 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer53 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula47, pointValuePairConvergenceChecker51, univariateSolver52);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker54 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver55 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer56 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula47, pointValuePairConvergenceChecker54, univariateSolver55);
        org.apache.commons.math3.random.RandomGenerator randomGenerator62 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer70 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker71 = simplexOptimizer70.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer72 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker71);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(10, (double) 0L, false, (int) (byte) 10, (int) (short) -1, randomGenerator62, true, pointValuePairConvergenceChecker71);
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver74 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner75 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray76 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma77 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray76);
        double[] doubleArray78 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma79 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray78);
        double[] doubleArray80 = identityPreconditioner75.precondition(doubleArray76, doubleArray78);
        double[] doubleArray81 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma82 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray81);
        double[] doubleArray83 = sigma82.getSigma();
        double[] doubleArray84 = sigma82.getSigma();
        double[] doubleArray85 = new double[] {};
        double[] doubleArray86 = identityPreconditioner75.precondition(doubleArray84, doubleArray85);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer87 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula47, pointValuePairConvergenceChecker71, univariateSolver74, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner75);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer88 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula19, pointValuePairConvergenceChecker43, univariateSolver46, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner75);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer89 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 100.0f, (double) 10, (double) (byte) 1, 0.0d, pointValuePairConvergenceChecker43);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer90 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 10.0f, (double) 10L, 0.0d, (double) (-1L), pointValuePairConvergenceChecker43);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer91 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(35.0d, (double) 97, pointValuePairConvergenceChecker43);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer92 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 'a', 100.0d, pointValuePairConvergenceChecker43);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (byte) 10, (double) 10L, true, 100, 32, randomGenerator5, true, pointValuePairConvergenceChecker43);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer94 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker43);
        org.junit.Assert.assertTrue("'" + formula19 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula19.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker43);
        org.junit.Assert.assertTrue("'" + formula47 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula47.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker71);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula7 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker8 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker8, univariateSolver9);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker11 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver12 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner13 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer14 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker11, univariateSolver12, preconditioner13);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker15 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer16 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker15);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker17 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver18 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer19 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker17, univariateSolver18);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker20 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver21 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner22 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer23 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker20, univariateSolver21, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner22);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker24 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver25 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula26 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker27 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver28 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula29 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker30 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver31 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer32 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula29, pointValuePairConvergenceChecker30, univariateSolver31);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker33 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver34 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer35 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula29, pointValuePairConvergenceChecker33, univariateSolver34);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker36 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver37 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner38 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer39 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula29, pointValuePairConvergenceChecker36, univariateSolver37, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner38);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer40 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula26, pointValuePairConvergenceChecker27, univariateSolver28, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner38);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer41 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker24, univariateSolver25, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner38);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula42 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker43 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver44 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer45 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker43, univariateSolver44);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker46 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver47 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer48 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker46, univariateSolver47);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker49 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver50 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer51 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker49, univariateSolver50);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker52 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer53 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker52);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker54 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer55 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker54);
        org.apache.commons.math3.random.RandomGenerator randomGenerator61 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer69 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker70 = simplexOptimizer69.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer71 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(10, (double) 0L, false, (int) (byte) 10, (int) (short) -1, randomGenerator61, true, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer73 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer74 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer75 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 100, (-1.0d), true, 52, 0, randomGenerator5, true, pointValuePairConvergenceChecker70);
        int int77 = cMAESOptimizer76.getMaxIterations();
        org.junit.Assert.assertTrue("'" + formula7 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula7.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula26 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula26.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula29 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula29.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula42 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula42.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker70);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker0 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer1 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker0);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer3 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker2);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize5 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) '4');
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep7 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        double double8 = bracketingStep7.getBracketingStep();
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray9 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize5, bracketingStep7 };
        simplexOptimizer3.parseOptimizationData(optimizationDataArray9);
        simplexOptimizer1.parseOptimizationData(optimizationDataArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker19 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator17, true, pointValuePairConvergenceChecker19);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker21 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer22 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker21);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep24 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray25 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep24 };
        simplexOptimizer22.parseOptimizationData(optimizationDataArray25);
        cMAESOptimizer20.parseOptimizationData(optimizationDataArray25);
        java.util.List<java.lang.Double> doubleList28 = cMAESOptimizer20.getStatisticsFitnessHistory();
        double[] doubleArray29 = cMAESOptimizer20.getStartPoint();
        int int30 = cMAESOptimizer20.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList31 = cMAESOptimizer20.getStatisticsMeanHistory();
        org.apache.commons.math3.random.RandomGenerator randomGenerator37 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker39 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 10, (double) 100.0f, true, 100, 100, randomGenerator37, false, pointValuePairConvergenceChecker39);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize42 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) (short) 100);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray43 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize42 };
        cMAESOptimizer40.parseOptimizationData(optimizationDataArray43);
        cMAESOptimizer20.parseOptimizationData(optimizationDataArray43);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.PointValuePair pointValuePair46 = simplexOptimizer1.optimize(optimizationDataArray43);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(optimizationDataArray9);
        org.junit.Assert.assertNotNull(optimizationDataArray25);
        org.junit.Assert.assertNotNull(doubleList28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(realMatrixList31);
        org.junit.Assert.assertNotNull(optimizationDataArray43);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator5, true, pointValuePairConvergenceChecker7);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker9);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep12 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray13 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep12 };
        simplexOptimizer10.parseOptimizationData(optimizationDataArray13);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray13);
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer8.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer8.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer8.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList19 = cMAESOptimizer8.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList20 = cMAESOptimizer8.getStatisticsFitnessHistory();
        org.junit.Assert.assertNotNull(optimizationDataArray13);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(realMatrixList17);
        org.junit.Assert.assertNotNull(realMatrixList18);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertNotNull(doubleList20);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getUpperBound();
        int int10 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1L, (double) '#', (double) 0.0f);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker4);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 10, (double) 100.0f, true, 100, 100, randomGenerator5, false, pointValuePairConvergenceChecker7);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) (short) 100);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray11 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize10 };
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray11);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer8.getStatisticsDHistory();
        org.apache.commons.math3.optim.nonlinear.scalar.GoalType goalType14 = cMAESOptimizer8.getGoalType();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer8.getStatisticsSigmaHistory();
        int int16 = cMAESOptimizer8.getMaxEvaluations();
        org.junit.Assert.assertNotNull(optimizationDataArray11);
        org.junit.Assert.assertNotNull(realMatrixList13);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((-1.0d), (double) 52, (double) (-1L), (double) 10, (double) (short) 0);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker7);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) 1, (double) ' ');
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer5 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(0.0d, (double) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker13 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) 'a', 100.0d, false, (int) (short) 1, (int) (short) 100, randomGenerator11, false, pointValuePairConvergenceChecker13);
        org.apache.commons.math3.random.RandomGenerator randomGenerator20 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker22 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator20, true, pointValuePairConvergenceChecker22);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker24 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer25 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker24);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep27 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray28 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep27 };
        simplexOptimizer25.parseOptimizationData(optimizationDataArray28);
        cMAESOptimizer23.parseOptimizationData(optimizationDataArray28);
        java.util.List<java.lang.Double> doubleList31 = cMAESOptimizer23.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer23.getStatisticsSigmaHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker33 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer34 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker33);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize36 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) '4');
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep38 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        double double39 = bracketingStep38.getBracketingStep();
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray40 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize36, bracketingStep38 };
        simplexOptimizer34.parseOptimizationData(optimizationDataArray40);
        cMAESOptimizer23.parseOptimizationData(optimizationDataArray40);
        cMAESOptimizer14.parseOptimizationData(optimizationDataArray40);
        simplexOptimizer5.parseOptimizationData(optimizationDataArray40);
        simplexOptimizer2.parseOptimizationData(optimizationDataArray40);
        org.junit.Assert.assertNotNull(optimizationDataArray28);
        org.junit.Assert.assertNotNull(doubleList31);
        org.junit.Assert.assertNotNull(doubleList32);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(optimizationDataArray40);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator5, true, pointValuePairConvergenceChecker7);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker9);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep12 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray13 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep12 };
        simplexOptimizer10.parseOptimizationData(optimizationDataArray13);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray13);
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer8.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer8.getStatisticsSigmaHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker18 = cMAESOptimizer8.getConvergenceChecker();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker19 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer20 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker19);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep22 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray23 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep22 };
        simplexOptimizer20.parseOptimizationData(optimizationDataArray23);
        int int25 = simplexOptimizer20.getMaxEvaluations();
        int int26 = simplexOptimizer20.getMaxIterations();
        int int27 = simplexOptimizer20.getIterations();
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker35 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 10, (double) 100.0f, true, 100, 100, randomGenerator33, false, pointValuePairConvergenceChecker35);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize38 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) (short) 100);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray39 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize38 };
        cMAESOptimizer36.parseOptimizationData(optimizationDataArray39);
        simplexOptimizer20.parseOptimizationData(optimizationDataArray39);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker42 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer43 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker42);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep45 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray46 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep45 };
        simplexOptimizer43.parseOptimizationData(optimizationDataArray46);
        simplexOptimizer20.parseOptimizationData(optimizationDataArray46);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray46);
        double[] doubleArray50 = cMAESOptimizer8.getUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass51 = doubleArray50.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optimizationDataArray13);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNull(pointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(optimizationDataArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(optimizationDataArray39);
        org.junit.Assert.assertNotNull(optimizationDataArray46);
        org.junit.Assert.assertNull(doubleArray50);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 1, pointVectorValuePairConvergenceChecker1, (double) 10.0f, (double) (byte) 1, (double) 0L, 0.0d);
        double[] doubleArray7 = levenbergMarquardtOptimizer6.getLowerBound();
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10L, (double) 'a', (double) (byte) 0, (double) (byte) 100, (double) (byte) -1);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getIterations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator5, true, pointValuePairConvergenceChecker7);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker9);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep12 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray13 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep12 };
        simplexOptimizer10.parseOptimizationData(optimizationDataArray13);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray13);
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer8.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer8.getStatisticsMeanHistory();
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker25 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) 10.0f, false, (int) (byte) -1, (int) (byte) 100, randomGenerator23, true, pointValuePairConvergenceChecker25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker34 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator32, true, pointValuePairConvergenceChecker34);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker36 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer37 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker36);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep39 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray40 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep39 };
        simplexOptimizer37.parseOptimizationData(optimizationDataArray40);
        cMAESOptimizer35.parseOptimizationData(optimizationDataArray40);
        cMAESOptimizer26.parseOptimizationData(optimizationDataArray40);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray40);
        java.util.List<java.lang.Double> doubleList45 = cMAESOptimizer8.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList46 = cMAESOptimizer8.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList47 = cMAESOptimizer8.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList48 = cMAESOptimizer8.getStatisticsMeanHistory();
        org.junit.Assert.assertNotNull(optimizationDataArray13);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(realMatrixList17);
        org.junit.Assert.assertNotNull(optimizationDataArray40);
        org.junit.Assert.assertNotNull(doubleList45);
        org.junit.Assert.assertNotNull(doubleList46);
        org.junit.Assert.assertNotNull(doubleList47);
        org.junit.Assert.assertNotNull(realMatrixList48);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula7 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker8 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker8, univariateSolver9);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker11 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver12 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner13 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray14);
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray16);
        double[] doubleArray18 = identityPreconditioner13.precondition(doubleArray14, doubleArray16);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma20 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray19);
        double[] doubleArray21 = sigma20.getSigma();
        double[] doubleArray22 = sigma20.getSigma();
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = identityPreconditioner13.precondition(doubleArray22, doubleArray23);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer25 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker11, univariateSolver12, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner13);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker26 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer27 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker26);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula28 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker29 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver30 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer31 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula28, pointValuePairConvergenceChecker29, univariateSolver30);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker32 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver33 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer34 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula28, pointValuePairConvergenceChecker32, univariateSolver33);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker35 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver36 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer37 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula28, pointValuePairConvergenceChecker35, univariateSolver36);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker38 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer39 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula28, pointValuePairConvergenceChecker38);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker40 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer41 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula28, pointValuePairConvergenceChecker40);
        org.apache.commons.math3.random.RandomGenerator randomGenerator47 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer55 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker56 = simplexOptimizer55.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer57 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker56);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(10, (double) 0L, false, (int) (byte) 10, (int) (short) -1, randomGenerator47, true, pointValuePairConvergenceChecker56);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer59 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula28, pointValuePairConvergenceChecker56);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer60 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker56);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer61 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker56);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer62 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker56);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer63 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker56);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (byte) 100, (-1.0d), false, 32, (int) (short) 10, randomGenerator5, false, pointValuePairConvergenceChecker56);
        int int65 = cMAESOptimizer64.getMaxIterations();
        org.junit.Assert.assertTrue("'" + formula7 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula7.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula28 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula28.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker56);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula11 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker12 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver13 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer14 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula11, pointValuePairConvergenceChecker12, univariateSolver13);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker15 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver16 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner17 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer18 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula11, pointValuePairConvergenceChecker15, univariateSolver16, preconditioner17);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker19 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver20 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner21 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma23 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray22);
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma25 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray24);
        double[] doubleArray26 = identityPreconditioner21.precondition(doubleArray22, doubleArray24);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer27 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula11, pointValuePairConvergenceChecker19, univariateSolver20, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner21);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer41 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker42 = simplexOptimizer41.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer43 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker42);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) '#', (-1.0d), false, 100, 52, randomGenerator33, true, pointValuePairConvergenceChecker42);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer45 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula11, pointValuePairConvergenceChecker42);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(52, (double) 1, true, (int) (short) 0, 100, randomGenerator9, true, pointValuePairConvergenceChecker42);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer47 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker42);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer48 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(0.0d, (double) 1.0f, 97.0d, (double) (-1L), pointValuePairConvergenceChecker42);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + formula11 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula11.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker42);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, 100.0d);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getUpperBound();
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getLowerBound();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(52, (double) '#', false, (int) (byte) 10, (int) (byte) 10, randomGenerator5, true, pointValuePairConvergenceChecker7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker16 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator14, true, pointValuePairConvergenceChecker16);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker18 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer19 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker18);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep21 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray22 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep21 };
        simplexOptimizer19.parseOptimizationData(optimizationDataArray22);
        cMAESOptimizer17.parseOptimizationData(optimizationDataArray22);
        java.util.List<java.lang.Double> doubleList25 = cMAESOptimizer17.getStatisticsFitnessHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker26 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer27 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker26);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep29 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray30 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep29 };
        simplexOptimizer27.parseOptimizationData(optimizationDataArray30);
        cMAESOptimizer17.parseOptimizationData(optimizationDataArray30);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray30);
        int int34 = cMAESOptimizer8.getIterations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList35 = cMAESOptimizer8.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList36 = cMAESOptimizer8.getStatisticsFitnessHistory();
        org.junit.Assert.assertNotNull(optimizationDataArray22);
        org.junit.Assert.assertNotNull(doubleList25);
        org.junit.Assert.assertNotNull(optimizationDataArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(realMatrixList35);
        org.junit.Assert.assertNotNull(doubleList36);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 100, pointVectorValuePairConvergenceChecker1, (double) 100L, (double) (byte) 1, (double) 'a', (double) 1L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker14 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator12, true, pointValuePairConvergenceChecker14);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker16 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker16);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep19 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray20 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep19 };
        simplexOptimizer17.parseOptimizationData(optimizationDataArray20);
        cMAESOptimizer15.parseOptimizationData(optimizationDataArray20);
        java.util.List<java.lang.Double> doubleList23 = cMAESOptimizer15.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList24 = cMAESOptimizer15.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList25 = cMAESOptimizer15.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList26 = cMAESOptimizer15.getStatisticsFitnessHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker27 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer28 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker27);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep30 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray31 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep30 };
        simplexOptimizer28.parseOptimizationData(optimizationDataArray31);
        int int33 = simplexOptimizer28.getMaxEvaluations();
        int int34 = simplexOptimizer28.getMaxIterations();
        org.apache.commons.math3.random.RandomGenerator randomGenerator40 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker42 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator40, true, pointValuePairConvergenceChecker42);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker44 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer45 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker44);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep47 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray48 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep47 };
        simplexOptimizer45.parseOptimizationData(optimizationDataArray48);
        cMAESOptimizer43.parseOptimizationData(optimizationDataArray48);
        java.util.List<java.lang.Double> doubleList51 = cMAESOptimizer43.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList52 = cMAESOptimizer43.getStatisticsSigmaHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker53 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer54 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker53);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize56 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) '4');
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep58 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        double double59 = bracketingStep58.getBracketingStep();
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray60 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize56, bracketingStep58 };
        simplexOptimizer54.parseOptimizationData(optimizationDataArray60);
        cMAESOptimizer43.parseOptimizationData(optimizationDataArray60);
        simplexOptimizer28.parseOptimizationData(optimizationDataArray60);
        org.apache.commons.math3.random.RandomGenerator randomGenerator69 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker71 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 10, (double) 100.0f, true, 100, 100, randomGenerator69, false, pointValuePairConvergenceChecker71);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize74 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) (short) 100);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray75 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize74 };
        cMAESOptimizer72.parseOptimizationData(optimizationDataArray75);
        simplexOptimizer28.parseOptimizationData(optimizationDataArray75);
        cMAESOptimizer15.parseOptimizationData(optimizationDataArray75);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.PointVectorValuePair pointVectorValuePair79 = levenbergMarquardtOptimizer6.optimize(optimizationDataArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optimizationDataArray20);
        org.junit.Assert.assertNotNull(doubleList23);
        org.junit.Assert.assertNotNull(doubleList24);
        org.junit.Assert.assertNotNull(doubleList25);
        org.junit.Assert.assertNotNull(doubleList26);
        org.junit.Assert.assertNotNull(optimizationDataArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(optimizationDataArray48);
        org.junit.Assert.assertNotNull(doubleList51);
        org.junit.Assert.assertNotNull(doubleList52);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertNotNull(optimizationDataArray60);
        org.junit.Assert.assertNotNull(optimizationDataArray75);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (byte) 10, 35.0d, (double) (-1L), (double) (byte) 0);
        int int5 = powellOptimizer4.getIterations();
        int int6 = powellOptimizer4.getEvaluations();
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker14 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator12, true, pointValuePairConvergenceChecker14);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker16 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker16);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep19 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray20 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep19 };
        simplexOptimizer17.parseOptimizationData(optimizationDataArray20);
        cMAESOptimizer15.parseOptimizationData(optimizationDataArray20);
        java.util.List<java.lang.Double> doubleList23 = cMAESOptimizer15.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList24 = cMAESOptimizer15.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList25 = cMAESOptimizer15.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList26 = cMAESOptimizer15.getStatisticsSigmaHistory();
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker34 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator32, true, pointValuePairConvergenceChecker34);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker36 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer37 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker36);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep39 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray40 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep39 };
        simplexOptimizer37.parseOptimizationData(optimizationDataArray40);
        cMAESOptimizer35.parseOptimizationData(optimizationDataArray40);
        java.util.List<java.lang.Double> doubleList43 = cMAESOptimizer35.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList44 = cMAESOptimizer35.getStatisticsSigmaHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker45 = cMAESOptimizer35.getConvergenceChecker();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker46 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer47 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker46);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep49 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray50 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep49 };
        simplexOptimizer47.parseOptimizationData(optimizationDataArray50);
        int int52 = simplexOptimizer47.getMaxEvaluations();
        int int53 = simplexOptimizer47.getMaxIterations();
        int int54 = simplexOptimizer47.getIterations();
        org.apache.commons.math3.random.RandomGenerator randomGenerator60 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker62 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 10, (double) 100.0f, true, 100, 100, randomGenerator60, false, pointValuePairConvergenceChecker62);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize65 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) (short) 100);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray66 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize65 };
        cMAESOptimizer63.parseOptimizationData(optimizationDataArray66);
        simplexOptimizer47.parseOptimizationData(optimizationDataArray66);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker69 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer70 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker69);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep72 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray73 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep72 };
        simplexOptimizer70.parseOptimizationData(optimizationDataArray73);
        simplexOptimizer47.parseOptimizationData(optimizationDataArray73);
        cMAESOptimizer35.parseOptimizationData(optimizationDataArray73);
        cMAESOptimizer15.parseOptimizationData(optimizationDataArray73);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.PointValuePair pointValuePair78 = powellOptimizer4.optimize(optimizationDataArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(optimizationDataArray20);
        org.junit.Assert.assertNotNull(doubleList23);
        org.junit.Assert.assertNotNull(doubleList24);
        org.junit.Assert.assertNotNull(doubleList25);
        org.junit.Assert.assertNotNull(doubleList26);
        org.junit.Assert.assertNotNull(optimizationDataArray40);
        org.junit.Assert.assertNotNull(doubleList43);
        org.junit.Assert.assertNotNull(doubleList44);
        org.junit.Assert.assertNull(pointValuePairConvergenceChecker45);
        org.junit.Assert.assertNotNull(optimizationDataArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(optimizationDataArray66);
        org.junit.Assert.assertNotNull(optimizationDataArray73);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula8 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula9 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker10 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver11 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer12 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula9, pointValuePairConvergenceChecker10, univariateSolver11);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker13 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver14 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner15 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma19 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray18);
        double[] doubleArray20 = identityPreconditioner15.precondition(doubleArray16, doubleArray18);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma22 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray21);
        double[] doubleArray23 = sigma22.getSigma();
        double[] doubleArray24 = sigma22.getSigma();
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = identityPreconditioner15.precondition(doubleArray24, doubleArray25);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer27 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula9, pointValuePairConvergenceChecker13, univariateSolver14, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner15);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker28 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer29 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula9, pointValuePairConvergenceChecker28);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer36 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker37 = simplexOptimizer36.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer38 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 100.0f, (double) (short) 100, (double) '4', 10.0d, pointValuePairConvergenceChecker37);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer39 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula9, pointValuePairConvergenceChecker37);
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver40 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula41 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker42 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver43 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer44 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula41, pointValuePairConvergenceChecker42, univariateSolver43);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker45 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver46 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer47 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula41, pointValuePairConvergenceChecker45, univariateSolver46);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker48 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver49 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner50 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer51 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula41, pointValuePairConvergenceChecker48, univariateSolver49, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner50);
        double[] doubleArray56 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma57 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray56);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma58 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray56);
        double[] doubleArray59 = sigma58.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma60 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray59);
        double[] doubleArray61 = sigma60.getSigma();
        double[] doubleArray62 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma63 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray62);
        double[] doubleArray64 = sigma63.getSigma();
        double[] doubleArray65 = sigma63.getSigma();
        double[] doubleArray66 = identityPreconditioner50.precondition(doubleArray61, doubleArray65);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer67 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula8, pointValuePairConvergenceChecker37, univariateSolver40, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner50);
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver68 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula69 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker70 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver71 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer72 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula69, pointValuePairConvergenceChecker70, univariateSolver71);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker73 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver74 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner75 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray76 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma77 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray76);
        double[] doubleArray78 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma79 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray78);
        double[] doubleArray80 = identityPreconditioner75.precondition(doubleArray76, doubleArray78);
        double[] doubleArray81 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma82 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray81);
        double[] doubleArray83 = sigma82.getSigma();
        double[] doubleArray84 = sigma82.getSigma();
        double[] doubleArray85 = new double[] {};
        double[] doubleArray86 = identityPreconditioner75.precondition(doubleArray84, doubleArray85);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer87 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula69, pointValuePairConvergenceChecker73, univariateSolver74, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner75);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer88 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker37, univariateSolver68, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner75);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer89 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker37);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) 'a', (double) 32, false, 100, 97, randomGenerator5, false, pointValuePairConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + formula8 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE + "'", formula8.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE));
        org.junit.Assert.assertTrue("'" + formula9 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula9.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + formula41 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula41.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula69 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula69.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray14 = levenbergMarquardtOptimizer5.getLowerBound();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula0 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver2 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner3 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker1, univariateSolver2, preconditioner3);
        int int5 = nonLinearConjugateGradientOptimizer4.getIterations();
        int int6 = nonLinearConjugateGradientOptimizer4.getIterations();
        int int7 = nonLinearConjugateGradientOptimizer4.getMaxEvaluations();
        int int8 = nonLinearConjugateGradientOptimizer4.getEvaluations();
        int int9 = nonLinearConjugateGradientOptimizer4.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (byte) 100, 1.0d, (double) 35, (double) (short) 1);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int12 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray14 = levenbergMarquardtOptimizer5.getUpperBound();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator5, true, pointValuePairConvergenceChecker7);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker9);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep12 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray13 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep12 };
        simplexOptimizer10.parseOptimizationData(optimizationDataArray13);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray13);
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer8.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer8.getStatisticsSigmaHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker18 = cMAESOptimizer8.getConvergenceChecker();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker19 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer20 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker19);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep22 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray23 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep22 };
        simplexOptimizer20.parseOptimizationData(optimizationDataArray23);
        int int25 = simplexOptimizer20.getMaxEvaluations();
        int int26 = simplexOptimizer20.getMaxIterations();
        int int27 = simplexOptimizer20.getIterations();
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker35 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 10, (double) 100.0f, true, 100, 100, randomGenerator33, false, pointValuePairConvergenceChecker35);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize38 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) (short) 100);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray39 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize38 };
        cMAESOptimizer36.parseOptimizationData(optimizationDataArray39);
        simplexOptimizer20.parseOptimizationData(optimizationDataArray39);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker42 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer43 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker42);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep45 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray46 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep45 };
        simplexOptimizer43.parseOptimizationData(optimizationDataArray46);
        simplexOptimizer20.parseOptimizationData(optimizationDataArray46);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray46);
        double[] doubleArray50 = cMAESOptimizer8.getUpperBound();
        double[] doubleArray51 = cMAESOptimizer8.getLowerBound();
        org.junit.Assert.assertNotNull(optimizationDataArray13);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNull(pointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(optimizationDataArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(optimizationDataArray39);
        org.junit.Assert.assertNotNull(optimizationDataArray46);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (byte) 0, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, 1.0d, (double) (-1), (double) 10, (double) 10);
        int int6 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getUpperBound();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(10.0d, (double) (-1L));
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 'a', pointVectorValuePairConvergenceChecker1, (double) 1.0f, (double) 1, (double) (byte) 100, (double) ' ');
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer6.getChiSquare();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer6.getEvaluations();
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, 0.0d, (double) ' ', 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 100.0f, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 1, (double) 10.0f, (double) 100L);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula11 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker12 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver13 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer14 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula11, pointValuePairConvergenceChecker12, univariateSolver13);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker15 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver16 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner17 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma19 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma21 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray20);
        double[] doubleArray22 = identityPreconditioner17.precondition(doubleArray18, doubleArray20);
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma24 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray23);
        double[] doubleArray25 = sigma24.getSigma();
        double[] doubleArray26 = sigma24.getSigma();
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = identityPreconditioner17.precondition(doubleArray26, doubleArray27);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer29 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula11, pointValuePairConvergenceChecker15, univariateSolver16, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner17);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker30 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver31 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula32 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker33 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver34 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer35 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula32, pointValuePairConvergenceChecker33, univariateSolver34);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker36 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver37 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner38 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer39 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula32, pointValuePairConvergenceChecker36, univariateSolver37, preconditioner38);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker40 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver41 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner42 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray43 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma44 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray43);
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma46 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray45);
        double[] doubleArray47 = identityPreconditioner42.precondition(doubleArray43, doubleArray45);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer48 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula32, pointValuePairConvergenceChecker40, univariateSolver41, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner42);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer49 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula11, pointValuePairConvergenceChecker30, univariateSolver31, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner42);
        org.apache.commons.math3.random.RandomGenerator randomGenerator55 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer63 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker64 = simplexOptimizer63.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer65 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker64);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) '#', (-1.0d), false, 100, 52, randomGenerator55, true, pointValuePairConvergenceChecker64);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer67 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula11, pointValuePairConvergenceChecker64);
        org.apache.commons.math3.random.RandomGenerator randomGenerator73 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer81 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker82 = simplexOptimizer81.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer83 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker82);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) '#', (-1.0d), false, 100, 52, randomGenerator73, true, pointValuePairConvergenceChecker82);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer85 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula11, pointValuePairConvergenceChecker82);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) 10, true, (-1), 1, randomGenerator9, false, pointValuePairConvergenceChecker82);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer87 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) '#', (double) 52, (double) ' ', (double) (short) 0, pointValuePairConvergenceChecker82);
        double[] doubleArray88 = powellOptimizer87.getLowerBound();
        org.junit.Assert.assertTrue("'" + formula11 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula11.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula32 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula32.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker64);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker82);
        org.junit.Assert.assertNull(doubleArray88);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (byte) 0, (double) (byte) -1, true, 52, 0, randomGenerator5, true, pointValuePairConvergenceChecker7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer8.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(realMatrixList9);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) (-1.0f), (double) '#', (double) (byte) -1, (double) 10.0f);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker0 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer1 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker0);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep3 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray4 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep3 };
        simplexOptimizer1.parseOptimizationData(optimizationDataArray4);
        int int6 = simplexOptimizer1.getMaxEvaluations();
        int int7 = simplexOptimizer1.getMaxIterations();
        int int8 = simplexOptimizer1.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker9 = simplexOptimizer1.getConvergenceChecker();
        int int10 = simplexOptimizer1.getMaxEvaluations();
        double[] doubleArray11 = simplexOptimizer1.getLowerBound();
        org.apache.commons.math3.optim.nonlinear.scalar.GoalType goalType12 = simplexOptimizer1.getGoalType();
        int int13 = simplexOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(optimizationDataArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(pointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula4 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator24 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula26 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker27 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver28 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer29 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula26, pointValuePairConvergenceChecker27, univariateSolver28);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker30 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver31 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner32 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer33 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula26, pointValuePairConvergenceChecker30, univariateSolver31, preconditioner32);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker34 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver35 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner36 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma38 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray37);
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma40 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray39);
        double[] doubleArray41 = identityPreconditioner36.precondition(doubleArray37, doubleArray39);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer42 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula26, pointValuePairConvergenceChecker34, univariateSolver35, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner36);
        org.apache.commons.math3.random.RandomGenerator randomGenerator48 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer56 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker57 = simplexOptimizer56.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer58 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker57);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) '#', (-1.0d), false, 100, 52, randomGenerator48, true, pointValuePairConvergenceChecker57);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer60 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula26, pointValuePairConvergenceChecker57);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(52, (double) 1, true, (int) (short) 0, 100, randomGenerator24, true, pointValuePairConvergenceChecker57);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (byte) 100, (double) 32, true, (int) (byte) 100, (int) '4', randomGenerator17, false, pointValuePairConvergenceChecker57);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer63 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker57);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((-1), (double) 100.0f, false, (int) (byte) -1, (int) (short) 1, randomGenerator10, false, pointValuePairConvergenceChecker57);
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver65 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer66 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula4, pointValuePairConvergenceChecker57, univariateSolver65);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer67 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 1, (double) 1.0f, (double) '4', (double) 1.0f, pointValuePairConvergenceChecker57);
        org.junit.Assert.assertTrue("'" + formula26 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula26.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker57);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) 10.0f, false, (int) (byte) -1, (int) (byte) 100, randomGenerator5, true, pointValuePairConvergenceChecker7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer8.getStatisticsMeanHistory();
        org.apache.commons.math3.optim.nonlinear.scalar.GoalType goalType11 = cMAESOptimizer8.getGoalType();
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertNotNull(realMatrixList10);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (byte) 1, (double) (byte) 100, false, (int) '#', (int) (byte) -1, randomGenerator5, false, pointValuePairConvergenceChecker7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker16 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(52, (double) '#', false, (int) (byte) 10, (int) (byte) 10, randomGenerator14, true, pointValuePairConvergenceChecker16);
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker25 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator23, true, pointValuePairConvergenceChecker25);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker27 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer28 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker27);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep30 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray31 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep30 };
        simplexOptimizer28.parseOptimizationData(optimizationDataArray31);
        cMAESOptimizer26.parseOptimizationData(optimizationDataArray31);
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer26.getStatisticsFitnessHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker35 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer36 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker35);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep38 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray39 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep38 };
        simplexOptimizer36.parseOptimizationData(optimizationDataArray39);
        cMAESOptimizer26.parseOptimizationData(optimizationDataArray39);
        cMAESOptimizer17.parseOptimizationData(optimizationDataArray39);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray39);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer8.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.GoalType goalType45 = cMAESOptimizer8.getGoalType();
        org.junit.Assert.assertNotNull(optimizationDataArray31);
        org.junit.Assert.assertNotNull(doubleList34);
        org.junit.Assert.assertNotNull(optimizationDataArray39);
        org.junit.Assert.assertNull(pointValuePairConvergenceChecker44);
        org.junit.Assert.assertNull(goalType45);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(0, (double) (short) 10, false, (int) '4', (int) '#', randomGenerator5, true, pointValuePairConvergenceChecker7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer8.getStatisticsDHistory();
        int int10 = cMAESOptimizer8.getMaxEvaluations();
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker18 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(52, (double) '#', false, (int) (byte) 10, (int) (byte) 10, randomGenerator16, true, pointValuePairConvergenceChecker18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator25 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker27 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator25, true, pointValuePairConvergenceChecker27);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker29 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer30 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker29);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep32 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray33 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep32 };
        simplexOptimizer30.parseOptimizationData(optimizationDataArray33);
        cMAESOptimizer28.parseOptimizationData(optimizationDataArray33);
        java.util.List<java.lang.Double> doubleList36 = cMAESOptimizer28.getStatisticsFitnessHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker37 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer38 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker37);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep40 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray41 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep40 };
        simplexOptimizer38.parseOptimizationData(optimizationDataArray41);
        cMAESOptimizer28.parseOptimizationData(optimizationDataArray41);
        cMAESOptimizer19.parseOptimizationData(optimizationDataArray41);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList45 = cMAESOptimizer19.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList46 = cMAESOptimizer19.getStatisticsFitnessHistory();
        int int47 = cMAESOptimizer19.getIterations();
        org.apache.commons.math3.random.RandomGenerator randomGenerator53 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker55 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator53, true, pointValuePairConvergenceChecker55);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker57 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer58 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker57);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep60 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray61 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep60 };
        simplexOptimizer58.parseOptimizationData(optimizationDataArray61);
        cMAESOptimizer56.parseOptimizationData(optimizationDataArray61);
        java.util.List<java.lang.Double> doubleList64 = cMAESOptimizer56.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList65 = cMAESOptimizer56.getStatisticsDHistory();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer68 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(0.0d, (double) (byte) -1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator74 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker76 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator74, true, pointValuePairConvergenceChecker76);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker78 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer79 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker78);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep81 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray82 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep81 };
        simplexOptimizer79.parseOptimizationData(optimizationDataArray82);
        cMAESOptimizer77.parseOptimizationData(optimizationDataArray82);
        simplexOptimizer68.parseOptimizationData(optimizationDataArray82);
        cMAESOptimizer56.parseOptimizationData(optimizationDataArray82);
        cMAESOptimizer19.parseOptimizationData(optimizationDataArray82);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.PointValuePair pointValuePair88 = cMAESOptimizer8.optimize(optimizationDataArray82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrixList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(optimizationDataArray33);
        org.junit.Assert.assertNotNull(doubleList36);
        org.junit.Assert.assertNotNull(optimizationDataArray41);
        org.junit.Assert.assertNotNull(realMatrixList45);
        org.junit.Assert.assertNotNull(doubleList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(optimizationDataArray61);
        org.junit.Assert.assertNotNull(doubleList64);
        org.junit.Assert.assertNotNull(realMatrixList65);
        org.junit.Assert.assertNotNull(optimizationDataArray82);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula18 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker19 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver20 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer21 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula18, pointValuePairConvergenceChecker19, univariateSolver20);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker22 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver23 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner24 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer25 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula18, pointValuePairConvergenceChecker22, univariateSolver23, preconditioner24);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker26 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver27 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner28 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma30 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray29);
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma32 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray31);
        double[] doubleArray33 = identityPreconditioner28.precondition(doubleArray29, doubleArray31);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer34 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula18, pointValuePairConvergenceChecker26, univariateSolver27, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator40 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer48 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker49 = simplexOptimizer48.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer50 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker49);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) '#', (-1.0d), false, 100, 52, randomGenerator40, true, pointValuePairConvergenceChecker49);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer52 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula18, pointValuePairConvergenceChecker49);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) 100, false, 32, (int) '#', randomGenerator16, false, pointValuePairConvergenceChecker49);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (byte) 100, (-1.0d), true, (int) (short) 100, (int) '4', randomGenerator9, false, pointValuePairConvergenceChecker49);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer55 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker49);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer56 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 52, (double) (byte) 100, (double) 10, (double) (short) 100, pointValuePairConvergenceChecker49);
        org.junit.Assert.assertTrue("'" + formula18 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula18.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker49);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 32, (double) 1.0f, (double) (byte) 100, 0.0d, (double) 97);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula0 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver2 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer3 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker1, univariateSolver2);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker4 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver5 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner6 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer7 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker4, univariateSolver5, preconditioner6);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker8 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner10 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        double[] doubleArray15 = identityPreconditioner10.precondition(doubleArray11, doubleArray13);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer16 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker8, univariateSolver9, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner10);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula17 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker18 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver19 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer20 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula17, pointValuePairConvergenceChecker18, univariateSolver19);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker21 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver22 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer23 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula17, pointValuePairConvergenceChecker21, univariateSolver22);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker24 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver25 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer26 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula17, pointValuePairConvergenceChecker24, univariateSolver25);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker27 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer28 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula17, pointValuePairConvergenceChecker27);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker29 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer30 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula17, pointValuePairConvergenceChecker29);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer44 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker45 = simplexOptimizer44.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer46 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker45);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(10, (double) 0L, false, (int) (byte) 10, (int) (short) -1, randomGenerator36, true, pointValuePairConvergenceChecker45);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer48 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula17, pointValuePairConvergenceChecker45);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer49 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker45);
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver50 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer51 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker45, univariateSolver50);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer54 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker55 = simplexOptimizer54.getConvergenceChecker();
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver56 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer57 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker55, univariateSolver56);
        org.apache.commons.math3.random.RandomGenerator randomGenerator63 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula65 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker66 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver67 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer68 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula65, pointValuePairConvergenceChecker66, univariateSolver67);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker69 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver70 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner71 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer72 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula65, pointValuePairConvergenceChecker69, univariateSolver70, preconditioner71);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker73 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver74 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner75 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray76 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma77 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray76);
        double[] doubleArray78 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma79 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray78);
        double[] doubleArray80 = identityPreconditioner75.precondition(doubleArray76, doubleArray78);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer81 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula65, pointValuePairConvergenceChecker73, univariateSolver74, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner75);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer84 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker85 = simplexOptimizer84.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer86 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula65, pointValuePairConvergenceChecker85);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((-1), (double) (short) -1, false, (int) (byte) 0, (int) (short) 100, randomGenerator63, true, pointValuePairConvergenceChecker85);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer88 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker85);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker89 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver90 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner91 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer92 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker89, univariateSolver90, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner91);
        org.junit.Assert.assertTrue("'" + formula0 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula0.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula17 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula17.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker45);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker55);
        org.junit.Assert.assertTrue("'" + formula65 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula65.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker85);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(100.0d, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.PointValuePair pointValuePair3 = simplexOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (-1.0f), (double) (-1.0f));
        double[] doubleArray3 = simplexOptimizer2.getLowerBound();
        int int4 = simplexOptimizer2.getMaxIterations();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator5, true, pointValuePairConvergenceChecker7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        double[] doubleArray10 = cMAESOptimizer8.getUpperBound();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer8.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer8.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer8.getStatisticsFitnessHistory();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.PointValuePair pointValuePair14 = cMAESOptimizer8.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula7 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE;
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer23 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker24 = simplexOptimizer23.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer25 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 100.0f, (double) (short) 100, (double) '4', 10.0d, pointValuePairConvergenceChecker24);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (byte) 0, (double) 1, true, (int) (short) 100, (int) (byte) -1, randomGenerator15, true, pointValuePairConvergenceChecker24);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer27 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 10, (double) '4', pointValuePairConvergenceChecker24);
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver28 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer29 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker24, univariateSolver28);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) '#', (double) 32, true, (-1), (int) (short) 100, randomGenerator5, true, pointValuePairConvergenceChecker24);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer31 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker24);
        int int32 = simplexOptimizer31.getMaxIterations();
        org.junit.Assert.assertTrue("'" + formula7 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE + "'", formula7.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getUpperBound();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getStartPoint();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getLowerBound();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getLowerBound();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula14 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker15 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver16 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer17 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula14, pointValuePairConvergenceChecker15, univariateSolver16);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker18 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver19 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer20 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula14, pointValuePairConvergenceChecker18, univariateSolver19);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker21 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver22 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer23 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula14, pointValuePairConvergenceChecker21, univariateSolver22);
        org.apache.commons.math3.random.RandomGenerator randomGenerator29 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer37 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker38 = simplexOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer39 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker38);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(10, (double) 0L, false, (int) (byte) 10, (int) (short) -1, randomGenerator29, true, pointValuePairConvergenceChecker38);
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver41 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula42 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker43 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver44 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer45 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker43, univariateSolver44);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker46 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver47 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer48 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker46, univariateSolver47);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker49 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver50 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer51 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker49, univariateSolver50);
        org.apache.commons.math3.random.RandomGenerator randomGenerator57 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer65 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker66 = simplexOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer67 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(10, (double) 0L, false, (int) (byte) 10, (int) (short) -1, randomGenerator57, true, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver69 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner70 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray71 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma72 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray71);
        double[] doubleArray73 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma74 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray73);
        double[] doubleArray75 = identityPreconditioner70.precondition(doubleArray71, doubleArray73);
        double[] doubleArray76 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma77 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray76);
        double[] doubleArray78 = sigma77.getSigma();
        double[] doubleArray79 = sigma77.getSigma();
        double[] doubleArray80 = new double[] {};
        double[] doubleArray81 = identityPreconditioner70.precondition(doubleArray79, doubleArray80);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer82 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker66, univariateSolver69, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner70);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer83 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula14, pointValuePairConvergenceChecker38, univariateSolver41, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner70);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer84 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 100.0f, (double) 10, (double) (byte) 1, 0.0d, pointValuePairConvergenceChecker38);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer85 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 10.0f, (double) 10L, 0.0d, (double) (-1L), pointValuePairConvergenceChecker38);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer86 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(35.0d, (double) 97, pointValuePairConvergenceChecker38);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer87 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 'a', 100.0d, pointValuePairConvergenceChecker38);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer88 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (-1), (double) 32, pointValuePairConvergenceChecker38);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + formula14 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula14.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + formula42 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula42.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker66);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula7 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker8 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker8, univariateSolver9);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker11 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver12 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer13 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker11, univariateSolver12);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker14 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver15 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner16 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer17 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker14, univariateSolver15, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner16);
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula25 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker26 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver27 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer28 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula25, pointValuePairConvergenceChecker26, univariateSolver27);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker29 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver30 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner31 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma33 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray32);
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma35 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray34);
        double[] doubleArray36 = identityPreconditioner31.precondition(doubleArray32, doubleArray34);
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma38 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray37);
        double[] doubleArray39 = sigma38.getSigma();
        double[] doubleArray40 = sigma38.getSigma();
        double[] doubleArray41 = new double[] {};
        double[] doubleArray42 = identityPreconditioner31.precondition(doubleArray40, doubleArray41);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer43 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula25, pointValuePairConvergenceChecker29, univariateSolver30, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner31);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker44 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer45 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula25, pointValuePairConvergenceChecker44);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula46 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker47 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver48 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer49 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula46, pointValuePairConvergenceChecker47, univariateSolver48);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker50 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver51 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer52 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula46, pointValuePairConvergenceChecker50, univariateSolver51);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker53 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver54 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer55 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula46, pointValuePairConvergenceChecker53, univariateSolver54);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker56 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer57 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula46, pointValuePairConvergenceChecker56);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker58 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer59 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula46, pointValuePairConvergenceChecker58);
        org.apache.commons.math3.random.RandomGenerator randomGenerator65 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer73 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker74 = simplexOptimizer73.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer75 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(10, (double) 0L, false, (int) (byte) 10, (int) (short) -1, randomGenerator65, true, pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer77 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula46, pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer78 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer79 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula25, pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer80 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(32, (double) 100L, true, (int) (short) 10, 0, randomGenerator23, false, pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer82 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) 'a', (double) 0, true, (int) '4', 100, randomGenerator5, false, pointValuePairConvergenceChecker74);
        java.util.List<java.lang.Double> doubleList84 = cMAESOptimizer83.getStatisticsSigmaHistory();
        org.junit.Assert.assertTrue("'" + formula7 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula7.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula25 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula25.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula46 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula46.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker74);
        org.junit.Assert.assertNotNull(doubleList84);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator5, true, pointValuePairConvergenceChecker7);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker9);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep12 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray13 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep12 };
        simplexOptimizer10.parseOptimizationData(optimizationDataArray13);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray13);
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer8.getStatisticsFitnessHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker17 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer18 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker17);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep20 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray21 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep20 };
        simplexOptimizer18.parseOptimizationData(optimizationDataArray21);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray21);
        java.util.List<java.lang.Double> doubleList24 = cMAESOptimizer8.getStatisticsSigmaHistory();
        double[] doubleArray25 = cMAESOptimizer8.getStartPoint();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList26 = cMAESOptimizer8.getStatisticsDHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker27 = cMAESOptimizer8.getConvergenceChecker();
        org.junit.Assert.assertNotNull(optimizationDataArray13);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(optimizationDataArray21);
        org.junit.Assert.assertNotNull(doubleList24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNotNull(realMatrixList26);
        org.junit.Assert.assertNull(pointValuePairConvergenceChecker27);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 1, (double) 1, (double) 32, (double) 10L, (double) (short) 100);
        int int6 = levenbergMarquardtOptimizer5.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula14 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker15 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver16 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer17 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula14, pointValuePairConvergenceChecker15, univariateSolver16);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker18 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver19 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner20 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma22 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray21);
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma24 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray23);
        double[] doubleArray25 = identityPreconditioner20.precondition(doubleArray21, doubleArray23);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma27 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray26);
        double[] doubleArray28 = sigma27.getSigma();
        double[] doubleArray29 = sigma27.getSigma();
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = identityPreconditioner20.precondition(doubleArray29, doubleArray30);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer32 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula14, pointValuePairConvergenceChecker18, univariateSolver19, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner20);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker33 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer34 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula14, pointValuePairConvergenceChecker33);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula35 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker36 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver37 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer38 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula35, pointValuePairConvergenceChecker36, univariateSolver37);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker39 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver40 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer41 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula35, pointValuePairConvergenceChecker39, univariateSolver40);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker42 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver43 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer44 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula35, pointValuePairConvergenceChecker42, univariateSolver43);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker45 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer46 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula35, pointValuePairConvergenceChecker45);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker47 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer48 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula35, pointValuePairConvergenceChecker47);
        org.apache.commons.math3.random.RandomGenerator randomGenerator54 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer62 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker63 = simplexOptimizer62.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer64 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker63);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(10, (double) 0L, false, (int) (byte) 10, (int) (short) -1, randomGenerator54, true, pointValuePairConvergenceChecker63);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer66 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula35, pointValuePairConvergenceChecker63);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer67 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker63);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer68 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula14, pointValuePairConvergenceChecker63);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) 100.0f, false, 10, (int) '#', randomGenerator12, true, pointValuePairConvergenceChecker63);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker70 = cMAESOptimizer69.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) -1, (double) 52, true, (int) (byte) 1, 32, randomGenerator5, false, pointValuePairConvergenceChecker70);
        int int72 = cMAESOptimizer71.getIterations();
        org.junit.Assert.assertTrue("'" + formula14 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula14.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula35 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula35.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker63);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 32, pointVectorValuePairConvergenceChecker1, 1.0d, (double) (short) 100, (double) 10, 10.0d);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) 0, (double) 'a', (double) 0L, (double) 1L);
        int int6 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer5.getIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer gaussNewtonOptimizer2 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer(true, pointVectorValuePairConvergenceChecker1);
        double double3 = gaussNewtonOptimizer2.getChiSquare();
        int int4 = gaussNewtonOptimizer2.getMaxIterations();
        double double5 = gaussNewtonOptimizer2.getChiSquare();
        int int6 = gaussNewtonOptimizer2.getMaxIterations();
        double[] doubleArray7 = gaussNewtonOptimizer2.getStartPoint();
        double[] doubleArray8 = gaussNewtonOptimizer2.getStartPoint();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner9 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray12);
        double[] doubleArray14 = identityPreconditioner9.precondition(doubleArray10, doubleArray12);
        double[] doubleArray19 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma20 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray19);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma21 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray19);
        double[] doubleArray22 = sigma21.getSigma();
        double[] doubleArray23 = sigma21.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula24 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker25 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver26 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula27 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker28 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver29 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer30 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula27, pointValuePairConvergenceChecker28, univariateSolver29);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker31 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver32 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer33 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula27, pointValuePairConvergenceChecker31, univariateSolver32);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker34 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver35 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner36 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer37 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula27, pointValuePairConvergenceChecker34, univariateSolver35, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner36);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer38 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula24, pointValuePairConvergenceChecker25, univariateSolver26, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner36);
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma40 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray39);
        double[] doubleArray41 = sigma40.getSigma();
        double[] doubleArray42 = sigma40.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula43 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker44 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver45 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula46 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker47 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver48 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer49 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula46, pointValuePairConvergenceChecker47, univariateSolver48);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker50 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver51 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer52 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula46, pointValuePairConvergenceChecker50, univariateSolver51);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker53 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver54 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner55 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer56 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula46, pointValuePairConvergenceChecker53, univariateSolver54, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner55);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer57 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula43, pointValuePairConvergenceChecker44, univariateSolver45, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner55);
        double[] doubleArray58 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma59 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray58);
        double[] doubleArray60 = sigma59.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner61 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray62 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma63 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray62);
        double[] doubleArray64 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma65 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray64);
        double[] doubleArray66 = identityPreconditioner61.precondition(doubleArray62, doubleArray64);
        double[] doubleArray67 = identityPreconditioner55.precondition(doubleArray60, doubleArray62);
        double[] doubleArray68 = identityPreconditioner36.precondition(doubleArray42, doubleArray60);
        double[] doubleArray69 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma70 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray69);
        double[] doubleArray71 = sigma70.getSigma();
        double[] doubleArray72 = sigma70.getSigma();
        double[] doubleArray73 = sigma70.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma74 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray73);
        double[] doubleArray75 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma76 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray75);
        double[] doubleArray77 = identityPreconditioner36.precondition(doubleArray73, doubleArray75);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma78 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray73);
        double[] doubleArray79 = identityPreconditioner9.precondition(doubleArray23, doubleArray73);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray81 = gaussNewtonOptimizer2.computeCovariances(doubleArray23, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula24 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula24.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula27 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula27.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula43 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula43.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula46 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula46.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker14 = simplexOptimizer13.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker14);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(35, (double) '#', true, 100, (-1), randomGenerator5, false, pointValuePairConvergenceChecker14);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer16.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(realMatrixList17);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(0.0d, pointVectorValuePairConvergenceChecker1, (double) 100, (double) ' ', (double) 0, (-1.0d));
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker14 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator12, true, pointValuePairConvergenceChecker14);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker16 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker16);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep19 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray20 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep19 };
        simplexOptimizer17.parseOptimizationData(optimizationDataArray20);
        cMAESOptimizer15.parseOptimizationData(optimizationDataArray20);
        java.util.List<java.lang.Double> doubleList23 = cMAESOptimizer15.getStatisticsFitnessHistory();
        double[] doubleArray24 = cMAESOptimizer15.getStartPoint();
        int int25 = cMAESOptimizer15.getEvaluations();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer28 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(100.0d, 0.0d);
        int int29 = simplexOptimizer28.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker30 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer31 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker30);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep33 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray34 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep33 };
        simplexOptimizer31.parseOptimizationData(optimizationDataArray34);
        int int36 = simplexOptimizer31.getMaxEvaluations();
        int int37 = simplexOptimizer31.getMaxIterations();
        int int38 = simplexOptimizer31.getIterations();
        org.apache.commons.math3.random.RandomGenerator randomGenerator44 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker46 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 10, (double) 100.0f, true, 100, 100, randomGenerator44, false, pointValuePairConvergenceChecker46);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize49 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) (short) 100);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray50 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize49 };
        cMAESOptimizer47.parseOptimizationData(optimizationDataArray50);
        simplexOptimizer31.parseOptimizationData(optimizationDataArray50);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker53 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer54 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker53);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep56 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray57 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep56 };
        simplexOptimizer54.parseOptimizationData(optimizationDataArray57);
        simplexOptimizer31.parseOptimizationData(optimizationDataArray57);
        simplexOptimizer28.parseOptimizationData(optimizationDataArray57);
        org.apache.commons.math3.random.RandomGenerator randomGenerator66 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker68 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(52, (double) '#', false, (int) (byte) 10, (int) (byte) 10, randomGenerator66, true, pointValuePairConvergenceChecker68);
        org.apache.commons.math3.random.RandomGenerator randomGenerator75 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker77 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator75, true, pointValuePairConvergenceChecker77);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker79 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer80 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker79);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep82 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray83 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep82 };
        simplexOptimizer80.parseOptimizationData(optimizationDataArray83);
        cMAESOptimizer78.parseOptimizationData(optimizationDataArray83);
        java.util.List<java.lang.Double> doubleList86 = cMAESOptimizer78.getStatisticsFitnessHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker87 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer88 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker87);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep90 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray91 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep90 };
        simplexOptimizer88.parseOptimizationData(optimizationDataArray91);
        cMAESOptimizer78.parseOptimizationData(optimizationDataArray91);
        cMAESOptimizer69.parseOptimizationData(optimizationDataArray91);
        simplexOptimizer28.parseOptimizationData(optimizationDataArray91);
        cMAESOptimizer15.parseOptimizationData(optimizationDataArray91);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.PointVectorValuePair pointVectorValuePair97 = levenbergMarquardtOptimizer6.optimize(optimizationDataArray91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optimizationDataArray20);
        org.junit.Assert.assertNotNull(doubleList23);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(optimizationDataArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(optimizationDataArray50);
        org.junit.Assert.assertNotNull(optimizationDataArray57);
        org.junit.Assert.assertNotNull(optimizationDataArray83);
        org.junit.Assert.assertNotNull(doubleList86);
        org.junit.Assert.assertNotNull(optimizationDataArray91);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula4 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker5 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver6 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula7 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker8 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker8, univariateSolver9);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker11 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver12 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer13 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker11, univariateSolver12);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker14 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver15 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner16 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer17 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker14, univariateSolver15, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner16);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer18 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula4, pointValuePairConvergenceChecker5, univariateSolver6, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner16);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula27 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker28 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver29 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer30 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula27, pointValuePairConvergenceChecker28, univariateSolver29);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker31 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver32 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer33 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula27, pointValuePairConvergenceChecker31, univariateSolver32);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker34 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver35 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer36 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula27, pointValuePairConvergenceChecker34, univariateSolver35);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker37 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer38 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula27, pointValuePairConvergenceChecker37);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker39 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer40 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula27, pointValuePairConvergenceChecker39);
        org.apache.commons.math3.random.RandomGenerator randomGenerator46 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer54 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker55 = simplexOptimizer54.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer56 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker55);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(10, (double) 0L, false, (int) (byte) 10, (int) (short) -1, randomGenerator46, true, pointValuePairConvergenceChecker55);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer58 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula27, pointValuePairConvergenceChecker55);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer59 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker55);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer60 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 10, (double) '4', (double) (short) 0, (double) (short) 1, pointValuePairConvergenceChecker55);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer61 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 52, 35.0d, (double) (short) 0, (double) 100L, pointValuePairConvergenceChecker55);
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver62 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer63 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula4, pointValuePairConvergenceChecker55, univariateSolver62);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer64 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(52.0d, (double) 10, (double) (-1L), (double) 0.0f, pointValuePairConvergenceChecker55);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.PointValuePair pointValuePair65 = powellOptimizer64.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + formula4 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula4.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula7 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula7.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula27 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula27.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker55);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula0 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver2 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer3 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker1, univariateSolver2);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker4 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver5 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner6 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer7 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker4, univariateSolver5, preconditioner6);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker8 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner10 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        double[] doubleArray15 = identityPreconditioner10.precondition(doubleArray11, doubleArray13);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer16 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker8, univariateSolver9, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner10);
        double[] doubleArray21 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma22 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray21);
        double[] doubleArray23 = sigma22.getSigma();
        double[] doubleArray24 = sigma22.getSigma();
        double[] doubleArray25 = sigma22.getSigma();
        double[] doubleArray26 = sigma22.getSigma();
        double[] doubleArray27 = sigma22.getSigma();
        double[] doubleArray28 = sigma22.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma29 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray28);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula30 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker31 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver32 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer33 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula30, pointValuePairConvergenceChecker31, univariateSolver32);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker34 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver35 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer36 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula30, pointValuePairConvergenceChecker34, univariateSolver35);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker37 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver38 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner39 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer40 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula30, pointValuePairConvergenceChecker37, univariateSolver38, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner39);
        double[] doubleArray45 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma46 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray45);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma47 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray45);
        double[] doubleArray48 = sigma47.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma49 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray48);
        double[] doubleArray50 = sigma49.getSigma();
        double[] doubleArray51 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma52 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray51);
        double[] doubleArray53 = sigma52.getSigma();
        double[] doubleArray54 = sigma52.getSigma();
        double[] doubleArray55 = identityPreconditioner39.precondition(doubleArray50, doubleArray54);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma56 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray55);
        double[] doubleArray57 = identityPreconditioner10.precondition(doubleArray28, doubleArray55);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma58 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray28);
        org.junit.Assert.assertTrue("'" + formula0 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula0.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula30 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula30.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator5, true, pointValuePairConvergenceChecker7);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker9);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep12 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray13 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep12 };
        simplexOptimizer10.parseOptimizationData(optimizationDataArray13);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray13);
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer8.getStatisticsFitnessHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker17 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer18 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker17);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep20 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray21 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep20 };
        simplexOptimizer18.parseOptimizationData(optimizationDataArray21);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray21);
        int int24 = cMAESOptimizer8.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList25 = cMAESOptimizer8.getStatisticsMeanHistory();
        double[] doubleArray26 = cMAESOptimizer8.getUpperBound();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList27 = cMAESOptimizer8.getStatisticsDHistory();
        int int28 = cMAESOptimizer8.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.PointValuePair pointValuePair29 = cMAESOptimizer8.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optimizationDataArray13);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(optimizationDataArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(realMatrixList25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNotNull(realMatrixList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula9 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker10 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver11 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer12 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula9, pointValuePairConvergenceChecker10, univariateSolver11);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker13 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver14 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner15 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma19 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray18);
        double[] doubleArray20 = identityPreconditioner15.precondition(doubleArray16, doubleArray18);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma22 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray21);
        double[] doubleArray23 = sigma22.getSigma();
        double[] doubleArray24 = sigma22.getSigma();
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = identityPreconditioner15.precondition(doubleArray24, doubleArray25);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer27 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula9, pointValuePairConvergenceChecker13, univariateSolver14, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner15);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker28 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver29 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula30 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker31 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver32 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer33 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula30, pointValuePairConvergenceChecker31, univariateSolver32);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker34 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver35 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner36 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer37 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula30, pointValuePairConvergenceChecker34, univariateSolver35, preconditioner36);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker38 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver39 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner40 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma42 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray41);
        double[] doubleArray43 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma44 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray43);
        double[] doubleArray45 = identityPreconditioner40.precondition(doubleArray41, doubleArray43);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer46 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula30, pointValuePairConvergenceChecker38, univariateSolver39, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner40);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer47 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula9, pointValuePairConvergenceChecker28, univariateSolver29, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner40);
        org.apache.commons.math3.random.RandomGenerator randomGenerator53 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer61 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker62 = simplexOptimizer61.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer63 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker62);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) '#', (-1.0d), false, 100, 52, randomGenerator53, true, pointValuePairConvergenceChecker62);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer65 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula9, pointValuePairConvergenceChecker62);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker66 = nonLinearConjugateGradientOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 10, 0.0d, true, (int) (short) 1, (int) (byte) -1, randomGenerator7, false, pointValuePairConvergenceChecker66);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer68 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(0.0d, (double) 0.0f, pointValuePairConvergenceChecker66);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + formula9 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula9.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula30 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula30.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker62);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker66);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, pointVectorValuePairConvergenceChecker1, (double) 10.0f, (double) (byte) 0, (double) (short) 0, (double) (short) 100);
        int int7 = levenbergMarquardtOptimizer6.getMaxEvaluations();
        double[] doubleArray8 = levenbergMarquardtOptimizer6.getLowerBound();
        double[] doubleArray9 = levenbergMarquardtOptimizer6.getUpperBound();
        int int10 = levenbergMarquardtOptimizer6.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker0 = null;
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer gaussNewtonOptimizer1 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer(pointVectorValuePairConvergenceChecker0);
        double[] doubleArray2 = gaussNewtonOptimizer1.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker3 = gaussNewtonOptimizer1.getConvergenceChecker();
        int int4 = gaussNewtonOptimizer1.getEvaluations();
        double[] doubleArray5 = gaussNewtonOptimizer1.getLowerBound();
        int int6 = gaussNewtonOptimizer1.getEvaluations();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator5, true, pointValuePairConvergenceChecker7);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker9);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep12 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray13 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep12 };
        simplexOptimizer10.parseOptimizationData(optimizationDataArray13);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray13);
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer8.getStatisticsFitnessHistory();
        double[] doubleArray17 = cMAESOptimizer8.getStartPoint();
        int int18 = cMAESOptimizer8.getEvaluations();
        org.apache.commons.math3.optim.nonlinear.scalar.GoalType goalType19 = cMAESOptimizer8.getGoalType();
        org.apache.commons.math3.random.RandomGenerator randomGenerator25 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker27 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator25, true, pointValuePairConvergenceChecker27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker36 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) 10.0f, false, (int) (byte) -1, (int) (byte) 100, randomGenerator34, true, pointValuePairConvergenceChecker36);
        org.apache.commons.math3.random.RandomGenerator randomGenerator43 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker45 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator43, true, pointValuePairConvergenceChecker45);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker47 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer48 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker47);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep50 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray51 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep50 };
        simplexOptimizer48.parseOptimizationData(optimizationDataArray51);
        cMAESOptimizer46.parseOptimizationData(optimizationDataArray51);
        cMAESOptimizer37.parseOptimizationData(optimizationDataArray51);
        java.util.List<java.lang.Double> doubleList55 = cMAESOptimizer37.getStatisticsSigmaHistory();
        int int56 = cMAESOptimizer37.getMaxIterations();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer59 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (short) -1, (double) (short) 100);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker60 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer61 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker60);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker62 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer63 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker62);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize65 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) '4');
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep67 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        double double68 = bracketingStep67.getBracketingStep();
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray69 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize65, bracketingStep67 };
        simplexOptimizer63.parseOptimizationData(optimizationDataArray69);
        simplexOptimizer61.parseOptimizationData(optimizationDataArray69);
        simplexOptimizer59.parseOptimizationData(optimizationDataArray69);
        cMAESOptimizer37.parseOptimizationData(optimizationDataArray69);
        cMAESOptimizer28.parseOptimizationData(optimizationDataArray69);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.PointValuePair pointValuePair75 = cMAESOptimizer8.optimize(optimizationDataArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optimizationDataArray13);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(goalType19);
        org.junit.Assert.assertNotNull(optimizationDataArray51);
        org.junit.Assert.assertNotNull(doubleList55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertNotNull(optimizationDataArray69);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(52, (double) '#', false, (int) (byte) 10, (int) (byte) 10, randomGenerator5, true, pointValuePairConvergenceChecker7);
        double[] doubleArray9 = cMAESOptimizer8.getStartPoint();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer8.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer8.getStatisticsDHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker12 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker12);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker14 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker14);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) '4');
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep19 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        double double20 = bracketingStep19.getBracketingStep();
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray21 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize17, bracketingStep19 };
        simplexOptimizer15.parseOptimizationData(optimizationDataArray21);
        simplexOptimizer13.parseOptimizationData(optimizationDataArray21);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula24 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker25 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver26 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer27 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula24, pointValuePairConvergenceChecker25, univariateSolver26);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker28 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver29 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer30 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula24, pointValuePairConvergenceChecker28, univariateSolver29);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker31 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver32 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer33 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula24, pointValuePairConvergenceChecker31, univariateSolver32);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker34 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer35 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula24, pointValuePairConvergenceChecker34);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker36 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer37 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula24, pointValuePairConvergenceChecker36);
        org.apache.commons.math3.random.RandomGenerator randomGenerator43 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer51 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker52 = simplexOptimizer51.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer53 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker52);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(10, (double) 0L, false, (int) (byte) 10, (int) (short) -1, randomGenerator43, true, pointValuePairConvergenceChecker52);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer55 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula24, pointValuePairConvergenceChecker52);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer56 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker52);
        org.apache.commons.math3.random.RandomGenerator randomGenerator62 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker64 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator62, true, pointValuePairConvergenceChecker64);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker66 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer67 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep69 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray70 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep69 };
        simplexOptimizer67.parseOptimizationData(optimizationDataArray70);
        cMAESOptimizer65.parseOptimizationData(optimizationDataArray70);
        java.util.List<java.lang.Double> doubleList73 = cMAESOptimizer65.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList74 = cMAESOptimizer65.getStatisticsSigmaHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker75 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer76 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker75);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize78 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) '4');
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep80 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        double double81 = bracketingStep80.getBracketingStep();
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray82 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize78, bracketingStep80 };
        simplexOptimizer76.parseOptimizationData(optimizationDataArray82);
        cMAESOptimizer65.parseOptimizationData(optimizationDataArray82);
        simplexOptimizer56.parseOptimizationData(optimizationDataArray82);
        simplexOptimizer13.parseOptimizationData(optimizationDataArray82);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.PointValuePair pointValuePair87 = cMAESOptimizer8.optimize(optimizationDataArray82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrixList10);
        org.junit.Assert.assertNotNull(realMatrixList11);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(optimizationDataArray21);
        org.junit.Assert.assertTrue("'" + formula24 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula24.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker52);
        org.junit.Assert.assertNotNull(optimizationDataArray70);
        org.junit.Assert.assertNotNull(doubleList73);
        org.junit.Assert.assertNotNull(doubleList74);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertNotNull(optimizationDataArray82);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (byte) 10, (double) (byte) 1, (double) (byte) 0, 52.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker5 = powellOptimizer4.getConvergenceChecker();
        org.junit.Assert.assertNull(pointValuePairConvergenceChecker5);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, 1.0d, (double) (-1), (double) 10, (double) 10);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator5, true, pointValuePairConvergenceChecker7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        double[] doubleArray10 = cMAESOptimizer8.getStartPoint();
        double[] doubleArray11 = cMAESOptimizer8.getLowerBound();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer8.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer6 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = simplexOptimizer6.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker7);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer9 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker7);
        int int10 = simplexOptimizer9.getMaxIterations();
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        int int6 = levenbergMarquardtOptimizer3.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double[] doubleArray8 = levenbergMarquardtOptimizer3.getLowerBound();
        double[] doubleArray9 = levenbergMarquardtOptimizer3.getStartPoint();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 100, pointVectorValuePairConvergenceChecker1, 0.0d, (double) (-1L), (double) 100, (double) ' ');
        int int7 = levenbergMarquardtOptimizer6.getIterations();
        int int8 = levenbergMarquardtOptimizer6.getMaxIterations();
        double[] doubleArray9 = levenbergMarquardtOptimizer6.getLowerBound();
        int int10 = levenbergMarquardtOptimizer6.getEvaluations();
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker18 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator16, true, pointValuePairConvergenceChecker18);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker20 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer21 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker20);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep23 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray24 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep23 };
        simplexOptimizer21.parseOptimizationData(optimizationDataArray24);
        cMAESOptimizer19.parseOptimizationData(optimizationDataArray24);
        java.util.List<java.lang.Double> doubleList27 = cMAESOptimizer19.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList28 = cMAESOptimizer19.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList29 = cMAESOptimizer19.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList30 = cMAESOptimizer19.getStatisticsFitnessHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker31 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer32 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker31);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep34 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray35 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep34 };
        simplexOptimizer32.parseOptimizationData(optimizationDataArray35);
        int int37 = simplexOptimizer32.getMaxEvaluations();
        int int38 = simplexOptimizer32.getMaxIterations();
        org.apache.commons.math3.random.RandomGenerator randomGenerator44 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker46 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator44, true, pointValuePairConvergenceChecker46);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker48 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer49 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker48);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep51 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray52 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep51 };
        simplexOptimizer49.parseOptimizationData(optimizationDataArray52);
        cMAESOptimizer47.parseOptimizationData(optimizationDataArray52);
        java.util.List<java.lang.Double> doubleList55 = cMAESOptimizer47.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList56 = cMAESOptimizer47.getStatisticsSigmaHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker57 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer58 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker57);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize60 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) '4');
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep62 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        double double63 = bracketingStep62.getBracketingStep();
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray64 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize60, bracketingStep62 };
        simplexOptimizer58.parseOptimizationData(optimizationDataArray64);
        cMAESOptimizer47.parseOptimizationData(optimizationDataArray64);
        simplexOptimizer32.parseOptimizationData(optimizationDataArray64);
        org.apache.commons.math3.random.RandomGenerator randomGenerator73 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker75 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 10, (double) 100.0f, true, 100, 100, randomGenerator73, false, pointValuePairConvergenceChecker75);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize78 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) (short) 100);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray79 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize78 };
        cMAESOptimizer76.parseOptimizationData(optimizationDataArray79);
        simplexOptimizer32.parseOptimizationData(optimizationDataArray79);
        cMAESOptimizer19.parseOptimizationData(optimizationDataArray79);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.PointVectorValuePair pointVectorValuePair83 = levenbergMarquardtOptimizer6.optimize(optimizationDataArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(optimizationDataArray24);
        org.junit.Assert.assertNotNull(doubleList27);
        org.junit.Assert.assertNotNull(doubleList28);
        org.junit.Assert.assertNotNull(doubleList29);
        org.junit.Assert.assertNotNull(doubleList30);
        org.junit.Assert.assertNotNull(optimizationDataArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(optimizationDataArray52);
        org.junit.Assert.assertNotNull(doubleList55);
        org.junit.Assert.assertNotNull(doubleList56);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertNotNull(optimizationDataArray64);
        org.junit.Assert.assertNotNull(optimizationDataArray79);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) -1, (double) (short) 0, (double) 35);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer7 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(0.0d, (double) (-1L));
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker15 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) 10.0f, false, (int) (byte) -1, (int) (byte) 100, randomGenerator13, true, pointValuePairConvergenceChecker15);
        org.apache.commons.math3.random.RandomGenerator randomGenerator22 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker24 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator22, true, pointValuePairConvergenceChecker24);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker26 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer27 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker26);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep29 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray30 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep29 };
        simplexOptimizer27.parseOptimizationData(optimizationDataArray30);
        cMAESOptimizer25.parseOptimizationData(optimizationDataArray30);
        cMAESOptimizer16.parseOptimizationData(optimizationDataArray30);
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer16.getStatisticsSigmaHistory();
        int int35 = cMAESOptimizer16.getMaxIterations();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer38 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (short) -1, (double) (short) 100);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker39 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer40 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker39);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker41 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer42 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker41);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize44 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) '4');
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep46 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        double double47 = bracketingStep46.getBracketingStep();
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray48 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize44, bracketingStep46 };
        simplexOptimizer42.parseOptimizationData(optimizationDataArray48);
        simplexOptimizer40.parseOptimizationData(optimizationDataArray48);
        simplexOptimizer38.parseOptimizationData(optimizationDataArray48);
        cMAESOptimizer16.parseOptimizationData(optimizationDataArray48);
        simplexOptimizer7.parseOptimizationData(optimizationDataArray48);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.PointVectorValuePair pointVectorValuePair54 = levenbergMarquardtOptimizer3.optimize(optimizationDataArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(optimizationDataArray30);
        org.junit.Assert.assertNotNull(doubleList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(optimizationDataArray48);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula0 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver2 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer3 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker1, univariateSolver2);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker4 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver5 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner6 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray7);
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray9);
        double[] doubleArray11 = identityPreconditioner6.precondition(doubleArray7, doubleArray9);
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray12);
        double[] doubleArray14 = sigma13.getSigma();
        double[] doubleArray15 = sigma13.getSigma();
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = identityPreconditioner6.precondition(doubleArray15, doubleArray16);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer18 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker4, univariateSolver5, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner6);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker19 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver20 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula21 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker22 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver23 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer24 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula21, pointValuePairConvergenceChecker22, univariateSolver23);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker25 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver26 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner27 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer28 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula21, pointValuePairConvergenceChecker25, univariateSolver26, preconditioner27);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker29 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver30 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner31 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma33 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray32);
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma35 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray34);
        double[] doubleArray36 = identityPreconditioner31.precondition(doubleArray32, doubleArray34);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer37 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula21, pointValuePairConvergenceChecker29, univariateSolver30, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner31);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer38 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker19, univariateSolver20, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner31);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula39 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker40 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver41 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula42 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker43 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver44 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer45 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker43, univariateSolver44);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker46 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver47 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer48 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker46, univariateSolver47);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker49 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver50 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner51 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer52 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula42, pointValuePairConvergenceChecker49, univariateSolver50, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner51);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer53 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula39, pointValuePairConvergenceChecker40, univariateSolver41, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner51);
        double[] doubleArray54 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma55 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray54);
        double[] doubleArray56 = sigma55.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner57 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray58 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma59 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray58);
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma61 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray60);
        double[] doubleArray62 = identityPreconditioner57.precondition(doubleArray58, doubleArray60);
        double[] doubleArray63 = identityPreconditioner51.precondition(doubleArray56, doubleArray58);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma64 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray56);
        double[] doubleArray65 = sigma64.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula66 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker67 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver68 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula69 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker70 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver71 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer72 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula69, pointValuePairConvergenceChecker70, univariateSolver71);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker73 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver74 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer75 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula69, pointValuePairConvergenceChecker73, univariateSolver74);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker76 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver77 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner78 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer79 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula69, pointValuePairConvergenceChecker76, univariateSolver77, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner78);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer80 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula66, pointValuePairConvergenceChecker67, univariateSolver68, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner78);
        double[] doubleArray81 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma82 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray81);
        double[] doubleArray83 = sigma82.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner84 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray85 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma86 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray85);
        double[] doubleArray87 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma88 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray87);
        double[] doubleArray89 = identityPreconditioner84.precondition(doubleArray85, doubleArray87);
        double[] doubleArray90 = identityPreconditioner78.precondition(doubleArray83, doubleArray85);
        double[] doubleArray91 = identityPreconditioner31.precondition(doubleArray65, doubleArray83);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma92 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray83);
        double[] doubleArray93 = sigma92.getSigma();
        org.junit.Assert.assertTrue("'" + formula0 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula0.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula21 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula21.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula39 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula39.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula42 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula42.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula66 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula66.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula69 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula69.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertArrayEquals(doubleArray91, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertArrayEquals(doubleArray93, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 0, pointVectorValuePairConvergenceChecker1, 0.0d, (double) 1L, (double) (short) -1, (double) (short) 100);
        int int7 = levenbergMarquardtOptimizer6.getEvaluations();
        int int8 = levenbergMarquardtOptimizer6.getEvaluations();
        double double9 = levenbergMarquardtOptimizer6.getChiSquare();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker10);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 100.0f, (double) (byte) 1, (double) (-1), (double) '4');
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker6);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '4', (double) 1, (double) 0L);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker0 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer1 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker0);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep3 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray4 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep3 };
        simplexOptimizer1.parseOptimizationData(optimizationDataArray4);
        int int6 = simplexOptimizer1.getMaxEvaluations();
        int int7 = simplexOptimizer1.getMaxIterations();
        int int8 = simplexOptimizer1.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker9 = simplexOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(0.0d, (double) (byte) -1);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker13 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker13);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep16 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray17 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep16 };
        simplexOptimizer14.parseOptimizationData(optimizationDataArray17);
        int int19 = simplexOptimizer14.getMaxEvaluations();
        int int20 = simplexOptimizer14.getMaxIterations();
        int int21 = simplexOptimizer14.getIterations();
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker29 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 10, (double) 100.0f, true, 100, 100, randomGenerator27, false, pointValuePairConvergenceChecker29);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize32 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) (short) 100);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray33 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize32 };
        cMAESOptimizer30.parseOptimizationData(optimizationDataArray33);
        simplexOptimizer14.parseOptimizationData(optimizationDataArray33);
        simplexOptimizer12.parseOptimizationData(optimizationDataArray33);
        simplexOptimizer1.parseOptimizationData(optimizationDataArray33);
        int int38 = simplexOptimizer1.getMaxIterations();
        org.apache.commons.math3.random.RandomGenerator randomGenerator44 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer52 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker53 = simplexOptimizer52.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer54 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker53);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) '#', (-1.0d), false, 100, 52, randomGenerator44, true, pointValuePairConvergenceChecker53);
        int int56 = cMAESOptimizer55.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList57 = cMAESOptimizer55.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList58 = cMAESOptimizer55.getStatisticsSigmaHistory();
        org.apache.commons.math3.random.RandomGenerator randomGenerator64 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker66 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) 'a', 100.0d, false, (int) (short) 1, (int) (short) 100, randomGenerator64, false, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.random.RandomGenerator randomGenerator73 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker75 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator73, true, pointValuePairConvergenceChecker75);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker77 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer78 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker77);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep80 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray81 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep80 };
        simplexOptimizer78.parseOptimizationData(optimizationDataArray81);
        cMAESOptimizer76.parseOptimizationData(optimizationDataArray81);
        java.util.List<java.lang.Double> doubleList84 = cMAESOptimizer76.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList85 = cMAESOptimizer76.getStatisticsSigmaHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker86 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer87 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker86);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize89 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) '4');
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep91 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        double double92 = bracketingStep91.getBracketingStep();
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray93 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize89, bracketingStep91 };
        simplexOptimizer87.parseOptimizationData(optimizationDataArray93);
        cMAESOptimizer76.parseOptimizationData(optimizationDataArray93);
        cMAESOptimizer67.parseOptimizationData(optimizationDataArray93);
        cMAESOptimizer55.parseOptimizationData(optimizationDataArray93);
        simplexOptimizer1.parseOptimizationData(optimizationDataArray93);
        org.junit.Assert.assertNotNull(optimizationDataArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(pointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(optimizationDataArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(optimizationDataArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(realMatrixList57);
        org.junit.Assert.assertNotNull(doubleList58);
        org.junit.Assert.assertNotNull(optimizationDataArray81);
        org.junit.Assert.assertNotNull(doubleList84);
        org.junit.Assert.assertNotNull(doubleList85);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 10.0d + "'", double92 == 10.0d);
        org.junit.Assert.assertNotNull(optimizationDataArray93);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) '4', (double) 100L, true, (int) (short) 1, (int) (short) 100, randomGenerator5, true, pointValuePairConvergenceChecker7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        double[] doubleArray10 = cMAESOptimizer8.getStartPoint();
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula0 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver2 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer3 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker1, univariateSolver2);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula4 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker5 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver6 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer7 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula4, pointValuePairConvergenceChecker5, univariateSolver6);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker8 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner10 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        double[] doubleArray15 = identityPreconditioner10.precondition(doubleArray11, doubleArray13);
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray16);
        double[] doubleArray18 = sigma17.getSigma();
        double[] doubleArray19 = sigma17.getSigma();
        double[] doubleArray20 = new double[] {};
        double[] doubleArray21 = identityPreconditioner10.precondition(doubleArray19, doubleArray20);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer22 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula4, pointValuePairConvergenceChecker8, univariateSolver9, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker23 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer24 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula4, pointValuePairConvergenceChecker23);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula25 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker26 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver27 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer28 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula25, pointValuePairConvergenceChecker26, univariateSolver27);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker29 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver30 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer31 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula25, pointValuePairConvergenceChecker29, univariateSolver30);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker32 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver33 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer34 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula25, pointValuePairConvergenceChecker32, univariateSolver33);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker35 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer36 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula25, pointValuePairConvergenceChecker35);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker37 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer38 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula25, pointValuePairConvergenceChecker37);
        org.apache.commons.math3.random.RandomGenerator randomGenerator44 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer52 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker53 = simplexOptimizer52.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer54 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker53);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(10, (double) 0L, false, (int) (byte) 10, (int) (short) -1, randomGenerator44, true, pointValuePairConvergenceChecker53);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer56 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula25, pointValuePairConvergenceChecker53);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer57 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker53);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer58 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula4, pointValuePairConvergenceChecker53);
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver59 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer60 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker53, univariateSolver59);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula61 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker62 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver63 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer64 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula61, pointValuePairConvergenceChecker62, univariateSolver63);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker65 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver66 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner67 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer68 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula61, pointValuePairConvergenceChecker65, univariateSolver66, preconditioner67);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker69 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver70 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner71 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray72 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma73 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray72);
        double[] doubleArray74 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma75 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray74);
        double[] doubleArray76 = identityPreconditioner71.precondition(doubleArray72, doubleArray74);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer77 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula61, pointValuePairConvergenceChecker69, univariateSolver70, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner71);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer80 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker81 = simplexOptimizer80.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer82 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula61, pointValuePairConvergenceChecker81);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer83 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker81);
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver84 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer85 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker81, univariateSolver84);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer86 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker81);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer87 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker81);
        double[] doubleArray88 = simplexOptimizer87.getUpperBound();
        org.junit.Assert.assertTrue("'" + formula0 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula0.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula4 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula4.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula25 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula25.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker53);
        org.junit.Assert.assertTrue("'" + formula61 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula61.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker81);
        org.junit.Assert.assertNull(doubleArray88);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) 10L, (double) (byte) 100);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator5, true, pointValuePairConvergenceChecker7);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker9);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep12 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray13 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep12 };
        simplexOptimizer10.parseOptimizationData(optimizationDataArray13);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray13);
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer8.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer8.getStatisticsSigmaHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker18 = cMAESOptimizer8.getConvergenceChecker();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker19 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer20 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker19);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep22 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray23 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep22 };
        simplexOptimizer20.parseOptimizationData(optimizationDataArray23);
        int int25 = simplexOptimizer20.getMaxEvaluations();
        int int26 = simplexOptimizer20.getMaxIterations();
        int int27 = simplexOptimizer20.getIterations();
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker35 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 10, (double) 100.0f, true, 100, 100, randomGenerator33, false, pointValuePairConvergenceChecker35);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize38 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) (short) 100);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray39 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize38 };
        cMAESOptimizer36.parseOptimizationData(optimizationDataArray39);
        simplexOptimizer20.parseOptimizationData(optimizationDataArray39);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker42 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer43 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker42);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep45 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray46 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep45 };
        simplexOptimizer43.parseOptimizationData(optimizationDataArray46);
        simplexOptimizer20.parseOptimizationData(optimizationDataArray46);
        cMAESOptimizer8.parseOptimizationData(optimizationDataArray46);
        double[] doubleArray50 = cMAESOptimizer8.getUpperBound();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList51 = cMAESOptimizer8.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(optimizationDataArray13);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNull(pointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(optimizationDataArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(optimizationDataArray39);
        org.junit.Assert.assertNotNull(optimizationDataArray46);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNotNull(realMatrixList51);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula0 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver2 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer3 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker1, univariateSolver2);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker4 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver5 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner6 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray7);
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray9);
        double[] doubleArray11 = identityPreconditioner6.precondition(doubleArray7, doubleArray9);
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray12);
        double[] doubleArray14 = sigma13.getSigma();
        double[] doubleArray15 = sigma13.getSigma();
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = identityPreconditioner6.precondition(doubleArray15, doubleArray16);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer18 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker4, univariateSolver5, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner6);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula19 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker20 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver21 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer22 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula19, pointValuePairConvergenceChecker20, univariateSolver21);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker23 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver24 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner25 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer26 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula19, pointValuePairConvergenceChecker23, univariateSolver24, preconditioner25);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker27 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer28 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula19, pointValuePairConvergenceChecker27);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker29 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver30 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer31 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula19, pointValuePairConvergenceChecker29, univariateSolver30);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker32 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver33 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner34 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer35 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula19, pointValuePairConvergenceChecker32, univariateSolver33, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner34);
        double[] doubleArray40 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma41 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray40);
        double[] doubleArray42 = sigma41.getSigma();
        double[] doubleArray43 = sigma41.getSigma();
        double[] doubleArray44 = sigma41.getSigma();
        double[] doubleArray49 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma50 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray49);
        double[] doubleArray51 = identityPreconditioner34.precondition(doubleArray44, doubleArray49);
        double[] doubleArray52 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma53 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray52);
        double[] doubleArray54 = sigma53.getSigma();
        double[] doubleArray55 = sigma53.getSigma();
        double[] doubleArray56 = sigma53.getSigma();
        double[] doubleArray57 = sigma53.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma58 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray57);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma59 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray57);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma60 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray57);
        double[] doubleArray61 = identityPreconditioner6.precondition(doubleArray49, doubleArray57);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma62 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray61);
        double[] doubleArray63 = sigma62.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma64 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray63);
        org.junit.Assert.assertTrue("'" + formula0 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula0.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + formula19 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula19.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula0 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker1 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver2 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner3 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula0, pointValuePairConvergenceChecker1, univariateSolver2, preconditioner3);
        int int5 = nonLinearConjugateGradientOptimizer4.getIterations();
        int int6 = nonLinearConjugateGradientOptimizer4.getIterations();
        int int7 = nonLinearConjugateGradientOptimizer4.getIterations();
        int int8 = nonLinearConjugateGradientOptimizer4.getMaxIterations();
        int int9 = nonLinearConjugateGradientOptimizer4.getMaxEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker10 = nonLinearConjugateGradientOptimizer4.getConvergenceChecker();
        double[] doubleArray11 = nonLinearConjugateGradientOptimizer4.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker12 = nonLinearConjugateGradientOptimizer4.getConvergenceChecker();
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker20 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) 'a', 100.0d, false, (int) (short) 1, (int) (short) 100, randomGenerator18, false, pointValuePairConvergenceChecker20);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = null;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker29 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer((int) (short) 1, (double) (byte) -1, false, (int) (byte) 100, (int) (byte) 10, randomGenerator27, true, pointValuePairConvergenceChecker29);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker31 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer32 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker31);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep34 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray35 = new org.apache.commons.math3.optim.OptimizationData[] { bracketingStep34 };
        simplexOptimizer32.parseOptimizationData(optimizationDataArray35);
        cMAESOptimizer30.parseOptimizationData(optimizationDataArray35);
        java.util.List<java.lang.Double> doubleList38 = cMAESOptimizer30.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList39 = cMAESOptimizer30.getStatisticsSigmaHistory();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker40 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer41 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer(pointValuePairConvergenceChecker40);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize43 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((int) '4');
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep45 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        double double46 = bracketingStep45.getBracketingStep();
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray47 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize43, bracketingStep45 };
        simplexOptimizer41.parseOptimizationData(optimizationDataArray47);
        cMAESOptimizer30.parseOptimizationData(optimizationDataArray47);
        cMAESOptimizer21.parseOptimizationData(optimizationDataArray47);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.PointValuePair pointValuePair51 = nonLinearConjugateGradientOptimizer4.optimize(optimizationDataArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(pointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(pointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(optimizationDataArray35);
        org.junit.Assert.assertNotNull(doubleList38);
        org.junit.Assert.assertNotNull(doubleList39);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(optimizationDataArray47);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getIterations();
        double[] doubleArray7 = levenbergMarquardtOptimizer3.getUpperBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker8);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) 100.0f, (double) (short) 1, (double) (short) -1);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) 1.0f, (double) 0, 0.0d, (double) 10);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(0.0d, (double) 52, (double) 100L);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertNull(pointVectorValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula2 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker3 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver4 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer5 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula2, pointValuePairConvergenceChecker3, univariateSolver4);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker6 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver7 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner8 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer9 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula2, pointValuePairConvergenceChecker6, univariateSolver7, preconditioner8);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker10 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer11 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula2, pointValuePairConvergenceChecker10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker12 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver13 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer14 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula2, pointValuePairConvergenceChecker12, univariateSolver13);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker15 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver16 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner17 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer18 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula2, pointValuePairConvergenceChecker15, univariateSolver16, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner17);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker19 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver20 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula21 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker22 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver23 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula24 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker25 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver26 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer27 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula24, pointValuePairConvergenceChecker25, univariateSolver26);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker28 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver29 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer30 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula24, pointValuePairConvergenceChecker28, univariateSolver29);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker31 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver32 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner33 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer34 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula24, pointValuePairConvergenceChecker31, univariateSolver32, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner33);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer35 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula21, pointValuePairConvergenceChecker22, univariateSolver23, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner33);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer36 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula2, pointValuePairConvergenceChecker19, univariateSolver20, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner33);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula37 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker38 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver39 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer40 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula37, pointValuePairConvergenceChecker38, univariateSolver39);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker41 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver42 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer43 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula37, pointValuePairConvergenceChecker41, univariateSolver42);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker44 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver45 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer46 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula37, pointValuePairConvergenceChecker44, univariateSolver45);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker47 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer48 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula37, pointValuePairConvergenceChecker47);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker49 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer50 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula37, pointValuePairConvergenceChecker49);
        org.apache.commons.math3.random.RandomGenerator randomGenerator56 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer64 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker65 = simplexOptimizer64.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer66 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker65);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(10, (double) 0L, false, (int) (byte) 10, (int) (short) -1, randomGenerator56, true, pointValuePairConvergenceChecker65);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer68 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula37, pointValuePairConvergenceChecker65);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer69 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula2, pointValuePairConvergenceChecker65);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer70 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(35.0d, (double) (short) 1, pointValuePairConvergenceChecker65);
        int int71 = powellOptimizer70.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + formula2 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula2.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula21 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula21.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula24 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula24.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula37 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula37.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker65);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize1 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula7 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker8 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver9 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer10 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker8, univariateSolver9);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker11 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver12 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer13 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker11, univariateSolver12);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker14 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver15 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer16 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker14, univariateSolver15);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker17 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer18 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker17);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker19 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer20 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer34 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker35 = simplexOptimizer34.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer36 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker35);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(10, (double) 0L, false, (int) (byte) 10, (int) (short) -1, randomGenerator26, true, pointValuePairConvergenceChecker35);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer38 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker35);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula39 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer46 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker47 = simplexOptimizer46.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer48 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 100.0f, (double) (short) 100, (double) '4', 10.0d, pointValuePairConvergenceChecker47);
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver49 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula50 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker51 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver52 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer53 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula50, pointValuePairConvergenceChecker51, univariateSolver52);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker54 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver55 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner56 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer57 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula50, pointValuePairConvergenceChecker54, univariateSolver55, preconditioner56);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker58 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer59 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula50, pointValuePairConvergenceChecker58);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker60 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver61 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula62 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker63 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver64 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula65 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker66 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver67 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer68 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula65, pointValuePairConvergenceChecker66, univariateSolver67);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker69 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver70 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer71 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula65, pointValuePairConvergenceChecker69, univariateSolver70);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker72 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver73 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner74 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer75 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula65, pointValuePairConvergenceChecker72, univariateSolver73, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner74);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer76 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula62, pointValuePairConvergenceChecker63, univariateSolver64, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner74);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker77 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver78 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula79 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker80 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver81 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula formula82 = org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker83 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver84 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer85 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula82, pointValuePairConvergenceChecker83, univariateSolver84);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker86 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver87 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer88 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula82, pointValuePairConvergenceChecker86, univariateSolver87);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker89 = null;
        org.apache.commons.math3.analysis.solvers.UnivariateSolver univariateSolver90 = null;
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner91 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer92 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula82, pointValuePairConvergenceChecker89, univariateSolver90, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner91);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer93 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula79, pointValuePairConvergenceChecker80, univariateSolver81, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner91);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer94 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula62, pointValuePairConvergenceChecker77, univariateSolver78, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner91);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer95 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula50, pointValuePairConvergenceChecker60, univariateSolver61, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner91);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer96 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula39, pointValuePairConvergenceChecker47, univariateSolver49, (org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner) identityPreconditioner91);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer97 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer(formula7, pointValuePairConvergenceChecker47);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer cMAESOptimizer98 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer(1, (double) 32, true, (int) (short) 10, (-1), randomGenerator5, true, pointValuePairConvergenceChecker47);
        java.util.List<java.lang.Double> doubleList99 = cMAESOptimizer98.getStatisticsSigmaHistory();
        org.junit.Assert.assertTrue("'" + formula7 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula7.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker35);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker47);
        org.junit.Assert.assertTrue("'" + formula50 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula50.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula62 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula62.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula65 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula65.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula79 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula79.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertTrue("'" + formula82 + "' != '" + org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES + "'", formula82.equals(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES));
        org.junit.Assert.assertNotNull(doubleList99);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 1, (-1.0d), (double) 0L, (double) 1.0f, 100.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getIterations();
        int int13 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray14 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray15 = levenbergMarquardtOptimizer5.getUpperBound();
        int int16 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int17 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray18 = levenbergMarquardtOptimizer5.getStartPoint();
        int int19 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray20 = levenbergMarquardtOptimizer5.getLowerBound();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(doubleArray20);
    }
}

