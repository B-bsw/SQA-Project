package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = levenbergMarquardtOptimizer5.computeSigma(doubleArray8, 0.0d);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double[] doubleArray14 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = levenbergMarquardtOptimizer5.computeSigma(doubleArray14, 10.0d);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray11 = new double[] { 1, 10.0f, 1.0d, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = levenbergMarquardtOptimizer5.computeSigma(doubleArray11, (double) 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray10 = new double[] { (byte) 100, (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = levenbergMarquardtOptimizer5.computeSigma(doubleArray10, (double) (byte) 10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray12 = new double[] { 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = levenbergMarquardtOptimizer5.computeSigma(doubleArray12, (double) 'a');
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray10 = new org.apache.commons.math3.optim.OptimizationData[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointVectorValuePair pointVectorValuePair11 = levenbergMarquardtOptimizer5.optimize(optimizationDataArray10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray11 = new double[] { 100L, (byte) 10, (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray11, (double) (byte) 1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 100.0f, (double) '4', 10.0d, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int12 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(1.0d, (double) (short) 0, (double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma5 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer3.computeSigma(doubleArray4, (double) (-1L));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getIterations();
        int int2 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double[] doubleArray3 = levenbergMarquardtOptimizer0.getUpperBound();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner4 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma6 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray5);
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray7);
        double[] doubleArray9 = identityPreconditioner4.precondition(doubleArray5, doubleArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer0.computeCovariances(doubleArray9, (double) (short) 100);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int12 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer5.getMaxIterations();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize(1);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep17 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep((double) 10);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize populationSize19 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize(1);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray20 = new org.apache.commons.math3.optim.OptimizationData[] { populationSize15, bracketingStep17, populationSize19 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointVectorValuePair pointVectorValuePair21 = levenbergMarquardtOptimizer5.optimize(optimizationDataArray20);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray1);
        double[] doubleArray3 = sigma2.getSigma();
        double[] doubleArray4 = sigma2.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer0.computeSigma(doubleArray4, (double) '#');
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getIterations();
        int int2 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double[] doubleArray8 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma9 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer0.computeCovariances(doubleArray8, (double) '#');
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '4', (double) 1, (double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getUpperBound();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        double double12 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        double[] doubleArray15 = sigma14.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = levenbergMarquardtOptimizer5.computeSigma(doubleArray15, (double) '4');
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix1 = levenbergMarquardtOptimizer0.getWeight();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray12 = sigma11.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = levenbergMarquardtOptimizer5.computeSigma(doubleArray12, (double) 1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) '4', (double) 0L, 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray14 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray14);
        double[] doubleArray16 = sigma15.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray16, 0.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 10, (double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair3 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) ' ', (double) 10L, (double) (short) 0, (double) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner13 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray14);
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray16);
        double[] doubleArray18 = identityPreconditioner13.precondition(doubleArray14, doubleArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = levenbergMarquardtOptimizer5.computeSigma(doubleArray14, (double) 'a');
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 52, (double) (byte) -1, (double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 1, 10.0d, (double) (short) 100, (double) (-1.0f));
        int int5 = powellOptimizer4.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair6 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 52, (double) (byte) -1, (double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1L, (double) '#', (double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray12);
        double[] doubleArray14 = sigma13.getSigma();
        double[] doubleArray15 = sigma13.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray15, (double) '#');
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getIterations();
        int int13 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, 0.0d, (double) ' ', 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((-1.0d), (double) 10L, (double) (short) 100);
        int int4 = levenbergMarquardtOptimizer3.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 1, (double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, 1.0d, (double) (-1), (double) 10, (double) 10);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getIterations();
        int int2 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = levenbergMarquardtOptimizer0.getTargetSize();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getLowerBound();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray13 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray13, (double) 0L);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        double[] doubleArray10 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = levenbergMarquardtOptimizer3.computeSigma(doubleArray10, (double) (byte) -1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((-1.0d), (double) 10L, (double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, 0.0d, (double) (short) 100, (double) (-1), (double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma9 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray8);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = levenbergMarquardtOptimizer5.computeSigma(doubleArray8, 0.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray11 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray14 = sigma13.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = levenbergMarquardtOptimizer5.computeSigma(doubleArray14, 35.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getLowerBound();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker11 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer3.computeCovariances(doubleArray16, (double) 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '#', 100.0d, (-1.0d), (double) (short) 100, (double) 10.0f);
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma7 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray6);
        double[] doubleArray8 = sigma7.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray10 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray8, 0.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) '4', 100.0d, (double) '4', (double) 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(1.0d, (double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair3 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, 0.0d, (double) ' ', 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray12 = sigma11.getSigma();
        double[] doubleArray13 = sigma11.getSigma();
        double[] doubleArray14 = sigma11.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray14, (double) (byte) 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getUpperBound();
        int int13 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(97.0d, 0.0d, (double) 1);
        double[] doubleArray8 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma9 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray8);
        double[] doubleArray10 = sigma9.getSigma();
        double[] doubleArray11 = sigma9.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer3.computeCovariances(doubleArray11, (double) 0L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 52, (double) (byte) -1, (double) (-1L));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(97.0d, 0.0d, (double) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 52, (double) (byte) -1, (double) (-1L));
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma5 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray4);
        double[] doubleArray6 = sigma5.getSigma();
        double[] doubleArray7 = sigma5.getSigma();
        double[] doubleArray8 = sigma5.getSigma();
        double[] doubleArray9 = sigma5.getSigma();
        double[] doubleArray10 = sigma5.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = levenbergMarquardtOptimizer3.computeSigma(doubleArray10, (double) (short) 1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
        int int15 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getIterations();
        int int13 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0.0f, (double) ' ', (double) (short) -1, (double) (byte) 10, (double) '4');
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray12 = new double[] { 0.0d, 97.0d, (byte) 0, 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray12, (double) 1.0f);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getLowerBound();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) ' ', (double) 10L, (double) (-1), (double) 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(0.0d, 0.0d, (double) (byte) 10, (double) 1, (double) 100L);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner6 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray7);
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray9);
        double[] doubleArray11 = identityPreconditioner6.precondition(doubleArray7, doubleArray9);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray13 = sigma12.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = levenbergMarquardtOptimizer5.computeSigma(doubleArray13, 35.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getIterations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray11 = new org.apache.commons.math3.optim.OptimizationData[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointVectorValuePair pointVectorValuePair12 = levenbergMarquardtOptimizer5.optimize(optimizationDataArray11);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, 100.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getIterations();
        int int13 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int15 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma3 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer0.computeCovariances(doubleArray1, (double) (short) 10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getIterations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(0.0d, (double) 100, (double) (short) 100, (double) (short) 1, (double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray12 = sigma11.getSigma();
        double[] doubleArray13 = sigma11.getSigma();
        double[] doubleArray14 = sigma11.getSigma();
        double[] doubleArray15 = sigma11.getSigma();
        double[] doubleArray16 = sigma11.getSigma();
        double[] doubleArray17 = sigma11.getSigma();
        double[] doubleArray18 = sigma11.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray18, (double) 1L);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 32, (double) (byte) 0, (double) 10.0f, (double) (-1L), (double) 10.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1L, (double) 100, (double) 100L);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer5.getChiSquare();
        double double13 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1L, (double) '#', (double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 1.0f, 10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair3 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = levenbergMarquardtOptimizer5.computeSigma(doubleArray11, 0.0d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1L, (double) 100, (double) 100L);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10L, (double) 0L, (double) 100, (double) 10, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) (byte) 100, (double) (short) 1, (double) (-1L), (double) (byte) 10);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getUpperBound();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner7 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma9 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray8);
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray12 = identityPreconditioner7.precondition(doubleArray8, doubleArray10);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        double[] doubleArray15 = sigma14.getSigma();
        double[] doubleArray16 = sigma14.getSigma();
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = identityPreconditioner7.precondition(doubleArray16, doubleArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray17, (double) (byte) 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        double[] doubleArray17 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma19 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray18);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma20 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray22 = levenbergMarquardtOptimizer5.computeSigma(doubleArray18, (double) 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '4', (double) 1, (double) 0L);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(10.0d, (double) ' ', (double) 0.0f, (-1.0d), (double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (-1L), (double) 100.0f, (double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getUpperBound();
        int int13 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1, (double) (short) 1, (double) 1L, (double) 1L, (double) 52);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1L, (double) '#', (double) 0.0f);
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner4 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma6 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray5);
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray7);
        double[] doubleArray9 = identityPreconditioner4.precondition(doubleArray5, doubleArray7);
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray12 = sigma11.getSigma();
        double[] doubleArray13 = sigma11.getSigma();
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = identityPreconditioner4.precondition(doubleArray13, doubleArray14);
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray16);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma18 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray16);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma19 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray16);
        double[] doubleArray20 = sigma19.getSigma();
        double[] doubleArray25 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma26 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray25);
        double[] doubleArray27 = sigma26.getSigma();
        double[] doubleArray28 = sigma26.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma29 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray28);
        double[] doubleArray30 = identityPreconditioner4.precondition(doubleArray20, doubleArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray32 = levenbergMarquardtOptimizer3.computeCovariances(doubleArray20, (double) 100);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker11 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray12);
        double[] doubleArray14 = sigma13.getSigma();
        double[] doubleArray15 = sigma13.getSigma();
        double[] doubleArray16 = sigma13.getSigma();
        double[] doubleArray17 = sigma13.getSigma();
        double[] doubleArray18 = sigma13.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray18, (double) 1.0f);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, 1.0d, (double) (-1), (double) 10, (double) 10);
        int int6 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray17 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma18 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray17);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma19 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray17);
        double[] doubleArray20 = sigma19.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma21 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray20);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma22 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray24 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray20, 97.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) -1, (double) (-1), (double) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getUpperBound();
        int int13 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 0, 100.0d, (double) '4');
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, 0.0d, (double) ' ', 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 100.0f, (double) 0L);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, 0.0d, (double) ' ', 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getStartPoint();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) -1, (double) (-1), (double) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner5 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma7 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray6);
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma9 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray8);
        double[] doubleArray10 = identityPreconditioner5.precondition(doubleArray6, doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer3.computeCovariances(doubleArray6, (double) (short) 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getUpperBound();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        double double12 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (-1), (double) (-1), (double) '#', (double) (byte) 10, (double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getUpperBound();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) 10, (double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getLowerBound();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '#', 100.0d, (-1.0d), (double) (short) 100, (double) 10.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '4', (double) 1, (double) 0L);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 1, (double) (short) 1);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getUpperBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) 0, (double) 'a', (double) 0L, (double) 1L);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getLowerBound();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0.0f, (double) ' ', (double) (short) -1, (double) (byte) 10, (double) '4');
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 100.0f, (double) (short) 100, 100.0d, 0.0d);
        double[] doubleArray5 = powellOptimizer4.getStartPoint();
        double[] doubleArray6 = powellOptimizer4.getUpperBound();
        int int7 = powellOptimizer4.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair8 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
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
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma18 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray17);
        double[] doubleArray19 = sigma18.getSigma();
        double[] doubleArray20 = sigma18.getSigma();
        double[] doubleArray21 = sigma18.getSigma();
        double[] doubleArray22 = sigma18.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma23 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray22);
        double[] doubleArray24 = sigma23.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray26 = levenbergMarquardtOptimizer5.computeSigma(doubleArray24, (double) 1.0f);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getStartPoint();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getIterations();
        double[] doubleArray2 = levenbergMarquardtOptimizer0.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = levenbergMarquardtOptimizer0.getTargetSize();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) ' ', (double) (byte) 10, (double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 1, 35.0d, (double) (byte) -1, (double) (-1), 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(0.0d, 100.0d, (double) (short) 10, (double) (-1L), (double) 100L);
        double[] doubleArray10 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray10, 1.0d);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getLowerBound();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 1, (double) 0.0f, (double) 10L);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) 1.0f, (double) 0, 0.0d, (double) 10);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getIterations();
        int int2 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = levenbergMarquardtOptimizer0.getTargetSize();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getLowerBound();
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
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma23 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray22);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma24 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray22);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma25 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray22);
        double[] doubleArray26 = sigma25.getSigma();
        double[] doubleArray31 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma32 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray31);
        double[] doubleArray33 = sigma32.getSigma();
        double[] doubleArray34 = sigma32.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma35 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray34);
        double[] doubleArray36 = identityPreconditioner10.precondition(doubleArray26, doubleArray34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray38 = levenbergMarquardtOptimizer5.computeSigma(doubleArray36, (double) 1.0f);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, 1.0d, (double) (-1), (double) 10, (double) 10);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getLowerBound();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 100.0f, (double) 0.0f, 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getIterations();
        double[] doubleArray2 = levenbergMarquardtOptimizer0.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        double[] doubleArray5 = levenbergMarquardtOptimizer0.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer0.getWeight();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getStartPoint();
        int int10 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker11 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (-1), (double) (-1), (double) '#', (double) (byte) 10, (double) 1.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int12 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 100, 0.0d, (double) 52);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double[] doubleArray11 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray13 = sigma12.getSigma();
        double[] doubleArray14 = sigma12.getSigma();
        double[] doubleArray15 = sigma12.getSigma();
        double[] doubleArray16 = sigma12.getSigma();
        double[] doubleArray17 = sigma12.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = levenbergMarquardtOptimizer3.computeSigma(doubleArray17, 0.0d);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 0, (double) 100.0f, (double) (short) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 100.0f, (double) 0L);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 0, 10.0d, (double) 35, (double) 100, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (byte) 10, (double) 'a', (double) (short) 1, (double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getLowerBound();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getLowerBound();
        int int13 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray19 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma20 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray19);
        double[] doubleArray21 = sigma20.getSigma();
        double[] doubleArray22 = sigma20.getSigma();
        double[] doubleArray23 = sigma20.getSigma();
        double[] doubleArray24 = sigma20.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray26 = levenbergMarquardtOptimizer5.computeSigma(doubleArray24, (double) (short) 100);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix2 = levenbergMarquardtOptimizer0.getWeight();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 0, (double) 100.0f, (double) (short) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner5 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma7 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray6);
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma9 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray8);
        double[] doubleArray10 = identityPreconditioner5.precondition(doubleArray6, doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = levenbergMarquardtOptimizer3.computeSigma(doubleArray8, 1.0d);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0.0f, (double) 100.0f, (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 100.0f, (double) 0.0f, 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, 1.0d, (double) (-1), (double) 10, (double) 10);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray14 = new double[] { 'a', (byte) 0, '#', 10.0d, 32 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray16 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray14, (double) '4');
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getIterations();
        int int13 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (-1), 97.0d, (double) 10.0f, (double) (short) 100, (double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner9 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray12);
        double[] doubleArray14 = identityPreconditioner9.precondition(doubleArray10, doubleArray12);
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma16 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray15);
        double[] doubleArray17 = sigma16.getSigma();
        double[] doubleArray18 = sigma16.getSigma();
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = identityPreconditioner9.precondition(doubleArray18, doubleArray19);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma22 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray21);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma23 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray21);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma24 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray21);
        double[] doubleArray25 = sigma24.getSigma();
        double[] doubleArray30 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma31 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray30);
        double[] doubleArray32 = sigma31.getSigma();
        double[] doubleArray33 = sigma31.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma34 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray33);
        double[] doubleArray35 = identityPreconditioner9.precondition(doubleArray25, doubleArray33);
        double[] doubleArray40 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma41 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray40);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma42 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray40);
        double[] doubleArray43 = sigma42.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma44 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray43);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma45 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray43);
        double[] doubleArray50 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma51 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray50);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma52 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray50);
        double[] doubleArray53 = sigma52.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma54 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray53);
        double[] doubleArray55 = identityPreconditioner9.precondition(doubleArray43, doubleArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray57 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray43, (double) (short) -1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(10.0d, (double) (byte) 100, (double) '#', (double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 0, 100.0d, (double) '4');
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 10, (double) 1.0f, (double) (byte) 100, (double) 0L);
        int int5 = powellOptimizer4.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair6 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(1.0d, (double) (short) 0, (double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 0, 10.0d, (double) 35, (double) 100, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) '#', (double) (byte) 10);
        double[] doubleArray3 = powellOptimizer2.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair4 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) 10, (double) (byte) 10);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '4', (double) 1, (double) 0L);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (-1), (double) (-1.0f), (double) (byte) 100, (double) 97, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(1.0d, 0.0d, 35.0d);
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma5 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray4);
        double[] doubleArray6 = sigma5.getSigma();
        double[] doubleArray7 = sigma5.getSigma();
        double[] doubleArray8 = sigma5.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma9 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = levenbergMarquardtOptimizer3.computeSigma(doubleArray8, (double) 'a');
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
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
        double[] doubleArray19 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma20 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray19);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma21 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray19);
        double[] doubleArray22 = sigma21.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray24 = levenbergMarquardtOptimizer5.computeSigma(doubleArray22, (double) '#');
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 1.0f, (double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair3 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 10, (double) 1.0f);
        org.apache.commons.math3.optim.nonlinear.scalar.GoalType goalType3 = powellOptimizer2.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair4 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double[] doubleArray13 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        double[] doubleArray15 = sigma14.getSigma();
        double[] doubleArray16 = sigma14.getSigma();
        double[] doubleArray17 = sigma14.getSigma();
        double[] doubleArray18 = sigma14.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray18, 0.0d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 100, 0.0d, (double) 52);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 1, (double) 1L, (double) (byte) 1, (double) 32);
        int int5 = powellOptimizer4.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair6 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, 0.0d, (double) ' ', 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '4', 0.0d, 0.0d);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, 0.0d, (double) (short) 100, (double) (-1), (double) 1.0f);
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma7 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray6);
        double[] doubleArray8 = sigma7.getSigma();
        double[] doubleArray9 = sigma7.getSigma();
        double[] doubleArray10 = sigma7.getSigma();
        double[] doubleArray11 = sigma7.getSigma();
        double[] doubleArray12 = sigma7.getSigma();
        double[] doubleArray13 = sigma7.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray13, (double) (byte) 1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 100.0f, (double) (short) 100, 100.0d, 0.0d);
        double[] doubleArray5 = powellOptimizer4.getStartPoint();
        double[] doubleArray6 = powellOptimizer4.getUpperBound();
        int int7 = powellOptimizer4.getMaxIterations();
        org.apache.commons.math3.optim.nonlinear.scalar.GoalType goalType8 = powellOptimizer4.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair9 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, 100.0d);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(0.0d, 0.0d, (double) (byte) 10, (double) 1, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '4', (double) 1, (double) 0L);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getLowerBound();
        double[] doubleArray15 = new double[] { 0.0d, 1.0f, 10, 52.0d };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray15, (double) 100L);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) -1, 1.0d, (double) (short) 10, (double) 97, (double) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, 0.0d, (double) ' ', 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
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
        int int16 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray17 = levenbergMarquardtOptimizer5.getUpperBound();
        int int18 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray23 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma24 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray23);
        double[] doubleArray25 = sigma24.getSigma();
        double[] doubleArray26 = sigma24.getSigma();
        double[] doubleArray27 = sigma24.getSigma();
        double[] doubleArray28 = sigma24.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray30 = levenbergMarquardtOptimizer5.computeSigma(doubleArray28, (double) 1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker12 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 'a', 35.0d, (double) (short) 1, (double) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
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
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner18 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma20 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray19);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma22 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray21);
        double[] doubleArray23 = identityPreconditioner18.precondition(doubleArray19, doubleArray21);
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma25 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray24);
        double[] doubleArray26 = sigma25.getSigma();
        double[] doubleArray27 = sigma25.getSigma();
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = identityPreconditioner18.precondition(doubleArray27, doubleArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray31 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray28, (double) (byte) 1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(0.0d, 100.0d, (double) (short) 10, (double) (-1L), (double) 100L);
        double[] doubleArray10 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray12 = sigma11.getSigma();
        double[] doubleArray13 = sigma11.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        double[] doubleArray15 = sigma14.getSigma();
        double[] doubleArray16 = sigma14.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray16);
        double[] doubleArray18 = sigma17.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray18, (-1.0d));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(1.0d, (double) (short) 0, (double) 100);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(10.0d, (double) ' ', (double) 0.0f, (-1.0d), (double) (byte) 1);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getLowerBound();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray26 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray23, (double) (byte) -1);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 1, 35.0d, (double) (byte) -1, (double) (-1), 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0.0f, (double) 100.0f, (double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        double[] doubleArray1 = levenbergMarquardtOptimizer0.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer0.getTarget();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(97.0d, 0.0d, (double) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner9 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray12);
        double[] doubleArray14 = identityPreconditioner9.precondition(doubleArray10, doubleArray12);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray14);
        double[] doubleArray16 = sigma15.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray16, (double) (byte) 100);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getLowerBound();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 100, (double) (short) 10, (double) 1L, (double) 52, (double) (short) 10);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10L, (double) 'a', (double) (byte) 0, (double) (byte) 100, (double) (byte) -1);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 0, 100.0d, (double) '4');
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 100, (double) (short) 0, (-1.0d), (double) 1, 10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (byte) 10, (double) 100L, 97.0d, (double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getUpperBound();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double[] doubleArray2 = levenbergMarquardtOptimizer0.getStartPoint();
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        double[] doubleArray4 = levenbergMarquardtOptimizer0.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = levenbergMarquardtOptimizer0.getWeightSquareRoot();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((-1.0d), 10.0d, 100.0d);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1L, (double) 100, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) ' ', (double) 10L, (double) (-1), (double) 52);
        double[] doubleArray5 = powellOptimizer4.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair6 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getUpperBound();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 52, (double) (byte) -1, (double) (-1L));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '#', 100.0d, (-1.0d), (double) (short) 100, (double) 10.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray11 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray13 = sigma12.getSigma();
        double[] doubleArray14 = sigma12.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = levenbergMarquardtOptimizer5.computeSigma(doubleArray14, (double) 10L);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getIterations();
        int int13 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int15 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int16 = levenbergMarquardtOptimizer5.getMaxIterations();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray30 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray28, (double) 'a');
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getUpperBound();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 0, 100.0d, (double) '4');
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma5 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray4);
        double[] doubleArray6 = sigma5.getSigma();
        double[] doubleArray7 = sigma5.getSigma();
        double[] doubleArray8 = sigma5.getSigma();
        double[] doubleArray9 = sigma5.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray9);
        double[] doubleArray11 = sigma10.getSigma();
        double[] doubleArray12 = sigma10.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer3.computeCovariances(doubleArray12, 0.0d);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 52, (double) (-1.0f), (double) (short) -1, 0.0d, (double) '4');
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getLowerBound();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, 0.0d, (double) ' ', 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getLowerBound();
        int int10 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0.0f, (double) ' ', (double) (short) -1, (double) (byte) 10, (double) '4');
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(1.0d, (double) (byte) 10);
        int int3 = powellOptimizer2.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair4 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getLowerBound();
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray14);
        double[] doubleArray16 = sigma15.getSigma();
        double[] doubleArray17 = sigma15.getSigma();
        double[] doubleArray18 = sigma15.getSigma();
        double[] doubleArray19 = sigma15.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray21 = levenbergMarquardtOptimizer5.computeSigma(doubleArray19, (double) (byte) 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getStartPoint();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 10.0f, 100.0d, 0.0d, (-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 100, 0.0d, (double) 52);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        double[] doubleArray1 = levenbergMarquardtOptimizer0.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = levenbergMarquardtOptimizer0.getRMS();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, 1.0d, (double) (-1), (double) 10, (double) 10);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray13 = sigma12.getSigma();
        double[] doubleArray14 = sigma12.getSigma();
        double[] doubleArray15 = sigma12.getSigma();
        double[] doubleArray16 = sigma12.getSigma();
        double[] doubleArray17 = sigma12.getSigma();
        double[] doubleArray18 = sigma12.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = levenbergMarquardtOptimizer5.computeSigma(doubleArray18, (double) 10L);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, 100.0d);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 1, (-1.0d), (double) 0L, (double) 1.0f, 100.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getIterations();
        double[] doubleArray2 = levenbergMarquardtOptimizer0.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        double[] doubleArray11 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray14 = sigma13.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray14);
        double[] doubleArray16 = sigma15.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = levenbergMarquardtOptimizer0.computeSigma(doubleArray16, (double) (short) 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) 0, (double) 'a', (double) 0L, (double) 1L);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner8 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma10 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray9);
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray13 = identityPreconditioner8.precondition(doubleArray9, doubleArray11);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        double[] doubleArray15 = sigma14.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma16 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray15, (double) (-1));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getIterations();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 0, 100.0d, (double) '4');
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (byte) 1, (double) 1L, (double) (-1.0f), (double) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, 10.0d, (double) ' ', (double) 10.0f, (double) 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) '#', (double) (byte) 10);
        double[] doubleArray3 = powellOptimizer2.getStartPoint();
        int int4 = powellOptimizer2.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
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
        int int15 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
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
        int int15 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '#', (double) (byte) 1, (double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getLowerBound();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(97.0d, 0.0d, (double) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
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
        int int15 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        double[] doubleArray1 = levenbergMarquardtOptimizer0.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix2 = levenbergMarquardtOptimizer0.getWeight();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double double12 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        double[] doubleArray16 = sigma15.getSigma();
        double[] doubleArray17 = sigma15.getSigma();
        double[] doubleArray18 = sigma15.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma19 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray21 = levenbergMarquardtOptimizer5.computeSigma(doubleArray18, (double) (byte) 10);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) '#', (double) 10.0f, (double) 'a', (double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 1, (double) (short) 1);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getUpperBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '#', 100.0d, 10.0d);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 100, 0.0d, (double) 52);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(1.0d, (double) (short) 0, (double) 100);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getEvaluations();
        double double12 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 1, (double) (short) 1);
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma5 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma6 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray4);
        double[] doubleArray7 = sigma6.getSigma();
        double[] doubleArray8 = sigma6.getSigma();
        double[] doubleArray9 = sigma6.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer3.computeCovariances(doubleArray9, (double) (short) -1);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, 0.0d, (double) ' ', 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 32, 0.0d, (double) (byte) -1, (double) ' ', (-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double[] doubleArray2 = levenbergMarquardtOptimizer0.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = levenbergMarquardtOptimizer0.getWeightSquareRoot();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, 0.0d, (double) (short) 100, (double) (-1), (double) 1.0f);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray11 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray13 = sigma12.getSigma();
        double[] doubleArray14 = sigma12.getSigma();
        double[] doubleArray15 = sigma12.getSigma();
        double[] doubleArray16 = sigma12.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray16, (double) 35);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getUpperBound();
        int int11 = levenbergMarquardtOptimizer5.getEvaluations();
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 0, 100.0d, (double) '4');
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getUpperBound();
        double[] doubleArray10 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray13 = sigma12.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = levenbergMarquardtOptimizer3.computeSigma(doubleArray13, (double) '#');
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 100, 0.0d, (double) 52);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getEvaluations();
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray12);
        double[] doubleArray14 = sigma13.getSigma();
        double[] doubleArray15 = sigma13.getSigma();
        double[] doubleArray16 = sigma13.getSigma();
        double[] doubleArray17 = sigma13.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma18 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray17);
        double[] doubleArray19 = sigma18.getSigma();
        double[] doubleArray20 = sigma18.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray22 = levenbergMarquardtOptimizer5.computeSigma(doubleArray20, (double) (-1));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
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
        double[] doubleArray17 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '#', 100.0d, 10.0d);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getUpperBound();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(10.0d, (double) ' ', (double) 0.0f, (-1.0d), (double) (byte) 1);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer5.getMaxIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '4', (double) 1, (double) 0L);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0.0f, (double) 100.0f, (double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 100, (double) (short) 0, (-1.0d), (double) 1, 10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker11 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray12);
        double[] doubleArray14 = sigma13.getSigma();
        double[] doubleArray15 = sigma13.getSigma();
        double[] doubleArray16 = sigma13.getSigma();
        double[] doubleArray17 = sigma13.getSigma();
        double[] doubleArray18 = sigma13.getSigma();
        double[] doubleArray19 = sigma13.getSigma();
        double[] doubleArray20 = sigma13.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray22 = levenbergMarquardtOptimizer5.computeSigma(doubleArray20, (double) 1L);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(1.0d, (double) (short) 0, (double) 100);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma6 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray5);
        double[] doubleArray7 = sigma6.getSigma();
        double[] doubleArray8 = sigma6.getSigma();
        double[] doubleArray9 = sigma6.getSigma();
        double[] doubleArray10 = sigma6.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray12 = sigma11.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = levenbergMarquardtOptimizer3.computeSigma(doubleArray12, 0.0d);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getIterations();
        double[] doubleArray2 = levenbergMarquardtOptimizer0.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double[] doubleArray6 = levenbergMarquardtOptimizer0.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = levenbergMarquardtOptimizer0.getRMS();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
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
        int int16 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray17 = levenbergMarquardtOptimizer5.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 0, 0.0d, (double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker12 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int13 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1L, (double) '#', (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10L, (double) 'a', (double) (byte) 0, (double) (byte) 100, (double) (byte) -1);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray11 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray13 = sigma12.getSigma();
        double[] doubleArray14 = sigma12.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray14);
        double[] doubleArray16 = sigma15.getSigma();
        double[] doubleArray17 = sigma15.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma18 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray17);
        double[] doubleArray19 = sigma18.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray21 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray19, (double) 'a');
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, 1.0d, (double) (-1), (double) 10, (double) 10);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        double double11 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker12 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getIterations();
        double[] doubleArray2 = levenbergMarquardtOptimizer0.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = levenbergMarquardtOptimizer0.getWeight();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '4', (double) 1, (double) 0L);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 1, (double) (byte) -1, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxIterations();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer simplexOptimizer8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer((double) (short) 100, (double) 10.0f);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray9 = new org.apache.commons.math3.optim.OptimizationData[] {};
        simplexOptimizer8.parseOptimizationData(optimizationDataArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointVectorValuePair pointVectorValuePair11 = levenbergMarquardtOptimizer3.optimize(optimizationDataArray9);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray16 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray16);
        double[] doubleArray18 = sigma17.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = levenbergMarquardtOptimizer5.computeSigma(doubleArray18, (double) (-1));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getStartPoint();
        int int6 = levenbergMarquardtOptimizer3.getIterations();
        double[] doubleArray7 = levenbergMarquardtOptimizer3.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(1.0d, (double) 100.0f);
        double[] doubleArray3 = powellOptimizer2.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair4 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 0, (double) (byte) 10, (double) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0.0f, (double) 100.0f, (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 100, 0.0d, (double) 52);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 1, 35.0d, (double) (byte) -1, (double) (-1), 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 100, 0.0d, (double) 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 97, (double) (byte) 1, (double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
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
        double[] doubleArray15 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getLowerBound();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray17 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma18 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray17);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma19 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray17);
        double[] doubleArray20 = sigma19.getSigma();
        double[] doubleArray21 = sigma19.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray23 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray21, (double) 10L);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, 0.0d, (double) ' ', 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, 0.0d, (double) ' ', 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma9 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray8);
        double[] doubleArray10 = sigma9.getSigma();
        double[] doubleArray11 = sigma9.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = levenbergMarquardtOptimizer5.computeSigma(doubleArray11, (double) 0.0f);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (-1), (double) (-1L), (double) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, 100.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, 1.0d, (double) (-1), (double) 10, (double) 10);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner10 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        double[] doubleArray15 = identityPreconditioner10.precondition(doubleArray11, doubleArray13);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma16 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray15);
        double[] doubleArray17 = sigma16.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma18 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = levenbergMarquardtOptimizer5.computeSigma(doubleArray17, (double) 97);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10L, (double) 0L, (double) 100, (double) 10, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker12 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(97.0d, 0.0d, (double) 1);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(52.0d, (double) '4', 0.0d, (double) (byte) 100, (double) ' ');
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getLowerBound();
        int int11 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(97.0d, 0.0d, (double) 1);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 35, (double) '#', 1.0d, 10.0d, 35.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1, (double) (short) 1, (double) 1L, (double) 1L, (double) 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getUpperBound();
        int int11 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 1, 35.0d, (double) (byte) -1, (double) (-1), 1.0d);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner7 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma9 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray8);
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray12 = identityPreconditioner7.precondition(doubleArray8, doubleArray10);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        double[] doubleArray15 = sigma14.getSigma();
        double[] doubleArray16 = sigma14.getSigma();
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = identityPreconditioner7.precondition(doubleArray16, doubleArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = levenbergMarquardtOptimizer5.computeSigma(doubleArray17, (double) (-1));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 0, 0.0d, (double) 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, 0.0d, (double) ' ', 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray13 = sigma12.getSigma();
        double[] doubleArray14 = sigma12.getSigma();
        double[] doubleArray15 = sigma12.getSigma();
        double[] doubleArray16 = sigma12.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = levenbergMarquardtOptimizer5.computeSigma(doubleArray16, 0.0d);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double[] doubleArray2 = levenbergMarquardtOptimizer0.getStartPoint();
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = levenbergMarquardtOptimizer0.getRMS();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getUpperBound();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 100L, (double) (short) 1);
        int int3 = powellOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optim.nonlinear.scalar.GoalType goalType4 = powellOptimizer2.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, 0.0d, (double) ' ', 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getLowerBound();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((-1.0d), (double) 52, (double) (-1L), (double) 10, (double) (short) 0);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 1, (double) (short) 1);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getUpperBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) -1, (double) (-1), (double) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 10, (double) 1.0f, (double) (byte) 100, (double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1L, (double) (short) 100, (double) (short) 0, (double) 35, (double) 100);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double[] doubleArray11 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray14 = sigma13.getSigma();
        double[] doubleArray15 = sigma13.getSigma();
        double[] doubleArray16 = sigma13.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray16, (double) (-1));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) '4', (double) 0L, 1.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        double[] doubleArray1 = levenbergMarquardtOptimizer0.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix3 = levenbergMarquardtOptimizer0.getWeight();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(1.0d, (double) (byte) 100, 0.0d, (double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(35.0d, (double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair3 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 100L, (double) (short) 1);
        int int3 = powellOptimizer2.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair4 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(100.0d, 100.0d, 0.0d, (double) '4');
        double[] doubleArray5 = powellOptimizer4.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair6 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getStartPoint();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '#', (double) 97, (double) '#', (double) 10.0f, (double) (short) 10);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray7);
        double[] doubleArray9 = sigma8.getSigma();
        double[] doubleArray10 = sigma8.getSigma();
        double[] doubleArray11 = sigma8.getSigma();
        double[] doubleArray12 = sigma8.getSigma();
        double[] doubleArray13 = sigma8.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        double[] doubleArray15 = sigma14.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = levenbergMarquardtOptimizer5.computeSigma(doubleArray15, (double) '4');
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 0, (double) (-1), 1.0d, (double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 1, 10.0d, (double) (short) 100, (double) (-1.0f));
        int int5 = powellOptimizer4.getMaxEvaluations();
        int int6 = powellOptimizer4.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair7 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getEvaluations();
        int int13 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int14 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner10 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray13);
        double[] doubleArray15 = identityPreconditioner10.precondition(doubleArray11, doubleArray13);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma16 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray15);
        double[] doubleArray17 = sigma16.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma18 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray17, 0.0d);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) '#', 52.0d, (double) (-1.0f), 100.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(10.0d, (double) ' ', (double) 0.0f, (-1.0d), (double) (byte) 1);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        int int12 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getLowerBound();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray11);
        double[] doubleArray13 = sigma12.getSigma();
        double[] doubleArray14 = sigma12.getSigma();
        double[] doubleArray15 = sigma12.getSigma();
        double[] doubleArray16 = sigma12.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma17 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray16);
        double[] doubleArray18 = sigma17.getSigma();
        double[] doubleArray19 = sigma17.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray21 = levenbergMarquardtOptimizer5.computeSigma(doubleArray19, (double) (short) 0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) 10, (double) (byte) 10);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getUpperBound();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 100, (-1.0d), (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(1.0d, 0.0d, 35.0d);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 1, (-1.0d), (double) 0L, (double) 1.0f, 100.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '4', (double) 1, (double) 0L);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 1L, (double) '#', (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) (byte) 0, (-1.0d), 10.0d, (double) (short) 0);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
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
        int int16 = levenbergMarquardtOptimizer5.getIterations();
        double[] doubleArray17 = levenbergMarquardtOptimizer5.getUpperBound();
        double[] doubleArray18 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(0.0d, (double) (byte) 100, 97.0d, (double) 10L, 97.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (-1L), (double) 100, (double) 10.0f, (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((-1.0d), (double) 10L, (double) (short) 100);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) 'a', (double) ' ');
        double[] doubleArray3 = powellOptimizer2.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair4 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray14 = new double[] { (short) 1, 52, 100, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma15 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray14);
        double[] doubleArray16 = sigma15.getSigma();
        double[] doubleArray17 = sigma15.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma18 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray17);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma19 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray17);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma20 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray22 = levenbergMarquardtOptimizer5.computeCovariances(doubleArray17, (double) 1L);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getUpperBound();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker13 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(52.0d, (double) '4', 0.0d, (double) (byte) 100, (double) ' ');
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) 10, (double) 10.0f);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, 0.0d, (double) (short) 100, (double) (-1), (double) 1.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(10.0d, (double) ' ', (double) 0.0f, (-1.0d), (double) (byte) 1);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0.0f, (double) ' ', (double) (short) -1, (double) (byte) 10, (double) '4');
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) 0, (double) 'a', (double) 0L, (double) 1L);
        int int6 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 0, 100.0d, (double) '4');
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer3.getIterations();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma7 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray6);
        double[] doubleArray8 = sigma7.getSigma();
        double[] doubleArray9 = sigma7.getSigma();
        double[] doubleArray10 = sigma7.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray12 = sigma11.getSigma();
        double[] doubleArray13 = sigma11.getSigma();
        double[] doubleArray14 = sigma11.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = levenbergMarquardtOptimizer3.computeSigma(doubleArray14, (double) 1L);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 1, (double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (byte) 1, 100.0d, 0.0d, (double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        int int8 = levenbergMarquardtOptimizer5.getIterations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker12 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (-1), (double) 0, (double) 10.0f, (double) '#', (-1.0d));
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma7 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray6);
        double[] doubleArray8 = sigma7.getSigma();
        double[] doubleArray9 = sigma7.getSigma();
        double[] doubleArray10 = sigma7.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray12 = sigma11.getSigma();
        double[] doubleArray13 = sigma11.getSigma();
        double[] doubleArray14 = sigma11.getSigma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = levenbergMarquardtOptimizer5.computeSigma(doubleArray14, (double) '#');
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxIterations();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker11 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer5.getEvaluations();
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getUpperBound();
        double[] doubleArray14 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = levenbergMarquardtOptimizer5.getWeight();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getIterations();
        int int13 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) -1, (double) 35, 10.0d);
        int int4 = levenbergMarquardtOptimizer3.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '#', (double) 97, (double) '#', (double) 10.0f, (double) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 100, (double) 1, 10.0d, (double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
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
        int int15 = levenbergMarquardtOptimizer5.getEvaluations();
        int int16 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '#', (double) 97, (double) '#', (double) 10.0f, (double) (short) 10);
        int int6 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getUpperBound();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getStartPoint();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (-1L), (double) 100.0f, (double) 100);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 10, 10.0d, (double) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, (double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getUpperBound();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = levenbergMarquardtOptimizer5.getRMS();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 1, 35.0d, (double) (byte) -1, (double) (-1), 1.0d);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getUpperBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) 10, (double) (byte) 10);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner identityPreconditioner5 = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma7 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray6);
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma9 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray8);
        double[] doubleArray10 = identityPreconditioner5.precondition(doubleArray6, doubleArray8);
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma11 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray10);
        double[] doubleArray12 = sigma11.getSigma();
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma sigma13 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma(doubleArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer3.computeCovariances(doubleArray12, (double) (-1.0f));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '4', 0.0d, 0.0d);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
        int int5 = levenbergMarquardtOptimizer3.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getTarget();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 97, (double) ' ', (double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = levenbergMarquardtOptimizer3.getWeightSquareRoot();
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) '4', (double) 100, (double) 100.0f);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getUpperBound();
        int int13 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (byte) 1, (double) 0.0f, (double) 10L);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = levenbergMarquardtOptimizer3.getTargetSize();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, (double) 100, (double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer3.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getStartPoint();
        int int7 = levenbergMarquardtOptimizer3.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = levenbergMarquardtOptimizer3.getWeight();
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(52.0d, (double) 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair3 = powellOptimizer2.doOptimize();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 0, 1.0d, (double) (-1), (double) 10, (double) 10);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 1, (-1.0d), (double) 0L, (double) 1.0f, 100.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(97.0d, 0.0d, (double) 1);
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = levenbergMarquardtOptimizer3.getRMS();
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '4', (double) 1L, (double) (short) 100, (double) ' ', (double) '4');
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getTarget();
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((double) (short) 10, (double) 1.0f, (double) (byte) 100, (double) 0L);
        int int5 = powellOptimizer4.getMaxEvaluations();
        double[] doubleArray6 = powellOptimizer4.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair7 = powellOptimizer4.doOptimize();
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) '#', (double) 97, (double) '#', (double) 10.0f, (double) (short) 10);
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        int int10 = levenbergMarquardtOptimizer5.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        int int12 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getLowerBound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = levenbergMarquardtOptimizer5.getWeightSquareRoot();
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = levenbergMarquardtOptimizer0.getRMS();
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) (short) 10, 0.0d, (double) (short) 100, (double) (-1), (double) 1.0f);
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getIterations();
        int int7 = levenbergMarquardtOptimizer5.getMaxIterations();
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getLowerBound();
        org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> pointVectorValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = levenbergMarquardtOptimizer5.getTargetSize();
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer powellOptimizer4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer(35.0d, (double) 35, 52.0d, (double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optim.PointValuePair pointValuePair5 = powellOptimizer4.doOptimize();
    }
}

