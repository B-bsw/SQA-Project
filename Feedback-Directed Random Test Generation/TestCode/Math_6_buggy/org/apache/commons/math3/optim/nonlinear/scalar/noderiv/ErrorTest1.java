package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0L, 100.0d, (double) 52, (double) 1, (double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 52, (double) (byte) -1, (double) (-1L));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 10, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair3 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getLowerBound();
        int int13 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 52, (double) (-1.0f), (double) (short) -1, 0.0d, (double) '4');
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getLowerBound();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0.0f, 0.0d, (double) 0.0f, 0.0d, (double) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1, (double) (-1L), (double) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getIterations();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, 0.0d, (double) ' ', 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, 0.0d, (double) ' ', 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner8 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray9);
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray13 = identityPreconditioner8.precondition(doubleArray9, doubleArray11);
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray14);
        double[] doubleArray16 = sigma15.getSigma();
        double[] doubleArray17 = sigma15.getSigma();
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = identityPreconditioner8.precondition(doubleArray17, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma21 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray20);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma22 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray20);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma23 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray20);
        double[] doubleArray24 = sigma23.getSigma();
        double[] doubleArray29 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma30 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray29);
        double[] doubleArray31 = sigma30.getSigma();
        double[] doubleArray32 = sigma30.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma33 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray32);
        double[] doubleArray34 = identityPreconditioner8.precondition(doubleArray24, doubleArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray36 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray34, (double) '#');
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getLowerBound();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, 0.0d, (double) ' ', 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(1.0d, 0.0d, 35.0d);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((-1.0d), (double) 'a', (double) (short) 10, (double) 10L, (double) 0.0f);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(1.0d, (double) 100.0f);
        int int3 = powellOptimizer2.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair4 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray14);
        double[] doubleArray16 = sigma15.getSigma();
        double[] doubleArray17 = sigma15.getSigma();
        double[] doubleArray18 = sigma15.getSigma();
        double[] doubleArray19 = sigma15.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray21 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray19, (double) (-1L));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 100, 0.0d, (double) 52);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) -1, 1.0d, (double) (short) 10, (double) 97, (double) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) 10, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getIterations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getUpperBound();
        double[] doubleArray7 = levenbergMarquardtOptimizer3.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 1, (-1.0d), (double) 0L, (double) 1.0f, 100.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(97.0d, (double) 1L, (double) (short) -1, (double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) 0, (double) 'a', (double) 0L, (double) 1L);
        int int6 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getLowerBound();
        int int10 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int12 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 52, (double) (byte) -1, (double) (-1L));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '4', (double) 1, (double) 0L);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer3.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner9 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray12);
        double[] doubleArray14 = identityPreconditioner9.precondition(doubleArray10, doubleArray12);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray14);
        double[] doubleArray16 = sigma15.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray16, (double) 0);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10L, (double) 'a', (double) (byte) 0, (double) (byte) 100, (double) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 0, 100.0d, (double) '4');
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(97.0d, 0.0d, (double) 'a');
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '#', 97.0d, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer6 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> pointValuePairConvergenceChecker7 = simplexOptimizer6.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 1, (double) (-1.0f), 10.0d, pointValuePairConvergenceChecker7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair9 = powellOptimizer8.doOptimize();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) -1, (double) 35, 10.0d);
        int int4 = levenbergMarquardtOptimizer3.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 100.0f, (double) (short) 100, 100.0d, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getStartPoint();
        int int10 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker11 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (-1L), 10.0d, (double) (-1), 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker11 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer5.getEvaluations();
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '4', 0.0d, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 10.0f, (double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair3 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10L, 10.0d, (double) (short) 0, (double) (-1L), (double) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double[] doubleArray2 = levenbergMarquardtOptimizer0.getStartPoint();
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = levenbergMarquardtOptimizer0.getWeight();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getUpperBound();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getUpperBound();
        double[] doubleArray16 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray16);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma18 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray16);
        double[] doubleArray19 = sigma18.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma20 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray19);
        double[] doubleArray21 = sigma20.getSigma();
        double[] doubleArray22 = sigma20.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray24 = levenbergMarquardtOptimizer5.computeSigma(doubleArray22, 32.0d);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 100, (double) (short) 10, (double) 1L, (double) 52, (double) (short) 10);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getLowerBound();
        double[] doubleArray11 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray13 = sigma12.getSigma();
        double[] doubleArray14 = sigma12.getSigma();
        double[] doubleArray15 = sigma12.getSigma();
        double[] doubleArray16 = sigma12.getSigma();
        double[] doubleArray17 = sigma12.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = levenbergMarquardtOptimizer5.computeSigma(doubleArray17, (double) 97);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, 1.0d, (double) (-1), (double) 10, (double) 10);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 0, (double) 100.0f, (double) 32, 35.0d, (double) ' ');
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getUpperBound();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 1, (double) 0.0f, (double) 10L);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getUpperBound();
        double[] doubleArray9 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray9);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray9);
        double[] doubleArray12 = sigma11.getSigma();
        double[] doubleArray13 = sigma11.getSigma();
        double[] doubleArray14 = sigma11.getSigma();
        double[] doubleArray15 = sigma11.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer3.computeCovariances(doubleArray15, (double) 100L);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (-1), (double) 100.0f, (double) ' ', 35.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getIterations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray15 = new double[] { 1.0d, (byte) 100, 1L, (short) 100, 0.0f };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray15, (double) (short) 1);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) 0, (double) 'a', (double) 0L, (double) 1L);
        int int6 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma9 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray8);
        double[] doubleArray10 = sigma9.getSigma();
        double[] doubleArray11 = sigma9.getSigma();
        double[] doubleArray12 = sigma9.getSigma();
        double[] doubleArray13 = sigma9.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        double[] doubleArray15 = sigma14.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray15, (-1.0d));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getIterations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray13 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        double[] doubleArray15 = sigma14.getSigma();
        double[] doubleArray16 = sigma14.getSigma();
        double[] doubleArray17 = sigma14.getSigma();
        double[] doubleArray18 = sigma14.getSigma();
        double[] doubleArray19 = sigma14.getSigma();
        double[] doubleArray20 = sigma14.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray22 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray20, (double) 1L);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 100.0f, (double) 0.0f, 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getStartPoint();
        int int7 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getStartPoint();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker11 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer5.getEvaluations();
        int int13 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray14 = levenbergMarquardtOptimizer5.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker11 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 100, 0.0d, (double) ' ', 0.0d, (double) ' ');
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
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma19 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray18);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma20 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray18);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma21 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray18);
        double[] doubleArray22 = sigma21.getSigma();
        double[] doubleArray27 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma28 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray27);
        double[] doubleArray29 = sigma28.getSigma();
        double[] doubleArray30 = sigma28.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma31 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray30);
        double[] doubleArray32 = identityPreconditioner6.precondition(doubleArray22, doubleArray30);
        double[] doubleArray37 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma38 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray37);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma39 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray37);
        double[] doubleArray40 = sigma39.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma41 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray40);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma42 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray40);
        double[] doubleArray47 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma48 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray47);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma49 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray47);
        double[] doubleArray50 = sigma49.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma51 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray50);
        double[] doubleArray52 = identityPreconditioner6.precondition(doubleArray40, doubleArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray54 = levenbergMarquardtOptimizer5.computeSigma(doubleArray40, 0.0d);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getStartPoint();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(100.0d, (double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair3 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 1, (-1.0d), (double) 0L, (double) 1.0f, 100.0d);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 1L, (double) 1.0f);
        org.apache.commons.math3.optim.nonlinear.scalar.GoalType goalType3 = powellOptimizer2.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair4 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 0, (double) '#', (double) 10L, 0.0d, (double) 100L);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker11 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer5.getEvaluations();
        int int13 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        double[] doubleArray1 = levenbergMarquardtOptimizer0.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double[] doubleArray7 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray7);
        double[] doubleArray9 = sigma8.getSigma();
        double[] doubleArray10 = sigma8.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer0.computeCovariances(doubleArray10, (double) 1);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getStartPoint();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 100.0f, (double) 0L);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getLowerBound();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getLowerBound();
        int int13 = levenbergMarquardtOptimizer5.getIterations();
        int int14 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray15 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (byte) 10, 35.0d, (double) (-1L), (double) (byte) 0);
        int int5 = powellOptimizer4.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair6 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1L, (double) 100, (double) 100L);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getUpperBound();
        int int6 = levenbergMarquardtOptimizer3.getMaxIterations();
        double[] doubleArray7 = levenbergMarquardtOptimizer3.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int12 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int14 = levenbergMarquardtOptimizer5.getEvaluations();
        double[] doubleArray15 = levenbergMarquardtOptimizer5.getUpperBound();
        int int16 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int17 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int18 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double19 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma21 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray20);
        double[] doubleArray22 = sigma21.getSigma();
        double[] doubleArray23 = sigma21.getSigma();
        double[] doubleArray24 = sigma21.getSigma();
        double[] doubleArray25 = sigma21.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma26 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray25);
        double[] doubleArray27 = sigma26.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma28 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray30 = levenbergMarquardtOptimizer5.computeSigma(doubleArray27, (double) (byte) 10);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(52.0d, (double) '4', 0.0d, (double) (byte) 100, (double) ' ');
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getUpperBound();
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(97.0d, 0.0d, (double) 1);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, 32.0d, (double) (byte) 1, 97.0d, 97.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        int int12 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer5.getEvaluations();
        int int14 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '4', 0.0d, 0.0d);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
        int int5 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer3.getIterations();
        int int7 = levenbergMarquardtOptimizer3.getIterations();
        int int8 = levenbergMarquardtOptimizer3.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 0, (double) (byte) 10, (double) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getUpperBound();
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(97.0d, 0.0d, (double) 1);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) 10, (double) (byte) 10);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (-1), (double) ' ', 10.0d, 0.0d, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner7 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma9 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray8);
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray12 = identityPreconditioner7.precondition(doubleArray8, doubleArray10);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = levenbergMarquardtOptimizer5.computeSigma(doubleArray10, (double) ' ');
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 0, (double) 100.0f, (double) (short) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getStartPoint();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma7 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray6);
        double[] doubleArray8 = sigma7.getSigma();
        double[] doubleArray9 = sigma7.getSigma();
        double[] doubleArray10 = sigma7.getSigma();
        double[] doubleArray11 = sigma7.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = levenbergMarquardtOptimizer3.computeSigma(doubleArray11, (double) 1);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 10, (double) 1.0f);
        int int3 = powellOptimizer2.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair4 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = levenbergMarquardtOptimizer5.getRMS();
    }
}

