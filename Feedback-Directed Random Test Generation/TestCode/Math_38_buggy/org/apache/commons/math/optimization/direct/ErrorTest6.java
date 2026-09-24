package org.apache.commons.math.optimization.direct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3001");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 'a', 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3002");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3003");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0, (double) 0.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3004");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3005");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) 100, (double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3006");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        int int10 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3007");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (short) 1, (-1.0d));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3008");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, 1.0E-8d, 0.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3009");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3010");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (-1.0f), 10.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3011");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (byte) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3012");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3013");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) 0, (-1.0d));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3014");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3015");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (byte) 1, (double) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3016");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3017");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (short) 1, (double) (short) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3018");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3019");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 1.0f, (-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3020");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3021");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 0, (double) 1L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3022");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, 1.0d, 1.0E-8d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3023");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (byte) 1, (double) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3024");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3025");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3026");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3027");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3028");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, 100.0d, (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3029");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 1.0f, (double) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3030");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 100L, (double) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3031");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 100.0d, (double) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3032");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3033");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (-1), 1.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3034");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3035");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) 1, (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3036");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, 1.0d, (double) (short) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3037");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3038");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3039");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) '#', 1.0E-8d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3040");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (short) 1, (double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3041");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 0.0f, (double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3042");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3043");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3044");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker10 = bOBYQAOptimizer1.getConvergenceChecker();
        int int11 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType12 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType13 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker14 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3045");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) (short) 100, (double) '#');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3046");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 100, (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3047");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (short) 100, (double) (short) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3048");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', 1.0E-8d, (double) 100L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3049");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (byte) 10, (double) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3050");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (-1.0d), (double) 1L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3051");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3052");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) 100, (double) 1.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3053");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3054");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3055");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, 10.0d, (double) (byte) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3056");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (byte) 10, (double) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3057");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (-1.0f), (double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3058");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 1, (double) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3059");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3060");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3061");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) 1.0f, (double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3062");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3063");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3064");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) 'a', (double) 0L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3065");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 100L, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3066");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 1, (double) '4');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3067");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) '4', (double) '#');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3068");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3069");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) '4', 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3070");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (byte) 1, (double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3071");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 1L, (double) (byte) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3072");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        int int8 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3073");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (short) 10, (double) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3074");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3075");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) 0L, (double) 10.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3076");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 100.0f, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3077");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (byte) 100, (double) 2);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3078");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3079");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (byte) 0, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3080");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (byte) 0, (double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3081");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType10 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType11 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3082");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (-1.0f), 10.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3083");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, 10.0d, (double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3084");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (-1.0f), 10.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3085");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1));
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3086");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3087");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (byte) 10, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3088");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 0L, (double) 10L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3089");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3090");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3091");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 0.0d, (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3092");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 0.0d, 1.0E-8d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3093");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1.0f), (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3094");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) '4', (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3095");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 1.0f, (double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3096");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker10 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker11 = bOBYQAOptimizer1.getConvergenceChecker();
        int int12 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3097");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1));
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3098");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) 0, (-1.0d));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3099");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 100.0d, (double) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3100");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ');
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3101");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3102");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3103");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 0, 1.0E-8d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3104");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (short) 1, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3105");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 1, (double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3106");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (byte) -1, 100.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3107");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (short) 10, (double) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3108");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, 0.0d, (double) 100.0f);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3109");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 1.0f, (double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3110");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3111");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3112");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 0, (double) ' ');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3113");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3114");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) (short) 100, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3115");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 0.0f, (double) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3116");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3117");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1L), (double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3118");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3119");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, 0.0d, (double) 1L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3120");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 10, (double) (-1));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3121");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (byte) 10, (double) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3122");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (-1.0f), (double) 0.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3123");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 10.0f, 100.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3124");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) '4', 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3125");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (byte) 1, (double) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3126");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (short) 1, (double) 10L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3127");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 100, (double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3128");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1));
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3129");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, 10.0d, (double) (byte) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3130");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 0.0f, (double) (-1L));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3131");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', 100.0d, (double) 100.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3132");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3133");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (-1.0f), (double) (-1));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3134");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) 'a', (double) 10L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3135");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3136");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        int int9 = bOBYQAOptimizer1.getEvaluations();
        int int10 = bOBYQAOptimizer1.getEvaluations();
        int int11 = bOBYQAOptimizer1.getEvaluations();
        int int12 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker13 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3137");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3138");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (short) 100, (double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3139");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, 1.0d, (double) (short) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3140");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3141");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 100, (double) (short) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3142");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (-1L), 1.0E-8d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3143");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3144");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 1L, (double) (byte) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3145");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', 0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3146");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) '4', (double) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3147");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) (-1L), (double) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3148");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3149");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, 0.0d, (double) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3150");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3151");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 10, (double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3152");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (byte) 1, (double) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3153");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 'a', (double) 2);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3154");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) ' ', 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3155");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 100L, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3156");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        int int10 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3157");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) (byte) 100, (double) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3158");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 'a', (double) 'a');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3159");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 0.0f, (double) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3160");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (-1.0f), (double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3161");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 10, (double) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3162");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (byte) 1, (double) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3163");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3164");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        int int8 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer3.getConvergenceChecker();
        int int10 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3165");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) (byte) 100, (double) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3166");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0L, (double) '4');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3167");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 1.0f, 1.0E-8d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3168");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 10L, (double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3169");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3170");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker10 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker11 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3171");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (byte) -1, 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3172");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 10.0f, (double) (short) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3173");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, 10.0d, (double) (byte) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3174");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3175");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3176");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) '#', 10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3177");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (-1.0d), (double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3178");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (byte) 100, (double) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3179");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), (double) ' ');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3180");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3181");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3182");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (short) 100, (double) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3183");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 0.0d, 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3184");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3185");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 1, 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3186");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        int int10 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3187");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (short) 1, (double) 1.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3188");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (byte) 10, 10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3189");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (-1.0f), 10.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3190");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3191");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 100L, (double) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3192");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (-1.0f), 10.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3193");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3194");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 1L, (double) (byte) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3195");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) ' ', 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3196");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3197");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3198");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 'a', 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3199");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (-1), (double) (-1));
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3200");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) 0.0f, (double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3201");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, 0.0d, (double) 'a');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3202");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 1.0d, 100.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3203");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, 1.0E-8d, 0.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3204");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3205");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3206");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3207");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3208");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 1.0f, 1.0E-8d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3209");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (short) 1, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3210");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) -1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3211");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 2, 10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3212");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 10.0f, (double) (short) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3213");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 0.0d, (double) 1.0f);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3214");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (byte) -1, (-1.0d));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3215");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 10, 10.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3216");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 1, (double) ' ');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3217");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 1.0d, (-1.0d));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3218");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 10.0f, 1.0E-8d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3219");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 0, (double) 1L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3220");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 10, (double) (-1));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3221");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (short) 1, (double) 10.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3222");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (-1L), (double) (short) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3223");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, 1.0E-8d, (double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3224");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3225");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (-1L), (double) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3226");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 100, (double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3227");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), 100.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3228");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (byte) -1, (double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3229");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3230");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3231");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3232");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (byte) 0, (double) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3233");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3234");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 10.0f, (double) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3235");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (short) 10, (double) 1.0f);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3236");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (-1L), 1.0E-8d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3237");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3238");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 10.0f, 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3239");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3240");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) (byte) 0, (double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3241");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 1.0f, 1.0E-8d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3242");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (-1.0d), (double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3243");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 0, (double) 100.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3244");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, 1.0d, (double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3245");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (byte) 10, (double) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3246");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3247");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 1.0f, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3248");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3249");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3250");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (-1.0d), 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3251");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3252");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3253");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (short) 1, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3254");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3255");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 1.0f, (double) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3256");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3257");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1));
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3258");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3259");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 10, 10.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3260");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 1L, (double) (byte) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3261");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 'a', (double) 'a');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3262");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) (-1L), (double) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        int int9 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3263");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3264");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1.0f), (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3265");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3266");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 2, 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3267");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3268");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3269");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 1L, (double) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3270");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) 0L, (double) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3271");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3272");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, 0.0d, (double) 0L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3273");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3274");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) (short) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3275");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3276");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) '#', 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3277");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 0, 1.0E-8d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3278");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1L), (double) (-1));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3279");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3280");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 0L, (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3281");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair2 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3282");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3283");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 0.0d, 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3284");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 10L, (double) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3285");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 10.0f, 1.0E-8d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3286");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 0L, (double) 100L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3287");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) ' ', (double) ' ');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3288");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (byte) -1, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3289");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 2, (double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3290");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3291");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 1L, (double) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3292");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 2, (double) 0.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3293");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), (double) 100);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3294");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3295");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3296");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 2, 1.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3297");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 10L, (double) (byte) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3298");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 0.0d, 0.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3299");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 100L, (double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3300");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (-1), 1.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3301");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3302");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        int int10 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3303");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) '4', 1.0E-8d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3304");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3305");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) ' ', (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3306");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) '#', 0.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3307");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (short) 100, (double) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3308");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 1L, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3309");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3310");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) (-1L), (double) 0L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3311");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) 1, (double) 2);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3312");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) '4', (double) 100L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3313");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, 1.0E-8d, (double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3314");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, 1.0E-8d, (double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3315");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (byte) -1, 100.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3316");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3317");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (-1.0d), (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3318");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 10L, (double) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3319");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (short) 10, (double) 10);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3320");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3321");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) 100, 10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3322");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 1.0f, (-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3323");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, 0.0d, 0.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3324");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (-1), (double) (-1));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3325");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3326");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), 100.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3327");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 2, (double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3328");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 100.0d, (double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3329");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), 0.0d, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3330");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3331");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (-1), 1.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3332");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (byte) -1, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3333");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), (double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3334");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        int int10 = bOBYQAOptimizer1.getEvaluations();
        int int11 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3335");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1));
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3336");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 1, (double) '4');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3337");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', 1.0d, (double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3338");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 2, (double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3339");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 100L, (double) 'a');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3340");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3341");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 0, (double) 1L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3342");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (-1.0d), 0.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3343");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3344");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (-1), 1.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3345");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) 10, (double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3346");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType10 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3347");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 1.0f, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3348");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (short) 100, (double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3349");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3350");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (short) 10, (double) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3351");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 1L, (double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3352");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 100L, 1.0E-8d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3353");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (short) 1, (double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3354");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1L), (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3355");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3356");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 0, (double) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3357");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10, (double) (byte) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3358");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 2, (double) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3359");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (-1.0f), (double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3360");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 1L, (double) 0L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3361");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3362");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3363");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10L, (double) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3364");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) 0L, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3365");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3366");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3367");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = bOBYQAOptimizer1.getStartPoint();
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3368");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 1.0f, (double) 1L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3369");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3370");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3371");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 100.0f, 10.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3372");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0.0f, (double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3373");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3374");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3375");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1.0f), (double) ' ');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3376");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, 1.0d, (double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3377");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1L), 100.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = bOBYQAOptimizer3.doOptimize();
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3378");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) 10.0f, 100.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3379");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3380");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1), (double) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        int int8 = bOBYQAOptimizer3.getEvaluations();
        int int9 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3381");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a');
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getLowerBound();
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3382");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3383");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3384");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = bOBYQAOptimizer1.getUpperBound();
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3385");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1L), (double) (-1.0f));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3386");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, 1.0E-8d, (double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getLowerBound();
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3387");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (short) 10, (double) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bOBYQAOptimizer3.getStartPoint();
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3388");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = bOBYQAOptimizer1.doOptimize();
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3389");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (-1), 10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3390");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 0.0d, (double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bOBYQAOptimizer3.getUpperBound();
    }
}

