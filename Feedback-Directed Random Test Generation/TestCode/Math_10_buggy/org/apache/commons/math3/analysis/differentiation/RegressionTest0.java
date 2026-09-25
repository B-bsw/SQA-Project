package org.apache.commons.math3.analysis.differentiation;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray5 = new double[] { (-1.0d), 0L };
        double[] doubleArray10 = new double[] { 'a', (-1.0f), '4' };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.log10(doubleArray5, (int) 'a', doubleArray10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 97.0d, (-1.0d), 52.0d }, 1.0E-15);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray7 = new double[] { (-1.0f), (-1L), 0, 10L };
        double[] doubleArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.pow(doubleArray7, 0, 0, doubleArray10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray7 = new double[] { 10.0d, (byte) -1, ' ', (-1.0d) };
        double[] doubleArray14 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray20 = new double[] { 10L, 1.0d, (-1), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.divide(doubleArray7, 0, doubleArray14, 10, doubleArray20, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, (-1.0d), 32.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 100.0d, 1.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 1.0d, (-1.0d), 32.0d }, 1.0E-15);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray7 = new double[] { 100L, 10L, (short) 10, 100 };
        double[] doubleArray10 = new double[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.sinh(doubleArray7, 10, doubleArray10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 10.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray9 = new double[] { 0.0f, 0, 100, 1.0d, (byte) 1 };
        double[] doubleArray16 = new double[] { (byte) 100, 100, 100, 'a' };
        double[] doubleArray19 = null;
        double[] doubleArray25 = new double[] { 0.0f, (short) 10, (short) 1 };
        double[] doubleArray27 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.linearCombination((double) 0L, doubleArray9, 0, (double) 100, doubleArray16, (int) (byte) 100, 0.0d, doubleArray19, (int) ' ', (double) 100, doubleArray25, (int) (byte) 0, doubleArray27, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 0.0d, 100.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d, 100.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] {}, 1.0E-15);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray9 = new double[] { (byte) 10, (short) 0, 0L, 0.0d, (byte) -1, 0 };
        double[] doubleArray13 = new double[] { 0, 10L };
        double[] doubleArray19 = new double[] { 10L, 100, 0.0f, 0L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.compose(doubleArray9, (int) '#', doubleArray13, doubleArray19, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 0.0d, 0.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 100.0d, 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray3 = new double[] {};
        double[] doubleArray7 = new double[] { (short) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.tan(doubleArray3, (int) ' ', doubleArray7, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        double[] doubleArray10 = new double[] { (-1.0f), 0, (byte) 100, (-1), (byte) 100, '#' };
        double[] doubleArray15 = new double[] { (short) 100, 100.0d, 0.0f };
        double[] doubleArray21 = new double[] { (byte) 1, 100L, (byte) 1, (byte) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.compose(doubleArray10, (int) (short) 100, doubleArray15, doubleArray21, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 0.0d, 100.0d, (-1.0d), 100.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        double[] doubleArray9 = new double[] { (-1.0f), (byte) 1, (short) 1, (short) 10, 100.0f };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.cosh(doubleArray9, (-1), doubleArray11, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 1.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        double[] doubleArray9 = new double[] { 100.0f, 10.0f, 0, 100.0f, 0 };
        double[] doubleArray16 = new double[] { '#', 0.0d, 0, (short) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.asin(doubleArray9, (int) (short) 100, doubleArray16, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 10.0d, 0.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 35.0d, 0.0d, 0.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray10 = new double[] { '#', 0, ' ', (byte) 100, (byte) 1, (-1.0f) };
        double[] doubleArray16 = new double[] { 'a', 100, (short) 0 };
        double[] doubleArray24 = new double[] { 'a', (short) 100, (-1), (byte) -1, (byte) -1 };
        double[] doubleArray27 = new double[] { 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.linearCombination((double) 1, doubleArray10, 100, (double) '#', doubleArray16, 10, (double) '4', doubleArray24, (int) ' ', doubleArray27, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 35.0d, 0.0d, 32.0d, 100.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 97.0d, 100.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray4 = new double[] { 'a' };
        double[] doubleArray11 = new double[] { 1.0d, 0L, (short) -1, (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.log1p(doubleArray4, 100, doubleArray11, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 0.0d, (-1.0d), 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        double[] doubleArray8 = new double[] { (short) 1, (-1), 10.0d, 10 };
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.atan(doubleArray8, (int) (short) 10, doubleArray10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray8 = new double[] { 10.0d, 'a', (byte) 10, 1L, 1.0d };
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.atanh(doubleArray8, 1, doubleArray10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d, 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray7 = new double[] { 100.0f, (-1.0d), '4', 10L };
        double[] doubleArray15 = new double[] { 0, 1.0f, (-1.0f), (byte) 10, 0.0d, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.cos(doubleArray7, (int) 'a', doubleArray15, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, (-1.0d), 52.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, 1.0d, (-1.0d), 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getOrder();
        double[] doubleArray8 = new double[] { (-1), 1.0d, 1, (-1.0d) };
        double[] doubleArray12 = new double[] { 100L, 0L };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.log10(doubleArray8, 0, doubleArray12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 1.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        double[] doubleArray5 = new double[] { (short) 0 };
        double[] doubleArray11 = new double[] { (byte) 10, 10L, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.pow(doubleArray5, 100, (int) '#', doubleArray11, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray3 = new double[] {};
        double[] doubleArray6 = new double[] { 10 };
        double[] doubleArray7 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.compose(doubleArray3, (int) (byte) 0, doubleArray6, doubleArray7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getOrder();
        double[] doubleArray6 = new double[] { '4', 0L };
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.add(doubleArray6, (int) (byte) 100, doubleArray8, 1, doubleArray11, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 35.0d }, 1.0E-15);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getOrder();
        double[] doubleArray10 = new double[] { 10.0f, (short) -1, (-1.0f), ' ', (byte) 1, (short) 10 };
        double[] doubleArray17 = new double[] { (-1L), 100.0f, 0L, 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.cos(doubleArray10, (int) (byte) 10, doubleArray17, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, (-1.0d), (-1.0d), 32.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 100.0d, 0.0d, 97.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        double[] doubleArray9 = new double[] { (byte) -1, 10, 100L, (byte) 10, (short) -1 };
        double[] doubleArray12 = new double[] { (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.log(doubleArray9, (int) (byte) 1, doubleArray12, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray7 = new double[] { (-1.0f), (-1.0f), (short) 100, (short) 1 };
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.rootN(doubleArray7, (int) (short) 0, (int) (byte) -1, doubleArray10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        double[] doubleArray7 = new double[] { (-1.0d), (-1.0f), 0L };
        double[] doubleArray13 = new double[] { (short) 10, 10.0f, (byte) 10, 1L };
        double[] doubleArray20 = new double[] { '#', (-1.0d), 1.0d, 10.0f, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.add(doubleArray7, (int) (byte) 100, doubleArray13, (-1), doubleArray20, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 10.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 35.0d, (-1.0d), 1.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getOrder();
        double[] doubleArray8 = new double[] { 10.0d, (-1L), '4', (-1) };
        double[] doubleArray14 = new double[] { '#', 100.0d, (-1), 0.0d };
        double[] doubleArray21 = new double[] { 1.0d, (short) 100, 100.0d, 0.0f, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.remainder(doubleArray8, 1, doubleArray14, (int) (short) -1, doubleArray21, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, (-1.0d), 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 35.0d, 100.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 100.0d, 100.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getOrder();
        int int4 = dSCompiler2.getSize();
        double[] doubleArray7 = new double[] { (-1.0d), (-1.0f) };
        double[] doubleArray13 = new double[] { (-1L), ' ', '4', 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.asinh(doubleArray7, (int) '#', doubleArray13, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 32.0d, 52.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getOrder();
        double[] doubleArray5 = new double[] { (byte) 1 };
        double[] doubleArray12 = new double[] { (short) 1, 100, 10, 0.0f, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.log1p(doubleArray5, (int) ' ', doubleArray12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 100.0d, 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getOrder();
        int int4 = dSCompiler2.getSize();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = dSCompiler2.getPartialDerivativeOrders((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getOrder();
        double[] doubleArray7 = new double[] { 100, (-1L), 'a' };
        double[] doubleArray14 = new double[] { 0, 10.0d, 1, 'a', 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.asin(doubleArray7, 100, doubleArray14, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, 10.0d, 1.0d, 97.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getOrder();
        int int4 = dSCompiler2.getSize();
        double[] doubleArray6 = new double[] { (byte) 100 };
        double[] doubleArray14 = new double[] { (byte) -1, (-1.0f), 0, 0.0f, (short) 100, '#' };
        double[] doubleArray18 = new double[] { 0.0d, 100 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.subtract(doubleArray6, (int) (short) 10, doubleArray14, (int) '#', doubleArray18, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), (-1.0d), 0.0d, 0.0d, 100.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getOrder();
        int int4 = dSCompiler2.getSize();
        double[] doubleArray9 = new double[] { 100.0d, (short) 0, 1, 0.0f };
        double[] doubleArray13 = new double[] { (byte) -1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.exp(doubleArray9, (int) ' ', doubleArray13, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getOrder();
        double[] doubleArray8 = new double[] { '#', (short) 10, (byte) 1 };
        double[] doubleArray11 = new double[] { 100.0d };
        double[] doubleArray14 = new double[] { 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.remainder(doubleArray8, (int) (byte) -1, doubleArray11, (int) '4', doubleArray14, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 35.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getOrder();
        double[] doubleArray5 = new double[] {};
        double[] doubleArray10 = new double[] { (short) 10, (byte) 10, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.atan(doubleArray5, (int) (short) 100, doubleArray10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getSize();
        double[] doubleArray5 = new double[] {};
        double[] doubleArray12 = new double[] { (byte) 10, (-1L), (short) 10, 0.0f, 10 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.cosh(doubleArray5, 0, doubleArray12, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), 10.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        double[] doubleArray6 = new double[] { (byte) 10 };
        double[] doubleArray15 = new double[] { 1.0d, (-1L), (byte) 0, (-1.0f), (-1L), 0 };
        double[] doubleArray21 = new double[] { 10.0f, '#', 10L };
        double[] doubleArray28 = new double[] { (short) 10, 100, 1L, (byte) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.linearCombination((double) (byte) 1, doubleArray6, (int) '#', 10.0d, doubleArray15, (int) (short) 10, (double) ' ', doubleArray21, (int) (short) 10, doubleArray28, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d), 0.0d, (-1.0d), (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 35.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, 100.0d, 1.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getSize();
        int int5 = dSCompiler2.getFreeParameters();
        double[] doubleArray12 = new double[] { (byte) 1, 100, 0.0d, 0.0d, 10, (-1.0d) };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.sin(doubleArray12, (int) (short) -1, doubleArray14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 100.0d, 0.0d, 0.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getOrder();
        double[] doubleArray5 = new double[] {};
        double[] doubleArray13 = new double[] { 1.0d, (-1.0d), 10, (byte) 10, (-1L), 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.cosh(doubleArray5, (int) (byte) 10, doubleArray13, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, (-1.0d), 10.0d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getSize();
        double[] doubleArray5 = new double[] {};
        double[] doubleArray12 = new double[] { 10L, (byte) -1, 10.0d, 1.0f, 1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.asin(doubleArray5, (int) (byte) 0, doubleArray12, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), 10.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getSize();
        int int5 = dSCompiler2.getFreeParameters();
        double[] doubleArray6 = new double[] {};
        double[] doubleArray12 = new double[] { 1L, 10L, 10, 1.0d };
        double[] doubleArray20 = new double[] { '#', (byte) 0, 10L, 100L, 1, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.atan2(doubleArray6, (int) (short) 1, doubleArray12, (int) (short) -1, doubleArray20, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 10.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 35.0d, 0.0d, 10.0d, 100.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler7 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int8 = dSCompiler7.getSize();
        int int9 = dSCompiler7.getOrder();
        dSCompiler2.checkCompatibility(dSCompiler7);
        double[] doubleArray13 = new double[] { '#', (byte) 0 };
        double[] doubleArray19 = new double[] { 100.0d, 1.0f, '#', 1L };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler7.asinh(doubleArray13, (int) (short) 100, doubleArray19, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dSCompiler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 35.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 1.0d, 35.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler6 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray9 = new double[] { 10L, (short) 10 };
        double[] doubleArray13 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray18 = new double[] { (short) 0, 1, '#' };
        dSCompiler6.subtract(doubleArray9, (int) (byte) 0, doubleArray13, (int) (byte) 0, doubleArray18, 0);
        double[] doubleArray22 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.acos(doubleArray18, (int) (short) -1, doubleArray22, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dSCompiler6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler6 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray9 = new double[] { 10L, (short) 10 };
        double[] doubleArray13 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray18 = new double[] { (short) 0, 1, '#' };
        dSCompiler6.subtract(doubleArray9, (int) (byte) 0, doubleArray13, (int) (byte) 0, doubleArray18, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler24 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray27 = new double[] { 10L, (short) 10 };
        double[] doubleArray31 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray36 = new double[] { (short) 0, 1, '#' };
        dSCompiler24.subtract(doubleArray27, (int) (byte) 0, doubleArray31, (int) (byte) 0, doubleArray36, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler42 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray45 = new double[] { 10L, (short) 10 };
        double[] doubleArray49 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray54 = new double[] { (short) 0, 1, '#' };
        dSCompiler42.subtract(doubleArray45, (int) (byte) 0, doubleArray49, (int) (byte) 0, doubleArray54, 0);
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.multiply(doubleArray13, (int) '#', doubleArray36, (int) (byte) -1, doubleArray54, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dSCompiler6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getSize();
        int int5 = dSCompiler2.getFreeParameters();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler8 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray11 = new double[] { 10L, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray20 = new double[] { (short) 0, 1, '#' };
        dSCompiler8.subtract(doubleArray11, (int) (byte) 0, doubleArray15, (int) (byte) 0, doubleArray20, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler26 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray29 = new double[] { 10L, (short) 10 };
        double[] doubleArray33 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray38 = new double[] { (short) 0, 1, '#' };
        dSCompiler26.subtract(doubleArray29, (int) (byte) 0, doubleArray33, (int) (byte) 0, doubleArray38, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler44 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray47 = new double[] { 10L, (short) 10 };
        double[] doubleArray51 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray56 = new double[] { (short) 0, 1, '#' };
        dSCompiler44.subtract(doubleArray47, (int) (byte) 0, doubleArray51, (int) (byte) 0, doubleArray56, 0);
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.multiply(doubleArray20, (int) (short) 100, doubleArray38, (-1), doubleArray51, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(dSCompiler8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getOrder();
        double[] doubleArray4 = null;
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler8 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray11 = new double[] { 10L, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray20 = new double[] { (short) 0, 1, '#' };
        dSCompiler8.subtract(doubleArray11, (int) (byte) 0, doubleArray15, (int) (byte) 0, doubleArray20, 0);
        double[] doubleArray26 = new double[] { 100, (byte) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.compose(doubleArray4, (int) (byte) 1, doubleArray11, doubleArray26, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dSCompiler8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray5 = new double[] { 10L, (short) 10 };
        double[] doubleArray9 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray14 = new double[] { (short) 0, 1, '#' };
        dSCompiler2.subtract(doubleArray5, (int) (byte) 0, doubleArray9, (int) (byte) 0, doubleArray14, 0);
        double[] doubleArray21 = new double[] { ' ', 10, (-1.0d), 0.0d };
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler25 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray28 = new double[] { 10L, (short) 10 };
        double[] doubleArray32 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray37 = new double[] { (short) 0, 1, '#' };
        dSCompiler25.subtract(doubleArray28, (int) (byte) 0, doubleArray32, (int) (byte) 0, doubleArray37, 0);
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.cosh(doubleArray21, (int) (short) 0, doubleArray37, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 32.0d, 10.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler7 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int8 = dSCompiler7.getSize();
        int int9 = dSCompiler7.getOrder();
        dSCompiler2.checkCompatibility(dSCompiler7);
        int int11 = dSCompiler2.getSize();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler14 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray17 = new double[] { 10L, (short) 10 };
        double[] doubleArray21 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray26 = new double[] { (short) 0, 1, '#' };
        dSCompiler14.subtract(doubleArray17, (int) (byte) 0, doubleArray21, (int) (byte) 0, doubleArray26, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler32 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray35 = new double[] { 10L, (short) 10 };
        double[] doubleArray39 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray44 = new double[] { (short) 0, 1, '#' };
        dSCompiler32.subtract(doubleArray35, (int) (byte) 0, doubleArray39, (int) (byte) 0, doubleArray44, 0);
        double[] doubleArray54 = new double[] { (byte) -1, 1.0d, 10.0d, (-1), (byte) 0, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.atan2(doubleArray26, 1, doubleArray35, (int) '#', doubleArray54, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dSCompiler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dSCompiler14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { (-1.0d), 1.0d, 10.0d, (-1.0d), 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray5 = new double[] { 10L, (short) 10 };
        double[] doubleArray9 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray14 = new double[] { (short) 0, 1, '#' };
        dSCompiler2.subtract(doubleArray5, (int) (byte) 0, doubleArray9, (int) (byte) 0, doubleArray14, 0);
        int int17 = dSCompiler2.getFreeParameters();
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getSize();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler7 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray10 = new double[] { 10L, (short) 10 };
        double[] doubleArray14 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray19 = new double[] { (short) 0, 1, '#' };
        dSCompiler7.subtract(doubleArray10, (int) (byte) 0, doubleArray14, (int) (byte) 0, doubleArray19, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler25 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray28 = new double[] { 10L, (short) 10 };
        double[] doubleArray32 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray37 = new double[] { (short) 0, 1, '#' };
        dSCompiler25.subtract(doubleArray28, (int) (byte) 0, doubleArray32, (int) (byte) 0, doubleArray37, 0);
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.asin(doubleArray14, (int) (short) 1, doubleArray37, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dSCompiler7);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getOrder();
        double[] doubleArray6 = new double[] { 100, (byte) -1 };
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler11 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray14 = new double[] { 10L, (short) 10 };
        double[] doubleArray18 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray23 = new double[] { (short) 0, 1, '#' };
        dSCompiler11.subtract(doubleArray14, (int) (byte) 0, doubleArray18, (int) (byte) 0, doubleArray23, 0);
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.rootN(doubleArray6, (int) 'a', 10, doubleArray18, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler7 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int8 = dSCompiler7.getSize();
        int int9 = dSCompiler7.getOrder();
        dSCompiler2.checkCompatibility(dSCompiler7);
        int int11 = dSCompiler2.getSize();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler14 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray17 = new double[] { 10L, (short) 10 };
        double[] doubleArray21 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray26 = new double[] { (short) 0, 1, '#' };
        dSCompiler14.subtract(doubleArray17, (int) (byte) 0, doubleArray21, (int) (byte) 0, doubleArray26, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler32 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray35 = new double[] { 10L, (short) 10 };
        double[] doubleArray39 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray44 = new double[] { (short) 0, 1, '#' };
        dSCompiler32.subtract(doubleArray35, (int) (byte) 0, doubleArray39, (int) (byte) 0, doubleArray44, 0);
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.atan(doubleArray17, (int) (byte) 1, doubleArray35, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dSCompiler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dSCompiler14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler7 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int8 = dSCompiler7.getSize();
        int int9 = dSCompiler7.getOrder();
        dSCompiler2.checkCompatibility(dSCompiler7);
        int int11 = dSCompiler2.getSize();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler14 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray17 = new double[] { 10L, (short) 10 };
        double[] doubleArray21 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray26 = new double[] { (short) 0, 1, '#' };
        dSCompiler14.subtract(doubleArray17, (int) (byte) 0, doubleArray21, (int) (byte) 0, doubleArray26, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler32 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray35 = new double[] { 10L, (short) 10 };
        double[] doubleArray39 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray44 = new double[] { (short) 0, 1, '#' };
        dSCompiler32.subtract(doubleArray35, (int) (byte) 0, doubleArray39, (int) (byte) 0, doubleArray44, 0);
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.asin(doubleArray21, (int) ' ', doubleArray39, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dSCompiler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dSCompiler14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getOrder();
        int int4 = dSCompiler2.getSize();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler8 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray11 = new double[] { 10L, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray20 = new double[] { (short) 0, 1, '#' };
        dSCompiler8.subtract(doubleArray11, (int) (byte) 0, doubleArray15, (int) (byte) 0, doubleArray20, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler27 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray30 = new double[] { 10L, (short) 10 };
        double[] doubleArray34 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray39 = new double[] { (short) 0, 1, '#' };
        dSCompiler27.subtract(doubleArray30, (int) (byte) 0, doubleArray34, (int) (byte) 0, doubleArray39, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler46 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray49 = new double[] { 10L, (short) 10 };
        double[] doubleArray53 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray58 = new double[] { (short) 0, 1, '#' };
        dSCompiler46.subtract(doubleArray49, (int) (byte) 0, doubleArray53, (int) (byte) 0, doubleArray58, 0);
        double[] doubleArray64 = new double[] { '#', 100L };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.linearCombination((double) (short) 100, doubleArray20, 10, (double) ' ', doubleArray39, 0, (double) 100.0f, doubleArray58, 10, doubleArray64, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dSCompiler8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler46);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 35.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler7 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int8 = dSCompiler7.getSize();
        int int9 = dSCompiler7.getOrder();
        dSCompiler2.checkCompatibility(dSCompiler7);
        int int11 = dSCompiler2.getSize();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler14 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray17 = new double[] { 10L, (short) 10 };
        double[] doubleArray21 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray26 = new double[] { (short) 0, 1, '#' };
        dSCompiler14.subtract(doubleArray17, (int) (byte) 0, doubleArray21, (int) (byte) 0, doubleArray26, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler32 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray35 = new double[] { 10L, (short) 10 };
        double[] doubleArray39 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray44 = new double[] { (short) 0, 1, '#' };
        dSCompiler32.subtract(doubleArray35, (int) (byte) 0, doubleArray39, (int) (byte) 0, doubleArray44, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler50 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int51 = dSCompiler50.getSize();
        int int52 = dSCompiler50.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler55 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray58 = new double[] { 10L, (short) 10 };
        double[] doubleArray62 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray67 = new double[] { (short) 0, 1, '#' };
        dSCompiler55.subtract(doubleArray58, (int) (byte) 0, doubleArray62, (int) (byte) 0, doubleArray67, 0);
        double[] doubleArray74 = new double[] { (short) 0, 10.0d, (byte) 100 };
        double double75 = dSCompiler50.taylor(doubleArray67, 1, doubleArray74);
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.atan2(doubleArray17, 1, doubleArray35, (int) (short) 100, doubleArray74, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dSCompiler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dSCompiler14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(dSCompiler55);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 0.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.0d + "'", double75 == 1.0d);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler5 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray8 = new double[] { 10L, (short) 10 };
        double[] doubleArray12 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray17 = new double[] { (short) 0, 1, '#' };
        dSCompiler5.subtract(doubleArray8, (int) (byte) 0, doubleArray12, (int) (byte) 0, doubleArray17, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler23 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int24 = dSCompiler23.getSize();
        int int25 = dSCompiler23.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler28 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int29 = dSCompiler28.getSize();
        int int30 = dSCompiler28.getOrder();
        dSCompiler23.checkCompatibility(dSCompiler28);
        double[] doubleArray37 = new double[] { 'a', 100, 10, 100L, (byte) 0 };
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler41 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray44 = new double[] { 10L, (short) 10 };
        double[] doubleArray48 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray53 = new double[] { (short) 0, 1, '#' };
        dSCompiler41.subtract(doubleArray44, (int) (byte) 0, doubleArray48, (int) (byte) 0, doubleArray53, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler59 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int60 = dSCompiler59.getSize();
        int int61 = dSCompiler59.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler64 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray67 = new double[] { 10L, (short) 10 };
        double[] doubleArray71 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray76 = new double[] { (short) 0, 1, '#' };
        dSCompiler64.subtract(doubleArray67, (int) (byte) 0, doubleArray71, (int) (byte) 0, doubleArray76, 0);
        double[] doubleArray83 = new double[] { (short) 0, 10.0d, (byte) 100 };
        double double84 = dSCompiler59.taylor(doubleArray76, 1, doubleArray83);
        dSCompiler23.subtract(doubleArray37, 1, doubleArray48, (int) (byte) 1, doubleArray76, 0);
        double[] doubleArray93 = new double[] { (byte) 1, 100.0f, (short) 100, ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.remainder(doubleArray12, 0, doubleArray37, (int) (byte) 100, doubleArray93, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(dSCompiler5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dSCompiler28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 97.0d, 100.0d, 10.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler41);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(dSCompiler64);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 101.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 0.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 1.0d + "'", double84 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertArrayEquals(doubleArray93, new double[] { 1.0d, 100.0d, 100.0d, 32.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler7 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int8 = dSCompiler7.getSize();
        int int9 = dSCompiler7.getOrder();
        dSCompiler2.checkCompatibility(dSCompiler7);
        double[] doubleArray17 = new double[] { 0.0f, (short) 100, (short) 0, (byte) 10, (byte) 100, (short) -1 };
        double[] doubleArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler7.exp(doubleArray17, (int) (byte) 100, doubleArray19, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dSCompiler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, 100.0d, 0.0d, 10.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler7 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int8 = dSCompiler7.getSize();
        int int9 = dSCompiler7.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler12 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int13 = dSCompiler12.getSize();
        int int14 = dSCompiler12.getOrder();
        dSCompiler7.checkCompatibility(dSCompiler12);
        double[] doubleArray21 = new double[] { 'a', 100, 10, 100L, (byte) 0 };
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler25 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray28 = new double[] { 10L, (short) 10 };
        double[] doubleArray32 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray37 = new double[] { (short) 0, 1, '#' };
        dSCompiler25.subtract(doubleArray28, (int) (byte) 0, doubleArray32, (int) (byte) 0, doubleArray37, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler43 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int44 = dSCompiler43.getSize();
        int int45 = dSCompiler43.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler48 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray51 = new double[] { 10L, (short) 10 };
        double[] doubleArray55 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray60 = new double[] { (short) 0, 1, '#' };
        dSCompiler48.subtract(doubleArray51, (int) (byte) 0, doubleArray55, (int) (byte) 0, doubleArray60, 0);
        double[] doubleArray67 = new double[] { (short) 0, 10.0d, (byte) 100 };
        double double68 = dSCompiler43.taylor(doubleArray60, 1, doubleArray67);
        dSCompiler7.subtract(doubleArray21, 1, doubleArray32, (int) (byte) 1, doubleArray60, 0);
        double[] doubleArray73 = null;
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.pow(doubleArray21, (int) (byte) 10, 0, doubleArray73, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dSCompiler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dSCompiler12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 97.0d, 100.0d, 10.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(dSCompiler48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 101.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 0.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1.0d + "'", double68 == 1.0d);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray5 = new double[] { 10L, (short) 10 };
        double[] doubleArray9 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray14 = new double[] { (short) 0, 1, '#' };
        dSCompiler2.subtract(doubleArray5, (int) (byte) 0, doubleArray9, (int) (byte) 0, doubleArray14, 0);
        java.lang.Class<?> wildcardClass17 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler6 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int7 = dSCompiler6.getSize();
        int int8 = dSCompiler6.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler11 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int12 = dSCompiler11.getSize();
        int int13 = dSCompiler11.getOrder();
        dSCompiler6.checkCompatibility(dSCompiler11);
        double[] doubleArray20 = new double[] { 'a', 100, 10, 100L, (byte) 0 };
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler24 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray27 = new double[] { 10L, (short) 10 };
        double[] doubleArray31 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray36 = new double[] { (short) 0, 1, '#' };
        dSCompiler24.subtract(doubleArray27, (int) (byte) 0, doubleArray31, (int) (byte) 0, doubleArray36, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler42 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int43 = dSCompiler42.getSize();
        int int44 = dSCompiler42.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler47 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray50 = new double[] { 10L, (short) 10 };
        double[] doubleArray54 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray59 = new double[] { (short) 0, 1, '#' };
        dSCompiler47.subtract(doubleArray50, (int) (byte) 0, doubleArray54, (int) (byte) 0, doubleArray59, 0);
        double[] doubleArray66 = new double[] { (short) 0, 10.0d, (byte) 100 };
        double double67 = dSCompiler42.taylor(doubleArray59, 1, doubleArray66);
        dSCompiler6.subtract(doubleArray20, 1, doubleArray31, (int) (byte) 1, doubleArray59, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler73 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray76 = new double[] { 10L, (short) 10 };
        double[] doubleArray80 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray85 = new double[] { (short) 0, 1, '#' };
        dSCompiler73.subtract(doubleArray76, (int) (byte) 0, doubleArray80, (int) (byte) 0, doubleArray85, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double88 = dSCompiler2.taylor(doubleArray59, (int) ' ', doubleArray76);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dSCompiler6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dSCompiler11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 97.0d, 100.0d, 10.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(dSCompiler47);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 101.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 0.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 1.0d + "'", double67 == 1.0d);
        org.junit.Assert.assertNotNull(dSCompiler73);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler7 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int8 = dSCompiler7.getSize();
        int int9 = dSCompiler7.getOrder();
        dSCompiler2.checkCompatibility(dSCompiler7);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler13 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int14 = dSCompiler13.getSize();
        int int15 = dSCompiler13.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler18 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int19 = dSCompiler18.getSize();
        int int20 = dSCompiler18.getOrder();
        dSCompiler13.checkCompatibility(dSCompiler18);
        double[] doubleArray27 = new double[] { 'a', 100, 10, 100L, (byte) 0 };
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler31 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray34 = new double[] { 10L, (short) 10 };
        double[] doubleArray38 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray43 = new double[] { (short) 0, 1, '#' };
        dSCompiler31.subtract(doubleArray34, (int) (byte) 0, doubleArray38, (int) (byte) 0, doubleArray43, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler49 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int50 = dSCompiler49.getSize();
        int int51 = dSCompiler49.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler54 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray57 = new double[] { 10L, (short) 10 };
        double[] doubleArray61 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray66 = new double[] { (short) 0, 1, '#' };
        dSCompiler54.subtract(doubleArray57, (int) (byte) 0, doubleArray61, (int) (byte) 0, doubleArray66, 0);
        double[] doubleArray73 = new double[] { (short) 0, 10.0d, (byte) 100 };
        double double74 = dSCompiler49.taylor(doubleArray66, 1, doubleArray73);
        dSCompiler13.subtract(doubleArray27, 1, doubleArray38, (int) (byte) 1, doubleArray66, 0);
        dSCompiler7.checkCompatibility(dSCompiler13);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler80 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray83 = new double[] { 10L, (short) 10 };
        double[] doubleArray87 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray92 = new double[] { (short) 0, 1, '#' };
        dSCompiler80.subtract(doubleArray83, (int) (byte) 0, doubleArray87, (int) (byte) 0, doubleArray92, 0);
        double[] doubleArray96 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler7.cosh(doubleArray87, (int) (short) 1, doubleArray96, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dSCompiler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dSCompiler13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dSCompiler18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 97.0d, 100.0d, 10.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(dSCompiler54);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 101.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 0.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
        org.junit.Assert.assertNotNull(dSCompiler80);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertArrayEquals(doubleArray96, new double[] {}, 1.0E-15);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getOrder();
        int int4 = dSCompiler2.getSize();
        int int5 = dSCompiler2.getFreeParameters();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler8 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int9 = dSCompiler8.getSize();
        int int10 = dSCompiler8.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler13 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int14 = dSCompiler13.getSize();
        int int15 = dSCompiler13.getOrder();
        dSCompiler8.checkCompatibility(dSCompiler13);
        double[] doubleArray22 = new double[] { 'a', 100, 10, 100L, (byte) 0 };
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler26 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray29 = new double[] { 10L, (short) 10 };
        double[] doubleArray33 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray38 = new double[] { (short) 0, 1, '#' };
        dSCompiler26.subtract(doubleArray29, (int) (byte) 0, doubleArray33, (int) (byte) 0, doubleArray38, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler44 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int45 = dSCompiler44.getSize();
        int int46 = dSCompiler44.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler49 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray52 = new double[] { 10L, (short) 10 };
        double[] doubleArray56 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray61 = new double[] { (short) 0, 1, '#' };
        dSCompiler49.subtract(doubleArray52, (int) (byte) 0, doubleArray56, (int) (byte) 0, doubleArray61, 0);
        double[] doubleArray68 = new double[] { (short) 0, 10.0d, (byte) 100 };
        double double69 = dSCompiler44.taylor(doubleArray61, 1, doubleArray68);
        dSCompiler8.subtract(doubleArray22, 1, doubleArray33, (int) (byte) 1, doubleArray61, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler75 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray78 = new double[] { 10L, (short) 10 };
        double[] doubleArray82 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray87 = new double[] { (short) 0, 1, '#' };
        dSCompiler75.subtract(doubleArray78, (int) (byte) 0, doubleArray82, (int) (byte) 0, doubleArray87, 0);
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.atan(doubleArray33, (int) (short) 0, doubleArray87, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(dSCompiler8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dSCompiler13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 97.0d, 100.0d, 10.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dSCompiler49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 101.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 0.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0d + "'", double69 == 1.0d);
        org.junit.Assert.assertNotNull(dSCompiler75);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int3 = dSCompiler2.getSize();
        int int4 = dSCompiler2.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler7 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int8 = dSCompiler7.getSize();
        int int9 = dSCompiler7.getOrder();
        dSCompiler2.checkCompatibility(dSCompiler7);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler13 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray16 = new double[] { 10L, (short) 10 };
        double[] doubleArray20 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray25 = new double[] { (short) 0, 1, '#' };
        dSCompiler13.subtract(doubleArray16, (int) (byte) 0, doubleArray20, (int) (byte) 0, doubleArray25, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler31 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int32 = dSCompiler31.getSize();
        int int33 = dSCompiler31.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler36 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int37 = dSCompiler36.getSize();
        int int38 = dSCompiler36.getOrder();
        dSCompiler31.checkCompatibility(dSCompiler36);
        double[] doubleArray45 = new double[] { 'a', 100, 10, 100L, (byte) 0 };
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler49 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray52 = new double[] { 10L, (short) 10 };
        double[] doubleArray56 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray61 = new double[] { (short) 0, 1, '#' };
        dSCompiler49.subtract(doubleArray52, (int) (byte) 0, doubleArray56, (int) (byte) 0, doubleArray61, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler67 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int68 = dSCompiler67.getSize();
        int int69 = dSCompiler67.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler72 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray75 = new double[] { 10L, (short) 10 };
        double[] doubleArray79 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray84 = new double[] { (short) 0, 1, '#' };
        dSCompiler72.subtract(doubleArray75, (int) (byte) 0, doubleArray79, (int) (byte) 0, doubleArray84, 0);
        double[] doubleArray91 = new double[] { (short) 0, 10.0d, (byte) 100 };
        double double92 = dSCompiler67.taylor(doubleArray84, 1, doubleArray91);
        dSCompiler31.subtract(doubleArray45, 1, doubleArray56, (int) (byte) 1, doubleArray84, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double95 = dSCompiler2.taylor(doubleArray16, (int) (short) 100, doubleArray84);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dSCompiler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dSCompiler13);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dSCompiler36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 97.0d, 100.0d, 10.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(dSCompiler72);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 101.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertArrayEquals(doubleArray91, new double[] { 0.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 1.0d + "'", double92 == 1.0d);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray5 = new double[] { 10L, (short) 10 };
        double[] doubleArray9 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray14 = new double[] { (short) 0, 1, '#' };
        dSCompiler2.subtract(doubleArray5, (int) (byte) 0, doubleArray9, (int) (byte) 0, doubleArray14, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler19 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int20 = dSCompiler19.getOrder();
        dSCompiler2.checkCompatibility(dSCompiler19);
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray5 = new double[] { 10L, (short) 10 };
        double[] doubleArray9 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray14 = new double[] { (short) 0, 1, '#' };
        dSCompiler2.subtract(doubleArray5, (int) (byte) 0, doubleArray9, (int) (byte) 0, doubleArray14, 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler19 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        int int20 = dSCompiler19.getSize();
        int int21 = dSCompiler19.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler24 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(100, (int) (short) 0);
        double[] doubleArray27 = new double[] { 10L, (short) 10 };
        double[] doubleArray31 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray36 = new double[] { (short) 0, 1, '#' };
        dSCompiler24.subtract(doubleArray27, (int) (byte) 0, doubleArray31, (int) (byte) 0, doubleArray36, 0);
        double[] doubleArray43 = new double[] { (short) 0, 10.0d, (byte) 100 };
        double double44 = dSCompiler19.taylor(doubleArray36, 1, doubleArray43);
        double[] doubleArray50 = new double[] { ' ', 10.0f, 10.0d, (short) 10 };
        dSCompiler2.tan(doubleArray36, (int) (short) 1, doubleArray50, (int) (byte) 0);
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(dSCompiler19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dSCompiler24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 9.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.5574077246549023d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
    }
}

