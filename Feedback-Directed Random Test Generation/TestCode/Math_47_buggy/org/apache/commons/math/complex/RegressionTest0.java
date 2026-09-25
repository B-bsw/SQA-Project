package org.apache.commons.math.complex;

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
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList2 = complex0.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(100.0d, 1.0d);
        java.lang.Class<?> wildcardClass3 = complex2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex13 = complex9.divide(complex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) '#', (double) 'a');
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        java.lang.Class<?> wildcardClass14 = complex11.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.asin();
        double double8 = complex7.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract((double) 10.0f);
        java.lang.Class<?> wildcardClass5 = complex0.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complexField2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex4.nthRoot((int) (byte) 10);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexList6);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex14 = complex11.sin();
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        double double16 = complex15.abs();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        java.lang.Object obj11 = complex9.readResolve();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex0.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex6 = complex4.subtract(complex5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        double double2 = complex0.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        double double9 = complex6.getReal();
        double double10 = complex6.abs();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex11 = complex8.multiply(complex10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 10);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        double double7 = complex5.abs();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex13 = complex10.tan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cos();
        java.lang.Object obj15 = complex14.readResolve();
        org.apache.commons.math.complex.ComplexField complexField16 = complex14.getField();
        org.apache.commons.math.complex.Complex complex17 = complex5.add(complex14);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "(1.0, -0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "(1.0, -0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "(1.0, -0.0)");
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex4 = complex1.negate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex1.nthRoot((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        boolean boolean2 = complex1.isNaN();
        org.apache.commons.math.complex.Complex complex3 = complex1.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex4.sqrt();
        java.lang.Class<?> wildcardClass10 = complex4.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        java.lang.Object obj7 = complex6.readResolve();
        org.apache.commons.math.complex.ComplexField complexField8 = complex6.getField();
        double double9 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex10 = complex6.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "(1.0, -0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "(1.0, -0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "(1.0, -0.0)");
        org.junit.Assert.assertNotNull(complexField8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex8.pow((double) 10L);
        double double11 = complex8.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex10.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex4 = complex1.tan();
        boolean boolean5 = complex4.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        java.lang.Object obj7 = complex6.readResolve();
        org.apache.commons.math.complex.Complex complex8 = complex6.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "(1.0, -0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "(1.0, -0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "(1.0, -0.0)");
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 100);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 'a');
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        org.apache.commons.math.complex.Complex complex19 = complex8.subtract(complex18);
        org.apache.commons.math.complex.ComplexField complexField20 = complex18.getField();
        org.apache.commons.math.complex.Complex complex21 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex23 = complex21.add((double) 0);
        org.apache.commons.math.complex.Complex complex24 = complex23.exp();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complexField20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) -1, (double) 0.0f);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        double double1 = complex0.getArgument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList3 = complex0.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex4 = complex1.exp();
        org.apache.commons.math.complex.Complex complex5 = complex4.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex4 = complex1.log();
        java.lang.String str5 = complex1.toString();
        java.lang.Class<?> wildcardClass6 = complex1.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(NaN, NaN)" + "'", str5, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) '4');
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex5 = complex1.divide(complex4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex16.divide(0.0d);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex19.pow(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex26 = complex23.sinh();
        boolean boolean27 = complex18.equals((java.lang.Object) complex23);
        org.apache.commons.math.complex.Complex complex28 = complex13.multiply(complex23);
        org.apache.commons.math.complex.ComplexField complexField29 = complex23.getField();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexField29);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) '4');
        org.apache.commons.math.complex.Complex complex2 = complex1.acos();
        double double3 = complex1.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = complex0.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex10.divide(0.0d);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 10);
        org.apache.commons.math.complex.Complex complex16 = complex14.add(1.0d);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField18 = complex17.getField();
        org.apache.commons.math.complex.Complex complex19 = complex14.multiply(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex19.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex22 = complex19.sin();
        org.apache.commons.math.complex.Complex complex23 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex24 = complex23.cos();
        org.apache.commons.math.complex.Complex complex25 = complex7.add(complex23);
        org.apache.commons.math.complex.Complex complex27 = complex25.subtract((double) 'a');
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) -1, (double) 0L);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        java.lang.Object obj19 = complex14.readResolve();
        org.apache.commons.math.complex.Complex complex20 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean24 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex25 = complex21.pow(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex23.tan();
        org.apache.commons.math.complex.Complex complex27 = complex26.cos();
        org.apache.commons.math.complex.Complex complex28 = complex20.subtract(complex26);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex29.atan();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex36 = complex34.divide(0.0d);
        org.apache.commons.math.complex.Complex complex37 = complex36.cosh();
        org.apache.commons.math.complex.Complex complex38 = complex29.multiply(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex38.acos();
        org.apache.commons.math.complex.Complex complex40 = complex38.asin();
        boolean boolean41 = complex26.equals((java.lang.Object) complex40);
        boolean boolean42 = complex26.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        double double11 = complex8.getArgument();
        double double12 = complex8.getImaginary();
        java.lang.Class<?> wildcardClass13 = complex8.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex15 = complex12.sinh();
        boolean boolean16 = complex7.equals((java.lang.Object) complex12);
        org.apache.commons.math.complex.Complex complex17 = complex12.asin();
        org.apache.commons.math.complex.Complex complex18 = complex2.add(complex12);
        java.lang.Class<?> wildcardClass19 = complex12.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex3 = complex0.divide((double) 10.0f);
        double double4 = complex3.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex5 = complex1.divide((double) (short) 100);
        org.apache.commons.math.complex.Complex complex6 = complex1.acos();
        java.lang.Class<?> wildcardClass7 = complex1.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex14 = complex11.sin();
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        java.lang.String str16 = complex15.toString();
        org.apache.commons.math.complex.Complex complex17 = complex15.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = complex15.cosh();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(NaN, NaN)" + "'", str16, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 10);
        double double12 = complex9.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex6);
        java.lang.Class<?> wildcardClass10 = complex6.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex15 = complex12.sinh();
        boolean boolean16 = complex7.equals((java.lang.Object) complex12);
        org.apache.commons.math.complex.Complex complex17 = complex12.asin();
        org.apache.commons.math.complex.Complex complex18 = complex2.add(complex12);
        org.apache.commons.math.complex.Complex complex19 = complex2.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        boolean boolean11 = complex10.isNaN();
        boolean boolean12 = complex10.isInfinite();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex5 = complex2.pow((double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList7 = complex5.nthRoot((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        boolean boolean2 = complex1.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.tan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex10 = complex6.pow(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex10.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex4.divide(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex14.createComplex((double) (-1.0f), (double) (byte) 1);
        org.apache.commons.math.complex.ComplexField complexField20 = complex14.getField();
        org.apache.commons.math.complex.Complex complex21 = complex14.conjugate();
        java.lang.Class<?> wildcardClass22 = complex14.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complexField20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex5 = complex0.acos();
        org.apache.commons.math.complex.Complex complex6 = complex0.acos();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField8 = complex7.getField();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex7.add(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex13.tan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex17.divide(0.0d);
        org.apache.commons.math.complex.Complex complex21 = complex19.pow((double) 10);
        org.apache.commons.math.complex.Complex complex23 = complex21.add(1.0d);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField25 = complex24.getField();
        org.apache.commons.math.complex.Complex complex26 = complex21.multiply(complex24);
        org.apache.commons.math.complex.Complex complex28 = complex26.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex29 = complex26.sin();
        org.apache.commons.math.complex.Complex complex30 = complex26.sqrt();
        org.apache.commons.math.complex.Complex complex31 = complex30.cos();
        org.apache.commons.math.complex.Complex complex32 = complex14.add(complex30);
        org.apache.commons.math.complex.Complex complex33 = complex6.multiply(complex30);
        java.lang.Class<?> wildcardClass34 = complex6.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complexField2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexField8);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complexField25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex4 = complex1.divide(complex3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        java.lang.Object obj19 = complex14.readResolve();
        org.apache.commons.math.complex.Complex complex20 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean24 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex25 = complex21.pow(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex23.tan();
        org.apache.commons.math.complex.Complex complex27 = complex26.cos();
        org.apache.commons.math.complex.Complex complex28 = complex20.subtract(complex26);
        org.apache.commons.math.complex.Complex complex30 = complex28.add((double) (short) 0);
        java.lang.Class<?> wildcardClass31 = complex30.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        java.lang.Object obj19 = complex14.readResolve();
        org.apache.commons.math.complex.Complex complex20 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex22 = complex20.divide((double) 100);
        org.apache.commons.math.complex.Complex complex24 = complex20.multiply(97.0d);
        java.lang.Class<?> wildcardClass25 = complex20.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.acos();
        org.apache.commons.math.complex.Complex complex11 = complex10.negate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList13 = complex11.nthRoot((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        double double6 = complex5.abs();
        org.apache.commons.math.complex.Complex complex7 = complex0.add(complex5);
        org.apache.commons.math.complex.Complex complex8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex9 = complex5.multiply(complex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.sinh();
        org.apache.commons.math.complex.ComplexField complexField3 = complex0.getField();
        org.apache.commons.math.complex.Complex complex5 = complex0.add((double) 1L);
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply((double) 1.0f);
        org.apache.commons.math.complex.ComplexField complexField8 = complex7.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexField8);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) ' ', (double) 100.0f);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) 100);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex12.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex17.divide(0.0d);
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex12.multiply(complex20);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex26 = complex24.divide(0.0d);
        org.apache.commons.math.complex.Complex complex28 = complex26.pow((double) 10);
        boolean boolean29 = complex26.isInfinite();
        org.apache.commons.math.complex.Complex complex30 = complex26.asin();
        org.apache.commons.math.complex.Complex complex31 = complex20.subtract(complex30);
        org.apache.commons.math.complex.ComplexField complexField32 = complex30.getField();
        org.apache.commons.math.complex.Complex complex33 = complex30.sqrt();
        boolean boolean34 = complex11.equals((java.lang.Object) complex33);
        double double35 = complex11.abs();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complexField32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) 100);
        org.apache.commons.math.complex.Complex complex12 = complex9.asin();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex9.nthRoot((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex14 = complex11.acos();
        org.apache.commons.math.complex.Complex complex15 = complex14.negate();
        org.apache.commons.math.complex.ComplexField complexField16 = complex15.getField();
        org.apache.commons.math.complex.Complex complex17 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex17.acos();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        boolean boolean5 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField7 = complex6.getField();
        org.apache.commons.math.complex.Complex complex9 = complex6.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex10 = complex6.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(1.0d);
        org.apache.commons.math.complex.Complex complex13 = complex12.cos();
        org.apache.commons.math.complex.Complex complex14 = complex2.pow(complex12);
        double double15 = complex2.getArgument();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.009999666686665238d + "'", double15 == 0.009999666686665238d);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex3 = complex0.divide((double) 10.0f);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt1z();
        double double5 = complex3.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex15 = complex11.subtract((double) 0);
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt();
        double double17 = complex16.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex5 = complex0.acos();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply((double) (byte) 0);
        double double8 = complex0.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complexField2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex15 = complex11.subtract((double) 0);
        org.apache.commons.math.complex.Complex complex17 = complex11.pow((double) '4');
        boolean boolean18 = complex17.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex7 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex12 = complex10.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex13 = complex10.negate();
        org.apache.commons.math.complex.Complex complex15 = complex13.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex16 = complex8.add(complex15);
        java.lang.Class<?> wildcardClass17 = complex8.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex14 = complex11.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        double double16 = complex15.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex15.divide((double) 10.0f);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex23.pow((double) 10);
        org.apache.commons.math.complex.Complex complex27 = complex25.add(1.0d);
        org.apache.commons.math.complex.Complex complex28 = complex27.acos();
        org.apache.commons.math.complex.Complex complex30 = complex28.add((double) 100);
        boolean boolean31 = complex15.equals((java.lang.Object) 100);
        org.apache.commons.math.complex.Complex complex32 = complex15.acos();
        org.apache.commons.math.complex.Complex complex33 = complex14.divide(complex32);
        java.lang.Class<?> wildcardClass34 = complex33.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.tan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex10 = complex6.pow(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex10.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex4.divide(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex14.createComplex((double) (-1.0f), (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList21 = complex19.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(100.0d, (double) (byte) 10);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        double double3 = complex2.abs();
        double double4 = complex2.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 0L);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math.complex.Complex complex8 = complex7.cos();
        double double9 = complex7.abs();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.ComplexField complexField12 = complex10.getField();
        org.apache.commons.math.complex.Complex complex14 = complex10.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex15 = complex10.acos();
        org.apache.commons.math.complex.Complex complex16 = complex7.subtract(complex10);
        org.apache.commons.math.complex.Complex complex18 = complex7.multiply((double) '#');
        java.lang.String str19 = complex7.toString();
        boolean boolean20 = complex1.equals((java.lang.Object) complex7);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexField12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(0.0, 0.0)" + "'", str19, "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.add(Double.NaN);
        org.apache.commons.math.complex.ComplexField complexField11 = complex8.getField();
        org.apache.commons.math.complex.Complex complex12 = complex8.asin();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) 100);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex19.pow(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex23.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex26 = complex17.divide(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex25.sin();
        org.apache.commons.math.complex.Complex complex28 = complex16.pow(complex27);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex29.atan();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex36 = complex34.divide(0.0d);
        org.apache.commons.math.complex.Complex complex37 = complex36.cosh();
        org.apache.commons.math.complex.Complex complex38 = complex29.multiply(complex37);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex43 = complex41.divide(0.0d);
        org.apache.commons.math.complex.Complex complex45 = complex43.pow((double) 10);
        boolean boolean46 = complex43.isInfinite();
        org.apache.commons.math.complex.Complex complex47 = complex43.asin();
        org.apache.commons.math.complex.Complex complex48 = complex37.subtract(complex47);
        org.apache.commons.math.complex.Complex complex49 = complex27.subtract(complex47);
        org.apache.commons.math.complex.Complex complex51 = complex49.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex52 = complex13.pow(complex51);
        org.apache.commons.math.complex.ComplexField complexField53 = complex13.getField();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complexField53);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 100);
        org.apache.commons.math.complex.Complex complex6 = complex1.createComplex((-1.0d), (double) 0.0f);
        java.lang.String str7 = complex6.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(-1.0, 0.0)" + "'", str7, "(-1.0, 0.0)");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        double double7 = complex5.abs();
        java.lang.String str8 = complex5.toString();
        boolean boolean9 = complex5.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(0.0, 0.0)" + "'", str8, "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 0.0f);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        double double7 = complex5.abs();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.ComplexField complexField10 = complex8.getField();
        org.apache.commons.math.complex.Complex complex12 = complex8.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex13 = complex8.acos();
        org.apache.commons.math.complex.Complex complex14 = complex5.subtract(complex8);
        org.apache.commons.math.complex.Complex complex15 = complex5.exp();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex15 = complex11.subtract((double) 0);
        java.lang.String str16 = complex11.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(0.0, 0.0)" + "'", str16, "(0.0, 0.0)");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex7.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(100.0d, 1.0d);
        boolean boolean3 = complex2.isInfinite();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complexField4);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) 100);
        org.apache.commons.math.complex.Complex complex12 = complex9.asin();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        double double14 = complex12.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.negate();
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = complex6.acos();
        double double9 = complex6.abs();
        double double10 = complex6.getImaginary();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.sinh();
        boolean boolean13 = complex4.equals((java.lang.Object) complex9);
        boolean boolean14 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex9.cosh();
        java.lang.Class<?> wildcardClass16 = complex9.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        double double5 = complex4.getArgument();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex8 = complex4.pow(complex6);
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex3.pow(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex10.log();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f, (-0.019228399099707208d));
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex12.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex17 = complex16.asin();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex22 = complex20.divide(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex22.pow((double) 10);
        boolean boolean25 = complex22.isInfinite();
        org.apache.commons.math.complex.Complex complex26 = complex22.asin();
        java.lang.Object obj27 = complex22.readResolve();
        org.apache.commons.math.complex.Complex complex28 = complex16.divide(complex22);
        org.apache.commons.math.complex.Complex complex30 = complex28.divide((double) 100);
        boolean boolean31 = complex30.isInfinite();
        org.apache.commons.math.complex.Complex complex32 = complex4.subtract(complex30);
        double double33 = complex30.getReal();
        org.apache.commons.math.complex.Complex complex34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex35 = complex30.subtract(complex34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex14 = complex11.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex15 = complex11.subtract((double) 0);
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt();
        double double17 = complex15.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex16 = complex14.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex16.pow((double) 10);
        org.apache.commons.math.complex.Complex complex20 = complex18.add(1.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot(10);
        org.apache.commons.math.complex.Complex complex23 = complex9.multiply(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex24.cos();
        org.apache.commons.math.complex.Complex complex26 = complex25.acos();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexList22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.ComplexField complexField7 = complex4.getField();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex14.tanh();
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex4.divide(complex14);
        double double19 = complex14.getArgument();
        java.lang.Class<?> wildcardClass20 = complex14.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList10 = complex8.nthRoot(1);
        double double11 = complex8.abs();
        org.apache.commons.math.complex.Complex complex12 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex8.add((double) (short) 100);
        org.apache.commons.math.complex.Complex complex17 = complex8.createComplex((double) (short) -1, (-1.0d));
        java.lang.Class<?> wildcardClass18 = complex8.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complexList10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.acos();
        java.lang.Class<?> wildcardClass11 = complex9.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex10 = complex8.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex11 = complex8.negate();
        org.apache.commons.math.complex.Complex complex12 = complex4.divide(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex11.cos();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex10 = complex6.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex11 = complex10.asin();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10);
        org.apache.commons.math.complex.Complex complex15 = complex13.divide((double) (short) -1);
        org.apache.commons.math.complex.Complex complex16 = complex1.divide(complex13);
        double double17 = complex1.getArgument();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        double double7 = complex5.abs();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.ComplexField complexField10 = complex8.getField();
        org.apache.commons.math.complex.Complex complex12 = complex8.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex13 = complex8.acos();
        org.apache.commons.math.complex.Complex complex14 = complex5.subtract(complex8);
        org.apache.commons.math.complex.Complex complex16 = complex5.multiply((double) '#');
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex4.exp();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        double double6 = complex5.abs();
        org.apache.commons.math.complex.Complex complex7 = complex0.add(complex5);
        java.lang.String str8 = complex5.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(1.0, 0.0)" + "'", str8, "(1.0, 0.0)");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(1.5707963267948966d, 0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) '#');
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        boolean boolean8 = complex7.isInfinite();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        double double5 = complex4.abs();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex6.negate();
        java.lang.String str9 = complex8.toString();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(NaN, NaN)" + "'", str9, "(NaN, NaN)");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.acos();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex15 = complex13.divide(0.0d);
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) 10);
        org.apache.commons.math.complex.Complex complex19 = complex17.add(1.0d);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField21 = complex20.getField();
        org.apache.commons.math.complex.Complex complex22 = complex17.multiply(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex22.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex25 = complex22.acos();
        org.apache.commons.math.complex.Complex complex26 = complex9.divide(complex25);
        double double27 = complex25.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexField21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex16.divide(0.0d);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex19.pow(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex26 = complex23.sinh();
        boolean boolean27 = complex18.equals((java.lang.Object) complex23);
        org.apache.commons.math.complex.Complex complex28 = complex13.multiply(complex23);
        org.apache.commons.math.complex.Complex complex29 = complex28.tan();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex4 = complex1.log();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex1.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.asin();
        org.apache.commons.math.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math.complex.Complex complex9 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.ComplexField complexField12 = complex10.getField();
        org.apache.commons.math.complex.Complex complex14 = complex10.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        double double16 = complex15.getArgument();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean18 = complex17.isNaN();
        org.apache.commons.math.complex.Complex complex19 = complex15.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex17.tan();
        org.apache.commons.math.complex.Complex complex21 = complex20.cos();
        double double22 = complex20.abs();
        org.apache.commons.math.complex.ComplexField complexField23 = complex20.getField();
        org.apache.commons.math.complex.Complex complex24 = complex14.add(complex20);
        org.apache.commons.math.complex.Complex complex25 = complex24.asin();
        org.apache.commons.math.complex.Complex complex26 = complex7.pow(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex26.cos();
        java.lang.Class<?> wildcardClass28 = complex27.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexField12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complexField23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = complex0.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex10.divide(0.0d);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 10);
        org.apache.commons.math.complex.Complex complex16 = complex14.add(1.0d);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField18 = complex17.getField();
        org.apache.commons.math.complex.Complex complex19 = complex14.multiply(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex19.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex22 = complex19.sin();
        org.apache.commons.math.complex.Complex complex23 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex24 = complex23.cos();
        org.apache.commons.math.complex.Complex complex25 = complex7.add(complex23);
        org.apache.commons.math.complex.ComplexField complexField26 = complex7.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complexField26);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        double double5 = complex4.getArgument();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex8 = complex4.pow(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex8.atan();
        org.apache.commons.math.complex.Complex complex15 = complex12.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex18 = complex3.pow(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex17.log();
        org.apache.commons.math.complex.Complex complex20 = complex17.atan();
        org.apache.commons.math.complex.Complex complex21 = complex20.asin();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 10L);
        org.apache.commons.math.complex.Complex complex10 = complex6.pow((double) 0);
        double double11 = complex10.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        java.lang.Object obj7 = complex4.readResolve();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "(NaN, NaN)");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        org.apache.commons.math.complex.Complex complex19 = complex8.subtract(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex18.subtract((double) '#');
        double double22 = complex21.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 0.0f);
        double double15 = complex14.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (byte) 100);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 1L, (double) (byte) 0);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = complex0.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex10.divide(0.0d);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 10);
        org.apache.commons.math.complex.Complex complex16 = complex14.add(1.0d);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField18 = complex17.getField();
        org.apache.commons.math.complex.Complex complex19 = complex14.multiply(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex19.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex22 = complex19.sin();
        org.apache.commons.math.complex.Complex complex23 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex24 = complex23.cos();
        org.apache.commons.math.complex.Complex complex25 = complex7.add(complex23);
        org.apache.commons.math.complex.Complex complex27 = complex23.divide((double) (byte) 1);
        boolean boolean28 = complex23.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 0);
        double double2 = complex1.getReal();
        java.util.List<org.apache.commons.math.complex.Complex> complexList4 = complex1.nthRoot((int) (short) 1);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complexList4);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = complex0.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex10.divide(0.0d);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 10);
        org.apache.commons.math.complex.Complex complex16 = complex14.add(1.0d);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField18 = complex17.getField();
        org.apache.commons.math.complex.Complex complex19 = complex14.multiply(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex19.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex22 = complex19.sin();
        org.apache.commons.math.complex.Complex complex23 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex24 = complex23.cos();
        org.apache.commons.math.complex.Complex complex25 = complex7.add(complex23);
        org.apache.commons.math.complex.ComplexField complexField26 = complex23.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complexField26);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.add(Double.NaN);
        org.apache.commons.math.complex.ComplexField complexField11 = complex8.getField();
        org.apache.commons.math.complex.Complex complex12 = complex8.asin();
        org.apache.commons.math.complex.Complex complex13 = complex12.negate();
        org.apache.commons.math.complex.Complex complex15 = complex13.add((double) (short) 1);
        double double16 = complex13.getArgument();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) -1, (double) (byte) -1);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        double double2 = complex1.abs();
        double double3 = complex1.getImaginary();
        org.apache.commons.math.complex.Complex complex4 = complex1.conjugate();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex0.add((double) (byte) 0);
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex9 = complex6.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) '4');
        org.apache.commons.math.complex.Complex complex2 = complex1.acos();
        org.apache.commons.math.complex.Complex complex3 = complex2.acos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex8 = complex6.divide(0.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        double double10 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean12 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex13 = complex9.pow(complex11);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex16 = complex13.sinh();
        boolean boolean17 = complex8.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        double double19 = complex18.getArgument();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean21 = complex20.isNaN();
        org.apache.commons.math.complex.Complex complex22 = complex18.pow(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex22.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex22.sinh();
        org.apache.commons.math.complex.Complex complex26 = complex22.atan();
        org.apache.commons.math.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex13.pow(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex13.asin();
        org.apache.commons.math.complex.Complex complex30 = complex13.sqrt1z();
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math.complex.Complex complex32 = complex3.subtract(complex30);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList34 = complex3.nthRoot((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList10 = complex8.nthRoot(10);
        org.apache.commons.math.complex.Complex complex11 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex8.atan();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complexList10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex15 = complex13.subtract((double) '#');
        double double16 = complex13.getImaginary();
        double double17 = complex13.getArgument();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(10.0d, (double) (byte) 10);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math.complex.Complex complex12 = complex10.sinh();
        java.lang.String str13 = complex10.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(NaN, NaN)" + "'", str13, "(NaN, NaN)");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 0, (double) 0);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (short) 0);
        java.lang.Object obj8 = complex7.readResolve();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "(0.0, 0.0)");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) 100);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex12 = complex3.divide(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex11.sin();
        org.apache.commons.math.complex.Complex complex14 = complex2.pow(complex13);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex15.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex22 = complex20.divide(0.0d);
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex15.multiply(complex23);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex29 = complex27.divide(0.0d);
        org.apache.commons.math.complex.Complex complex31 = complex29.pow((double) 10);
        boolean boolean32 = complex29.isInfinite();
        org.apache.commons.math.complex.Complex complex33 = complex29.asin();
        org.apache.commons.math.complex.Complex complex34 = complex23.subtract(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex13.subtract(complex33);
        org.apache.commons.math.complex.Complex complex37 = complex35.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        double double39 = complex38.getArgument();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean41 = complex40.isNaN();
        org.apache.commons.math.complex.Complex complex42 = complex38.pow(complex40);
        org.apache.commons.math.complex.Complex complex44 = complex42.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex45 = complex42.sinh();
        org.apache.commons.math.complex.Complex complex46 = complex42.atan();
        org.apache.commons.math.complex.Complex complex47 = complex46.tanh();
        org.apache.commons.math.complex.Complex complex49 = complex46.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex50 = complex37.pow(complex49);
        boolean boolean51 = complex37.isInfinite();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        double double4 = complex3.getArgument();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex5.isNaN();
        org.apache.commons.math.complex.Complex complex7 = complex3.pow(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex7.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex10 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10L);
        double double14 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex2.divide(complex11);
        org.apache.commons.math.complex.Complex complex17 = complex11.divide((double) 100L);
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt1z();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex10 = complex6.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex11 = complex10.asin();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10);
        org.apache.commons.math.complex.Complex complex15 = complex13.divide((double) (short) -1);
        org.apache.commons.math.complex.Complex complex16 = complex1.divide(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        double double21 = complex20.getArgument();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean23 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex24 = complex20.pow(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex24.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex27 = complex18.divide(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex26.sin();
        org.apache.commons.math.complex.Complex complex29 = complex28.conjugate();
        org.apache.commons.math.complex.Complex complex30 = complex17.add(complex28);
        boolean boolean31 = complex30.isNaN();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (byte) 100, (double) (short) 10);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex14 = complex11.acos();
        org.apache.commons.math.complex.Complex complex15 = complex14.acos();
        boolean boolean16 = complex15.isNaN();
        java.lang.Class<?> wildcardClass17 = complex15.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.ComplexField complexField6 = complex5.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complexField6);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) -1, (double) (byte) 1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 'a');
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        double double5 = complex4.getArgument();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex8 = complex4.pow(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex8.atan();
        org.apache.commons.math.complex.Complex complex15 = complex12.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex18 = complex3.pow(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex17.log();
        org.apache.commons.math.complex.Complex complex20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex21 = complex19.multiply(complex20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math.complex.Complex complex13 = complex10.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        double double10 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex8.conjugate();
        double double12 = complex8.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        boolean boolean12 = complex11.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList10 = complex8.nthRoot(10);
        org.apache.commons.math.complex.Complex complex11 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        double double13 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean15 = complex14.isNaN();
        org.apache.commons.math.complex.Complex complex16 = complex12.pow(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex16.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex19 = complex16.asin();
        org.apache.commons.math.complex.Complex complex20 = complex19.exp();
        org.apache.commons.math.complex.Complex complex21 = complex8.multiply(complex20);
        java.lang.Class<?> wildcardClass22 = complex20.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complexList10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (byte) 0, (double) (short) 10);
        java.lang.Object obj3 = complex2.readResolve();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "(0.0, 10.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "(0.0, 10.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "(0.0, 10.0)");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) -1);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex2.nthRoot((int) '#');
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexList5);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex10 = complex6.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex11 = complex10.asin();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10);
        org.apache.commons.math.complex.Complex complex14 = complex1.subtract(complex11);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex14.subtract(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex14.createComplex((double) '#', (-0.0d));
        org.apache.commons.math.complex.ComplexField complexField22 = complex14.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complexField22);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.add(Double.NaN);
        double double11 = complex8.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.negate();
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = complex6.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract((double) (short) 100);
        org.apache.commons.math.complex.Complex complex11 = complex8.sqrt1z();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex16.pow((double) 10L);
        double double19 = complex16.getImaginary();
        org.apache.commons.math.complex.Complex complex20 = complex7.divide(complex16);
        org.apache.commons.math.complex.Complex complex21 = complex4.subtract(complex16);
        org.apache.commons.math.complex.Complex complex22 = complex4.tan();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList24 = complex22.nthRoot((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex9.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex14 = complex13.asin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex17.divide(0.0d);
        org.apache.commons.math.complex.Complex complex21 = complex19.pow((double) 10);
        boolean boolean22 = complex19.isInfinite();
        org.apache.commons.math.complex.Complex complex23 = complex19.asin();
        java.lang.Object obj24 = complex19.readResolve();
        org.apache.commons.math.complex.Complex complex25 = complex13.divide(complex19);
        org.apache.commons.math.complex.Complex complex27 = complex25.divide((double) 100);
        org.apache.commons.math.complex.ComplexField complexField28 = complex27.getField();
        boolean boolean29 = complex2.equals((java.lang.Object) complexField28);
        java.lang.Object obj30 = complex2.readResolve();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complexField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "(0.0, 0.0)");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex4 = complex1.log();
        org.apache.commons.math.complex.Complex complex6 = complex1.multiply((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex7 = complex6.cos();
        org.apache.commons.math.complex.ComplexField complexField8 = complex6.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexField8);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex4 = complex1.log();
        org.apache.commons.math.complex.Complex complex6 = complex1.multiply((double) (byte) 1);
        org.apache.commons.math.complex.ComplexField complexField7 = complex6.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 10L);
        org.apache.commons.math.complex.ComplexField complexField9 = complex8.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complexField9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex10 = complex8.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex11 = complex8.negate();
        org.apache.commons.math.complex.Complex complex12 = complex4.divide(complex11);
        java.lang.String str13 = complex11.toString();
        org.apache.commons.math.complex.Complex complex14 = complex11.sqrt();
        java.lang.Class<?> wildcardClass15 = complex14.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(NaN, NaN)" + "'", str13, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) 100);
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        java.lang.Object obj13 = complex12.readResolve();
        org.apache.commons.math.complex.Complex complex14 = complex12.atan();
        org.apache.commons.math.complex.Complex complex16 = complex12.pow((double) (byte) 0);
        java.lang.Class<?> wildcardClass17 = complex16.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math.complex.Complex complex8 = complex7.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex6 = complex4.subtract(complex5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complexField2);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        boolean boolean6 = complex4.isInfinite();
        double double7 = complex4.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.negate();
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = complex6.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract((double) (short) 100);
        java.lang.String str11 = complex10.toString();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(NaN, NaN)" + "'", str11, "(NaN, NaN)");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex10 = complex6.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex11 = complex10.asin();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10);
        org.apache.commons.math.complex.Complex complex15 = complex13.divide((double) (short) -1);
        org.apache.commons.math.complex.Complex complex16 = complex1.divide(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        double double21 = complex20.getArgument();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean23 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex24 = complex20.pow(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex24.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex27 = complex18.divide(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex26.sin();
        org.apache.commons.math.complex.Complex complex29 = complex28.conjugate();
        org.apache.commons.math.complex.Complex complex30 = complex17.add(complex28);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        double double34 = complex33.getArgument();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean36 = complex35.isNaN();
        org.apache.commons.math.complex.Complex complex37 = complex33.pow(complex35);
        org.apache.commons.math.complex.Complex complex39 = complex37.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex40 = complex31.divide(complex39);
        org.apache.commons.math.complex.Complex complex41 = complex40.conjugate();
        org.apache.commons.math.complex.Complex complex42 = complex40.acos();
        double double43 = complex42.abs();
        org.apache.commons.math.complex.Complex complex44 = complex30.pow(complex42);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(complex44);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        boolean boolean5 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = complex2.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex5 = complex0.acos();
        org.apache.commons.math.complex.Complex complex6 = complex0.acos();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField8 = complex7.getField();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex7.add(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex13.tan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex17.divide(0.0d);
        org.apache.commons.math.complex.Complex complex21 = complex19.pow((double) 10);
        org.apache.commons.math.complex.Complex complex23 = complex21.add(1.0d);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField25 = complex24.getField();
        org.apache.commons.math.complex.Complex complex26 = complex21.multiply(complex24);
        org.apache.commons.math.complex.Complex complex28 = complex26.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex29 = complex26.sin();
        org.apache.commons.math.complex.Complex complex30 = complex26.sqrt();
        org.apache.commons.math.complex.Complex complex31 = complex30.cos();
        org.apache.commons.math.complex.Complex complex32 = complex14.add(complex30);
        org.apache.commons.math.complex.Complex complex33 = complex6.multiply(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex6.tan();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex37 = complex36.sinh();
        org.apache.commons.math.complex.Complex complex38 = complex36.sin();
        org.apache.commons.math.complex.Complex complex39 = complex38.acos();
        org.apache.commons.math.complex.Complex complex40 = complex39.tan();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        double double42 = complex41.getArgument();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean44 = complex43.isNaN();
        org.apache.commons.math.complex.Complex complex45 = complex41.pow(complex43);
        org.apache.commons.math.complex.Complex complex47 = complex45.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex48 = complex47.sinh();
        org.apache.commons.math.complex.Complex complex49 = complex47.tanh();
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = complex39.divide(complex49);
        org.apache.commons.math.complex.Complex complex52 = complex6.subtract(complex39);
        double double53 = complex39.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complexField2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexField8);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complexField25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 2.5707963267948966d + "'", double53 == 2.5707963267948966d);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = complex1.acos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        java.lang.Class<?> wildcardClass11 = complex10.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(2.5707963267948966d);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex0.add((double) (byte) 0);
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex6.divide((-0.019228399099707208d));
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex6.nthRoot((int) (short) 1);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexList12);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.tan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex10 = complex6.pow(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex10.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex4.divide(complex14);
        java.lang.Class<?> wildcardClass17 = complex4.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex2.negate();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex2.nthRoot((int) (byte) 1);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexList5);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex7 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract(Double.NaN);
        java.lang.String str11 = complex10.toString();
        double double12 = complex10.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(NaN, NaN)" + "'", str11, "(NaN, NaN)");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        boolean boolean2 = complex0.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.sinh();
        boolean boolean13 = complex4.equals((java.lang.Object) complex9);
        boolean boolean14 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex15.subtract((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 1, (-0.019228399099707208d));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        double double13 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean15 = complex14.isNaN();
        org.apache.commons.math.complex.Complex complex16 = complex12.pow(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex16.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex19 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex20 = complex16.atan();
        org.apache.commons.math.complex.Complex complex23 = complex20.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex26 = complex11.multiply(complex25);
        boolean boolean27 = complex26.isInfinite();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        double double29 = complex28.getArgument();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean31 = complex30.isNaN();
        org.apache.commons.math.complex.Complex complex32 = complex28.pow(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex28.add((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex36 = complex28.multiply(97.0d);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        org.apache.commons.math.complex.Complex complex39 = complex28.multiply(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex26.subtract(complex28);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList42 = complex40.nthRoot((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex14 = complex11.acos();
        org.apache.commons.math.complex.Complex complex15 = complex11.tanh();
        double double16 = complex15.getImaginary();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        double double5 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex0.exp();
        org.apache.commons.math.complex.Complex complex7 = complex0.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        java.lang.Object obj7 = complex6.readResolve();
        org.apache.commons.math.complex.ComplexField complexField8 = complex6.getField();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        double double10 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean12 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex13 = complex9.pow(complex11);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex16 = complex13.sinh();
        org.apache.commons.math.complex.Complex complex17 = complex6.pow(complex13);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex18.atan();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex25 = complex23.divide(0.0d);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        double double27 = complex26.getArgument();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean29 = complex28.isNaN();
        org.apache.commons.math.complex.Complex complex30 = complex26.pow(complex28);
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex33 = complex30.sinh();
        boolean boolean34 = complex25.equals((java.lang.Object) complex30);
        org.apache.commons.math.complex.Complex complex35 = complex30.asin();
        org.apache.commons.math.complex.Complex complex36 = complex20.add(complex30);
        org.apache.commons.math.complex.Complex complex38 = complex30.pow((double) 10L);
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((double) '#');
        org.apache.commons.math.complex.Complex complex43 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) 100);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        double double47 = complex46.getArgument();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean49 = complex48.isNaN();
        org.apache.commons.math.complex.Complex complex50 = complex46.pow(complex48);
        org.apache.commons.math.complex.Complex complex52 = complex50.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex53 = complex44.divide(complex52);
        org.apache.commons.math.complex.Complex complex54 = complex52.sin();
        org.apache.commons.math.complex.Complex complex55 = complex43.pow(complex54);
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex57 = complex56.atan();
        org.apache.commons.math.complex.Complex complex58 = complex56.atan();
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex63 = complex61.divide(0.0d);
        org.apache.commons.math.complex.Complex complex64 = complex63.cosh();
        org.apache.commons.math.complex.Complex complex65 = complex56.multiply(complex64);
        org.apache.commons.math.complex.Complex complex68 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex70 = complex68.divide(0.0d);
        org.apache.commons.math.complex.Complex complex72 = complex70.pow((double) 10);
        boolean boolean73 = complex70.isInfinite();
        org.apache.commons.math.complex.Complex complex74 = complex70.asin();
        org.apache.commons.math.complex.Complex complex75 = complex64.subtract(complex74);
        org.apache.commons.math.complex.Complex complex76 = complex54.subtract(complex74);
        boolean boolean77 = complex40.equals((java.lang.Object) complex76);
        org.apache.commons.math.complex.Complex complex78 = complex76.conjugate();
        boolean boolean79 = complex6.equals((java.lang.Object) complex78);
        org.apache.commons.math.complex.ComplexField complexField80 = complex78.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "(1.0, -0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "(1.0, -0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "(1.0, -0.0)");
        org.junit.Assert.assertNotNull(complexField8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(complexField80);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) '#');
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math.complex.ComplexField complexField11 = complex9.getField();
        org.apache.commons.math.complex.Complex complex12 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex4.multiply(complex9);
        double double14 = complex13.getReal();
        org.apache.commons.math.complex.Complex complex15 = complex13.sin();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        java.lang.Object obj19 = complex14.readResolve();
        org.apache.commons.math.complex.Complex complex20 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex22 = complex20.divide((double) 100);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex26 = complex24.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex28 = complex24.divide((double) (short) 100);
        org.apache.commons.math.complex.Complex complex29 = complex24.acos();
        org.apache.commons.math.complex.Complex complex30 = complex22.divide(complex24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList32 = complex30.nthRoot((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.sinh();
        boolean boolean13 = complex4.equals((java.lang.Object) complex9);
        boolean boolean14 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex9.cosh();
        org.apache.commons.math.complex.ComplexField complexField16 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.add(32.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex3 = complex0.divide((double) 10.0f);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10L);
        java.lang.Class<?> wildcardClass7 = complex4.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) 10.0f);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex15 = complex13.divide(0.0d);
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) 10);
        org.apache.commons.math.complex.Complex complex19 = complex17.add(1.0d);
        org.apache.commons.math.complex.Complex complex21 = complex17.add((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex23 = complex17.pow((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = complex10.add(complex17);
        org.apache.commons.math.complex.Complex complex25 = complex17.acos();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        double double13 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean15 = complex14.isNaN();
        org.apache.commons.math.complex.Complex complex16 = complex12.pow(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex16.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex19 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex20 = complex16.atan();
        org.apache.commons.math.complex.Complex complex23 = complex20.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex26 = complex11.multiply(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex27.atan();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex34 = complex32.divide(0.0d);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        double double36 = complex35.getArgument();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean38 = complex37.isNaN();
        org.apache.commons.math.complex.Complex complex39 = complex35.pow(complex37);
        org.apache.commons.math.complex.Complex complex41 = complex39.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex42 = complex39.sinh();
        boolean boolean43 = complex34.equals((java.lang.Object) complex39);
        org.apache.commons.math.complex.Complex complex44 = complex39.asin();
        org.apache.commons.math.complex.Complex complex45 = complex29.add(complex39);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex50 = complex48.divide(0.0d);
        org.apache.commons.math.complex.Complex complex52 = complex50.pow((double) 10);
        boolean boolean53 = complex50.isInfinite();
        org.apache.commons.math.complex.Complex complex54 = complex50.asin();
        org.apache.commons.math.complex.Complex complex55 = complex54.conjugate();
        org.apache.commons.math.complex.ComplexField complexField56 = complex55.getField();
        org.apache.commons.math.complex.Complex complex57 = complex45.pow(complex55);
        boolean boolean58 = complex11.equals((java.lang.Object) complex57);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complexField56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex7.tan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        double double12 = complex10.abs();
        org.apache.commons.math.complex.ComplexField complexField13 = complex10.getField();
        org.apache.commons.math.complex.Complex complex14 = complex4.add(complex10);
        org.apache.commons.math.complex.Complex complex16 = complex10.multiply(3.141592653589793d);
        java.lang.Class<?> wildcardClass17 = complex16.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complexField2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complexField13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10L);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 10L);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (-1L), 0.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (byte) 0, (double) (short) 10);
        boolean boolean3 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex4 = complex2.log();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 0.0d);
        java.lang.Object obj3 = complex2.readResolve();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "(100.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "(100.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "(100.0, 0.0)");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex9 = complex4.createComplex((double) 100.0f, (-1.0d));
        org.apache.commons.math.complex.ComplexField complexField10 = complex4.getField();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex7.tan();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        double double12 = complex10.abs();
        org.apache.commons.math.complex.ComplexField complexField13 = complex10.getField();
        org.apache.commons.math.complex.Complex complex14 = complex4.add(complex10);
        org.apache.commons.math.complex.ComplexField complexField15 = complex4.getField();
        org.apache.commons.math.complex.Complex complex16 = complex4.exp();
        double double17 = complex16.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complexField2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complexField13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complexField15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.5399929762484854E-5d + "'", double17 == 4.5399929762484854E-5d);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        double double10 = complex9.getReal();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        double double13 = complex12.getArgument();
        double double14 = complex12.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex7 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex12 = complex10.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex13 = complex10.negate();
        org.apache.commons.math.complex.Complex complex15 = complex13.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex16 = complex8.add(complex15);
        java.lang.Class<?> wildcardClass17 = complex15.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex16 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex17 = complex11.add(complex12);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField19 = complex18.getField();
        double double20 = complex18.getReal();
        double double21 = complex18.getArgument();
        org.apache.commons.math.complex.Complex complex22 = complex11.pow(complex18);
        boolean boolean23 = complex11.isInfinite();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexField13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList3 = complex1.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex7.cos();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex13 = complex11.divide(0.0d);
        org.apache.commons.math.complex.Complex complex15 = complex13.pow((double) 10);
        org.apache.commons.math.complex.Complex complex17 = complex15.add(1.0d);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField19 = complex18.getField();
        org.apache.commons.math.complex.Complex complex20 = complex15.multiply(complex18);
        org.apache.commons.math.complex.Complex complex22 = complex20.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex23 = complex20.sin();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        double double25 = complex24.getArgument();
        org.apache.commons.math.complex.Complex complex27 = complex24.divide((double) 10.0f);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex32 = complex30.divide(0.0d);
        org.apache.commons.math.complex.Complex complex34 = complex32.pow((double) 10);
        org.apache.commons.math.complex.Complex complex36 = complex34.add(1.0d);
        org.apache.commons.math.complex.Complex complex37 = complex36.acos();
        org.apache.commons.math.complex.Complex complex39 = complex37.add((double) 100);
        boolean boolean40 = complex24.equals((java.lang.Object) 100);
        org.apache.commons.math.complex.Complex complex41 = complex24.acos();
        org.apache.commons.math.complex.Complex complex42 = complex23.divide(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex8.add(complex23);
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex48 = complex46.divide(0.0d);
        org.apache.commons.math.complex.Complex complex50 = complex48.pow((double) 10);
        boolean boolean51 = complex48.isInfinite();
        org.apache.commons.math.complex.Complex complex52 = complex48.asin();
        org.apache.commons.math.complex.Complex complex53 = complex52.conjugate();
        org.apache.commons.math.complex.Complex complex55 = complex52.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex56 = complex23.add(complex52);
        java.lang.Class<?> wildcardClass57 = complex23.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1, (-0.019228399099707208d));
        double double3 = complex2.abs();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0001848485814697d + "'", double3 == 1.0001848485814697d);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList10 = complex8.nthRoot(1);
        double double11 = complex8.abs();
        org.apache.commons.math.complex.Complex complex12 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        java.lang.Class<?> wildcardClass15 = complex14.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complexList10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex5 = complex0.acos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex10 = complex6.pow(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex10.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex10.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.exp();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex23.pow((double) 10);
        org.apache.commons.math.complex.Complex complex27 = complex25.add(1.0d);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField29 = complex28.getField();
        org.apache.commons.math.complex.Complex complex30 = complex25.multiply(complex28);
        org.apache.commons.math.complex.Complex complex32 = complex30.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex37 = complex35.divide(0.0d);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        double double39 = complex38.getArgument();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean41 = complex40.isNaN();
        org.apache.commons.math.complex.Complex complex42 = complex38.pow(complex40);
        org.apache.commons.math.complex.Complex complex44 = complex42.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex45 = complex42.sinh();
        boolean boolean46 = complex37.equals((java.lang.Object) complex42);
        org.apache.commons.math.complex.Complex complex47 = complex32.multiply(complex42);
        boolean boolean48 = complex15.equals((java.lang.Object) complex42);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ZERO;
        double double50 = complex49.getArgument();
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean52 = complex51.isNaN();
        org.apache.commons.math.complex.Complex complex53 = complex49.pow(complex51);
        org.apache.commons.math.complex.Complex complex55 = complex53.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex56 = complex53.sinh();
        org.apache.commons.math.complex.Complex complex57 = complex53.atan();
        org.apache.commons.math.complex.Complex complex58 = complex57.tanh();
        org.apache.commons.math.complex.Complex complex59 = complex58.atan();
        org.apache.commons.math.complex.Complex complex61 = complex58.divide((double) 10);
        org.apache.commons.math.complex.Complex complex62 = complex42.add(complex58);
        org.apache.commons.math.complex.Complex complex63 = complex5.pow(complex58);
        org.apache.commons.math.complex.Complex complex64 = complex58.tan();
        org.apache.commons.math.complex.Complex complex66 = complex58.subtract(141.4213562373095d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complexField2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complexField17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexField29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex66);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex12 = complex9.divide((double) 10);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 10);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(97.0d);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (-1.0f), (double) 1L);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.acos();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex15 = complex13.divide(0.0d);
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) 10);
        org.apache.commons.math.complex.Complex complex19 = complex17.add(1.0d);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField21 = complex20.getField();
        org.apache.commons.math.complex.Complex complex22 = complex17.multiply(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex22.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex25 = complex22.acos();
        org.apache.commons.math.complex.Complex complex26 = complex9.divide(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        double double28 = complex27.getArgument();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math.complex.Complex complex31 = complex27.pow(complex29);
        org.apache.commons.math.complex.Complex complex33 = complex31.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex35 = complex31.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex36 = complex31.sqrt();
        org.apache.commons.math.complex.Complex complex37 = complex26.add(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex36.exp();
        double double39 = complex36.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexField21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (-1), (double) (short) 10);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        double double5 = complex4.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        boolean boolean9 = complex8.isInfinite();
        java.lang.Object obj10 = null;
        boolean boolean11 = complex8.equals(obj10);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        boolean boolean3 = complex2.isInfinite();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex4 = complex1.exp();
        org.apache.commons.math.complex.Complex complex5 = complex1.asin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex1.multiply(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex8.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex12.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex17 = complex16.asin();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex22 = complex20.divide(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex22.pow((double) 10);
        boolean boolean25 = complex22.isInfinite();
        org.apache.commons.math.complex.Complex complex26 = complex22.asin();
        java.lang.Object obj27 = complex22.readResolve();
        org.apache.commons.math.complex.Complex complex28 = complex16.divide(complex22);
        org.apache.commons.math.complex.Complex complex30 = complex28.divide((double) 100);
        boolean boolean31 = complex30.isInfinite();
        org.apache.commons.math.complex.Complex complex32 = complex4.subtract(complex30);
        double double33 = complex32.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex8.asin();
        double double11 = complex8.getImaginary();
        java.lang.Class<?> wildcardClass12 = complex8.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 10.0f, (double) 10);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        double double7 = complex5.abs();
        org.apache.commons.math.complex.ComplexField complexField8 = complex5.getField();
        double double9 = complex5.getArgument();
        boolean boolean10 = complex5.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complexField8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 1);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) 10.0f);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex15 = complex13.divide(0.0d);
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) 10);
        org.apache.commons.math.complex.Complex complex19 = complex17.add(1.0d);
        org.apache.commons.math.complex.Complex complex21 = complex17.add((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex23 = complex17.pow((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = complex10.add(complex17);
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        double double30 = complex29.getArgument();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean32 = complex31.isNaN();
        org.apache.commons.math.complex.Complex complex33 = complex29.pow(complex31);
        org.apache.commons.math.complex.Complex complex35 = complex33.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex36 = complex33.sinh();
        org.apache.commons.math.complex.Complex complex37 = complex33.atan();
        org.apache.commons.math.complex.Complex complex40 = complex37.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex42 = complex40.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex43 = complex28.pow(complex42);
        org.apache.commons.math.complex.Complex complex44 = complex42.log();
        org.apache.commons.math.complex.Complex complex45 = complex44.exp();
        org.apache.commons.math.complex.Complex complex46 = complex10.subtract(complex45);
        java.lang.Object obj47 = complex46.readResolve();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "(NaN, NaN)");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        java.lang.Object obj19 = complex14.readResolve();
        org.apache.commons.math.complex.Complex complex20 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex22 = complex20.divide((double) 100);
        org.apache.commons.math.complex.Complex complex24 = complex20.multiply(97.0d);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        double double28 = complex27.getArgument();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math.complex.Complex complex31 = complex27.pow(complex29);
        org.apache.commons.math.complex.Complex complex33 = complex31.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex34 = complex25.divide(complex33);
        org.apache.commons.math.complex.ComplexField complexField35 = complex34.getField();
        org.apache.commons.math.complex.Complex complex36 = complex34.sqrt1z();
        org.apache.commons.math.complex.Complex complex37 = complex24.divide(complex34);
        org.apache.commons.math.complex.Complex complex38 = complex24.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complexField35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((-0.0d));
        org.apache.commons.math.complex.Complex complex2 = complex1.negate();
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        org.apache.commons.math.complex.Complex complex19 = complex8.subtract(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex18.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex23 = complex21.pow(10.0d);
        org.apache.commons.math.complex.Complex complex24 = complex21.asin();
        org.apache.commons.math.complex.Complex complex25 = complex24.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex4 = complex1.log();
        org.apache.commons.math.complex.Complex complex6 = complex1.add((double) 1L);
        org.apache.commons.math.complex.ComplexField complexField7 = complex6.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex4 = complex1.tan();
        org.apache.commons.math.complex.Complex complex5 = complex4.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex5.sqrt1z();
        java.lang.Class<?> wildcardClass8 = complex5.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex0.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) '4');
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex8.asin();
        org.apache.commons.math.complex.Complex complex11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex12 = complex10.pow(complex11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex3 = complex0.divide((double) 10.0f);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex10.log();
        org.apache.commons.math.complex.Complex complex13 = complex10.subtract((double) (-1L));
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.sinh();
        boolean boolean13 = complex4.equals((java.lang.Object) complex9);
        double double14 = complex4.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex3.exp();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) '4');
        org.apache.commons.math.complex.Complex complex2 = complex1.acos();
        org.apache.commons.math.complex.Complex complex3 = complex2.acos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex8 = complex6.divide(0.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        double double10 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean12 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex13 = complex9.pow(complex11);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex16 = complex13.sinh();
        boolean boolean17 = complex8.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        double double19 = complex18.getArgument();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean21 = complex20.isNaN();
        org.apache.commons.math.complex.Complex complex22 = complex18.pow(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex22.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex22.sinh();
        org.apache.commons.math.complex.Complex complex26 = complex22.atan();
        org.apache.commons.math.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex13.pow(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex13.asin();
        org.apache.commons.math.complex.Complex complex30 = complex13.sqrt1z();
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math.complex.Complex complex32 = complex3.subtract(complex30);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.atan();
        org.apache.commons.math.complex.Complex complex35 = complex33.atan();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex40 = complex38.divide(0.0d);
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex42 = complex33.multiply(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex42.acos();
        org.apache.commons.math.complex.Complex complex44 = complex43.exp();
        org.apache.commons.math.complex.Complex complex46 = complex44.multiply((double) 100);
        boolean boolean47 = complex32.equals((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        org.apache.commons.math.complex.Complex complex19 = complex8.subtract(complex18);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex24 = complex22.divide(0.0d);
        org.apache.commons.math.complex.Complex complex26 = complex24.pow((double) 10);
        org.apache.commons.math.complex.Complex complex28 = complex26.add(1.0d);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField30 = complex29.getField();
        org.apache.commons.math.complex.Complex complex31 = complex26.multiply(complex29);
        org.apache.commons.math.complex.Complex complex33 = complex31.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex34 = complex8.divide(complex31);
        double double35 = complex34.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complexField30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        double double13 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean15 = complex14.isNaN();
        org.apache.commons.math.complex.Complex complex16 = complex12.pow(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex16.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex19 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex20 = complex16.atan();
        org.apache.commons.math.complex.Complex complex23 = complex20.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex26 = complex11.multiply(complex25);
        boolean boolean27 = complex26.isInfinite();
        org.apache.commons.math.complex.Complex complex29 = complex26.divide(0.0d);
        boolean boolean30 = complex29.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = complex0.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex13 = complex11.divide(0.0d);
        org.apache.commons.math.complex.Complex complex15 = complex13.pow((double) 10);
        org.apache.commons.math.complex.ComplexField complexField16 = complex13.getField();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        double double18 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean20 = complex19.isNaN();
        org.apache.commons.math.complex.Complex complex21 = complex17.pow(complex19);
        org.apache.commons.math.complex.Complex complex23 = complex21.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex24 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex23.tanh();
        boolean boolean26 = complex23.isInfinite();
        org.apache.commons.math.complex.Complex complex27 = complex13.divide(complex23);
        org.apache.commons.math.complex.Complex complex28 = complex23.cos();
        org.apache.commons.math.complex.Complex complex29 = complex8.add(complex23);
        boolean boolean30 = complex29.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 100);
        boolean boolean4 = complex1.isInfinite();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex1.nthRoot((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        double double5 = complex4.getArgument();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex8 = complex4.pow(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex8.atan();
        org.apache.commons.math.complex.Complex complex15 = complex12.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex18 = complex3.pow(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex17.log();
        org.apache.commons.math.complex.ComplexField complexField20 = complex17.getField();
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex17.nthRoot((int) ' ');
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complexField20);
        org.junit.Assert.assertNotNull(complexList22);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 10);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(100.0d);
        org.apache.commons.math.complex.Complex complex11 = complex9.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex12 = complex4.divide(complex11);
        double double13 = complex12.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((-0.0d));
        double double2 = complex1.getReal();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        double double13 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean15 = complex14.isNaN();
        org.apache.commons.math.complex.Complex complex16 = complex12.pow(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex16.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex19 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex20 = complex16.atan();
        org.apache.commons.math.complex.Complex complex23 = complex20.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex26 = complex11.multiply(complex25);
        boolean boolean27 = complex26.isInfinite();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        double double29 = complex28.getArgument();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean31 = complex30.isNaN();
        org.apache.commons.math.complex.Complex complex32 = complex28.pow(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex28.add((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex36 = complex28.multiply(97.0d);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        org.apache.commons.math.complex.Complex complex39 = complex28.multiply(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex26.subtract(complex28);
        java.lang.Class<?> wildcardClass41 = complex28.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex14 = complex11.acos();
        org.apache.commons.math.complex.Complex complex15 = complex14.asin();
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.asin();
        org.apache.commons.math.complex.Complex complex19 = complex16.subtract(1.0d);
        org.apache.commons.math.complex.Complex complex20 = complex19.cos();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex8.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        double double4 = complex3.getArgument();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex5.isNaN();
        org.apache.commons.math.complex.Complex complex7 = complex3.pow(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex7.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex10 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10L);
        double double14 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex2.divide(complex11);
        org.apache.commons.math.complex.Complex complex17 = complex11.divide((double) 100L);
        org.apache.commons.math.complex.ComplexField complexField18 = complex17.getField();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex19.pow(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex23.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex26 = complex25.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex29 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex25.multiply((double) '#');
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex17.add(complex31);
        org.apache.commons.math.complex.Complex complex34 = complex17.tanh();
        org.apache.commons.math.complex.ComplexField complexField35 = complex34.getField();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complexField35);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex8.pow((double) 10L);
        double double11 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex13 = complex8.add((double) 100L);
        java.lang.Class<?> wildcardClass14 = complex13.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) '#');
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = complex13.tan();
        double double16 = complex13.abs();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 'a');
        org.apache.commons.math.complex.Complex complex2 = complex1.log();
        org.apache.commons.math.complex.Complex complex3 = complex1.asin();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex3.nthRoot((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex14 = complex11.sin();
        org.apache.commons.math.complex.Complex complex15 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex11.tan();
        org.apache.commons.math.complex.Complex complex18 = complex11.divide((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList20 = complex18.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex0.add((double) (byte) 0);
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (byte) 100);
        java.lang.String str9 = complex6.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0.0, 0.0)" + "'", str9, "(0.0, 0.0)");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) 100);
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        java.lang.Object obj13 = complex12.readResolve();
        org.apache.commons.math.complex.Complex complex14 = complex12.atan();
        org.apache.commons.math.complex.Complex complex16 = complex12.pow((double) (byte) 0);
        double double17 = complex16.abs();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(Double.POSITIVE_INFINITY, 32.0d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        java.lang.String str8 = complex6.toString();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        double double10 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean12 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex13 = complex9.pow(complex11);
        org.apache.commons.math.complex.Complex complex15 = complex13.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex17 = complex13.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex18 = complex17.asin();
        org.apache.commons.math.complex.Complex complex20 = complex18.pow((double) 10);
        org.apache.commons.math.complex.Complex complex22 = complex20.divide((double) (short) -1);
        org.apache.commons.math.complex.Complex complex23 = complex6.add(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex22.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(NaN, NaN)" + "'", str8, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 10);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        double double14 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean16 = complex15.isNaN();
        org.apache.commons.math.complex.Complex complex17 = complex13.pow(complex15);
        org.apache.commons.math.complex.Complex complex18 = complex15.tan();
        org.apache.commons.math.complex.Complex complex19 = complex18.cos();
        java.lang.String str20 = complex18.toString();
        org.apache.commons.math.complex.Complex complex21 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex22 = complex12.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex22.sinh();
        double double24 = complex22.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(0.0, 0.0)" + "'", str20, "(0.0, 0.0)");
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        double double5 = complex4.getArgument();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex8 = complex4.pow(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex8.atan();
        org.apache.commons.math.complex.Complex complex15 = complex12.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex18 = complex3.pow(complex17);
        double double19 = complex18.getReal();
        org.apache.commons.math.complex.Complex complex21 = complex18.add(3.141592653589793d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 10L);
        org.apache.commons.math.complex.Complex complex11 = complex6.createComplex((double) 10, (double) 1);
        org.apache.commons.math.complex.Complex complex12 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex6.tan();
        boolean boolean14 = complex13.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.asin();
        org.apache.commons.math.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math.complex.Complex complex9 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.ComplexField complexField12 = complex10.getField();
        org.apache.commons.math.complex.Complex complex14 = complex10.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        double double16 = complex15.getArgument();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean18 = complex17.isNaN();
        org.apache.commons.math.complex.Complex complex19 = complex15.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex17.tan();
        org.apache.commons.math.complex.Complex complex21 = complex20.cos();
        double double22 = complex20.abs();
        org.apache.commons.math.complex.ComplexField complexField23 = complex20.getField();
        org.apache.commons.math.complex.Complex complex24 = complex14.add(complex20);
        org.apache.commons.math.complex.Complex complex25 = complex24.asin();
        org.apache.commons.math.complex.Complex complex26 = complex7.pow(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex26.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList29 = complex26.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex30 = complex26.negate();
        boolean boolean31 = complex26.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexField12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complexField23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complexList29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex5 = complex0.acos();
        org.apache.commons.math.complex.Complex complex6 = complex0.acos();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField8 = complex7.getField();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex7.add(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex13.tan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex17.divide(0.0d);
        org.apache.commons.math.complex.Complex complex21 = complex19.pow((double) 10);
        org.apache.commons.math.complex.Complex complex23 = complex21.add(1.0d);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField25 = complex24.getField();
        org.apache.commons.math.complex.Complex complex26 = complex21.multiply(complex24);
        org.apache.commons.math.complex.Complex complex28 = complex26.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex29 = complex26.sin();
        org.apache.commons.math.complex.Complex complex30 = complex26.sqrt();
        org.apache.commons.math.complex.Complex complex31 = complex30.cos();
        org.apache.commons.math.complex.Complex complex32 = complex14.add(complex30);
        org.apache.commons.math.complex.Complex complex33 = complex6.multiply(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex33.sinh();
        boolean boolean35 = complex34.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complexField2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexField8);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complexField25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex12.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex17.divide(0.0d);
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex12.multiply(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex21.acos();
        org.apache.commons.math.complex.Complex complex23 = complex8.subtract(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex8.atan();
        java.lang.Class<?> wildcardClass25 = complex8.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList10 = complex8.nthRoot(10);
        org.apache.commons.math.complex.Complex complex11 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complexList10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexField13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 0L, (double) 100.0f);
        double double3 = complex2.getImaginary();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (-1L), (-0.0d));
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = complex0.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex10.divide(0.0d);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 10);
        org.apache.commons.math.complex.Complex complex16 = complex14.add(1.0d);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField18 = complex17.getField();
        org.apache.commons.math.complex.Complex complex19 = complex14.multiply(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex19.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex22 = complex19.sin();
        org.apache.commons.math.complex.Complex complex23 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex24 = complex23.cos();
        org.apache.commons.math.complex.Complex complex25 = complex7.add(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex23.log();
        double double27 = complex23.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        double double5 = complex4.abs();
        java.lang.String str6 = complex4.toString();
        org.apache.commons.math.complex.Complex complex7 = complex4.negate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList9 = complex4.nthRoot((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(NaN, NaN)" + "'", str6, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        java.lang.String str3 = complex1.toString();
        java.lang.Class<?> wildcardClass4 = complex1.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0.5403023058681398, -0.0)" + "'", str3, "(0.5403023058681398, -0.0)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex7.cos();
        double double9 = complex7.getImaginary();
        java.lang.Class<?> wildcardClass10 = complex7.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) 100);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex16 = complex14.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex16.pow((double) 10);
        org.apache.commons.math.complex.Complex complex20 = complex18.add(1.0d);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField22 = complex21.getField();
        org.apache.commons.math.complex.Complex complex23 = complex18.multiply(complex21);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex28 = complex26.divide(0.0d);
        org.apache.commons.math.complex.Complex complex30 = complex28.pow((double) 10);
        org.apache.commons.math.complex.Complex complex32 = complex30.add(1.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList34 = complex32.nthRoot(10);
        org.apache.commons.math.complex.Complex complex35 = complex21.multiply(complex32);
        org.apache.commons.math.complex.Complex complex36 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex37 = complex36.cos();
        org.apache.commons.math.complex.Complex complex38 = complex11.pow(complex36);
        java.lang.Class<?> wildcardClass39 = complex36.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complexField22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complexList34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.tan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex10 = complex6.pow(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex10.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex4.divide(complex14);
        java.lang.Class<?> wildcardClass17 = complex16.getClass();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        double double4 = complex3.getArgument();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex5.isNaN();
        org.apache.commons.math.complex.Complex complex7 = complex3.pow(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex7.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex10 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10L);
        double double14 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex2.divide(complex11);
        org.apache.commons.math.complex.Complex complex17 = complex11.divide((double) 100L);
        double double18 = complex11.getArgument();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) -1, (double) (-1L));
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex16.pow((double) 10L);
        double double19 = complex16.getImaginary();
        org.apache.commons.math.complex.Complex complex20 = complex7.divide(complex16);
        org.apache.commons.math.complex.Complex complex21 = complex4.subtract(complex16);
        org.apache.commons.math.complex.Complex complex22 = complex16.negate();
        org.apache.commons.math.complex.Complex complex23 = complex16.tanh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex10 = complex6.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex11 = complex10.asin();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10);
        org.apache.commons.math.complex.Complex complex14 = complex1.subtract(complex11);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex14.subtract(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex14.createComplex((double) '#', (-0.0d));
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        double double23 = complex22.getArgument();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean25 = complex24.isNaN();
        org.apache.commons.math.complex.Complex complex26 = complex22.pow(complex24);
        org.apache.commons.math.complex.Complex complex28 = complex26.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex30 = complex26.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex36 = complex34.divide(0.0d);
        org.apache.commons.math.complex.Complex complex38 = complex36.pow((double) 10);
        boolean boolean39 = complex36.isInfinite();
        org.apache.commons.math.complex.Complex complex40 = complex36.asin();
        java.lang.Object obj41 = complex36.readResolve();
        org.apache.commons.math.complex.Complex complex42 = complex30.divide(complex36);
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        double double44 = complex43.getArgument();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean46 = complex45.isNaN();
        org.apache.commons.math.complex.Complex complex47 = complex43.pow(complex45);
        org.apache.commons.math.complex.Complex complex48 = complex45.tan();
        org.apache.commons.math.complex.Complex complex49 = complex48.cos();
        org.apache.commons.math.complex.Complex complex50 = complex42.subtract(complex48);
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex52 = complex51.atan();
        org.apache.commons.math.complex.Complex complex53 = complex51.atan();
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex58 = complex56.divide(0.0d);
        org.apache.commons.math.complex.Complex complex59 = complex58.cosh();
        org.apache.commons.math.complex.Complex complex60 = complex51.multiply(complex59);
        org.apache.commons.math.complex.Complex complex61 = complex60.acos();
        org.apache.commons.math.complex.Complex complex62 = complex60.asin();
        boolean boolean63 = complex48.equals((java.lang.Object) complex62);
        boolean boolean64 = complex21.equals((java.lang.Object) complex48);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.ComplexField complexField5 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.ComplexField complexField8 = complex7.getField();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexField8);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (-1.0f), 1.0d);
        org.apache.commons.math.complex.Complex complex4 = complex2.add((double) 1.0f);
        org.apache.commons.math.complex.Complex complex5 = complex4.log();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = complex0.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.ComplexField complexField8 = complex6.getField();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex13 = complex11.divide(0.0d);
        org.apache.commons.math.complex.Complex complex15 = complex13.pow((double) 10);
        org.apache.commons.math.complex.Complex complex17 = complex15.add(1.0d);
        org.apache.commons.math.complex.Complex complex18 = complex17.acos();
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex19.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.exp();
        org.apache.commons.math.complex.Complex complex23 = complex20.divide((double) (short) 10);
        org.apache.commons.math.complex.Complex complex24 = complex6.add(complex23);
        java.lang.Object obj25 = complex6.readResolve();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexField8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "(10.000124996093955, 0.049999375027342134)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "(10.000124996093955, 0.049999375027342134)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "(10.000124996093955, 0.049999375027342134)");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(0.5669767943827975d);
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.sinh();
        boolean boolean13 = complex4.equals((java.lang.Object) complex9);
        boolean boolean14 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex15.subtract((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex18 = complex15.cosh();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex15 = complex11.multiply((double) '#');
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex19 = complex18.negate();
        org.apache.commons.math.complex.Complex complex20 = complex11.multiply(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex18.exp();
        org.apache.commons.math.complex.Complex complex22 = complex18.sqrt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList24 = complex18.nthRoot((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.sinh();
        boolean boolean13 = complex4.equals((java.lang.Object) complex9);
        org.apache.commons.math.complex.Complex complex14 = complex9.asin();
        org.apache.commons.math.complex.Complex complex15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex16 = complex14.subtract(complex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) 100);
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10L);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex16.divide(0.0d);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex19.pow(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex26 = complex23.sinh();
        boolean boolean27 = complex18.equals((java.lang.Object) complex23);
        java.lang.Object obj28 = complex23.readResolve();
        org.apache.commons.math.complex.Complex complex29 = complex11.pow(complex23);
        java.lang.Class<?> wildcardClass30 = complex11.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex9 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex6.cosh();
        java.lang.Class<?> wildcardClass11 = complex10.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((-0.019228399099707208d));
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) '#');
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.sin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList10 = complex8.nthRoot(1);
        double double11 = complex8.abs();
        org.apache.commons.math.complex.Complex complex12 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex8.add((double) (short) 100);
        org.apache.commons.math.complex.Complex complex17 = complex8.createComplex((double) (short) -1, (-1.0d));
        org.apache.commons.math.complex.Complex complex18 = complex8.tan();
        org.apache.commons.math.complex.Complex complex19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex20 = complex8.pow(complex19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complexList10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        double double13 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean15 = complex14.isNaN();
        org.apache.commons.math.complex.Complex complex16 = complex12.pow(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex16.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex19 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex20 = complex16.atan();
        org.apache.commons.math.complex.Complex complex23 = complex20.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex26 = complex11.multiply(complex25);
        org.apache.commons.math.complex.Complex complex28 = complex11.divide((double) 0L);
        double double29 = complex11.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 10);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math.complex.ComplexField complexField14 = complex13.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complexField14);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.negate();
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = complex6.acos();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList10 = complex6.nthRoot((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex9 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex6.multiply((double) '#');
        boolean boolean13 = complex12.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex2.sqrt();
        double double6 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex11.negate();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex18 = complex15.negate();
        org.apache.commons.math.complex.Complex complex19 = complex11.divide(complex18);
        java.lang.String str20 = complex18.toString();
        org.apache.commons.math.complex.Complex complex21 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex22.atan();
        org.apache.commons.math.complex.Complex complex25 = complex24.cos();
        org.apache.commons.math.complex.Complex complex26 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex27 = complex18.multiply(complex26);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex32 = complex30.divide(0.0d);
        org.apache.commons.math.complex.Complex complex34 = complex32.pow((double) 10);
        org.apache.commons.math.complex.Complex complex36 = complex34.add(1.0d);
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField38 = complex37.getField();
        org.apache.commons.math.complex.Complex complex39 = complex34.multiply(complex37);
        org.apache.commons.math.complex.Complex complex41 = complex39.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex42 = complex39.sin();
        org.apache.commons.math.complex.Complex complex43 = complex39.sqrt();
        org.apache.commons.math.complex.Complex complex44 = complex43.cos();
        org.apache.commons.math.complex.Complex complex45 = complex27.pow(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex2.pow(complex27);
        org.apache.commons.math.complex.Complex complex48 = complex2.pow((double) (byte) 10);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(NaN, NaN)" + "'", str20, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complexField38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex48);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) 100);
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10L);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean17 = complex16.isNaN();
        org.apache.commons.math.complex.Complex complex18 = complex14.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex18.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex21 = complex18.sinh();
        org.apache.commons.math.complex.Complex complex22 = complex18.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.tanh();
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        double double25 = complex24.getArgument();
        org.apache.commons.math.complex.Complex complex26 = complex24.negate();
        org.apache.commons.math.complex.Complex complex27 = complex13.divide(complex24);
        org.apache.commons.math.complex.Complex complex28 = complex13.asin();
        org.apache.commons.math.complex.Complex complex30 = complex13.multiply((double) ' ');
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex5 = complex0.acos();
        org.apache.commons.math.complex.Complex complex6 = complex0.log();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complexField2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) 10.0f);
        org.apache.commons.math.complex.Complex complex11 = complex8.log();
        java.lang.Object obj12 = complex11.readResolve();
        java.lang.String str13 = complex11.toString();
        org.apache.commons.math.complex.Complex complex14 = complex11.asin();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "(NaN, NaN)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(NaN, NaN)" + "'", str13, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (byte) 10, (double) ' ');
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.cosh();
        double double5 = complex2.getArgument();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.2679114584199251d + "'", double5 == 1.2679114584199251d);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (-1.0f), 10.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.asin();
        org.apache.commons.math.complex.Complex complex12 = complex9.atan();
        boolean boolean13 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex14 = complex9.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.0d, 97.00515450222221d);
        double double3 = complex2.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt();
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex10.nthRoot((int) '#');
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexList12);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) (-1));
        org.apache.commons.math.complex.Complex complex7 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex10 = complex8.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex11 = complex8.negate();
        org.apache.commons.math.complex.Complex complex12 = complex4.divide(complex11);
        double double13 = complex4.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        java.lang.String str2 = complex1.toString();
        org.apache.commons.math.complex.Complex complex4 = complex1.pow(10.0d);
        boolean boolean5 = complex1.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(1.0, 0.0)" + "'", str2, "(1.0, 0.0)");
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 10);
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        double double14 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean16 = complex15.isNaN();
        org.apache.commons.math.complex.Complex complex17 = complex13.pow(complex15);
        org.apache.commons.math.complex.Complex complex19 = complex17.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex20 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        double double28 = complex27.getArgument();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math.complex.Complex complex31 = complex27.pow(complex29);
        org.apache.commons.math.complex.Complex complex33 = complex31.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex34 = complex31.sinh();
        org.apache.commons.math.complex.Complex complex35 = complex31.atan();
        org.apache.commons.math.complex.Complex complex38 = complex35.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex41 = complex26.pow(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex40.log();
        org.apache.commons.math.complex.Complex complex43 = complex42.sin();
        org.apache.commons.math.complex.Complex complex44 = complex43.conjugate();
        org.apache.commons.math.complex.Complex complex45 = complex19.divide(complex43);
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        double double47 = complex46.getArgument();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean49 = complex48.isNaN();
        org.apache.commons.math.complex.Complex complex50 = complex46.pow(complex48);
        org.apache.commons.math.complex.Complex complex52 = complex46.add((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex54 = complex46.multiply(97.0d);
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        org.apache.commons.math.complex.Complex complex57 = complex46.multiply(complex56);
        org.apache.commons.math.complex.Complex complex58 = complex46.acos();
        double double59 = complex58.abs();
        org.apache.commons.math.complex.Complex complex60 = complex43.subtract(complex58);
        boolean boolean61 = complex11.equals((java.lang.Object) complex43);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.5707963267948966d + "'", double59 == 1.5707963267948966d);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.sinh();
        boolean boolean13 = complex4.equals((java.lang.Object) complex9);
        org.apache.commons.math.complex.Complex complex14 = complex9.asin();
        org.apache.commons.math.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex20 = complex18.divide(0.0d);
        org.apache.commons.math.complex.Complex complex22 = complex20.pow((double) 10);
        org.apache.commons.math.complex.Complex complex24 = complex22.add(1.0d);
        org.apache.commons.math.complex.Complex complex26 = complex22.add((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex28 = complex22.pow((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex29 = complex15.multiply(complex22);
        org.apache.commons.math.complex.Complex complex30 = complex15.cos();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = complex0.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex13 = complex11.divide(0.0d);
        org.apache.commons.math.complex.Complex complex15 = complex13.pow((double) 10);
        org.apache.commons.math.complex.ComplexField complexField16 = complex13.getField();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        double double18 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean20 = complex19.isNaN();
        org.apache.commons.math.complex.Complex complex21 = complex17.pow(complex19);
        org.apache.commons.math.complex.Complex complex23 = complex21.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex24 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex23.tanh();
        boolean boolean26 = complex23.isInfinite();
        org.apache.commons.math.complex.Complex complex27 = complex13.divide(complex23);
        org.apache.commons.math.complex.Complex complex28 = complex23.cos();
        org.apache.commons.math.complex.Complex complex29 = complex8.add(complex23);
        org.apache.commons.math.complex.Complex complex30 = complex8.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean17 = complex16.isNaN();
        org.apache.commons.math.complex.Complex complex18 = complex14.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex18.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex21 = complex12.divide(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.sin();
        org.apache.commons.math.complex.Complex complex23 = complex22.cos();
        org.apache.commons.math.complex.Complex complex24 = complex9.pow(complex22);
        java.lang.String str25 = complex9.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(NaN, NaN)" + "'", str25, "(NaN, NaN)");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        boolean boolean2 = complex1.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex1.subtract((double) 0L);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((-0.09966865249116202d));
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.ComplexField complexField5 = complex2.getField();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex15 = complex7.pow(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex16.log();
        org.apache.commons.math.complex.Complex complex18 = complex2.add(complex17);
        double double19 = complex18.getReal();
        org.apache.commons.math.complex.Complex complex21 = complex18.subtract((double) 100.0f);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(3.141592653589793d, 100.4987562112089d);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        double double4 = complex2.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.54784733847407d + "'", double4 == 100.54784733847407d);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.sinh();
        org.apache.commons.math.complex.ComplexField complexField3 = complex0.getField();
        org.apache.commons.math.complex.Complex complex5 = complex0.add((double) 1L);
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply((double) 1.0f);
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex9 = complex7.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        double double4 = complex3.getArgument();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex5.isNaN();
        org.apache.commons.math.complex.Complex complex7 = complex3.pow(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex7.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex10 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10L);
        double double14 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex2.divide(complex11);
        org.apache.commons.math.complex.Complex complex17 = complex11.divide((double) 100L);
        org.apache.commons.math.complex.ComplexField complexField18 = complex17.getField();
        org.apache.commons.math.complex.Complex complex20 = complex17.add((double) 10);
        org.apache.commons.math.complex.Complex complex21 = complex17.log();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex7 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex12 = complex10.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex13 = complex10.negate();
        org.apache.commons.math.complex.Complex complex15 = complex13.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex16 = complex8.add(complex15);
        org.apache.commons.math.complex.ComplexField complexField17 = complex8.getField();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complexField17);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.acos();
        org.apache.commons.math.complex.Complex complex11 = complex10.negate();
        org.apache.commons.math.complex.Complex complex14 = complex10.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex15 = complex10.sin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        org.apache.commons.math.complex.Complex complex19 = complex17.sin();
        org.apache.commons.math.complex.Complex complex20 = complex19.acos();
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((double) (-1));
        org.apache.commons.math.complex.Complex complex24 = complex22.divide((double) 0.0f);
        boolean boolean25 = complex10.equals((java.lang.Object) complex22);
        org.apache.commons.math.complex.Complex complex26 = complex10.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex8.acos();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex16 = complex14.divide(0.0d);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        double double18 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean20 = complex19.isNaN();
        org.apache.commons.math.complex.Complex complex21 = complex17.pow(complex19);
        org.apache.commons.math.complex.Complex complex23 = complex21.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex24 = complex21.sinh();
        boolean boolean25 = complex16.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        double double27 = complex26.getArgument();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean29 = complex28.isNaN();
        org.apache.commons.math.complex.Complex complex30 = complex26.pow(complex28);
        org.apache.commons.math.complex.Complex complex32 = complex30.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex33 = complex30.sinh();
        org.apache.commons.math.complex.Complex complex34 = complex30.atan();
        org.apache.commons.math.complex.Complex complex35 = complex34.tanh();
        org.apache.commons.math.complex.Complex complex36 = complex21.pow(complex34);
        org.apache.commons.math.complex.Complex complex37 = complex21.asin();
        org.apache.commons.math.complex.Complex complex38 = complex8.multiply(complex37);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.divide((double) (short) 0);
        java.lang.String str7 = complex6.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(NaN, NaN)" + "'", str7, "(NaN, NaN)");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        double double7 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex5.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex16 = complex14.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex16.pow((double) 10);
        org.apache.commons.math.complex.Complex complex20 = complex18.add(1.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot(10);
        org.apache.commons.math.complex.Complex complex23 = complex9.multiply(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex24.asin();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexList22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.negate();
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = complex6.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract((double) (short) 100);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (short) 0, 1.0d);
        org.apache.commons.math.complex.Complex complex18 = complex16.divide(3.141592653589793d);
        org.apache.commons.math.complex.Complex complex19 = complex8.subtract(complex16);
        double double20 = complex8.abs();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex3 = complex0.divide((double) 10.0f);
        org.apache.commons.math.complex.Complex complex4 = complex3.exp();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex13 = complex9.atan();
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex20 = complex16.subtract((double) 0);
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math.complex.Complex complex22 = complex4.multiply(complex21);
        java.lang.Object obj23 = complex4.readResolve();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "(1.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "(1.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "(1.0, 0.0)");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.sinh();
        boolean boolean13 = complex4.equals((java.lang.Object) complex9);
        boolean boolean14 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex9.atan();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        double double21 = complex20.getArgument();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean23 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex24 = complex20.pow(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex24.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex27 = complex24.sinh();
        org.apache.commons.math.complex.Complex complex28 = complex24.atan();
        org.apache.commons.math.complex.Complex complex31 = complex28.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex33 = complex31.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex34 = complex19.pow(complex33);
        double double35 = complex34.getReal();
        org.apache.commons.math.complex.Complex complex36 = complex34.exp();
        org.apache.commons.math.complex.Complex complex37 = complex15.subtract(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex36.cosh();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex40 = complex39.atan();
        org.apache.commons.math.complex.Complex complex41 = complex39.sinh();
        org.apache.commons.math.complex.ComplexField complexField42 = complex39.getField();
        org.apache.commons.math.complex.Complex complex44 = complex39.add((double) 1L);
        org.apache.commons.math.complex.Complex complex46 = complex39.multiply((double) 1.0f);
        org.apache.commons.math.complex.Complex complex48 = complex39.divide(1.0001848485814697d);
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex(0.0d);
        boolean boolean51 = complex48.equals((java.lang.Object) complex50);
        org.apache.commons.math.complex.Complex complex52 = complex38.add(complex48);
        org.apache.commons.math.complex.Complex complex53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex54 = complex52.divide(complex53);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complexField42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(complex52);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 0L, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.5063656411097588d) + "'", double4 == (-0.5063656411097588d));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.acos();
        org.apache.commons.math.complex.Complex complex11 = complex10.negate();
        org.apache.commons.math.complex.Complex complex14 = complex10.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex15 = complex10.sin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        org.apache.commons.math.complex.Complex complex19 = complex17.sin();
        org.apache.commons.math.complex.Complex complex20 = complex19.acos();
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((double) (-1));
        org.apache.commons.math.complex.Complex complex24 = complex22.divide((double) 0.0f);
        boolean boolean25 = complex10.equals((java.lang.Object) complex22);
        org.apache.commons.math.complex.Complex complex26 = complex22.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex16.divide(0.0d);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex19.pow(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex26 = complex23.sinh();
        boolean boolean27 = complex18.equals((java.lang.Object) complex23);
        org.apache.commons.math.complex.Complex complex28 = complex13.multiply(complex23);
        org.apache.commons.math.complex.Complex complex29 = complex23.conjugate();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex34 = complex32.divide(0.0d);
        org.apache.commons.math.complex.Complex complex36 = complex34.pow((double) 10);
        org.apache.commons.math.complex.Complex complex38 = complex36.add(1.0d);
        org.apache.commons.math.complex.Complex complex39 = complex38.acos();
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex40.exp();
        org.apache.commons.math.complex.Complex complex42 = complex23.subtract(complex40);
        org.apache.commons.math.complex.Complex complex43 = complex40.tan();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        boolean boolean5 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField7 = complex6.getField();
        org.apache.commons.math.complex.Complex complex9 = complex6.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex10 = complex6.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(1.0d);
        org.apache.commons.math.complex.Complex complex13 = complex12.cos();
        org.apache.commons.math.complex.Complex complex14 = complex2.pow(complex12);
        org.apache.commons.math.complex.Complex complex15 = complex12.acos();
        double double16 = complex12.getArgument();
        java.lang.String str17 = complex12.toString();
        org.apache.commons.math.complex.ComplexField complexField18 = complex12.getField();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(NaN, NaN)" + "'", str17, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complexField18);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex16.divide(0.0d);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex19.pow(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex26 = complex23.sinh();
        boolean boolean27 = complex18.equals((java.lang.Object) complex23);
        org.apache.commons.math.complex.Complex complex28 = complex13.multiply(complex23);
        org.apache.commons.math.complex.Complex complex29 = complex23.conjugate();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex34 = complex32.divide(0.0d);
        org.apache.commons.math.complex.Complex complex36 = complex34.pow((double) 10);
        org.apache.commons.math.complex.Complex complex38 = complex36.add(1.0d);
        org.apache.commons.math.complex.Complex complex39 = complex38.acos();
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex40.exp();
        org.apache.commons.math.complex.Complex complex42 = complex23.subtract(complex40);
        org.apache.commons.math.complex.Complex complex44 = complex23.pow((double) 10);
        org.apache.commons.math.complex.ComplexField complexField45 = complex44.getField();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complexField45);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.tan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex10 = complex6.pow(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex10.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex4.divide(complex14);
        double double17 = complex16.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.cos();
        org.apache.commons.math.complex.Complex complex22 = complex18.createComplex(10.000249990625546d, 0.0d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) 100);
        org.apache.commons.math.complex.Complex complex12 = complex9.asin();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        double double14 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean16 = complex15.isNaN();
        org.apache.commons.math.complex.Complex complex17 = complex13.pow(complex15);
        org.apache.commons.math.complex.Complex complex19 = complex17.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex21 = complex17.add((double) 10.0f);
        double double22 = complex21.getImaginary();
        org.apache.commons.math.complex.Complex complex23 = complex21.asin();
        org.apache.commons.math.complex.Complex complex24 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex9.multiply(complex23);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        java.lang.Object obj19 = complex14.readResolve();
        org.apache.commons.math.complex.Complex complex20 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex22 = complex20.divide((double) 100);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex26 = complex24.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex28 = complex24.divide((double) (short) 100);
        org.apache.commons.math.complex.Complex complex29 = complex24.acos();
        org.apache.commons.math.complex.Complex complex30 = complex22.divide(complex24);
        org.apache.commons.math.complex.Complex complex31 = complex22.sinh();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex36 = complex34.divide(0.0d);
        org.apache.commons.math.complex.Complex complex38 = complex36.pow((double) 10);
        org.apache.commons.math.complex.Complex complex40 = complex38.add(1.0d);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField42 = complex41.getField();
        org.apache.commons.math.complex.Complex complex43 = complex38.multiply(complex41);
        org.apache.commons.math.complex.Complex complex45 = complex43.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex46 = complex43.acos();
        org.apache.commons.math.complex.Complex complex47 = complex46.asin();
        org.apache.commons.math.complex.Complex complex48 = complex46.cosh();
        org.apache.commons.math.complex.Complex complex51 = complex48.createComplex(Double.NaN, 0.0d);
        org.apache.commons.math.complex.Complex complex52 = complex48.sqrt();
        org.apache.commons.math.complex.Complex complex53 = complex22.multiply(complex48);
        org.apache.commons.math.complex.Complex complex54 = complex48.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complexField42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) 100);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        double double4 = complex3.getArgument();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex5.isNaN();
        org.apache.commons.math.complex.Complex complex7 = complex3.pow(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex7.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex10 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex7.atan();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex2.multiply(complex13);
        java.lang.String str15 = complex2.toString();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(100.0, 100.0)" + "'", str15, "(100.0, 100.0)");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        double double5 = complex4.getArgument();
        boolean boolean6 = complex4.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math.complex.Complex complex10 = complex7.createComplex((double) (short) -1, (double) 'a');
        org.apache.commons.math.complex.Complex complex11 = complex7.log();
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.cos();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex9.nthRoot((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        double double7 = complex5.abs();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.ComplexField complexField10 = complex8.getField();
        org.apache.commons.math.complex.Complex complex12 = complex8.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex13 = complex8.acos();
        org.apache.commons.math.complex.Complex complex14 = complex5.subtract(complex8);
        org.apache.commons.math.complex.Complex complex15 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex8.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        double double13 = complex11.getReal();
        java.lang.Class<?> wildcardClass14 = complex11.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.sinh();
        boolean boolean13 = complex4.equals((java.lang.Object) complex9);
        boolean boolean14 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex9.cosh();
        double double16 = complex15.getArgument();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 10, (double) (byte) -1);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        java.lang.Object obj19 = complex14.readResolve();
        org.apache.commons.math.complex.Complex complex20 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean24 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex25 = complex21.pow(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex23.tan();
        org.apache.commons.math.complex.Complex complex27 = complex26.cos();
        org.apache.commons.math.complex.Complex complex28 = complex20.subtract(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex26.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        double double5 = complex4.getArgument();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex8 = complex4.pow(complex6);
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex3.pow(complex8);
        org.apache.commons.math.complex.ComplexField complexField11 = complex8.getField();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex12.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex17.divide(0.0d);
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex12.multiply(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex21.acos();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex27 = complex25.divide(0.0d);
        org.apache.commons.math.complex.Complex complex29 = complex27.pow((double) 10);
        org.apache.commons.math.complex.Complex complex31 = complex29.add(1.0d);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField33 = complex32.getField();
        org.apache.commons.math.complex.Complex complex34 = complex29.multiply(complex32);
        org.apache.commons.math.complex.Complex complex36 = complex34.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex37 = complex34.acos();
        org.apache.commons.math.complex.Complex complex38 = complex21.divide(complex37);
        boolean boolean39 = complex8.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex40 = complex8.conjugate();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complexField33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(complex40);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((-1.0d));
        org.apache.commons.math.complex.Complex complex2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex3 = complex1.add(complex2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex14 = complex11.sin();
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        double double19 = complex18.getArgument();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean21 = complex20.isNaN();
        org.apache.commons.math.complex.Complex complex22 = complex18.pow(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex22.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex25 = complex24.sinh();
        org.apache.commons.math.complex.Complex complex26 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex26.pow((double) 10L);
        org.apache.commons.math.complex.Complex complex30 = complex26.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex31 = complex17.pow(complex26);
        org.apache.commons.math.complex.Complex complex32 = complex31.sinh();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex10 = complex6.add((double) (byte) -1);
        java.lang.Object obj11 = complex10.readResolve();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "(NaN, NaN)");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.sinh();
        boolean boolean13 = complex4.equals((java.lang.Object) complex9);
        boolean boolean14 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex9.atan();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        double double21 = complex20.getArgument();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean23 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex24 = complex20.pow(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex24.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex27 = complex24.sinh();
        org.apache.commons.math.complex.Complex complex28 = complex24.atan();
        org.apache.commons.math.complex.Complex complex31 = complex28.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex33 = complex31.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex34 = complex19.pow(complex33);
        double double35 = complex34.getReal();
        org.apache.commons.math.complex.Complex complex36 = complex34.exp();
        org.apache.commons.math.complex.Complex complex37 = complex15.subtract(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex36.cosh();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex40 = complex39.atan();
        org.apache.commons.math.complex.Complex complex41 = complex39.sinh();
        org.apache.commons.math.complex.ComplexField complexField42 = complex39.getField();
        org.apache.commons.math.complex.Complex complex44 = complex39.add((double) 1L);
        org.apache.commons.math.complex.Complex complex46 = complex39.multiply((double) 1.0f);
        org.apache.commons.math.complex.Complex complex48 = complex39.divide(1.0001848485814697d);
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex(0.0d);
        boolean boolean51 = complex48.equals((java.lang.Object) complex50);
        org.apache.commons.math.complex.Complex complex52 = complex38.add(complex48);
        org.apache.commons.math.complex.Complex complex53 = complex52.cos();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complexField42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex7.pow(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.cos();
        org.apache.commons.math.complex.Complex complex16 = complex13.divide(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex6.divide(complex14);
        double double18 = complex17.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex8.pow((double) 10L);
        org.apache.commons.math.complex.Complex complex12 = complex8.multiply(0.0d);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = complex12.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexField13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) '4');
        boolean boolean2 = complex1.isNaN();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex10 = complex6.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex11 = complex10.asin();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10);
        org.apache.commons.math.complex.Complex complex15 = complex13.divide((double) (short) -1);
        org.apache.commons.math.complex.Complex complex16 = complex1.divide(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex1.atan();
        java.lang.Class<?> wildcardClass18 = complex17.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 'a', (double) '4');
        double double3 = complex2.getImaginary();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        double double6 = complex5.abs();
        org.apache.commons.math.complex.Complex complex7 = complex0.add(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.log();
        double double2 = complex0.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex14 = complex11.acos();
        org.apache.commons.math.complex.Complex complex15 = complex14.asin();
        boolean boolean16 = complex15.isNaN();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) 10.0f);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex15 = complex13.divide(0.0d);
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) 10);
        org.apache.commons.math.complex.Complex complex19 = complex17.add(1.0d);
        org.apache.commons.math.complex.Complex complex21 = complex17.add((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex23 = complex17.pow((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = complex10.add(complex17);
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        double double30 = complex29.getArgument();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean32 = complex31.isNaN();
        org.apache.commons.math.complex.Complex complex33 = complex29.pow(complex31);
        org.apache.commons.math.complex.Complex complex35 = complex33.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex36 = complex33.sinh();
        org.apache.commons.math.complex.Complex complex37 = complex33.atan();
        org.apache.commons.math.complex.Complex complex40 = complex37.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex42 = complex40.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex43 = complex28.pow(complex42);
        org.apache.commons.math.complex.Complex complex44 = complex42.log();
        org.apache.commons.math.complex.Complex complex45 = complex44.exp();
        org.apache.commons.math.complex.Complex complex46 = complex10.subtract(complex45);
        org.apache.commons.math.complex.Complex complex49 = complex10.createComplex((double) (short) 100, (double) 100);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex49);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 100);
        org.apache.commons.math.complex.Complex complex6 = complex1.createComplex((-1.0d), (double) 0.0f);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex7.pow(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex14 = complex11.negate();
        org.apache.commons.math.complex.Complex complex15 = complex1.divide(complex11);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        double double17 = complex16.getArgument();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean19 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex20 = complex16.pow(complex18);
        org.apache.commons.math.complex.Complex complex22 = complex16.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex24 = complex22.pow((double) '4');
        org.apache.commons.math.complex.Complex complex25 = complex15.subtract(complex22);
        boolean boolean26 = complex15.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex7 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex4.cos();
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (-1L));
        org.apache.commons.math.complex.Complex complex2 = complex1.tanh();
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = complex3.cosh();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.0d, 100.54784733847407d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex2.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 0, 0.0d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 10L);
        org.apache.commons.math.complex.Complex complex11 = complex6.createComplex((double) 10, (double) 1);
        org.apache.commons.math.complex.Complex complex12 = complex6.sqrt1z();
        boolean boolean13 = complex6.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex5 = complex0.acos();
        org.apache.commons.math.complex.Complex complex6 = complex0.log();
        java.lang.Class<?> wildcardClass7 = complex6.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complexField2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.sinh();
        org.apache.commons.math.complex.ComplexField complexField3 = complex0.getField();
        org.apache.commons.math.complex.Complex complex5 = complex0.add((double) 1L);
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply((double) 1.0f);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(1.0001848485814697d);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex(0.0d);
        boolean boolean12 = complex9.equals((java.lang.Object) complex11);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex13.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.cos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex9.add(complex17);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        boolean boolean5 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField7 = complex6.getField();
        org.apache.commons.math.complex.Complex complex9 = complex6.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex10 = complex6.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(1.0d);
        org.apache.commons.math.complex.Complex complex13 = complex12.cos();
        org.apache.commons.math.complex.Complex complex14 = complex2.pow(complex12);
        org.apache.commons.math.complex.Complex complex15 = complex12.acos();
        double double16 = complex12.getArgument();
        java.lang.String str17 = complex12.toString();
        org.apache.commons.math.complex.Complex complex18 = complex12.sinh();
        boolean boolean19 = complex12.isInfinite();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(NaN, NaN)" + "'", str17, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        double double11 = complex8.getArgument();
        double double12 = complex8.getArgument();
        java.lang.String str13 = complex8.toString();
        org.apache.commons.math.complex.Complex complex15 = complex8.subtract(100.54784733847407d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(NaN, NaN)" + "'", str13, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) (-1));
        java.lang.String str7 = complex4.toString();
        org.apache.commons.math.complex.Complex complex8 = complex4.negate();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex13 = complex11.divide(0.0d);
        org.apache.commons.math.complex.Complex complex15 = complex13.pow((double) 10);
        boolean boolean16 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex17 = complex13.asin();
        org.apache.commons.math.complex.Complex complex19 = complex17.add(Double.NaN);
        org.apache.commons.math.complex.Complex complex20 = complex19.acos();
        org.apache.commons.math.complex.Complex complex21 = complex19.tan();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        double double23 = complex22.getArgument();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean25 = complex24.isNaN();
        org.apache.commons.math.complex.Complex complex26 = complex22.pow(complex24);
        org.apache.commons.math.complex.Complex complex28 = complex26.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex30 = complex26.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex33 = complex31.pow((double) 10);
        org.apache.commons.math.complex.Complex complex34 = complex33.conjugate();
        org.apache.commons.math.complex.Complex complex35 = complex19.pow(complex34);
        boolean boolean36 = complex4.equals((java.lang.Object) complex19);
        org.apache.commons.math.complex.Complex complex38 = complex4.pow(100.4987562112089d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(NaN, NaN)" + "'", str7, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(complex38);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex0.add((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex8 = complex0.multiply(97.0d);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        org.apache.commons.math.complex.Complex complex11 = complex0.multiply(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex16 = complex0.pow(complex15);
        double double17 = complex16.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexField13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) '#');
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math.complex.ComplexField complexField11 = complex9.getField();
        org.apache.commons.math.complex.Complex complex12 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex4.multiply(complex9);
        org.apache.commons.math.complex.Complex complex14 = complex4.conjugate();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        java.lang.Object obj19 = complex14.readResolve();
        org.apache.commons.math.complex.Complex complex20 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean24 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex25 = complex21.pow(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex23.tan();
        org.apache.commons.math.complex.Complex complex27 = complex26.cos();
        org.apache.commons.math.complex.Complex complex28 = complex20.subtract(complex26);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex33 = complex31.divide(0.0d);
        org.apache.commons.math.complex.Complex complex35 = complex33.pow((double) 10);
        boolean boolean36 = complex33.isInfinite();
        org.apache.commons.math.complex.Complex complex37 = complex33.asin();
        org.apache.commons.math.complex.Complex complex39 = complex37.add(Double.NaN);
        org.apache.commons.math.complex.ComplexField complexField40 = complex37.getField();
        org.apache.commons.math.complex.Complex complex41 = complex28.pow(complex37);
        java.lang.Object obj42 = complex28.readResolve();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complexField40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "(NaN, NaN)");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex16.divide(0.0d);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex19.pow(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex26 = complex23.sinh();
        boolean boolean27 = complex18.equals((java.lang.Object) complex23);
        org.apache.commons.math.complex.Complex complex28 = complex13.multiply(complex23);
        org.apache.commons.math.complex.Complex complex29 = complex23.conjugate();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex34 = complex32.divide(0.0d);
        org.apache.commons.math.complex.Complex complex36 = complex34.pow((double) 10);
        org.apache.commons.math.complex.Complex complex38 = complex36.add(1.0d);
        org.apache.commons.math.complex.Complex complex39 = complex38.acos();
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex40.exp();
        org.apache.commons.math.complex.Complex complex42 = complex23.subtract(complex40);
        org.apache.commons.math.complex.Complex complex43 = complex42.exp();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math.complex.Complex complex10 = complex7.createComplex((double) (short) -1, (double) 'a');
        org.apache.commons.math.complex.ComplexField complexField11 = complex10.getField();
        double double12 = complex10.abs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex10.nthRoot((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.00515450222221d + "'", double12 == 97.00515450222221d);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (byte) 10, (double) (-1.0f));
        double double3 = complex2.getArgument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex2.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.09966865249116202d) + "'", double3 == (-0.09966865249116202d));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex0.add((double) (-1));
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        double double5 = complex4.abs();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) (-1));
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        org.apache.commons.math.complex.Complex complex13 = complex6.divide(complex12);
        org.apache.commons.math.complex.Complex complex15 = complex6.add(141.4213562373095d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        double double5 = complex4.abs();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex6.negate();
        org.apache.commons.math.complex.Complex complex9 = complex6.log();
        java.lang.Object obj10 = complex6.readResolve();
        double double11 = complex6.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "(NaN, NaN)");
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.add(Double.NaN);
        org.apache.commons.math.complex.Complex complex11 = complex10.acos();
        org.apache.commons.math.complex.Complex complex12 = complex10.tan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        double double14 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean16 = complex15.isNaN();
        org.apache.commons.math.complex.Complex complex17 = complex13.pow(complex15);
        org.apache.commons.math.complex.Complex complex19 = complex17.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex21 = complex17.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex22 = complex21.asin();
        org.apache.commons.math.complex.Complex complex24 = complex22.pow((double) 10);
        org.apache.commons.math.complex.Complex complex25 = complex24.conjugate();
        org.apache.commons.math.complex.Complex complex26 = complex10.pow(complex25);
        java.lang.String str27 = complex26.toString();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(NaN, NaN)" + "'", str27, "(NaN, NaN)");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (byte) 0, (double) (short) 10);
        boolean boolean3 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex5 = complex2.subtract((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList7 = complex5.nthRoot((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.0d, 0.5669767943827975d);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.sinh();
        boolean boolean13 = complex4.equals((java.lang.Object) complex9);
        boolean boolean14 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex9.atan();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        double double21 = complex20.getArgument();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean23 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex24 = complex20.pow(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex24.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex27 = complex24.sinh();
        org.apache.commons.math.complex.Complex complex28 = complex24.atan();
        org.apache.commons.math.complex.Complex complex31 = complex28.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex33 = complex31.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex34 = complex19.pow(complex33);
        double double35 = complex34.getReal();
        org.apache.commons.math.complex.Complex complex36 = complex34.exp();
        org.apache.commons.math.complex.Complex complex37 = complex15.subtract(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex39 = complex38.tanh();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        boolean boolean4 = complex2.isInfinite();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        org.apache.commons.math.complex.Complex complex19 = complex8.subtract(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex18.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex23 = complex21.pow(10.0d);
        java.lang.Object obj24 = complex21.readResolve();
        org.apache.commons.math.complex.Complex complex25 = complex21.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex15 = complex12.sinh();
        boolean boolean16 = complex7.equals((java.lang.Object) complex12);
        org.apache.commons.math.complex.Complex complex17 = complex12.asin();
        org.apache.commons.math.complex.Complex complex18 = complex2.add(complex12);
        org.apache.commons.math.complex.Complex complex20 = complex12.pow((double) 10L);
        org.apache.commons.math.complex.Complex complex22 = complex12.add((double) (-1.0f));
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (byte) -1);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex15 = complex12.sinh();
        boolean boolean16 = complex7.equals((java.lang.Object) complex12);
        org.apache.commons.math.complex.Complex complex17 = complex12.asin();
        org.apache.commons.math.complex.Complex complex18 = complex2.add(complex12);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex23.pow((double) 10);
        boolean boolean26 = complex23.isInfinite();
        org.apache.commons.math.complex.Complex complex27 = complex23.asin();
        org.apache.commons.math.complex.Complex complex28 = complex27.conjugate();
        org.apache.commons.math.complex.ComplexField complexField29 = complex28.getField();
        org.apache.commons.math.complex.Complex complex30 = complex18.pow(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex30.acos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexField29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex10 = complex6.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex11 = complex10.asin();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10);
        org.apache.commons.math.complex.Complex complex14 = complex1.subtract(complex11);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex14.subtract(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex14.acos();
        org.apache.commons.math.complex.Complex complex21 = complex19.subtract((double) 10);
        boolean boolean22 = complex19.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        java.lang.Object obj19 = complex14.readResolve();
        org.apache.commons.math.complex.Complex complex20 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean24 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex25 = complex21.pow(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex23.tan();
        org.apache.commons.math.complex.Complex complex27 = complex26.cos();
        org.apache.commons.math.complex.Complex complex28 = complex20.subtract(complex26);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex29.atan();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex36 = complex34.divide(0.0d);
        org.apache.commons.math.complex.Complex complex37 = complex36.cosh();
        org.apache.commons.math.complex.Complex complex38 = complex29.multiply(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex38.acos();
        org.apache.commons.math.complex.Complex complex40 = complex38.asin();
        boolean boolean41 = complex26.equals((java.lang.Object) complex40);
        boolean boolean42 = complex26.isInfinite();
        org.apache.commons.math.complex.Complex complex43 = complex26.tan();
        org.apache.commons.math.complex.ComplexField complexField44 = complex26.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complexField44);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(100.4987562112089d, (double) 10.0f);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((-0.5063656411097588d), (double) (byte) 1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex9 = complex4.negate();
        org.apache.commons.math.complex.ComplexField complexField10 = complex4.getField();
        java.lang.Class<?> wildcardClass11 = complex4.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        boolean boolean5 = complex3.isInfinite();
        java.lang.Class<?> wildcardClass6 = complex3.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex12 = complex9.divide(100.0d);
        org.apache.commons.math.complex.Complex complex13 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = complex9.sin();
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        boolean boolean16 = complex14.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex10 = complex8.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex11 = complex8.negate();
        org.apache.commons.math.complex.Complex complex12 = complex4.divide(complex11);
        java.lang.String str13 = complex11.toString();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex21 = complex19.divide(0.0d);
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex14.multiply(complex22);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex28 = complex26.divide(0.0d);
        org.apache.commons.math.complex.Complex complex30 = complex28.pow((double) 10);
        boolean boolean31 = complex28.isInfinite();
        org.apache.commons.math.complex.Complex complex32 = complex28.asin();
        org.apache.commons.math.complex.Complex complex33 = complex22.subtract(complex32);
        org.apache.commons.math.complex.ComplexField complexField34 = complex32.getField();
        org.apache.commons.math.complex.Complex complex35 = complex32.sqrt();
        org.apache.commons.math.complex.Complex complex36 = complex11.add(complex35);
        java.lang.Class<?> wildcardClass37 = complex35.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(NaN, NaN)" + "'", str13, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complexField34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex6 = complex4.add(0.0d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex4 = complex1.tan();
        org.apache.commons.math.complex.Complex complex5 = complex4.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex5.tan();
        boolean boolean9 = complex5.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(52.0d, 0.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 0);
        org.apache.commons.math.complex.Complex complex2 = complex1.cos();
        boolean boolean3 = complex1.isInfinite();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 10);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex10.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex15 = complex11.subtract((double) 0);
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt();
        org.apache.commons.math.complex.Complex complex17 = complex15.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        double double6 = complex5.abs();
        org.apache.commons.math.complex.Complex complex7 = complex0.add(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex9.sqrt();
        java.lang.Object obj13 = complex12.readResolve();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "(0.0, 0.0)");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.tan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex10 = complex6.pow(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex10.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex4.divide(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex14.createComplex((double) (-1.0f), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex21 = complex19.subtract((-0.0d));
        org.apache.commons.math.complex.Complex complex24 = complex19.createComplex(97.00515450222221d, (double) 10L);
        org.apache.commons.math.complex.Complex complex25 = complex19.cos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        double double5 = complex4.abs();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math.complex.Complex complex8 = complex7.log();
        java.lang.Class<?> wildcardClass9 = complex7.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        double double2 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex3 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex8 = complex6.divide(0.0d);
        double double9 = complex8.abs();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.acos();
        org.apache.commons.math.complex.Complex complex12 = complex3.add(complex11);
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) 'a');
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexList14);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((-0.5063656411097588d));
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.sinh();
        boolean boolean13 = complex4.equals((java.lang.Object) complex9);
        boolean boolean14 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex9.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.tanh();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex15 = complex12.sinh();
        boolean boolean16 = complex7.equals((java.lang.Object) complex12);
        org.apache.commons.math.complex.Complex complex17 = complex12.asin();
        org.apache.commons.math.complex.Complex complex18 = complex2.add(complex12);
        org.apache.commons.math.complex.Complex complex20 = complex12.pow((double) 10L);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((double) '#');
        org.apache.commons.math.complex.Complex complex24 = complex22.subtract((double) 100.0f);
        java.lang.Object obj25 = complex22.readResolve();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "(NaN, NaN)");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        double double10 = complex9.getReal();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.ComplexField complexField13 = complex11.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexField13);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1, (double) 1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) 10.0f);
        org.apache.commons.math.complex.Complex complex11 = complex8.log();
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = complex12.cos();
        org.apache.commons.math.complex.Complex complex14 = complex12.negate();
        java.lang.Class<?> wildcardClass15 = complex12.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(10.0d, (double) 100);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        java.lang.Class<?> wildcardClass2 = complex1.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        double double12 = complex9.abs();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        double double5 = complex4.abs();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex6.negate();
        org.apache.commons.math.complex.Complex complex9 = complex6.sinh();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(100.4987562112089d, (double) 10.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 0, (double) 100.0f);
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.junit.Assert.assertNotNull(complexField3);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex7.pow(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.cos();
        org.apache.commons.math.complex.Complex complex16 = complex13.divide(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex6.divide(complex14);
        boolean boolean18 = complex14.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        org.apache.commons.math.complex.Complex complex19 = complex8.subtract(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex18.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex23 = complex21.pow(10.0d);
        double double24 = complex23.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        double double4 = complex3.getArgument();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex5.isNaN();
        org.apache.commons.math.complex.Complex complex7 = complex3.pow(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex7.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex10 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10L);
        double double14 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex2.divide(complex11);
        org.apache.commons.math.complex.Complex complex16 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex2.exp();
        boolean boolean18 = complex2.isNaN();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(100.54784733847407d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.ComplexField complexField5 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        double double10 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean12 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex13 = complex9.pow(complex11);
        org.apache.commons.math.complex.Complex complex15 = complex13.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex17 = complex13.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex18 = complex17.asin();
        org.apache.commons.math.complex.Complex complex20 = complex18.pow((double) 10);
        org.apache.commons.math.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex25 = complex21.subtract(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex21.acos();
        org.apache.commons.math.complex.Complex complex29 = complex26.createComplex(0.0d, (double) (byte) 100);
        java.lang.Object obj30 = null;
        boolean boolean31 = complex26.equals(obj30);
        org.apache.commons.math.complex.Complex complex32 = complex2.divide(complex26);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 10L, Double.NaN);
        org.apache.commons.math.complex.Complex complex4 = complex2.pow((double) 100);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        double double13 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean15 = complex14.isNaN();
        org.apache.commons.math.complex.Complex complex16 = complex12.pow(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex16.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex19 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex20 = complex16.atan();
        org.apache.commons.math.complex.Complex complex23 = complex20.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex26 = complex11.multiply(complex25);
        boolean boolean27 = complex26.isInfinite();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        double double29 = complex28.getArgument();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean31 = complex30.isNaN();
        org.apache.commons.math.complex.Complex complex32 = complex28.pow(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex28.add((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex36 = complex28.multiply(97.0d);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        org.apache.commons.math.complex.Complex complex39 = complex28.multiply(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex26.subtract(complex28);
        org.apache.commons.math.complex.Complex complex41 = complex40.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 0);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 100);
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex6 = complex4.divide(0.0d);
        double double7 = complex6.abs();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex8.negate();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        double double12 = complex11.getArgument();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex11.pow(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex15.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex19 = complex17.pow((double) 10L);
        org.apache.commons.math.complex.Complex complex20 = complex10.subtract(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        double double24 = complex23.getArgument();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean26 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex27 = complex23.pow(complex25);
        org.apache.commons.math.complex.Complex complex29 = complex27.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex30 = complex21.divide(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex30.conjugate();
        org.apache.commons.math.complex.Complex complex32 = complex31.cos();
        org.apache.commons.math.complex.Complex complex33 = complex31.conjugate();
        org.apache.commons.math.complex.Complex complex34 = complex10.divide(complex33);
        org.apache.commons.math.complex.ComplexField complexField35 = complex33.getField();
        boolean boolean36 = complex1.equals((java.lang.Object) complexField35);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complexField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 100);
        org.apache.commons.math.complex.Complex complex6 = complex1.createComplex((-1.0d), (double) 0.0f);
        org.apache.commons.math.complex.Complex complex7 = complex1.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        double double5 = complex4.abs();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex6.tan();
        org.apache.commons.math.complex.Complex complex9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex10 = complex8.pow(complex9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 'a', (double) '#');
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt1z();
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        double double5 = complex4.getArgument();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex8 = complex4.pow(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex8.atan();
        org.apache.commons.math.complex.Complex complex15 = complex12.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex18 = complex3.pow(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex17.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.exp();
        org.apache.commons.math.complex.Complex complex21 = complex19.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList23 = complex19.nthRoot((int) (byte) 10);
        org.apache.commons.math.complex.Complex complex24 = complex19.sqrt();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complexList23);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex16.pow((double) 10L);
        double double19 = complex16.getImaginary();
        org.apache.commons.math.complex.Complex complex20 = complex7.divide(complex16);
        org.apache.commons.math.complex.Complex complex21 = complex4.subtract(complex16);
        double double22 = complex16.getReal();
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) ' ');
        double double25 = complex24.getReal();
        boolean boolean26 = complex16.equals((java.lang.Object) double25);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 32.0d + "'", double25 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        boolean boolean5 = complex4.isInfinite();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.asin();
        org.apache.commons.math.complex.Complex complex12 = complex9.cos();
        double double13 = complex12.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-2.566370614359173d), 10.000249990625546d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.ComplexField complexField11 = complex9.getField();
        org.apache.commons.math.complex.Complex complex12 = complex9.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.exp();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) (-1));
        double double7 = complex4.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex15 = complex12.sinh();
        boolean boolean16 = complex7.equals((java.lang.Object) complex12);
        org.apache.commons.math.complex.Complex complex17 = complex12.asin();
        org.apache.commons.math.complex.Complex complex18 = complex2.add(complex12);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex23.pow((double) 10);
        boolean boolean26 = complex23.isInfinite();
        org.apache.commons.math.complex.Complex complex27 = complex23.asin();
        org.apache.commons.math.complex.Complex complex28 = complex27.conjugate();
        org.apache.commons.math.complex.ComplexField complexField29 = complex28.getField();
        org.apache.commons.math.complex.Complex complex30 = complex18.pow(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex28.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexField29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100L);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex10.divide(0.0d);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 10);
        org.apache.commons.math.complex.Complex complex16 = complex14.add(1.0d);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField18 = complex17.getField();
        org.apache.commons.math.complex.Complex complex19 = complex14.multiply(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex19.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex22 = complex19.sin();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        double double24 = complex23.getArgument();
        org.apache.commons.math.complex.Complex complex26 = complex23.divide((double) 10.0f);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex31 = complex29.divide(0.0d);
        org.apache.commons.math.complex.Complex complex33 = complex31.pow((double) 10);
        org.apache.commons.math.complex.Complex complex35 = complex33.add(1.0d);
        org.apache.commons.math.complex.Complex complex36 = complex35.acos();
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) 100);
        boolean boolean39 = complex23.equals((java.lang.Object) 100);
        org.apache.commons.math.complex.Complex complex40 = complex23.acos();
        org.apache.commons.math.complex.Complex complex41 = complex22.divide(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex4.divide(complex41);
        double double43 = complex42.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.0d, (double) ' ');
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.ComplexField complexField11 = complex9.getField();
        org.apache.commons.math.complex.Complex complex12 = complex9.exp();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex19 = complex17.pow((double) 10);
        org.apache.commons.math.complex.Complex complex21 = complex19.add(1.0d);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField23 = complex22.getField();
        org.apache.commons.math.complex.Complex complex24 = complex19.multiply(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex24.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex31 = complex29.divide(0.0d);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        double double33 = complex32.getArgument();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean35 = complex34.isNaN();
        org.apache.commons.math.complex.Complex complex36 = complex32.pow(complex34);
        org.apache.commons.math.complex.Complex complex38 = complex36.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex39 = complex36.sinh();
        boolean boolean40 = complex31.equals((java.lang.Object) complex36);
        org.apache.commons.math.complex.Complex complex41 = complex26.multiply(complex36);
        boolean boolean42 = complex9.equals((java.lang.Object) complex36);
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        double double44 = complex43.getArgument();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean46 = complex45.isNaN();
        org.apache.commons.math.complex.Complex complex47 = complex43.pow(complex45);
        org.apache.commons.math.complex.Complex complex49 = complex47.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex50 = complex47.sinh();
        org.apache.commons.math.complex.Complex complex51 = complex47.atan();
        org.apache.commons.math.complex.Complex complex52 = complex51.tanh();
        org.apache.commons.math.complex.Complex complex53 = complex52.atan();
        org.apache.commons.math.complex.Complex complex55 = complex52.divide((double) 10);
        org.apache.commons.math.complex.Complex complex56 = complex36.add(complex52);
        double double57 = complex36.abs();
        double double58 = complex36.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexField23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex7 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract(Double.NaN);
        java.lang.String str11 = complex10.toString();
        org.apache.commons.math.complex.Complex complex13 = complex10.subtract((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex15 = complex10.pow(1.0001848485814697d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(NaN, NaN)" + "'", str11, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) 1.0f);
        double double8 = complex7.getImaginary();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.96419413859206d + "'", double8 == 6.96419413859206d);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.ComplexField complexField7 = complex4.getField();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex14.tanh();
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex4.divide(complex14);
        double double19 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex21 = complex14.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex14.multiply(1.5707963267948966d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex3 = complex0.divide((double) 10.0f);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex8 = complex6.divide(0.0d);
        org.apache.commons.math.complex.Complex complex10 = complex8.pow((double) 10);
        org.apache.commons.math.complex.Complex complex12 = complex10.add(1.0d);
        org.apache.commons.math.complex.Complex complex13 = complex12.acos();
        org.apache.commons.math.complex.Complex complex15 = complex13.add((double) 100);
        boolean boolean16 = complex0.equals((java.lang.Object) 100);
        org.apache.commons.math.complex.Complex complex17 = complex0.acos();
        org.apache.commons.math.complex.Complex complex19 = complex17.multiply(141.4213562373095d);
        org.apache.commons.math.complex.Complex complex20 = complex17.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        double double10 = complex9.getReal();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        java.lang.Object obj13 = complex12.readResolve();
        org.apache.commons.math.complex.Complex complex15 = complex12.subtract((-0.019228399099707208d));
        org.apache.commons.math.complex.Complex complex16 = complex12.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10.0f);
        double double2 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex4 = complex1.add((double) (byte) -1);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.tan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex10 = complex6.pow(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex10.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex4.divide(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex14.createComplex((double) (-1.0f), (double) (byte) 1);
        org.apache.commons.math.complex.ComplexField complexField20 = complex14.getField();
        double double21 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex22 = complex14.acos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList24 = complex22.nthRoot((int) (byte) 10);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complexField20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexList24);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex0.add((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex8 = complex0.multiply(97.0d);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        org.apache.commons.math.complex.Complex complex11 = complex0.multiply(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex16 = complex0.pow(complex15);
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex19.pow(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex23.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex27 = complex23.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex28 = complex27.asin();
        org.apache.commons.math.complex.Complex complex30 = complex28.pow((double) 10);
        org.apache.commons.math.complex.Complex complex32 = complex30.divide((double) (short) -1);
        org.apache.commons.math.complex.Complex complex33 = complex18.divide(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex30.sqrt();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        double double38 = complex37.getArgument();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean40 = complex39.isNaN();
        org.apache.commons.math.complex.Complex complex41 = complex37.pow(complex39);
        org.apache.commons.math.complex.Complex complex43 = complex41.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex44 = complex35.divide(complex43);
        org.apache.commons.math.complex.Complex complex45 = complex43.sin();
        org.apache.commons.math.complex.Complex complex46 = complex45.conjugate();
        org.apache.commons.math.complex.Complex complex47 = complex34.add(complex45);
        java.lang.String str48 = complex47.toString();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex52 = complex50.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex54 = complex50.divide((double) (short) 100);
        org.apache.commons.math.complex.Complex complex55 = complex47.divide(complex54);
        org.apache.commons.math.complex.Complex complex56 = complex0.divide(complex47);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexField13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(NaN, NaN)" + "'", str48, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex3 = complex0.subtract((-0.0d));
        org.apache.commons.math.complex.Complex complex5 = complex0.multiply((double) (byte) -1);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex4 = complex1.exp();
        org.apache.commons.math.complex.Complex complex5 = complex1.sqrt1z();
        java.lang.Class<?> wildcardClass6 = complex1.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) 10.0f);
        org.apache.commons.math.complex.Complex complex11 = complex10.negate();
        org.apache.commons.math.complex.Complex complex12 = complex11.log();
        double double13 = complex12.getReal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex9.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        double double5 = complex4.abs();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math.complex.Complex complex8 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex10.divide(32.0d);
        double double13 = complex10.abs();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        double double7 = complex5.abs();
        org.apache.commons.math.complex.ComplexField complexField8 = complex5.getField();
        java.lang.Class<?> wildcardClass9 = complexField8.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complexField8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex4 = complex1.tan();
        org.apache.commons.math.complex.Complex complex5 = complex4.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex14 = complex11.acos();
        org.apache.commons.math.complex.Complex complex15 = complex14.asin();
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.asin();
        org.apache.commons.math.complex.Complex complex18 = complex16.tanh();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex10 = complex6.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex11 = complex10.asin();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10);
        org.apache.commons.math.complex.Complex complex14 = complex1.subtract(complex11);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex14.subtract(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex14.acos();
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex(0.0d, (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex19.multiply((double) (short) 10);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 100, (double) 1.0f);
        double double3 = complex2.getImaginary();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.tan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex10 = complex6.pow(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex10.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex4.divide(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex14.createComplex((double) (-1.0f), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex19.conjugate();
        double double21 = complex19.getReal();
        org.apache.commons.math.complex.Complex complex22 = complex19.exp();
        org.apache.commons.math.complex.Complex complex23 = complex22.tan();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex5 = complex0.acos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex10 = complex6.pow(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex10.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex10.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.exp();
        org.apache.commons.math.complex.Complex complex19 = complex5.subtract(complex18);
        boolean boolean20 = complex19.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complexField2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complexField17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        double double10 = complex9.getReal();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex11.negate();
        double double13 = complex12.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        double double11 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex8.asin();
        org.apache.commons.math.complex.Complex complex14 = complex8.multiply(100.4987562112089d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        java.lang.Object obj19 = complex14.readResolve();
        org.apache.commons.math.complex.Complex complex20 = complex8.divide(complex14);
        java.lang.Object obj21 = complex14.readResolve();
        org.apache.commons.math.complex.ComplexField complexField22 = complex14.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complexField22);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(Double.POSITIVE_INFINITY, (double) 0);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex16.divide(0.0d);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex19.pow(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex26 = complex23.sinh();
        boolean boolean27 = complex18.equals((java.lang.Object) complex23);
        org.apache.commons.math.complex.Complex complex28 = complex13.multiply(complex23);
        org.apache.commons.math.complex.Complex complex29 = complex23.conjugate();
        double double30 = complex29.abs();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex6 = complex4.pow(1.0d);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex10.divide(0.0d);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 10);
        org.apache.commons.math.complex.Complex complex16 = complex14.add(1.0d);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField18 = complex17.getField();
        org.apache.commons.math.complex.Complex complex19 = complex14.multiply(complex17);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex24 = complex22.divide(0.0d);
        org.apache.commons.math.complex.Complex complex26 = complex24.pow((double) 10);
        org.apache.commons.math.complex.Complex complex28 = complex26.add(1.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList30 = complex28.nthRoot(10);
        org.apache.commons.math.complex.Complex complex31 = complex17.multiply(complex28);
        org.apache.commons.math.complex.Complex complex32 = complex4.add(complex31);
        boolean boolean33 = complex32.isInfinite();
        boolean boolean34 = complex32.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexList30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        boolean boolean8 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex10 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex(100.0d, 1.0d);
        boolean boolean14 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex13.multiply((double) 10L);
        org.apache.commons.math.complex.Complex complex17 = complex10.divide(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex17.add((double) (-1L));
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        double double21 = complex20.getArgument();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean23 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex24 = complex20.pow(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex24.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex28 = complex24.add((double) 10.0f);
        double double29 = complex28.getImaginary();
        org.apache.commons.math.complex.Complex complex30 = complex17.multiply(complex28);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList32 = complex17.nthRoot((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(complex30);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex14 = complex11.acos();
        org.apache.commons.math.complex.Complex complex15 = complex14.asin();
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.asin();
        java.lang.String str18 = complex17.toString();
        double double19 = complex17.getArgument();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(NaN, NaN)" + "'", str18, "(NaN, NaN)");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        java.lang.Object obj10 = complex9.readResolve();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "(NaN, NaN)");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(97.00515450222221d, (double) (short) -1);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex16 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex17 = complex11.add(complex12);
        double double18 = complex11.getReal();
        org.apache.commons.math.complex.Complex complex19 = complex11.tan();
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) 0L, (double) (-1.0f));
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexField13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(100.0d);
        org.apache.commons.math.complex.Complex complex11 = complex9.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex12 = complex4.divide(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField15 = complex14.getField();
        org.apache.commons.math.complex.Complex complex17 = complex14.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex18 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex12.multiply(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complexField15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex7 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        org.apache.commons.math.complex.ComplexField complexField9 = complex7.getField();
        org.apache.commons.math.complex.ComplexField complexField10 = complex7.getField();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complexField9);
        org.junit.Assert.assertNotNull(complexField10);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex10.multiply(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex19.acos();
        boolean boolean21 = complex9.equals((java.lang.Object) complex19);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex26 = complex24.divide(0.0d);
        double double27 = complex26.abs();
        org.apache.commons.math.complex.Complex complex28 = complex26.exp();
        org.apache.commons.math.complex.Complex complex29 = complex28.asin();
        org.apache.commons.math.complex.Complex complex30 = complex29.log();
        org.apache.commons.math.complex.Complex complex32 = complex30.subtract((double) (byte) -1);
        boolean boolean33 = complex30.isInfinite();
        org.apache.commons.math.complex.Complex complex34 = complex19.subtract(complex30);
        org.apache.commons.math.complex.Complex complex35 = complex19.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        double double2 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex3 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = complex0.sin();
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract((double) '4');
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(97.00515450222221d, 1.2679114584199251d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        double double5 = complex4.abs();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math.complex.Complex complex8 = complex7.log();
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex11 = complex8.conjugate();
        java.util.List<org.apache.commons.math.complex.Complex> complexList13 = complex11.nthRoot((int) (byte) 100);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (byte) 10, (double) ' ');
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex7.divide(0.0d);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 10);
        org.apache.commons.math.complex.Complex complex13 = complex11.add(1.0d);
        org.apache.commons.math.complex.Complex complex14 = complex13.acos();
        org.apache.commons.math.complex.Complex complex16 = complex14.add((double) 100);
        org.apache.commons.math.complex.Complex complex18 = complex16.pow((double) 10L);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        double double25 = complex24.getArgument();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean27 = complex26.isNaN();
        org.apache.commons.math.complex.Complex complex28 = complex24.pow(complex26);
        org.apache.commons.math.complex.Complex complex30 = complex28.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex31 = complex28.sinh();
        boolean boolean32 = complex23.equals((java.lang.Object) complex28);
        java.lang.Object obj33 = complex28.readResolve();
        org.apache.commons.math.complex.Complex complex34 = complex16.pow(complex28);
        org.apache.commons.math.complex.Complex complex36 = complex28.multiply((double) 10.0f);
        boolean boolean37 = complex2.equals((java.lang.Object) complex28);
        org.apache.commons.math.complex.ComplexField complexField38 = complex28.getField();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(complexField38);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex7 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex4.cos();
        java.lang.Object obj9 = null;
        boolean boolean10 = complex4.equals(obj9);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(100.0d);
        org.apache.commons.math.complex.Complex complex11 = complex9.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex12 = complex4.divide(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField15 = complex14.getField();
        org.apache.commons.math.complex.Complex complex17 = complex14.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex18 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex12.multiply(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex23 = complex20.createComplex((double) 1L, (double) 1);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complexField15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) 100);
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10L);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex16.divide(0.0d);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex19.pow(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex26 = complex23.sinh();
        boolean boolean27 = complex18.equals((java.lang.Object) complex23);
        java.lang.Object obj28 = complex23.readResolve();
        org.apache.commons.math.complex.Complex complex29 = complex11.pow(complex23);
        org.apache.commons.math.complex.Complex complex31 = complex23.multiply((double) 10.0f);
        org.apache.commons.math.complex.Complex complex32 = complex23.tan();
        org.apache.commons.math.complex.Complex complex33 = complex32.sqrt();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) -1, (double) '4');
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        java.lang.Object obj19 = complex14.readResolve();
        org.apache.commons.math.complex.Complex complex20 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex22 = complex20.divide((double) 100);
        org.apache.commons.math.complex.Complex complex24 = complex20.multiply(97.0d);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        double double28 = complex27.getArgument();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math.complex.Complex complex31 = complex27.pow(complex29);
        org.apache.commons.math.complex.Complex complex33 = complex31.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex34 = complex25.divide(complex33);
        org.apache.commons.math.complex.ComplexField complexField35 = complex34.getField();
        org.apache.commons.math.complex.Complex complex36 = complex34.sqrt1z();
        org.apache.commons.math.complex.Complex complex37 = complex24.divide(complex34);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex41 = complex39.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex42 = complex39.exp();
        org.apache.commons.math.complex.Complex complex43 = complex39.sqrt1z();
        org.apache.commons.math.complex.Complex complex44 = complex24.subtract(complex43);
        java.lang.String str45 = complex24.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complexField35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(NaN, NaN)" + "'", str45, "(NaN, NaN)");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math.complex.Complex complex4 = complex3.cosh();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) ' ');
        java.lang.String str7 = complex6.toString();
        org.apache.commons.math.complex.Complex complex8 = complex6.negate();
        org.apache.commons.math.complex.Complex complex9 = complex3.pow(complex8);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(32.0, 0.0)" + "'", str7, "(32.0, 0.0)");
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex7.cos();
        org.apache.commons.math.complex.Complex complex9 = complex7.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.0d, (double) 0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex10 = complex6.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex11 = complex10.asin();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10);
        org.apache.commons.math.complex.Complex complex15 = complex13.divide((double) (short) -1);
        org.apache.commons.math.complex.Complex complex16 = complex1.divide(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        double double21 = complex20.getArgument();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean23 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex24 = complex20.pow(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex24.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex27 = complex18.divide(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex26.sin();
        org.apache.commons.math.complex.Complex complex29 = complex28.conjugate();
        org.apache.commons.math.complex.Complex complex30 = complex17.add(complex28);
        java.lang.String str31 = complex30.toString();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex35 = complex33.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex37 = complex33.divide((double) (short) 100);
        org.apache.commons.math.complex.Complex complex38 = complex30.divide(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex37.asin();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(NaN, NaN)" + "'", str31, "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.asin();
        java.lang.Object obj12 = complex11.readResolve();
        org.apache.commons.math.complex.Complex complex15 = complex11.createComplex(97.00515450222221d, (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex19.pow(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex23.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex26 = complex25.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex29 = complex27.pow((double) 10L);
        double double30 = complex27.getImaginary();
        org.apache.commons.math.complex.Complex complex31 = complex18.divide(complex27);
        org.apache.commons.math.complex.Complex complex32 = complex31.tanh();
        org.apache.commons.math.complex.Complex complex33 = complex11.pow(complex32);
        double double34 = complex11.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (-1.0f), 1.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex3.tanh();
        boolean boolean5 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) -1);
        java.lang.Object obj9 = complex8.readResolve();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "(0.12871409795254593, -0.9166356057911226)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "(0.12871409795254593, -0.9166356057911226)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "(0.12871409795254593, -0.9166356057911226)");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex14 = complex11.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        double double16 = complex15.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex15.divide((double) 10.0f);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex23.pow((double) 10);
        org.apache.commons.math.complex.Complex complex27 = complex25.add(1.0d);
        org.apache.commons.math.complex.Complex complex28 = complex27.acos();
        org.apache.commons.math.complex.Complex complex30 = complex28.add((double) 100);
        boolean boolean31 = complex15.equals((java.lang.Object) 100);
        org.apache.commons.math.complex.Complex complex32 = complex15.acos();
        org.apache.commons.math.complex.Complex complex33 = complex14.divide(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex33.sqrt1z();
        boolean boolean35 = complex34.isInfinite();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) '#');
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex9 = complex7.atan();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        double double16 = complex15.getArgument();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean18 = complex17.isNaN();
        org.apache.commons.math.complex.Complex complex19 = complex15.pow(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex22 = complex19.sinh();
        boolean boolean23 = complex14.equals((java.lang.Object) complex19);
        org.apache.commons.math.complex.Complex complex24 = complex19.asin();
        org.apache.commons.math.complex.Complex complex25 = complex9.add(complex19);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex30 = complex28.divide(0.0d);
        org.apache.commons.math.complex.Complex complex32 = complex30.pow((double) 10);
        boolean boolean33 = complex30.isInfinite();
        org.apache.commons.math.complex.Complex complex34 = complex30.asin();
        org.apache.commons.math.complex.Complex complex35 = complex34.conjugate();
        org.apache.commons.math.complex.ComplexField complexField36 = complex35.getField();
        org.apache.commons.math.complex.Complex complex37 = complex25.pow(complex35);
        org.apache.commons.math.complex.Complex complex38 = complex25.exp();
        org.apache.commons.math.complex.Complex complex39 = complex6.pow(complex25);
        org.apache.commons.math.complex.Complex complex40 = complex6.asin();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex42 = complex41.cos();
        org.apache.commons.math.complex.Complex complex44 = complex42.divide((double) 100);
        org.apache.commons.math.complex.Complex complex45 = complex40.subtract(complex42);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complexField36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex0.add((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex8 = complex0.multiply(97.0d);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        org.apache.commons.math.complex.Complex complex11 = complex0.multiply(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex0.acos();
        double double13 = complex12.abs();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex16.divide(0.0d);
        org.apache.commons.math.complex.Complex complex20 = complex18.pow((double) 10);
        boolean boolean21 = complex18.isInfinite();
        org.apache.commons.math.complex.Complex complex22 = complex18.asin();
        boolean boolean23 = complex22.isInfinite();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex28 = complex26.divide(0.0d);
        org.apache.commons.math.complex.Complex complex30 = complex28.pow((double) 10);
        boolean boolean31 = complex28.isInfinite();
        org.apache.commons.math.complex.Complex complex32 = complex28.asin();
        org.apache.commons.math.complex.Complex complex34 = complex32.add(Double.NaN);
        double double35 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex36 = complex22.multiply(complex32);
        org.apache.commons.math.complex.Complex complex37 = complex12.divide(complex32);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.5707963267948966d + "'", double13 == 1.5707963267948966d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (-1), 32.0d);
        boolean boolean3 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex8 = complex6.divide(0.0d);
        org.apache.commons.math.complex.Complex complex10 = complex8.pow((double) 10);
        org.apache.commons.math.complex.Complex complex12 = complex10.add(1.0d);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField14 = complex13.getField();
        org.apache.commons.math.complex.Complex complex15 = complex10.multiply(complex13);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex20 = complex18.divide(0.0d);
        org.apache.commons.math.complex.Complex complex22 = complex20.pow((double) 10);
        org.apache.commons.math.complex.Complex complex24 = complex22.add(1.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList26 = complex24.nthRoot(10);
        org.apache.commons.math.complex.Complex complex27 = complex13.multiply(complex24);
        org.apache.commons.math.complex.Complex complex28 = complex2.add(complex13);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complexField14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complexList26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex15 = complex12.sinh();
        boolean boolean16 = complex7.equals((java.lang.Object) complex12);
        org.apache.commons.math.complex.Complex complex17 = complex12.asin();
        org.apache.commons.math.complex.Complex complex18 = complex2.add(complex12);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex23.pow((double) 10);
        boolean boolean26 = complex23.isInfinite();
        org.apache.commons.math.complex.Complex complex27 = complex23.asin();
        org.apache.commons.math.complex.Complex complex28 = complex27.conjugate();
        org.apache.commons.math.complex.ComplexField complexField29 = complex28.getField();
        org.apache.commons.math.complex.Complex complex30 = complex18.pow(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex18.sqrt1z();
        double double32 = complex31.getArgument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList34 = complex31.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexField29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.sinh();
        boolean boolean13 = complex4.equals((java.lang.Object) complex9);
        boolean boolean14 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex9.atan();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        double double21 = complex20.getArgument();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean23 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex24 = complex20.pow(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex24.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex27 = complex24.sinh();
        org.apache.commons.math.complex.Complex complex28 = complex24.atan();
        org.apache.commons.math.complex.Complex complex31 = complex28.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex33 = complex31.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex34 = complex19.pow(complex33);
        double double35 = complex34.getReal();
        org.apache.commons.math.complex.Complex complex36 = complex34.exp();
        org.apache.commons.math.complex.Complex complex37 = complex15.subtract(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex40 = complex15.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex41 = complex40.negate();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(141.4213562373095d, 97.00515450222221d);
        org.apache.commons.math.complex.Complex complex3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex4 = complex2.subtract(complex3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.sinh();
        boolean boolean13 = complex4.equals((java.lang.Object) complex9);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean17 = complex16.isNaN();
        org.apache.commons.math.complex.Complex complex18 = complex14.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex18.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex21 = complex18.sinh();
        org.apache.commons.math.complex.Complex complex22 = complex18.atan();
        org.apache.commons.math.complex.Complex complex23 = complex22.tanh();
        org.apache.commons.math.complex.Complex complex24 = complex9.pow(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex22.multiply((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList28 = complex26.nthRoot((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex4 = complex1.exp();
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply(10.000249990625546d);
        boolean boolean7 = complex6.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex9.sqrt1z();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex9.nthRoot((int) ' ');
        boolean boolean15 = complex9.isNaN();
        java.util.List<org.apache.commons.math.complex.Complex> complexList17 = complex9.nthRoot((int) (short) 10);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(complexList17);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex9 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        double double15 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean17 = complex16.isNaN();
        org.apache.commons.math.complex.Complex complex18 = complex14.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex18.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex21 = complex18.sinh();
        org.apache.commons.math.complex.Complex complex22 = complex18.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex28 = complex13.pow(complex27);
        org.apache.commons.math.complex.Complex complex29 = complex27.log();
        org.apache.commons.math.complex.Complex complex30 = complex29.sin();
        org.apache.commons.math.complex.Complex complex31 = complex30.conjugate();
        org.apache.commons.math.complex.Complex complex32 = complex6.divide(complex30);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        double double34 = complex33.getArgument();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean36 = complex35.isNaN();
        org.apache.commons.math.complex.Complex complex37 = complex33.pow(complex35);
        org.apache.commons.math.complex.Complex complex39 = complex33.add((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex41 = complex33.multiply(97.0d);
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        org.apache.commons.math.complex.Complex complex44 = complex33.multiply(complex43);
        org.apache.commons.math.complex.Complex complex45 = complex33.acos();
        double double46 = complex45.abs();
        org.apache.commons.math.complex.Complex complex47 = complex30.subtract(complex45);
        org.apache.commons.math.complex.Complex complex48 = complex30.conjugate();
        java.util.List<org.apache.commons.math.complex.Complex> complexList50 = complex30.nthRoot((int) '#');
        double double51 = complex30.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.5707963267948966d + "'", double46 == 1.5707963267948966d);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complexList50);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply((double) (-1));
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) 0.0f);
        double double9 = complex8.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex4.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 10);
        boolean boolean17 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex14.asin();
        java.lang.Object obj19 = complex14.readResolve();
        org.apache.commons.math.complex.Complex complex20 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean24 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex25 = complex21.pow(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex23.tan();
        org.apache.commons.math.complex.Complex complex27 = complex26.cos();
        org.apache.commons.math.complex.Complex complex28 = complex20.subtract(complex26);
        org.apache.commons.math.complex.Complex complex30 = complex28.add((double) (short) 0);
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math.complex.Complex complex32 = complex31.conjugate();
        org.apache.commons.math.complex.Complex complex33 = complex31.exp();
        org.apache.commons.math.complex.Complex complex34 = complex33.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) 100);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex16 = complex14.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex16.pow((double) 10);
        org.apache.commons.math.complex.Complex complex20 = complex18.add(1.0d);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField22 = complex21.getField();
        org.apache.commons.math.complex.Complex complex23 = complex18.multiply(complex21);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex28 = complex26.divide(0.0d);
        org.apache.commons.math.complex.Complex complex30 = complex28.pow((double) 10);
        org.apache.commons.math.complex.Complex complex32 = complex30.add(1.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList34 = complex32.nthRoot(10);
        org.apache.commons.math.complex.Complex complex35 = complex21.multiply(complex32);
        org.apache.commons.math.complex.Complex complex36 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex37 = complex36.cos();
        org.apache.commons.math.complex.Complex complex38 = complex11.pow(complex36);
        org.apache.commons.math.complex.Complex complex40 = complex36.add(0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complexField22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complexList34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex8.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) (short) 1);
        org.apache.commons.math.complex.Complex complex15 = complex12.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 100);
        org.apache.commons.math.complex.Complex complex6 = complex1.createComplex((-1.0d), (double) 0.0f);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex7.pow(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex14 = complex11.negate();
        org.apache.commons.math.complex.Complex complex15 = complex1.divide(complex11);
        java.lang.String str16 = complex11.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(NaN, NaN)" + "'", str16, "(NaN, NaN)");
    }
}

