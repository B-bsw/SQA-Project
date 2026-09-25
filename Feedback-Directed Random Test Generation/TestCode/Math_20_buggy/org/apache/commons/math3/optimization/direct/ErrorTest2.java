package org.apache.commons.math3.optimization.direct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray2);
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer4.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer4.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer4.doOptimize();
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer4.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer4.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer4.getLowerBound();
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
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
        double[] doubleArray18 = cMAESOptimizer11.getStartPoint();
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList46 = cMAESOptimizer45.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray47 = cMAESOptimizer45.getUpperBound();
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
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
        int int54 = cMAESOptimizer53.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray55 = cMAESOptimizer53.getLowerBound();
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
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
        org.apache.commons.math3.optimization.PointValuePair pointValuePair73 = cMAESOptimizer71.doOptimize();
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        double[] doubleArray12 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray12);
        double[] doubleArray28 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray28, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator36, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray12, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator36, false);
        double[] doubleArray54 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray54);
        double[] doubleArray70 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray70);
        org.apache.commons.math3.random.RandomGenerator randomGenerator78 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray70, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator78, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray54, (int) (short) 10, (-1.0d), true, (int) (short) 0, 10, randomGenerator78, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        int int86 = cMAESOptimizer85.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType87 = cMAESOptimizer85.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType88 = cMAESOptimizer85.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker89 = cMAESOptimizer85.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray12, 10, (double) (short) 0, false, 100, (int) ' ', randomGenerator78, false, pointValuePairConvergenceChecker89);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        java.util.List<java.lang.Double> doubleList94 = cMAESOptimizer93.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair95 = cMAESOptimizer93.doOptimize();
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer0.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer0.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        double[] doubleArray10 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray21);
        double[] doubleArray36 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray36);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray36);
        org.apache.commons.math3.random.RandomGenerator randomGenerator44 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray36, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator44, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray21, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator44, false);
        double[] doubleArray56 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray56);
        double[] doubleArray71 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray71);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray71);
        org.apache.commons.math3.random.RandomGenerator randomGenerator79 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray71, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator79, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray56, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator79, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray21, (int) (byte) 1, (double) '#', false, (int) (short) 1, (int) (byte) 0, randomGenerator79, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray10, (int) (short) 100, (double) (byte) 1, true, (int) (byte) 1, (int) (byte) -1, randomGenerator79, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray90 = cMAESOptimizer89.getLowerBound();
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        double[] doubleArray9 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray18);
        double[] doubleArray33 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.random.RandomGenerator randomGenerator41 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray33, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator41, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray18, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator41, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray9, (int) (byte) 100, (-1.0d), false, (int) '4', (int) (byte) 1, randomGenerator41, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray9);
        java.util.List<java.lang.Double> doubleList50 = cMAESOptimizer49.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray51 = cMAESOptimizer49.getStartPoint();
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer5 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray4);
        double[] doubleArray19 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray19);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray19);
        org.apache.commons.math3.random.RandomGenerator randomGenerator27 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray19, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator27, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray4, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator27, false);
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray39);
        double[] doubleArray54 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray54);
        org.apache.commons.math3.random.RandomGenerator randomGenerator62 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray54, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator62, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray39, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator62, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray4, (int) (byte) 1, (double) '#', false, (int) (short) 1, (int) (byte) 0, randomGenerator62, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray4);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker70 = cMAESOptimizer69.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray71 = cMAESOptimizer69.getUpperBound();
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int7 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int9 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer9.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer9.doOptimize();
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair38 = cMAESOptimizer31.doOptimize();
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer0.getStatisticsDHistory();
        int int3 = cMAESOptimizer0.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer0.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray6);
        double[] doubleArray21 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray21);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray21);
        org.apache.commons.math3.random.RandomGenerator randomGenerator29 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray21, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator29, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray6, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator29, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator41 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6, (int) (short) -1, 1.0d, false, 0, (int) (byte) 1, randomGenerator41, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray6);
        int int45 = cMAESOptimizer44.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray46 = cMAESOptimizer44.getLowerBound();
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray61 = cMAESOptimizer56.getStartPoint();
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsDHistory();
        int int8 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int9 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray43 = cMAESOptimizer42.getUpperBound();
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer0.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair4 = cMAESOptimizer0.doOptimize();
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer16.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer16.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker19 = cMAESOptimizer16.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray6, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator13, true, pointValuePairConvergenceChecker19);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator35 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer38.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList40 = cMAESOptimizer38.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker41 = cMAESOptimizer38.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray28, (int) '#', (double) (byte) 10, false, 1, (int) '#', randomGenerator35, true, pointValuePairConvergenceChecker41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray6, 100, (-1.0d), true, 1, (int) (byte) 10, randomGenerator35, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray48 = cMAESOptimizer47.getLowerBound();
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
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
        double[] doubleArray11 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
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
        java.util.List<java.lang.Double> doubleList33 = cMAESOptimizer31.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker34 = cMAESOptimizer31.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType35 = cMAESOptimizer31.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList36 = cMAESOptimizer31.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair37 = cMAESOptimizer31.doOptimize();
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
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
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1);
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer2.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer2.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer2.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer2.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer2.getStartPoint();
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int7 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int9 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        double[] doubleArray20 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray20);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray20);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray20, (int) (byte) 100, 1.0d, true, (int) (short) 1, 100, randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray5, (int) '4', (double) 0, true, (int) (short) -1, (int) ' ', randomGenerator28, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray5);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray5);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList36 = cMAESOptimizer35.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray37 = cMAESOptimizer35.getUpperBound();
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
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
        double[] doubleArray44 = cMAESOptimizer43.getUpperBound();
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer9.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer9.getLowerBound();
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer9.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer9.getStatisticsSigmaHistory();
        int int13 = cMAESOptimizer9.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer9.getUpperBound();
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList88 = cMAESOptimizer87.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair89 = cMAESOptimizer87.doOptimize();
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray88 = cMAESOptimizer87.getLowerBound();
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer0.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer0.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer0.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer0.doOptimize();
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
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
        double[] doubleArray21 = cMAESOptimizer18.getLowerBound();
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        double[] doubleArray6 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsSigmaHistory();
        int int9 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        int int2 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList34 = cMAESOptimizer31.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair35 = cMAESOptimizer31.doOptimize();
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer0.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        double[] doubleArray7 = new double[] { ' ', '#', (byte) 10, ' ', 1.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer9.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer9.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer9.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer9.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer9.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer9.getStartPoint();
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer0.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer0.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair5 = cMAESOptimizer0.doOptimize();
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
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
        org.apache.commons.math3.optimization.GoalType goalType95 = cMAESOptimizer91.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker96 = cMAESOptimizer91.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray97 = cMAESOptimizer91.getStartPoint();
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray2);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray2);
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer4.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer4.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer4.getLowerBound();
    }
}

