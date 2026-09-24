package org.apache.commons.math3.optim.nonlinear.vector;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.math3.linear.RealMatrix realMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.nonlinear.vector.Weight weight1 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass6 = weight5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.nonlinear.vector.Weight weight1 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        java.lang.Class<?> wildcardClass6 = realMatrix5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass9 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        java.lang.Class<?> wildcardClass8 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        java.lang.Class<?> wildcardClass6 = weight4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        java.lang.Class<?> wildcardClass7 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass5 = weight4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass11 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        java.lang.Class<?> wildcardClass10 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        java.lang.Class<?> wildcardClass8 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass8 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        java.lang.Class<?> wildcardClass10 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass5 = weight4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass11 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass10 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass13 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass14 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        java.lang.Class<?> wildcardClass9 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        java.lang.Class<?> wildcardClass9 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        java.lang.Class<?> wildcardClass8 = realMatrix5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        java.lang.Class<?> wildcardClass6 = weight4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        java.lang.Class<?> wildcardClass11 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        java.lang.Class<?> wildcardClass10 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        java.lang.Class<?> wildcardClass9 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        java.lang.Class<?> wildcardClass10 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass10 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass4 = weight3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass15 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass9 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass9 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass13 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        java.lang.Class<?> wildcardClass10 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass13 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        java.lang.Class<?> wildcardClass5 = weight3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass11 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass9 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        java.lang.Class<?> wildcardClass9 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        java.lang.Class<?> wildcardClass6 = weight4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass11 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        java.lang.Class<?> wildcardClass12 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        java.lang.Class<?> wildcardClass15 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass9 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        java.lang.Class<?> wildcardClass7 = realMatrix5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass12 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        java.lang.Class<?> wildcardClass7 = weight4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass7 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass5 = weight4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass6 = weight5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass9 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        java.lang.Class<?> wildcardClass10 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass10 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        double[] doubleArray0 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optim.nonlinear.vector.Weight weight1 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        java.lang.Class<?> wildcardClass12 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass8 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight9.getWeight();
        java.lang.Class<?> wildcardClass14 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass15 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass15 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        java.lang.Class<?> wildcardClass11 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass10 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        java.lang.Class<?> wildcardClass6 = realMatrix5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        java.lang.Class<?> wildcardClass16 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        java.lang.Class<?> wildcardClass8 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        java.lang.Class<?> wildcardClass12 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass13 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass12 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass10 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        java.lang.Class<?> wildcardClass8 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        java.lang.Class<?> wildcardClass16 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        java.lang.Class<?> wildcardClass9 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass11 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        java.lang.Class<?> wildcardClass11 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass7 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight11.getWeight();
        java.lang.Class<?> wildcardClass18 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        java.lang.Class<?> wildcardClass6 = realMatrix5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        java.lang.Class<?> wildcardClass9 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass10 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass12 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        java.lang.Class<?> wildcardClass7 = realMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass11 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass17 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass7 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        java.lang.Class<?> wildcardClass7 = realMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        java.lang.Class<?> wildcardClass8 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight8.getWeight();
        java.lang.Class<?> wildcardClass13 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass13 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass12 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass10 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight5.getWeight();
        java.lang.Class<?> wildcardClass9 = weight5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        java.lang.Class<?> wildcardClass10 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        java.lang.Class<?> wildcardClass9 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass4 = weight3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        java.lang.Class<?> wildcardClass6 = realMatrix5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        java.lang.Class<?> wildcardClass15 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass15 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        java.lang.Class<?> wildcardClass9 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        java.lang.Class<?> wildcardClass8 = realMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        java.lang.Class<?> wildcardClass12 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        java.lang.Class<?> wildcardClass11 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        java.lang.Class<?> wildcardClass5 = weight3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight11.getWeight();
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass16 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass11 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        java.lang.Class<?> wildcardClass17 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass10 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass16 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass10 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass14 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        java.lang.Class<?> wildcardClass10 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        java.lang.Class<?> wildcardClass16 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass16 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass11 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight11.getWeight();
        java.lang.Class<?> wildcardClass17 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        java.lang.Class<?> wildcardClass8 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass7 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass5 = weight4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass16 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        java.lang.Class<?> wildcardClass7 = realMatrix5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        java.lang.Class<?> wildcardClass11 = realMatrix5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass11 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        java.lang.Class<?> wildcardClass8 = realMatrix5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass16 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight12.getWeight();
        java.lang.Class<?> wildcardClass18 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass6 = weight5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass10 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        java.lang.Class<?> wildcardClass7 = realMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        java.lang.Class<?> wildcardClass5 = realMatrix4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight13.getWeight();
        java.lang.Class<?> wildcardClass18 = realMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        java.lang.Class<?> wildcardClass10 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass15 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        java.lang.Class<?> wildcardClass17 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight9.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass11 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        java.lang.Class<?> wildcardClass8 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        java.lang.Class<?> wildcardClass13 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        java.lang.Class<?> wildcardClass7 = weight4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass9 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass12 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass15 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight6.getWeight();
        java.lang.Class<?> wildcardClass11 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        double[] doubleArray2 = new double[] { (short) -1, (byte) 1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass7 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass16 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight9.getWeight();
        java.lang.Class<?> wildcardClass15 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass14 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        java.lang.Class<?> wildcardClass16 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass17 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass8 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass14 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass15 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass7 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight14.getWeight();
        java.lang.Class<?> wildcardClass18 = realMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        java.lang.Class<?> wildcardClass11 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        java.lang.Class<?> wildcardClass6 = weight3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass16 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight9.getWeight();
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        java.lang.Class<?> wildcardClass7 = weight5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight13.getWeight();
        java.lang.Class<?> wildcardClass18 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        java.lang.Class<?> wildcardClass8 = realMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        java.lang.Class<?> wildcardClass17 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass16 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass9 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass17 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        java.lang.Class<?> wildcardClass21 = realMatrix18.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        java.lang.Class<?> wildcardClass14 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        java.lang.Class<?> wildcardClass18 = realMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        java.lang.Class<?> wildcardClass10 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        java.lang.Class<?> wildcardClass13 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass8 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass15 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass17 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight10.getWeight();
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        java.lang.Class<?> wildcardClass12 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight3.getWeight();
        java.lang.Class<?> wildcardClass7 = weight3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        java.lang.Class<?> wildcardClass12 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        java.lang.Class<?> wildcardClass11 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass11 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass15 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        java.lang.Class<?> wildcardClass6 = realMatrix4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass13 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        double[] doubleArray1 = new double[] { (byte) 0 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        java.lang.Class<?> wildcardClass20 = weight18.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        java.lang.Class<?> wildcardClass10 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass17 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass11 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        java.lang.Class<?> wildcardClass10 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        double[] doubleArray2 = new double[] { (short) -1, (byte) 1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        java.lang.Class<?> wildcardClass7 = weight5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass17 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        java.lang.Class<?> wildcardClass9 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        java.lang.Class<?> wildcardClass17 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        java.lang.Class<?> wildcardClass19 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        double[] doubleArray2 = new double[] { (short) -1, (byte) 1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        java.lang.Class<?> wildcardClass7 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass15 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        double[] doubleArray2 = new double[] { (short) -1, (byte) 1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        java.lang.Class<?> wildcardClass6 = weight3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass18 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass7 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        double[] doubleArray2 = new double[] { (short) -1, (byte) 1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        java.lang.Class<?> wildcardClass17 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        java.lang.Class<?> wildcardClass17 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        java.lang.Class<?> wildcardClass19 = realMatrix18.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        java.lang.Class<?> wildcardClass18 = realMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass10 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass8 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        double[] doubleArray1 = new double[] { (byte) 0 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        java.lang.Class<?> wildcardClass5 = weight4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        java.lang.Class<?> wildcardClass10 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass16 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        java.lang.Class<?> wildcardClass16 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        java.lang.Class<?> wildcardClass18 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        java.lang.Class<?> wildcardClass9 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        java.lang.Class<?> wildcardClass7 = realMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass11 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass16 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        java.lang.Class<?> wildcardClass7 = weight4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        java.lang.Class<?> wildcardClass18 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        double[] doubleArray2 = new double[] { (short) -1, (byte) 1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass9 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        java.lang.Class<?> wildcardClass12 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        java.lang.Class<?> wildcardClass8 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        java.lang.Class<?> wildcardClass14 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass17 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass16 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        java.lang.Class<?> wildcardClass19 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass15 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        java.lang.Class<?> wildcardClass7 = realMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass11 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        java.lang.Class<?> wildcardClass8 = weight4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        java.lang.Class<?> wildcardClass8 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass11 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass12 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass9 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass15 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass19 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        java.lang.Class<?> wildcardClass7 = realMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass17 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        java.lang.Class<?> wildcardClass7 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        java.lang.Class<?> wildcardClass18 = realMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        java.lang.Class<?> wildcardClass10 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass19 = weight18.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        java.lang.Class<?> wildcardClass8 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass17 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        double[] doubleArray1 = new double[] { (byte) 0 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        java.lang.Class<?> wildcardClass4 = weight3.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight12.getWeight();
        java.lang.Class<?> wildcardClass18 = realMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass14 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight12.getWeight();
        java.lang.Class<?> wildcardClass18 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass12 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        java.lang.Class<?> wildcardClass8 = weight5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass10 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass16 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        double[] doubleArray1 = new double[] { 100.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass15 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        java.lang.Class<?> wildcardClass12 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        java.lang.Class<?> wildcardClass20 = weight18.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass16 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        java.lang.Class<?> wildcardClass11 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight14.getWeight();
        java.lang.Class<?> wildcardClass19 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass15 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass18 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass14 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass10 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        java.lang.Class<?> wildcardClass12 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass15 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        java.lang.Class<?> wildcardClass21 = realMatrix18.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass18 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        java.lang.Class<?> wildcardClass7 = weight4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        double[] doubleArray1 = new double[] { 100.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        java.lang.Class<?> wildcardClass7 = realMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight14.getWeight();
        java.lang.Class<?> wildcardClass19 = realMatrix18.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        java.lang.Class<?> wildcardClass10 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass15 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        java.lang.Class<?> wildcardClass9 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass11 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        java.lang.Class<?> wildcardClass9 = realMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        java.lang.Class<?> wildcardClass8 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass13 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        java.lang.Class<?> wildcardClass15 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass9 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        java.lang.Class<?> wildcardClass11 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        java.lang.Class<?> wildcardClass19 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        java.lang.Class<?> wildcardClass9 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass16 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass10 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        java.lang.Class<?> wildcardClass20 = realMatrix19.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass15 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        java.lang.Class<?> wildcardClass18 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        java.lang.Class<?> wildcardClass11 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass16 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        java.lang.Class<?> wildcardClass7 = realMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        double[] doubleArray1 = new double[] { (byte) 0 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix3 = weight2.getWeight();
        java.lang.Class<?> wildcardClass4 = weight2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass15 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        double[] doubleArray1 = new double[] { 100.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        java.lang.Class<?> wildcardClass6 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass16 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass16 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        java.lang.Class<?> wildcardClass18 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass17 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight7.getWeight();
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass15 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass17 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight12.getWeight();
        java.lang.Class<?> wildcardClass17 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        java.lang.Class<?> wildcardClass13 = realMatrix5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        double[] doubleArray2 = new double[] { (short) -1, (byte) 1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass4 = weight3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass12 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        java.lang.Class<?> wildcardClass19 = weight18.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        double[] doubleArray1 = new double[] { 100.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        java.lang.Class<?> wildcardClass4 = weight3.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass10 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        java.lang.Class<?> wildcardClass12 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        java.lang.Class<?> wildcardClass14 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        java.lang.Class<?> wildcardClass11 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        java.lang.Class<?> wildcardClass11 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass18 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass15 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        java.lang.Class<?> wildcardClass21 = weight20.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        java.lang.Class<?> wildcardClass19 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass11 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        java.lang.Class<?> wildcardClass20 = weight19.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass17 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        java.lang.Class<?> wildcardClass11 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        double[] doubleArray2 = new double[] { (short) -1, (byte) 1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass9 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        double[] doubleArray2 = new double[] { 1, 0 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass18 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        java.lang.Class<?> wildcardClass19 = realMatrix18.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass9 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        java.lang.Class<?> wildcardClass14 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        double[] doubleArray1 = new double[] { (byte) 0 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix3 = weight2.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        java.lang.Class<?> wildcardClass5 = realMatrix3.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass9 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        java.lang.Class<?> wildcardClass22 = weight20.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass15 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        java.lang.Class<?> wildcardClass20 = realMatrix18.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass15 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass17 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        double[] doubleArray1 = new double[] { (byte) 0 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        java.lang.Class<?> wildcardClass10 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        java.lang.Class<?> wildcardClass19 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        java.lang.Class<?> wildcardClass8 = realMatrix5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        java.lang.Class<?> wildcardClass16 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass11 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

