package org.apache.commons.math3.optim.nonlinear.vector;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight22.getWeight();
        java.lang.Class<?> wildcardClass24 = weight22.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight19.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        java.lang.Class<?> wildcardClass24 = realMatrix21.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight18.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass10 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        java.lang.Class<?> wildcardClass24 = weight23.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass16 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        java.lang.Class<?> wildcardClass13 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        double[] doubleArray1 = new double[] { (byte) 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        java.lang.Class<?> wildcardClass20 = realMatrix19.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        double[] doubleArray2 = new double[] { 0L, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight19.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.linear.RealMatrix realMatrix24 = weight23.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix24);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix24);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight27 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix24);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight28 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix24);
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
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        java.lang.Class<?> wildcardClass22 = realMatrix21.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass17 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight13.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight16.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        double[] doubleArray1 = new double[] { (byte) 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        java.lang.Class<?> wildcardClass9 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass20 = weight19.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass17 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass16 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
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
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight3.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        java.lang.Class<?> wildcardClass17 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
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
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        double[] doubleArray1 = new double[] { (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        double[] doubleArray2 = new double[] { (short) -1, (byte) 1 };
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
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass20 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        double[] doubleArray1 = new double[] { (byte) 0 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        double[] doubleArray1 = new double[] { (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix3 = weight2.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight2.getWeight();
        java.lang.Class<?> wildcardClass5 = realMatrix4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight16.getWeight();
        java.lang.Class<?> wildcardClass21 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
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
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight9.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        double[] doubleArray1 = new double[] { 100.0f };
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
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        java.lang.Class<?> wildcardClass20 = realMatrix19.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.linear.RealMatrix realMatrix24 = weight23.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix25 = weight23.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix25);
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
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight20.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix22);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight16.getWeight();
        java.lang.Class<?> wildcardClass20 = realMatrix19.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        double[] doubleArray1 = new double[] { (byte) 0 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight6.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        java.lang.Class<?> wildcardClass21 = weight20.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        double[] doubleArray1 = new double[] { (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight20.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix22);
        org.apache.commons.math3.linear.RealMatrix realMatrix24 = weight23.getWeight();
        java.lang.Class<?> wildcardClass25 = weight23.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        double[] doubleArray2 = new double[] { (short) -1, (byte) 1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass11 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        double[] doubleArray1 = new double[] { 100.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight12.getWeight();
        java.lang.Class<?> wildcardClass20 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight22.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        double[] doubleArray1 = new double[] { (byte) 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        java.lang.Class<?> wildcardClass19 = realMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        java.lang.Class<?> wildcardClass10 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        java.lang.Class<?> wildcardClass22 = weight20.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight12.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass13 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        java.lang.Class<?> wildcardClass20 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        java.lang.Class<?> wildcardClass19 = realMatrix18.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        double[] doubleArray1 = new double[] { 100.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        java.lang.Class<?> wildcardClass21 = realMatrix19.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        double[] doubleArray1 = new double[] { (byte) 0 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight21.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        double[] doubleArray6 = new double[] { '4', (byte) -1, 0, '#', (-1.0d), 100.0d };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d, (-1.0d), 0.0d, 35.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        double[] doubleArray1 = new double[] { (byte) 0 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        java.lang.Class<?> wildcardClass18 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        java.lang.Class<?> wildcardClass16 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        double[] doubleArray1 = new double[] { 100.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        java.lang.Class<?> wildcardClass10 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        double[] doubleArray4 = new double[] { '#', 0.0f, '4', (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 0.0d, 52.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        double[] doubleArray5 = new double[] { (short) 1, (short) 1, (byte) -1, 10, 100.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, (-1.0d), 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        java.lang.Class<?> wildcardClass21 = weight20.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass14 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight21.getWeight();
        java.lang.Class<?> wildcardClass23 = realMatrix22.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
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
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        java.lang.Class<?> wildcardClass21 = realMatrix18.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        java.lang.Class<?> wildcardClass22 = weight20.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight20.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight20.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix24 = weight20.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix25 = weight20.getWeight();
        java.lang.Class<?> wildcardClass26 = weight20.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight18.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight22.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix24 = weight22.getWeight();
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
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight7.getWeight();
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight17.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        java.lang.Class<?> wildcardClass22 = weight20.getClass();
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
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        java.lang.Class<?> wildcardClass17 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        java.lang.Class<?> wildcardClass19 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
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
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight13.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass19 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        double[] doubleArray5 = new double[] { (short) 1, (short) 1, (byte) -1, 10, 100.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, (-1.0d), 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight19.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.linear.RealMatrix realMatrix24 = weight23.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix24);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix24);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight27 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix24);
        org.apache.commons.math3.linear.RealMatrix realMatrix28 = weight27.getWeight();
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
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix28);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
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
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
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
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight21.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight21.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        double[] doubleArray1 = new double[] { (byte) 0 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix3 = weight2.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight2.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        java.lang.Class<?> wildcardClass10 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight21.getWeight();
        java.lang.Class<?> wildcardClass23 = weight21.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight21.getWeight();
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
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        java.lang.Class<?> wildcardClass24 = realMatrix18.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight14.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        java.lang.Class<?> wildcardClass20 = realMatrix19.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        double[] doubleArray1 = new double[] { (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        java.lang.Class<?> wildcardClass13 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        java.lang.Class<?> wildcardClass10 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        java.lang.Class<?> wildcardClass10 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight17.getWeight();
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
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        double[] doubleArray2 = new double[] { (short) -1, (byte) 1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.linear.RealMatrix realMatrix25 = weight24.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix26 = weight24.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight27 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix26);
        org.apache.commons.math3.linear.RealMatrix realMatrix28 = weight27.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix29 = weight27.getWeight();
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
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        double[] doubleArray1 = new double[] { 100.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        java.lang.Class<?> wildcardClass14 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        double[] doubleArray5 = new double[] { (short) 1, (short) 1, (byte) -1, 10, 100.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, (-1.0d), 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight17.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        double[] doubleArray2 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass10 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        double[] doubleArray2 = new double[] { (short) -1, (byte) 1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        java.lang.Class<?> wildcardClass14 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight22.getWeight();
        java.lang.Class<?> wildcardClass24 = weight22.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
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
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass17 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
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
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        java.lang.Class<?> wildcardClass7 = realMatrix4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        double[] doubleArray3 = new double[] { (short) 1, (short) 0, (byte) 10 };
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
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.linear.RealMatrix realMatrix25 = weight24.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix25);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight27 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix25);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight28 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix25);
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
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix25);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        double[] doubleArray5 = new double[] { (short) 1, (short) 1, (byte) -1, 10, 100.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, (-1.0d), 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        double[] doubleArray6 = new double[] { (byte) 10, (byte) 10, 100L, (byte) 10, (byte) 0, 'a' };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 10.0d, 100.0d, 10.0d, 0.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        java.lang.Class<?> wildcardClass20 = realMatrix19.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        double[] doubleArray2 = new double[] { (short) -1, (byte) 1 };
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight22.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight9.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
        java.lang.Class<?> wildcardClass16 = realMatrix14.getClass();
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
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        double[] doubleArray3 = new double[] { (byte) 10, 'a', (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        java.lang.Class<?> wildcardClass6 = realMatrix5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        double[] doubleArray4 = new double[] { '#', 0.0f, '4', (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        java.lang.Class<?> wildcardClass10 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 0.0d, 52.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
        java.lang.Class<?> wildcardClass15 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight13.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight19.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
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
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight22.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix23);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix23);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        double[] doubleArray2 = new double[] { 100.0f, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix24 = weight23.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix24);
        java.lang.Class<?> wildcardClass26 = weight25.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        double[] doubleArray6 = new double[] { (byte) 10, (byte) 10, 100L, (byte) 10, (byte) 0, 'a' };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 10.0d, 100.0d, 10.0d, 0.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        java.lang.Class<?> wildcardClass19 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        double[] doubleArray1 = new double[] { (byte) 0 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        java.lang.Class<?> wildcardClass19 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass24 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass15 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass18 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
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
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        java.lang.Class<?> wildcardClass16 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight15.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
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
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix20);
    }
}

