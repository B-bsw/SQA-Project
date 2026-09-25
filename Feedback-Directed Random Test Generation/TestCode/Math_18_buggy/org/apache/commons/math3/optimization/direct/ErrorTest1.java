package org.apache.commons.math3.optimization.direct;

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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer2.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer2.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer2.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer2.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair8 = cMAESOptimizer2.doOptimize();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray2, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator9, true, pointValuePairConvergenceChecker15);
        int int17 = cMAESOptimizer16.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer16.getUpperBound();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsMeanHistory();
        int int11 = cMAESOptimizer9.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer9.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer9.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer9.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer9.getStartPoint();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer9.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer9.getStatisticsSigmaHistory();
        int int13 = cMAESOptimizer9.getEvaluations();
        int int14 = cMAESOptimizer9.getEvaluations();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer9.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer9.getStatisticsSigmaHistory();
        int int17 = cMAESOptimizer9.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer9.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair19 = cMAESOptimizer9.doOptimize();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray4);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray17);
        double[] doubleArray32 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray32);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray32);
        org.apache.commons.math3.random.RandomGenerator randomGenerator40 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray32, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator40, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray17, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator40, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray17);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray17);
        org.apache.commons.math3.random.RandomGenerator randomGenerator52 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray17, (int) (short) -1, 1.0d, false, 0, (int) (byte) 1, randomGenerator52, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray4, 10, (double) 10, false, (int) (short) -1, (-1), randomGenerator52, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4);
        java.util.List<java.lang.Double> doubleList58 = cMAESOptimizer57.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray59 = cMAESOptimizer57.getStartPoint();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray4);
        org.apache.commons.math3.optimization.GoalType goalType34 = cMAESOptimizer33.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType35 = cMAESOptimizer33.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList36 = cMAESOptimizer33.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray37 = cMAESOptimizer33.getStartPoint();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray16);
        double[] doubleArray31 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.random.RandomGenerator randomGenerator39 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray31, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator39, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray16, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator39, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray7, (int) (byte) 100, (-1.0d), false, (int) '4', (int) (byte) 1, randomGenerator39, true);
        int int46 = cMAESOptimizer45.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList47 = cMAESOptimizer45.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair48 = cMAESOptimizer45.doOptimize();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray13);
        double[] doubleArray28 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray28, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator36, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray13, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator36, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray3, (int) (byte) 10, (double) (short) 100, false, (int) (short) 0, (int) (short) 10, randomGenerator36, false);
        int int43 = cMAESOptimizer42.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList44 = cMAESOptimizer42.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray45 = cMAESOptimizer42.getLowerBound();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer0.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer0.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer14.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator11, true, pointValuePairConvergenceChecker17);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker37 = cMAESOptimizer36.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList38 = cMAESOptimizer36.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer36.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray26, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator33, true, pointValuePairConvergenceChecker39);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray4, 100, (-1.0d), true, 1, (int) (byte) 10, randomGenerator33, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair44 = cMAESOptimizer43.doOptimize();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray13);
        double[] doubleArray28 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray28, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator36, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray13, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator36, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray3, (int) (byte) 10, (double) (short) 100, false, (int) (short) 0, (int) (short) 10, randomGenerator36, false);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList43 = cMAESOptimizer42.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair44 = cMAESOptimizer42.doOptimize();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer2.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer2.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer2.getUpperBound();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer11.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer11.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer11.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer11.getGoalType();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer11.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer11.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType18 = cMAESOptimizer11.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType19 = cMAESOptimizer11.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = cMAESOptimizer11.getLowerBound();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer2.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer2.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer2.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer2.getLowerBound();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsDHistory();
        int int8 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsMeanHistory();
        int int11 = cMAESOptimizer9.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer9.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer9.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer9.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer9.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer9.getLowerBound();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer11.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer11.getGoalType();
        int int14 = cMAESOptimizer11.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer11.getGoalType();
        int int16 = cMAESOptimizer11.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType17 = cMAESOptimizer11.getGoalType();
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer11.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair19 = cMAESOptimizer11.doOptimize();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int33 = cMAESOptimizer31.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer31.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList35 = cMAESOptimizer31.getStatisticsDHistory();
        int int36 = cMAESOptimizer31.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray37 = cMAESOptimizer31.getLowerBound();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        int int5 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        int int7 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer2.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair5 = cMAESOptimizer2.doOptimize();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair34 = cMAESOptimizer33.doOptimize();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        int int11 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        int int11 = cMAESOptimizer7.getEvaluations();
        int int12 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        int int2 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair4 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair4 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        double[] doubleArray20 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray20);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray20, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray5);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList36 = cMAESOptimizer35.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair37 = cMAESOptimizer35.doOptimize();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        int int12 = cMAESOptimizer11.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer11.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer11.getUpperBound();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray7);
        double[] doubleArray22 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray22);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray22);
        org.apache.commons.math3.random.RandomGenerator randomGenerator30 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray22, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator42 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7, (int) (short) -1, 1.0d, false, 0, (int) (byte) 1, randomGenerator42, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray47 = cMAESOptimizer46.getUpperBound();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer11.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer11.getGoalType();
        int int14 = cMAESOptimizer11.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer11.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer11.getLowerBound();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer2.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer2.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer2.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer2.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer2.getStartPoint();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker7 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        int int2 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair3 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer4.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer9.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer9.getStartPoint();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair5 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer9.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer9.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer9.getConvergenceChecker();
        int int14 = cMAESOptimizer9.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer9.getLowerBound();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        double[] doubleArray20 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray20);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray20, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray5);
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray42);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker53 = cMAESOptimizer52.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList54 = cMAESOptimizer52.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker55 = cMAESOptimizer52.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray42, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator49, true, pointValuePairConvergenceChecker55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray5, (int) (byte) -1, 1.0d, false, (int) (short) 100, (int) (byte) 0, randomGenerator49, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray59 = cMAESOptimizer58.getStartPoint();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray3);
        int int32 = cMAESOptimizer31.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList33 = cMAESOptimizer31.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer31.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray35 = cMAESOptimizer31.getUpperBound();
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer2.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer2.getStartPoint();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        double[] doubleArray10 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray19);
        double[] doubleArray34 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator42 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray34, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator42, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray19, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator42, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray10, (int) (byte) 100, (-1.0d), false, (int) '4', (int) (byte) 1, randomGenerator42, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        org.apache.commons.math3.optimization.GoalType goalType52 = cMAESOptimizer51.getGoalType();
        int int53 = cMAESOptimizer51.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair54 = cMAESOptimizer51.doOptimize();
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        int int7 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair8 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int33 = cMAESOptimizer31.getMaxEvaluations();
        int int34 = cMAESOptimizer31.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray35 = cMAESOptimizer31.getLowerBound();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray4);
        org.apache.commons.math3.optimization.GoalType goalType34 = cMAESOptimizer33.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType35 = cMAESOptimizer33.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair36 = cMAESOptimizer33.doOptimize();
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair5 = cMAESOptimizer4.doOptimize();
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer9.getStatisticsMeanHistory();
        int int12 = cMAESOptimizer9.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer9.getStartPoint();
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer13.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer13.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer13.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator10, true, pointValuePairConvergenceChecker16);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray3);
        int int19 = cMAESOptimizer18.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = cMAESOptimizer18.getStartPoint();
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsMeanHistory();
        int int11 = cMAESOptimizer9.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer9.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer9.getEvaluations();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer9.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer9.getLowerBound();
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer0.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int5 = cMAESOptimizer0.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer0.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer0.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsDHistory();
        int int9 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer9.getGoalType();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer9.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer9.getLowerBound();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int33 = cMAESOptimizer31.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer31.getStatisticsSigmaHistory();
        int int35 = cMAESOptimizer31.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray36 = cMAESOptimizer31.getLowerBound();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        int int12 = cMAESOptimizer11.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer11.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer11.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer11.getStatisticsSigmaHistory();
        int int16 = cMAESOptimizer11.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType17 = cMAESOptimizer11.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = cMAESOptimizer11.doOptimize();
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer2.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer2.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer2.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer2.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer2.doOptimize();
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer9.getStatisticsMeanHistory();
        int int12 = cMAESOptimizer9.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer9.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer9.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer9.getStatisticsFitnessHistory();
        int int16 = cMAESOptimizer9.getEvaluations();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer9.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = cMAESOptimizer9.doOptimize();
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer2.getGoalType();
        int int5 = cMAESOptimizer2.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer2.getLowerBound();
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray3);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int33 = cMAESOptimizer31.getEvaluations();
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer31.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList35 = cMAESOptimizer31.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair36 = cMAESOptimizer31.doOptimize();
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray2, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator9, true, pointValuePairConvergenceChecker15);
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer16.getStatisticsFitnessHistory();
        int int18 = cMAESOptimizer16.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair19 = cMAESOptimizer16.doOptimize();
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int12 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer2.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer2.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer2.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer2.doOptimize();
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsMeanHistory();
        int int4 = cMAESOptimizer2.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer2.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer2.doOptimize();
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer11.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer11.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer11.getStatisticsSigmaHistory();
        int int15 = cMAESOptimizer11.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer11.getLowerBound();
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray4);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList34 = cMAESOptimizer33.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair35 = cMAESOptimizer33.doOptimize();
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray34 = cMAESOptimizer33.getStartPoint();
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer11.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer11.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer11.doOptimize();
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer9.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer9.getStatisticsSigmaHistory();
        int int13 = cMAESOptimizer9.getEvaluations();
        int int14 = cMAESOptimizer9.getEvaluations();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer9.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer9.getUpperBound();
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        int int4 = cMAESOptimizer1.getEvaluations();
        int int5 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer0.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int7 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int9 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair5 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int7 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int9 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int33 = cMAESOptimizer31.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer31.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList35 = cMAESOptimizer31.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray36 = cMAESOptimizer31.getStartPoint();
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer0.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3);
        org.apache.commons.math3.optimization.GoalType goalType32 = cMAESOptimizer31.getGoalType();
        java.util.List<java.lang.Double> doubleList33 = cMAESOptimizer31.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer31.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray35 = cMAESOptimizer31.getUpperBound();
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        int int2 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray4);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList34 = cMAESOptimizer33.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair35 = cMAESOptimizer33.doOptimize();
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        double[] doubleArray10 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray19);
        double[] doubleArray34 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator42 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray34, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator42, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray19, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator42, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray10, (int) (byte) 100, (-1.0d), false, (int) '4', (int) (byte) 1, randomGenerator42, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        org.apache.commons.math3.optimization.GoalType goalType52 = cMAESOptimizer51.getGoalType();
        int int53 = cMAESOptimizer51.getEvaluations();
        java.util.List<java.lang.Double> doubleList54 = cMAESOptimizer51.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray55 = cMAESOptimizer51.getUpperBound();
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer14.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator11, true, pointValuePairConvergenceChecker17);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker37 = cMAESOptimizer36.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList38 = cMAESOptimizer36.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer36.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray26, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator33, true, pointValuePairConvergenceChecker39);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray4, 100, (-1.0d), true, 1, (int) (byte) 10, randomGenerator33, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray4);
        java.util.List<java.lang.Double> doubleList44 = cMAESOptimizer43.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray45 = cMAESOptimizer43.getStartPoint();
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer14.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator11, true, pointValuePairConvergenceChecker17);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray21 = cMAESOptimizer20.getStartPoint();
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        double[] doubleArray20 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray20);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray20, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray5);
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray42);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker53 = cMAESOptimizer52.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList54 = cMAESOptimizer52.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker55 = cMAESOptimizer52.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray42, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator49, true, pointValuePairConvergenceChecker55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray5, (int) (byte) -1, 1.0d, false, (int) (short) 100, (int) (byte) 0, randomGenerator49, true);
        int int59 = cMAESOptimizer58.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair60 = cMAESOptimizer58.doOptimize();
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList34 = cMAESOptimizer33.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray35 = cMAESOptimizer33.getLowerBound();
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        double[] doubleArray9 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray9, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator17, false);
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer37.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList39 = cMAESOptimizer37.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker40 = cMAESOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray27, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator34, true, pointValuePairConvergenceChecker40);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9, (int) (short) 0, (double) (byte) -1, false, (int) '4', (int) (byte) 1, randomGenerator34, true);
        java.util.List<java.lang.Double> doubleList44 = cMAESOptimizer43.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray45 = cMAESOptimizer43.getUpperBound();
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray4);
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer33.getStatisticsFitnessHistory();
        int int35 = cMAESOptimizer33.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray36 = cMAESOptimizer33.getUpperBound();
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray2, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator9, true, pointValuePairConvergenceChecker15);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer16.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer16.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer16.getStartPoint();
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int14 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer11.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer11.getStartPoint();
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray4);
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray14);
        double[] doubleArray29 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray29);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray29);
        org.apache.commons.math3.random.RandomGenerator randomGenerator37 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray29, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator37, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray14, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator37, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray4, (int) (byte) 10, (double) (short) 100, false, (int) (short) 0, (int) (short) 10, randomGenerator37, false);
        double[] doubleArray51 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray51);
        org.apache.commons.math3.random.RandomGenerator randomGenerator58 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker62 = cMAESOptimizer61.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList63 = cMAESOptimizer61.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker64 = cMAESOptimizer61.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray51, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator58, true, pointValuePairConvergenceChecker64);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray4, (int) (byte) 0, (double) 100L, false, 1, (int) (short) 10, randomGenerator58, true);
        java.util.List<java.lang.Double> doubleList68 = cMAESOptimizer67.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList69 = cMAESOptimizer67.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair70 = cMAESOptimizer67.doOptimize();
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer14.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator11, true, pointValuePairConvergenceChecker17);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray26);
        double[] doubleArray41 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray41, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator49, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray26, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator49, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray4, (int) (byte) 0, (double) 1L, true, (int) (byte) 100, (int) '#', randomGenerator49, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray57 = cMAESOptimizer56.getLowerBound();
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer2.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer2.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer2.getMaxEvaluations();
        int int7 = cMAESOptimizer2.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer2.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer2.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer2.getLowerBound();
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer14.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator11, true, pointValuePairConvergenceChecker17);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray26);
        double[] doubleArray41 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray41, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator49, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray26, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator49, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray4, (int) (byte) 0, (double) 1L, true, (int) (byte) 100, (int) '#', randomGenerator49, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        org.apache.commons.math3.optimization.GoalType goalType57 = cMAESOptimizer56.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList58 = cMAESOptimizer56.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList59 = cMAESOptimizer56.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair60 = cMAESOptimizer56.doOptimize();
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer33.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList35 = cMAESOptimizer33.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray36 = cMAESOptimizer33.getLowerBound();
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int33 = cMAESOptimizer31.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList34 = cMAESOptimizer31.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray35 = cMAESOptimizer31.getUpperBound();
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray32 = cMAESOptimizer31.getLowerBound();
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer9.getStartPoint();
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        int int34 = cMAESOptimizer33.getEvaluations();
        int int35 = cMAESOptimizer33.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair36 = cMAESOptimizer33.doOptimize();
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        double[] doubleArray9 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray9, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator17, false);
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer37.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList39 = cMAESOptimizer37.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker40 = cMAESOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray27, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator34, true, pointValuePairConvergenceChecker40);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9, (int) (short) 0, (double) (byte) -1, false, (int) '4', (int) (byte) 1, randomGenerator34, true);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList44 = cMAESOptimizer43.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker45 = cMAESOptimizer43.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray46 = cMAESOptimizer43.getLowerBound();
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int9 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair4 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer14.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator11, true, pointValuePairConvergenceChecker17);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker37 = cMAESOptimizer36.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList38 = cMAESOptimizer36.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer36.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray26, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator33, true, pointValuePairConvergenceChecker39);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray4, 100, (-1.0d), true, 1, (int) (byte) 10, randomGenerator33, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray4);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList44 = cMAESOptimizer43.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList45 = cMAESOptimizer43.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair46 = cMAESOptimizer43.doOptimize();
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer0.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer0.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer0.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair8 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        int int2 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair3 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer11.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer11.getGoalType();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer11.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer11.getStartPoint();
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer9.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer9.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer9.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer9.getUpperBound();
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer2.getConvergenceChecker();
        int int5 = cMAESOptimizer2.getEvaluations();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer2.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer2.getStartPoint();
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair5 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer9.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer9.getStatisticsDHistory();
        int int13 = cMAESOptimizer9.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer9.getLowerBound();
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsDHistory();
        int int8 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray3);
        int int32 = cMAESOptimizer31.getEvaluations();
        int int33 = cMAESOptimizer31.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray34 = cMAESOptimizer31.getStartPoint();
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer2.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer2.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer2.getMaxEvaluations();
        int int7 = cMAESOptimizer2.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer2.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer2.getLowerBound();
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer9.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer9.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer9.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer9.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer9.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer9.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer9.getUpperBound();
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray7);
        double[] doubleArray22 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray22);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray22);
        org.apache.commons.math3.random.RandomGenerator randomGenerator30 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray22, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7);
        double[] doubleArray51 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray51);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray51);
        double[] doubleArray67 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray67);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray67);
        org.apache.commons.math3.random.RandomGenerator randomGenerator75 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray67, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator75, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray51, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator75, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList83 = cMAESOptimizer82.getStatisticsSigmaHistory();
        int int84 = cMAESOptimizer82.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker85 = cMAESOptimizer82.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7, (int) (short) 0, (double) (byte) 1, false, 10, (int) 'a', randomGenerator75, true, pointValuePairConvergenceChecker85);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList88 = cMAESOptimizer87.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray89 = cMAESOptimizer87.getUpperBound();
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        int int11 = cMAESOptimizer9.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer9.doOptimize();
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        double[] doubleArray11 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray11);
        double[] doubleArray27 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray27);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator35 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray27, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator35, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray11, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator35, false);
        double[] doubleArray53 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray53);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray53);
        double[] doubleArray69 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray69);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray69);
        org.apache.commons.math3.random.RandomGenerator randomGenerator77 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray69, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator77, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray53, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator77, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        int int85 = cMAESOptimizer84.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType86 = cMAESOptimizer84.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType87 = cMAESOptimizer84.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker88 = cMAESOptimizer84.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray11, 10, (double) (short) 0, false, 100, (int) ' ', randomGenerator77, false, pointValuePairConvergenceChecker88);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair92 = cMAESOptimizer91.doOptimize();
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer9.getStatisticsMeanHistory();
        int int12 = cMAESOptimizer9.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer9.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer9.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer9.getLowerBound();
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer14.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator11, true, pointValuePairConvergenceChecker17);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray26);
        double[] doubleArray41 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray41, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator49, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray26, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator49, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray4, (int) (byte) 0, (double) 1L, true, (int) (byte) 100, (int) '#', randomGenerator49, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        org.apache.commons.math3.optimization.GoalType goalType57 = cMAESOptimizer56.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList58 = cMAESOptimizer56.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList59 = cMAESOptimizer56.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray60 = cMAESOptimizer56.getLowerBound();
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair8 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer0.getGoalType();
        int int4 = cMAESOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer14.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator11, true, pointValuePairConvergenceChecker17);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray26);
        double[] doubleArray41 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray41, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator49, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray26, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator49, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray4, (int) (byte) 0, (double) 1L, true, (int) (byte) 100, (int) '#', randomGenerator49, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        org.apache.commons.math3.optimization.GoalType goalType57 = cMAESOptimizer56.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList58 = cMAESOptimizer56.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray59 = cMAESOptimizer56.getLowerBound();
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        int int2 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer9.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer9.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer9.getStartPoint();
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        int int2 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer0.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        int int7 = cMAESOptimizer1.getEvaluations();
        int int8 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer14.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator11, true, pointValuePairConvergenceChecker17);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker37 = cMAESOptimizer36.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList38 = cMAESOptimizer36.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer36.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray26, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator33, true, pointValuePairConvergenceChecker39);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray4, 100, (-1.0d), true, 1, (int) (byte) 10, randomGenerator33, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray4);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList44 = cMAESOptimizer43.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList45 = cMAESOptimizer43.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray46 = cMAESOptimizer43.getUpperBound();
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        int int6 = cMAESOptimizer1.getEvaluations();
        int int7 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer33.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList35 = cMAESOptimizer33.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList36 = cMAESOptimizer33.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray37 = cMAESOptimizer33.getLowerBound();
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        double[] doubleArray10 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        double[] doubleArray26 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray26, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator34, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray10, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator34, false);
        double[] doubleArray52 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray52);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray52);
        double[] doubleArray68 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray68);
        org.apache.commons.math3.random.RandomGenerator randomGenerator76 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray68, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator76, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray52, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator76, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        int int84 = cMAESOptimizer83.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType85 = cMAESOptimizer83.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType86 = cMAESOptimizer83.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker87 = cMAESOptimizer83.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray10, 10, (double) (short) 0, false, 100, (int) ' ', randomGenerator76, false, pointValuePairConvergenceChecker87);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray90 = cMAESOptimizer89.getLowerBound();
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray7);
        double[] doubleArray22 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray22);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray22);
        org.apache.commons.math3.random.RandomGenerator randomGenerator30 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray22, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator42 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7, (int) (short) -1, 1.0d, false, 0, (int) (byte) 1, randomGenerator42, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.GoalType goalType47 = cMAESOptimizer46.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray48 = cMAESOptimizer46.getLowerBound();
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray4);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray17);
        double[] doubleArray32 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray32);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray32);
        org.apache.commons.math3.random.RandomGenerator randomGenerator40 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray32, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator40, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray17, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator40, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray17);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray17);
        org.apache.commons.math3.random.RandomGenerator randomGenerator52 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray17, (int) (short) -1, 1.0d, false, 0, (int) (byte) 1, randomGenerator52, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray4, 10, (double) 10, false, (int) (short) -1, (-1), randomGenerator52, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray58 = cMAESOptimizer57.getUpperBound();
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray4);
        int int34 = cMAESOptimizer33.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray35 = cMAESOptimizer33.getStartPoint();
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair5 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        int int7 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        int int7 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int9 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer2.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer2.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer2.getStartPoint();
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        int int7 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        int int7 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int8 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer9.getLowerBound();
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        int int12 = cMAESOptimizer11.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer11.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer11.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer11.getStatisticsSigmaHistory();
        int int16 = cMAESOptimizer11.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType17 = cMAESOptimizer11.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer11.getUpperBound();
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer0.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer0.getStatisticsMeanHistory();
        int int6 = cMAESOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        int int6 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker7 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer0.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer0.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        int int7 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray4);
        org.apache.commons.math3.optimization.GoalType goalType34 = cMAESOptimizer33.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType35 = cMAESOptimizer33.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList36 = cMAESOptimizer33.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType37 = cMAESOptimizer33.getGoalType();
        int int38 = cMAESOptimizer33.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray39 = cMAESOptimizer33.getUpperBound();
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        double[] doubleArray20 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray20);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray20, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray36 = cMAESOptimizer35.getStartPoint();
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsMeanHistory();
        int int11 = cMAESOptimizer9.getMaxEvaluations();
        int int12 = cMAESOptimizer9.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer9.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer9.getStartPoint();
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer0.getGoalType();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer0.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        int int3 = cMAESOptimizer1.getEvaluations();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair8 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        int int7 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        int int2 = cMAESOptimizer1.getEvaluations();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer11.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer11.getGoalType();
        int int14 = cMAESOptimizer11.getMaxEvaluations();
        int int15 = cMAESOptimizer11.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer11.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = cMAESOptimizer11.doOptimize();
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        double[] doubleArray24 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray24, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator32, false);
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray37);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer38.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray8, (int) (byte) 10, (double) 10, false, (-1), (int) (byte) 10, randomGenerator32, true, pointValuePairConvergenceChecker39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray41 = cMAESOptimizer40.getUpperBound();
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        int int6 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker7 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer2.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer2.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer2.getMaxEvaluations();
        int int7 = cMAESOptimizer2.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer2.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer2.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer2.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer2.getStartPoint();
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        int int2 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray2);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer4.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer9.getStatisticsMeanHistory();
        int int12 = cMAESOptimizer9.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer9.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer9.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer9.getStatisticsFitnessHistory();
        int int16 = cMAESOptimizer9.getEvaluations();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer9.getStatisticsFitnessHistory();
        int int18 = cMAESOptimizer9.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer9.getUpperBound();
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray13);
        double[] doubleArray28 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray28, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator36, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray13, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator36, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray3, (int) (byte) 10, (double) (short) 100, false, (int) (short) 0, (int) (short) 10, randomGenerator36, false);
        int int43 = cMAESOptimizer42.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList44 = cMAESOptimizer42.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker45 = cMAESOptimizer42.getConvergenceChecker();
        int int46 = cMAESOptimizer42.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair47 = cMAESOptimizer42.doOptimize();
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer13.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer13.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer13.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator10, true, pointValuePairConvergenceChecker16);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray3);
        int int19 = cMAESOptimizer18.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList20 = cMAESOptimizer18.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList21 = cMAESOptimizer18.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair22 = cMAESOptimizer18.doOptimize();
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int33 = cMAESOptimizer31.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer31.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair35 = cMAESOptimizer31.doOptimize();
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        double[] doubleArray12 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray12);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray21);
        double[] doubleArray36 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray36);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray36);
        org.apache.commons.math3.random.RandomGenerator randomGenerator44 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray36, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator44, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray21, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator44, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray12, (int) (byte) 100, (-1.0d), false, (int) '4', (int) (byte) 1, randomGenerator44, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray56 = cMAESOptimizer55.getLowerBound();
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray2, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator9, true, pointValuePairConvergenceChecker15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer16.getLowerBound();
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        double[] doubleArray10 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray19);
        double[] doubleArray34 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator42 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray34, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator42, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray19, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator42, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray10, (int) (byte) 100, (-1.0d), false, (int) '4', (int) (byte) 1, randomGenerator42, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        org.apache.commons.math3.optimization.GoalType goalType52 = cMAESOptimizer51.getGoalType();
        int int53 = cMAESOptimizer51.getEvaluations();
        java.util.List<java.lang.Double> doubleList54 = cMAESOptimizer51.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList55 = cMAESOptimizer51.getStatisticsFitnessHistory();
        int int56 = cMAESOptimizer51.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray57 = cMAESOptimizer51.getLowerBound();
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        int int7 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int9 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray2, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator9, true, pointValuePairConvergenceChecker15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = cMAESOptimizer16.doOptimize();
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer33.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList35 = cMAESOptimizer33.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType36 = cMAESOptimizer33.getGoalType();
        int int37 = cMAESOptimizer33.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray38 = cMAESOptimizer33.getUpperBound();
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray7);
        double[] doubleArray22 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray22);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray22);
        org.apache.commons.math3.random.RandomGenerator randomGenerator30 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray22, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray40 = cMAESOptimizer39.getUpperBound();
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer13.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer13.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer13.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator10, true, pointValuePairConvergenceChecker16);
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker36 = cMAESOptimizer35.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList37 = cMAESOptimizer35.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer35.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray25, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator32, true, pointValuePairConvergenceChecker38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray3, 100, (-1.0d), true, 1, (int) (byte) 10, randomGenerator32, false);
        java.util.List<java.lang.Double> doubleList42 = cMAESOptimizer41.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray43 = cMAESOptimizer41.getStartPoint();
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        double[] doubleArray11 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray11);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray20);
        double[] doubleArray35 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray35);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray35);
        org.apache.commons.math3.random.RandomGenerator randomGenerator43 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray35, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator43, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray20, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator43, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray11, (int) (byte) 100, (-1.0d), false, (int) '4', (int) (byte) 1, randomGenerator43, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray11);
        int int54 = cMAESOptimizer53.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray55 = cMAESOptimizer53.getLowerBound();
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer2.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer2.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer2.getStartPoint();
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        double[] doubleArray20 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray20);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray20, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray36 = cMAESOptimizer35.getUpperBound();
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray4);
        int int34 = cMAESOptimizer33.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray35 = cMAESOptimizer33.getUpperBound();
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        int int7 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int9 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        int int2 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test805");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer9.getStatisticsMeanHistory();
        int int12 = cMAESOptimizer9.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer9.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer9.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer9.getStatisticsFitnessHistory();
        int int16 = cMAESOptimizer9.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer9.getUpperBound();
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test806");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer9.getStatisticsMeanHistory();
        int int12 = cMAESOptimizer9.getEvaluations();
        int int13 = cMAESOptimizer9.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer9.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer9.getLowerBound();
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test807");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair5 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test808");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer9.getUpperBound();
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test809");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        int int6 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker7 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair8 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test810");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test811");
        double[] doubleArray10 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray19);
        double[] doubleArray34 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator42 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray34, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator42, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray19, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator42, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray10, (int) (byte) 100, (-1.0d), false, (int) '4', (int) (byte) 1, randomGenerator42, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        org.apache.commons.math3.optimization.GoalType goalType52 = cMAESOptimizer51.getGoalType();
        int int53 = cMAESOptimizer51.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray54 = cMAESOptimizer51.getLowerBound();
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test812");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        int int7 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test813");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer9.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer9.getStatisticsSigmaHistory();
        int int13 = cMAESOptimizer9.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer9.doOptimize();
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test814");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test815");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test816");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test817");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer11.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer11.getStatisticsSigmaHistory();
        int int14 = cMAESOptimizer11.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer11.getStartPoint();
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test818");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker7 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int9 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test819");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        int int7 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test820");
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray7);
        double[] doubleArray22 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray22);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray22);
        org.apache.commons.math3.random.RandomGenerator randomGenerator30 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray22, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator30, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7);
        double[] doubleArray51 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray51);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray51);
        double[] doubleArray67 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray67);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray67);
        org.apache.commons.math3.random.RandomGenerator randomGenerator75 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray67, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator75, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray51, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator75, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList83 = cMAESOptimizer82.getStatisticsSigmaHistory();
        int int84 = cMAESOptimizer82.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker85 = cMAESOptimizer82.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7, (int) (short) 0, (double) (byte) 1, false, 10, (int) 'a', randomGenerator75, true, pointValuePairConvergenceChecker85);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList88 = cMAESOptimizer87.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray89 = cMAESOptimizer87.getLowerBound();
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test821");
        double[] doubleArray11 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray11);
        double[] doubleArray27 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray27);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator35 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray27, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator35, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray11, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator35, false);
        double[] doubleArray53 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray53);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray53);
        double[] doubleArray69 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray69);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray69);
        org.apache.commons.math3.random.RandomGenerator randomGenerator77 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray69, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator77, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray53, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator77, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        int int85 = cMAESOptimizer84.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType86 = cMAESOptimizer84.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType87 = cMAESOptimizer84.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker88 = cMAESOptimizer84.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray11, 10, (double) (short) 0, false, 100, (int) ' ', randomGenerator77, false, pointValuePairConvergenceChecker88);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11);
        int int92 = cMAESOptimizer91.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList93 = cMAESOptimizer91.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker94 = cMAESOptimizer91.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray95 = cMAESOptimizer91.getUpperBound();
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test822");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test823");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair5 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test824");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray4);
        int int34 = cMAESOptimizer33.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker35 = cMAESOptimizer33.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList36 = cMAESOptimizer33.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair37 = cMAESOptimizer33.doOptimize();
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test825");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test826");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test827");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test828");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test829");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test830");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        double[] doubleArray17 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray17);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray17);
        org.apache.commons.math3.random.RandomGenerator randomGenerator25 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray17, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator25, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray2, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator25, false);
        int int30 = cMAESOptimizer29.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType31 = cMAESOptimizer29.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType32 = cMAESOptimizer29.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray33 = cMAESOptimizer29.getUpperBound();
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test831");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test832");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer11.getStartPoint();
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test833");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test834");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test835");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        int int4 = cMAESOptimizer1.getEvaluations();
        int int5 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test836");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test837");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray2);
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer4.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer4.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer4.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test838");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test839");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        int int6 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker7 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test840");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int33 = cMAESOptimizer31.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer31.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList35 = cMAESOptimizer31.getStatisticsDHistory();
        int int36 = cMAESOptimizer31.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair37 = cMAESOptimizer31.doOptimize();
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test841");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsMeanHistory();
        int int4 = cMAESOptimizer2.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer2.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer2.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer2.getLowerBound();
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test842");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        int int3 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test843");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test844");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer2.getGoalType();
        int int5 = cMAESOptimizer2.getEvaluations();
        int int6 = cMAESOptimizer2.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer2.doOptimize();
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test845");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test846");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        int int7 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int9 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test847");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test848");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer9.doOptimize();
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test849");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer9.getStatisticsMeanHistory();
        int int12 = cMAESOptimizer9.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer9.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer9.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer9.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer9.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = cMAESOptimizer9.doOptimize();
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test850");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int8 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test851");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer33.getStatisticsFitnessHistory();
        int int35 = cMAESOptimizer33.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray36 = cMAESOptimizer33.getUpperBound();
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test852");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test853");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer14.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator11, true, pointValuePairConvergenceChecker17);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray26);
        double[] doubleArray41 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray41, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator49, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray26, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator49, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray4, (int) (byte) 0, (double) 1L, true, (int) (byte) 100, (int) '#', randomGenerator49, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        org.apache.commons.math3.optimization.GoalType goalType57 = cMAESOptimizer56.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList58 = cMAESOptimizer56.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList59 = cMAESOptimizer56.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList60 = cMAESOptimizer56.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray61 = cMAESOptimizer56.getUpperBound();
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test854");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test855");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer11.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer11.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer11.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer11.getGoalType();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer11.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer11.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType18 = cMAESOptimizer11.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer11.getLowerBound();
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test856");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test857");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        int int7 = cMAESOptimizer1.getEvaluations();
        int int8 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test858");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test859");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test860");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer14.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator11, true, pointValuePairConvergenceChecker17);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray26);
        double[] doubleArray41 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray41, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator49, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray26, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator49, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray4, (int) (byte) 0, (double) 1L, true, (int) (byte) 100, (int) '#', randomGenerator49, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        org.apache.commons.math3.optimization.GoalType goalType57 = cMAESOptimizer56.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList58 = cMAESOptimizer56.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList59 = cMAESOptimizer56.getStatisticsDHistory();
        int int60 = cMAESOptimizer56.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList61 = cMAESOptimizer56.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray62 = cMAESOptimizer56.getStartPoint();
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test861");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer9.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer9.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer9.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer9.getUpperBound();
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test862");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test863");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer0.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test864");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test865");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer9.doOptimize();
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test866");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test867");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer0.getGoalType();
        int int4 = cMAESOptimizer0.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer0.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test868");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test869");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test870");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer0.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer0.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair5 = cMAESOptimizer0.doOptimize();
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test871");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair5 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test872");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer2.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer2.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer2.getLowerBound();
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test873");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test874");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test875");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer9.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer9.getUpperBound();
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test876");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        int int7 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int9 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test877");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer14.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator11, true, pointValuePairConvergenceChecker17);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker37 = cMAESOptimizer36.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList38 = cMAESOptimizer36.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer36.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray26, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator33, true, pointValuePairConvergenceChecker39);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray4, 100, (-1.0d), true, 1, (int) (byte) 10, randomGenerator33, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray4);
        java.util.List<java.lang.Double> doubleList44 = cMAESOptimizer43.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair45 = cMAESOptimizer43.doOptimize();
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test878");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray2, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator9, true, pointValuePairConvergenceChecker15);
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer16.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer16.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType19 = cMAESOptimizer16.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = cMAESOptimizer16.getLowerBound();
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test879");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray4);
        org.apache.commons.math3.optimization.GoalType goalType34 = cMAESOptimizer33.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType35 = cMAESOptimizer33.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray36 = cMAESOptimizer33.getUpperBound();
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test880");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test881");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test882");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer11.getStatisticsDHistory();
        int int13 = cMAESOptimizer11.getMaxEvaluations();
        int int14 = cMAESOptimizer11.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = cMAESOptimizer11.doOptimize();
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test883");
        double[] doubleArray9 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray9, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator17, false);
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer37.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList39 = cMAESOptimizer37.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker40 = cMAESOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray27, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator34, true, pointValuePairConvergenceChecker40);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9, (int) (short) 0, (double) (byte) -1, false, (int) '4', (int) (byte) 1, randomGenerator34, true);
        org.apache.commons.math3.optimization.GoalType goalType44 = cMAESOptimizer43.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray45 = cMAESOptimizer43.getLowerBound();
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test884");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer11.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer11.getGoalType();
        int int14 = cMAESOptimizer11.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer11.getGoalType();
        int int16 = cMAESOptimizer11.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType17 = cMAESOptimizer11.getGoalType();
        int int18 = cMAESOptimizer11.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer11.getUpperBound();
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test885");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        double[] doubleArray20 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray20);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray20, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray36 = cMAESOptimizer35.getLowerBound();
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test886");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test887");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test888");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test889");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer2.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer2.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer2.getMaxEvaluations();
        int int7 = cMAESOptimizer2.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer2.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer2.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer2.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer2.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer2.getLowerBound();
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test890");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer0.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer0.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test891");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray2, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator9, true, pointValuePairConvergenceChecker15);
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer16.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer16.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList19 = cMAESOptimizer16.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = cMAESOptimizer16.getUpperBound();
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test892");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        int int7 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test893");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsMeanHistory();
        int int11 = cMAESOptimizer9.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer9.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer9.getUpperBound();
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test894");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test895");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray13);
        double[] doubleArray28 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray28, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator36, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray13, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator36, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray3, (int) (byte) 10, (double) (short) 100, false, (int) (short) 0, (int) (short) 10, randomGenerator36, false);
        int int43 = cMAESOptimizer42.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer42.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray45 = cMAESOptimizer42.getLowerBound();
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test896");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer0.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer0.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair5 = cMAESOptimizer0.doOptimize();
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test897");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer14.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator11, true, pointValuePairConvergenceChecker17);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray26);
        double[] doubleArray41 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray41, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator49, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray26, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator49, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray4, (int) (byte) 0, (double) 1L, true, (int) (byte) 100, (int) '#', randomGenerator49, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray57 = cMAESOptimizer56.getStartPoint();
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test898");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test899");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray32 = cMAESOptimizer31.getStartPoint();
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test900");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer13.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer13.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer13.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator10, true, pointValuePairConvergenceChecker16);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray3);
        java.util.List<java.lang.Double> doubleList19 = cMAESOptimizer18.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList20 = cMAESOptimizer18.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair21 = cMAESOptimizer18.doOptimize();
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test901");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray3);
        int int32 = cMAESOptimizer31.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList33 = cMAESOptimizer31.getStatisticsSigmaHistory();
        int int34 = cMAESOptimizer31.getEvaluations();
        int int35 = cMAESOptimizer31.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray36 = cMAESOptimizer31.getStartPoint();
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test902");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test903");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair3 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test904");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test905");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        double[] doubleArray20 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray20);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray20, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray5);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList36 = cMAESOptimizer35.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList37 = cMAESOptimizer35.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray38 = cMAESOptimizer35.getLowerBound();
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test906");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int8 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test907");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test908");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test909");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test910");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test911");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        int int7 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test912");
        double[] doubleArray9 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        double[] doubleArray25 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray25, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator33, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray9, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator33, false);
        double[] doubleArray51 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray51);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray51);
        double[] doubleArray67 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray67);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray67);
        org.apache.commons.math3.random.RandomGenerator randomGenerator75 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray67, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator75, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray51, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator75, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        int int83 = cMAESOptimizer82.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType84 = cMAESOptimizer82.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType85 = cMAESOptimizer82.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker86 = cMAESOptimizer82.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray9, 10, (double) (short) 0, false, 100, (int) ' ', randomGenerator75, false, pointValuePairConvergenceChecker86);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker88 = cMAESOptimizer87.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair89 = cMAESOptimizer87.doOptimize();
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test913");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer11.getStatisticsDHistory();
        int int13 = cMAESOptimizer11.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer11.getLowerBound();
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test914");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test915");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int33 = cMAESOptimizer31.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer31.getStatisticsSigmaHistory();
        int int35 = cMAESOptimizer31.getEvaluations();
        int int36 = cMAESOptimizer31.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray37 = cMAESOptimizer31.getLowerBound();
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test916");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer2.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer2.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer2.getMaxEvaluations();
        int int7 = cMAESOptimizer2.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer2.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer2.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer2.getUpperBound();
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test917");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test918");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test919");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair5 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test920");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        int int7 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test921");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test922");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int33 = cMAESOptimizer31.getMaxEvaluations();
        int int34 = cMAESOptimizer31.getMaxEvaluations();
        int int35 = cMAESOptimizer31.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList36 = cMAESOptimizer31.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray37 = cMAESOptimizer31.getUpperBound();
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test923");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        double[] doubleArray20 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray20);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray20, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray5);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList36 = cMAESOptimizer35.getStatisticsDHistory();
        int int37 = cMAESOptimizer35.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray38 = cMAESOptimizer35.getUpperBound();
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test924");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer2.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer2.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer2.getGoalType();
        int int6 = cMAESOptimizer2.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer2.getLowerBound();
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test925");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test926");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test927");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test928");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer2.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer2.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer2.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer2.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer2.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer2.getLowerBound();
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test929");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray3);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int33 = cMAESOptimizer31.getEvaluations();
        int int34 = cMAESOptimizer31.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair35 = cMAESOptimizer31.doOptimize();
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test930");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray2, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator9, true, pointValuePairConvergenceChecker15);
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer16.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer16.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList19 = cMAESOptimizer16.getStatisticsSigmaHistory();
        int int20 = cMAESOptimizer16.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray21 = cMAESOptimizer16.getUpperBound();
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test931");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        int int2 = cMAESOptimizer1.getEvaluations();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test932");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray3);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int33 = cMAESOptimizer31.getEvaluations();
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer31.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList35 = cMAESOptimizer31.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList36 = cMAESOptimizer31.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray37 = cMAESOptimizer31.getStartPoint();
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test933");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test934");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray17);
        double[] doubleArray32 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray32);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray32);
        org.apache.commons.math3.random.RandomGenerator randomGenerator40 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray32, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator40, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray17, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator40, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray8, (int) (byte) 100, (-1.0d), false, (int) '4', (int) (byte) 1, randomGenerator40, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray8);
        java.util.List<java.lang.Double> doubleList48 = cMAESOptimizer47.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList49 = cMAESOptimizer47.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList50 = cMAESOptimizer47.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair51 = cMAESOptimizer47.doOptimize();
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test935");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test936");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3);
        org.apache.commons.math3.optimization.GoalType goalType32 = cMAESOptimizer31.getGoalType();
        java.util.List<java.lang.Double> doubleList33 = cMAESOptimizer31.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer31.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList35 = cMAESOptimizer31.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair36 = cMAESOptimizer31.doOptimize();
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test937");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer0.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer0.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer0.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test938");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test939");
        double[] doubleArray11 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray11);
        double[] doubleArray27 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray27);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator35 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray27, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator35, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray11, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator35, false);
        double[] doubleArray53 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray53);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray53);
        double[] doubleArray69 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray69);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray69);
        org.apache.commons.math3.random.RandomGenerator randomGenerator77 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray69, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator77, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray53, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator77, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        int int85 = cMAESOptimizer84.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType86 = cMAESOptimizer84.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType87 = cMAESOptimizer84.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker88 = cMAESOptimizer84.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray11, 10, (double) (short) 0, false, 100, (int) ' ', randomGenerator77, false, pointValuePairConvergenceChecker88);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11);
        int int92 = cMAESOptimizer91.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList93 = cMAESOptimizer91.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList94 = cMAESOptimizer91.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray95 = cMAESOptimizer91.getStartPoint();
    }

    @Test
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test940");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test941");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray3);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int33 = cMAESOptimizer31.getEvaluations();
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer31.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList35 = cMAESOptimizer31.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray36 = cMAESOptimizer31.getStartPoint();
    }

    @Test
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test942");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair5 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test943");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test944");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray2);
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer4.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer4.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer4.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer4.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = cMAESOptimizer4.doOptimize();
    }

    @Test
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test945");
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray6);
        double[] doubleArray21 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray21);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray21);
        org.apache.commons.math3.random.RandomGenerator randomGenerator29 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray21, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator29, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray6, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator29, false);
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray41);
        double[] doubleArray56 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray56);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray56);
        org.apache.commons.math3.random.RandomGenerator randomGenerator64 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray56, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator64, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray41, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator64, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6, (int) (byte) 100, (double) 100, true, (int) (byte) 1, (int) (short) 0, randomGenerator64, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray6);
        double[] doubleArray86 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray86);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray86);
        org.apache.commons.math3.random.RandomGenerator randomGenerator94 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer96 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray86, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator94, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer98 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray6, (int) (short) -1, (double) (-1.0f), true, 10, (int) (short) -1, randomGenerator94, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray99 = cMAESOptimizer98.getUpperBound();
    }

    @Test
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test946");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer9.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer9.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer9.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer9.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer9.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer9.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer9.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer9.getLowerBound();
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test947");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        int int2 = cMAESOptimizer1.getEvaluations();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test948");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair8 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test949");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test950");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        double[] doubleArray24 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray24, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator32, false);
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray37);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer38.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray8, (int) (byte) 10, (double) 10, false, (-1), (int) (byte) 10, randomGenerator32, true, pointValuePairConvergenceChecker39);
        int int41 = cMAESOptimizer40.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray42 = cMAESOptimizer40.getLowerBound();
    }

    @Test
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test951");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsDHistory();
        int int13 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test952");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test953");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test954");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test955");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test956");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test957");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        int int7 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test958");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test959");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer9.getStatisticsMeanHistory();
        int int12 = cMAESOptimizer9.getEvaluations();
        int int13 = cMAESOptimizer9.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer9.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer9.getStartPoint();
    }

    @Test
    public void test960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test960");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer0.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer0.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer0.doOptimize();
    }

    @Test
    public void test961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test961");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test962");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int33 = cMAESOptimizer31.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer31.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList35 = cMAESOptimizer31.getStatisticsDHistory();
        int int36 = cMAESOptimizer31.getEvaluations();
        java.util.List<java.lang.Double> doubleList37 = cMAESOptimizer31.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList38 = cMAESOptimizer31.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray39 = cMAESOptimizer31.getStartPoint();
    }

    @Test
    public void test963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test963");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray2, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator9, true, pointValuePairConvergenceChecker15);
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer16.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer16.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList19 = cMAESOptimizer16.getStatisticsSigmaHistory();
        int int20 = cMAESOptimizer16.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair21 = cMAESOptimizer16.doOptimize();
    }

    @Test
    public void test964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test964");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test965");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        int int7 = cMAESOptimizer1.getEvaluations();
        int int8 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test966");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray4);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray34 = cMAESOptimizer33.getUpperBound();
    }

    @Test
    public void test967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test967");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test968");
        double[] doubleArray9 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray21);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray21);
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray34);
        double[] doubleArray49 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray49);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray49);
        org.apache.commons.math3.random.RandomGenerator randomGenerator57 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray49, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator57, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray34, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator57, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator69 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray34, (int) (short) -1, 1.0d, false, 0, (int) (byte) 1, randomGenerator69, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray21, 10, (double) 10, false, (int) (short) -1, (-1), randomGenerator69, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9, (int) (byte) -1, 1.0d, false, 30000, (int) (short) 10, randomGenerator69, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray76 = cMAESOptimizer75.getStartPoint();
    }

    @Test
    public void test969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test969");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test970");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer9.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer9.getStatisticsSigmaHistory();
        int int13 = cMAESOptimizer9.getEvaluations();
        int int14 = cMAESOptimizer9.getEvaluations();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer9.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer9.getStatisticsSigmaHistory();
        int int17 = cMAESOptimizer9.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer9.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair19 = cMAESOptimizer9.doOptimize();
    }

    @Test
    public void test971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test971");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray3);
        int int32 = cMAESOptimizer31.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList33 = cMAESOptimizer31.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer31.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray35 = cMAESOptimizer31.getStartPoint();
    }

    @Test
    public void test972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test972");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker7 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test973");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer2.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer2.getEvaluations();
        int int5 = cMAESOptimizer2.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer2.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer2.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair8 = cMAESOptimizer2.doOptimize();
    }

    @Test
    public void test974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test974");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3);
        org.apache.commons.math3.optimization.GoalType goalType32 = cMAESOptimizer31.getGoalType();
        java.util.List<java.lang.Double> doubleList33 = cMAESOptimizer31.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer31.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList35 = cMAESOptimizer31.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray36 = cMAESOptimizer31.getUpperBound();
    }

    @Test
    public void test975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test975");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray3);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker32 = cMAESOptimizer31.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair33 = cMAESOptimizer31.doOptimize();
    }

    @Test
    public void test976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test976");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer0.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test977");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test978");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        int int7 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test979");
        double[] doubleArray8 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        int int12 = cMAESOptimizer11.getMaxEvaluations();
        int int13 = cMAESOptimizer11.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer11.doOptimize();
    }

    @Test
    public void test980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test980");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test981");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer0.getEvaluations();
        int int4 = cMAESOptimizer0.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test982");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer0.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer0.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer0.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test983");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        double[] doubleArray20 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray20);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray20, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator28, false);
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray40);
        double[] doubleArray55 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray55);
        org.apache.commons.math3.random.RandomGenerator randomGenerator63 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray55, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator63, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray40, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator63, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray5, (int) (byte) 100, (double) 100, true, (int) (byte) 1, (int) (short) 0, randomGenerator63, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray5);
        int int72 = cMAESOptimizer71.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray73 = cMAESOptimizer71.getLowerBound();
    }

    @Test
    public void test984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test984");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test985");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test986");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test987");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test988");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3);
        java.util.List<java.lang.Double> doubleList32 = cMAESOptimizer31.getStatisticsFitnessHistory();
        int int33 = cMAESOptimizer31.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker34 = cMAESOptimizer31.getConvergenceChecker();
        int int35 = cMAESOptimizer31.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker36 = cMAESOptimizer31.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker37 = cMAESOptimizer31.getConvergenceChecker();
        int int38 = cMAESOptimizer31.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray39 = cMAESOptimizer31.getUpperBound();
    }

    @Test
    public void test989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test989");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray2, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator9, true, pointValuePairConvergenceChecker15);
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer16.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer16.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType19 = cMAESOptimizer16.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList20 = cMAESOptimizer16.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray21 = cMAESOptimizer16.getLowerBound();
    }

    @Test
    public void test990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test990");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test991");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer0.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer0.getConvergenceChecker();
        int int5 = cMAESOptimizer0.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer0.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer0.doOptimize();
    }

    @Test
    public void test992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test992");
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray3);
        double[] doubleArray18 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray18);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray18);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray18, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray3, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator26, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray3);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList32 = cMAESOptimizer31.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray33 = cMAESOptimizer31.getStartPoint();
    }

    @Test
    public void test993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test993");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test994");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        int int2 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test995");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair4 = cMAESOptimizer1.doOptimize();
    }
}

