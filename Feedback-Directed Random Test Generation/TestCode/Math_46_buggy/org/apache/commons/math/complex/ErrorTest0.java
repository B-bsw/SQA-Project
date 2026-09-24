package org.apache.commons.math.complex;

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
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex4.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = complex5.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(0.0d);
        boolean boolean10 = complex9.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex9", complex3.equals(complex9) ? complex3.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex4.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = complex5.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(0.0d);
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex9", complex3.equals(complex9) ? complex3.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.negate();
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) '#', (double) 0.0f);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex6 = complex3.divide(97.0d);
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        java.lang.Class<?> wildcardClass8 = complex6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex7", complex6.equals(complex7) ? complex6.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = complex0.log();
        org.apache.commons.math.complex.Complex complex3 = complex0.conjugate();
        double double4 = complex0.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.log();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
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
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex28.atan();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex35 = complex33.divide(0.0d);
        org.apache.commons.math.complex.Complex complex36 = complex35.cosh();
        org.apache.commons.math.complex.Complex complex37 = complex28.multiply(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex37.acos();
        org.apache.commons.math.complex.Complex complex39 = complex13.multiply(complex37);
        java.lang.String str40 = complex13.toString();
        org.apache.commons.math.complex.Complex complex41 = complex2.divide(complex13);
        org.apache.commons.math.complex.Complex complex42 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex44 = complex42.divide((double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex42", complex0.equals(complex42) ? complex0.hashCode() == complex42.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex4.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = complex5.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(0.0d);
        java.lang.Object obj10 = complex9.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex9", complex3.equals(complex9) ? complex3.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.negate();
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex2.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex10.multiply(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex0.pow(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex0.cos();
        org.apache.commons.math.complex.Complex complex22 = complex21.log();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 10, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex25.acos();
        org.apache.commons.math.complex.Complex complex27 = complex22.add(complex26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex22", complex0.equals(complex22) ? complex0.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) '#', (double) 0.0f);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex6 = complex3.divide(97.0d);
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex7", complex6.equals(complex7) ? complex6.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.negate();
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        java.lang.String str3 = complex1.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex5 = complex4.asin();
        org.apache.commons.math.complex.Complex complex6 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex7.pow(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply(10.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList15 = complex13.nthRoot(1);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) '#', (double) 0.0f);
        org.apache.commons.math.complex.Complex complex20 = complex13.add(complex19);
        boolean boolean21 = complex13.isInfinite();
        double double22 = complex13.getReal();
        org.apache.commons.math.complex.Complex complex23 = complex6.add(complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex4.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = complex5.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(0.0d);
        boolean boolean10 = complex7.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex9", complex3.equals(complex9) ? complex3.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = complex0.log();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) 10);
        boolean boolean10 = complex7.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex7.asin();
        org.apache.commons.math.complex.Complex complex12 = complex0.subtract(complex7);
        org.apache.commons.math.complex.Complex complex13 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.ComplexField complexField16 = complex14.getField();
        org.apache.commons.math.complex.Complex complex18 = complex14.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex21.tanh();
        boolean boolean25 = complex18.equals((java.lang.Object) complex24);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex30 = complex28.divide(0.0d);
        org.apache.commons.math.complex.Complex complex31 = complex28.sinh();
        org.apache.commons.math.complex.Complex complex32 = complex28.asin();
        boolean boolean33 = complex24.equals((java.lang.Object) complex28);
        java.lang.Object obj34 = complex28.readResolve();
        org.apache.commons.math.complex.Complex complex35 = complex0.divide(complex28);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex39 = complex36.createComplex((double) '#', (double) 0.0f);
        org.apache.commons.math.complex.ComplexField complexField40 = complex39.getField();
        org.apache.commons.math.complex.Complex complex42 = complex39.divide(97.0d);
        org.apache.commons.math.complex.Complex complex43 = complex42.conjugate();
        org.apache.commons.math.complex.Complex complex44 = complex0.pow(complex42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex42 and complex43", complex42.equals(complex43) ? complex42.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1L));
        org.apache.commons.math.complex.Complex complex8 = complex5.divide(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex7.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex8", complex7.equals(complex8) ? complex7.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.negate();
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = complex2.divide((double) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = complex0.log();
        org.apache.commons.math.complex.Complex complex3 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex0.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1L));
        org.apache.commons.math.complex.Complex complex8 = complex5.divide(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex8", complex7.equals(complex8) ? complex7.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex4.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = complex5.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(0.0d);
        double double10 = complex9.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex9", complex3.equals(complex9) ? complex3.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex3.pow((double) 100L);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex7.pow(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex14 = complex11.log();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex16.atan();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean24 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex25 = complex21.pow(complex23);
        org.apache.commons.math.complex.Complex complex27 = complex25.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex28 = complex19.divide(complex27);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex29.atan();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex36 = complex34.divide(0.0d);
        org.apache.commons.math.complex.Complex complex37 = complex36.cosh();
        org.apache.commons.math.complex.Complex complex38 = complex29.multiply(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex19.pow(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex16.pow(complex19);
        org.apache.commons.math.complex.Complex complex41 = complex15.subtract(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex6.pow(complex41);
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) 0L);
        org.apache.commons.math.complex.Complex complex45 = complex44.log();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex46.atan();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        double double49 = complex48.getArgument();
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean51 = complex50.isNaN();
        org.apache.commons.math.complex.Complex complex52 = complex48.pow(complex50);
        org.apache.commons.math.complex.Complex complex54 = complex52.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex55 = complex46.divide(complex54);
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex57 = complex56.atan();
        org.apache.commons.math.complex.Complex complex58 = complex56.atan();
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex63 = complex61.divide(0.0d);
        org.apache.commons.math.complex.Complex complex64 = complex63.cosh();
        org.apache.commons.math.complex.Complex complex65 = complex56.multiply(complex64);
        org.apache.commons.math.complex.Complex complex66 = complex46.pow(complex65);
        org.apache.commons.math.complex.Complex complex67 = complex46.cos();
        org.apache.commons.math.complex.Complex complex68 = org.apache.commons.math.complex.Complex.ZERO;
        double double69 = complex68.getArgument();
        org.apache.commons.math.complex.Complex complex70 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean71 = complex70.isNaN();
        org.apache.commons.math.complex.Complex complex72 = complex68.pow(complex70);
        org.apache.commons.math.complex.Complex complex74 = complex72.multiply(10.0d);
        double double75 = complex72.getImaginary();
        org.apache.commons.math.complex.Complex complex76 = complex72.sin();
        org.apache.commons.math.complex.Complex complex79 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex81 = complex79.divide(0.0d);
        org.apache.commons.math.complex.Complex complex83 = complex81.pow((double) 10);
        org.apache.commons.math.complex.Complex complex85 = complex83.add(1.0d);
        double double86 = complex83.getReal();
        org.apache.commons.math.complex.Complex complex87 = complex83.cos();
        org.apache.commons.math.complex.Complex complex88 = complex72.subtract(complex87);
        org.apache.commons.math.complex.Complex complex89 = complex72.sqrt();
        java.lang.Object obj90 = complex89.readResolve();
        org.apache.commons.math.complex.Complex complex91 = complex46.divide(complex89);
        boolean boolean92 = complex44.equals((java.lang.Object) complex89);
        org.apache.commons.math.complex.Complex complex93 = complex42.pow(complex89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex67", complex3.equals(complex67) ? complex3.hashCode() == complex67.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex10.multiply(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex0.pow(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex0.cos();
        org.apache.commons.math.complex.Complex complex22 = complex21.log();
        org.apache.commons.math.complex.Complex complex23 = complex21.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex22", complex0.equals(complex22) ? complex0.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) '#', (double) 0.0f);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex6 = complex3.divide(97.0d);
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex7.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex7", complex6.equals(complex7) ? complex6.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex5 = complex4.asin();
        org.apache.commons.math.complex.Complex complex6 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.4142135623730951d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex14 = complex11.sin();
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex17.divide((double) (-1));
        boolean boolean21 = complex17.isInfinite();
        org.apache.commons.math.complex.Complex complex23 = complex17.pow((double) 100);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex24.atan();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        double double30 = complex29.getArgument();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean32 = complex31.isNaN();
        org.apache.commons.math.complex.Complex complex33 = complex29.pow(complex31);
        org.apache.commons.math.complex.Complex complex35 = complex33.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex36 = complex27.divide(complex35);
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        org.apache.commons.math.complex.Complex complex39 = complex37.atan();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex44 = complex42.divide(0.0d);
        org.apache.commons.math.complex.Complex complex45 = complex44.cosh();
        org.apache.commons.math.complex.Complex complex46 = complex37.multiply(complex45);
        org.apache.commons.math.complex.Complex complex47 = complex27.pow(complex46);
        org.apache.commons.math.complex.Complex complex48 = complex24.pow(complex27);
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1, (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex52 = complex51.sinh();
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex54 = complex53.atan();
        org.apache.commons.math.complex.Complex complex55 = complex53.atan();
        double double56 = complex55.abs();
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField58 = complex57.getField();
        org.apache.commons.math.complex.Complex complex60 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex61 = complex57.pow(complex60);
        org.apache.commons.math.complex.Complex complex63 = complex61.add((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex64 = complex55.subtract(complex61);
        org.apache.commons.math.complex.Complex complex65 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField66 = complex65.getField();
        org.apache.commons.math.complex.Complex complex68 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex69 = complex65.pow(complex68);
        org.apache.commons.math.complex.Complex complex70 = complex64.divide(complex65);
        org.apache.commons.math.complex.Complex complex71 = complex52.subtract(complex65);
        org.apache.commons.math.complex.Complex complex72 = complex24.pow(complex65);
        org.apache.commons.math.complex.Complex complex73 = complex24.conjugate();
        org.apache.commons.math.complex.Complex complex74 = complex17.divide(complex73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex73", complex9.equals(complex73) ? complex9.hashCode() == complex73.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex4.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.ComplexField complexField9 = complex7.getField();
        org.apache.commons.math.complex.Complex complex11 = complex7.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex12 = complex7.exp();
        org.apache.commons.math.complex.Complex complex13 = complex7.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex4.multiply(complex7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex13", complex7.equals(complex13) ? complex7.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex10.multiply(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex0.pow(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex0.cos();
        org.apache.commons.math.complex.Complex complex22 = complex21.log();
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex22", complex0.equals(complex22) ? complex0.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex12 = complex3.divide(complex11);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex20 = complex18.divide(0.0d);
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math.complex.Complex complex22 = complex13.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex3.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex0.pow(complex3);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1, (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex27.sinh();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex29.atan();
        double double32 = complex31.abs();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField34 = complex33.getField();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex37 = complex33.pow(complex36);
        org.apache.commons.math.complex.Complex complex39 = complex37.add((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex40 = complex31.subtract(complex37);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField42 = complex41.getField();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex45 = complex41.pow(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex40.divide(complex41);
        org.apache.commons.math.complex.Complex complex47 = complex28.subtract(complex41);
        org.apache.commons.math.complex.Complex complex48 = complex0.pow(complex41);
        org.apache.commons.math.complex.Complex complex49 = complex0.conjugate();
        double double50 = complex49.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex49", complex0.equals(complex49) ? complex0.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) '#', (double) 0.0f);
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex9.negate();
        org.apache.commons.math.complex.Complex complex12 = complex5.pow(complex11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex5", complex3.equals(complex5) ? complex3.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex12 = complex3.divide(complex11);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex13.atan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex20 = complex18.divide(0.0d);
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math.complex.Complex complex22 = complex13.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex3.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex0.pow(complex3);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1, (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex27.sinh();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex29.atan();
        double double32 = complex31.abs();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField34 = complex33.getField();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex37 = complex33.pow(complex36);
        org.apache.commons.math.complex.Complex complex39 = complex37.add((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex40 = complex31.subtract(complex37);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField42 = complex41.getField();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex45 = complex41.pow(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex40.divide(complex41);
        org.apache.commons.math.complex.Complex complex47 = complex28.subtract(complex41);
        org.apache.commons.math.complex.Complex complex48 = complex0.pow(complex41);
        org.apache.commons.math.complex.Complex complex49 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex50 = complex0.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex49", complex0.equals(complex49) ? complex0.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        double double9 = complex6.getReal();
        org.apache.commons.math.complex.Complex complex10 = complex6.cos();
        org.apache.commons.math.complex.Complex complex11 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex11.negate();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.cos();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex15.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex22 = complex20.divide(0.0d);
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex15.multiply(complex23);
        java.util.List<org.apache.commons.math.complex.Complex> complexList26 = complex15.nthRoot((int) ' ');
        org.apache.commons.math.complex.Complex complex27 = complex15.acos();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1, (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex31 = complex30.sinh();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = complex32.atan();
        double double35 = complex34.abs();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField37 = complex36.getField();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex40 = complex36.pow(complex39);
        org.apache.commons.math.complex.Complex complex42 = complex40.add((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex43 = complex34.subtract(complex40);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField45 = complex44.getField();
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex48 = complex44.pow(complex47);
        org.apache.commons.math.complex.Complex complex49 = complex43.divide(complex44);
        org.apache.commons.math.complex.Complex complex50 = complex31.subtract(complex44);
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ZERO;
        double double52 = complex51.getArgument();
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean54 = complex53.isNaN();
        org.apache.commons.math.complex.Complex complex55 = complex51.pow(complex53);
        org.apache.commons.math.complex.Complex complex57 = complex55.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex58 = complex55.sinh();
        org.apache.commons.math.complex.Complex complex59 = complex55.atan();
        org.apache.commons.math.complex.Complex complex60 = complex59.tanh();
        org.apache.commons.math.complex.Complex complex62 = complex59.multiply((double) 10);
        double double63 = complex59.getArgument();
        org.apache.commons.math.complex.Complex complex64 = complex50.pow(complex59);
        org.apache.commons.math.complex.Complex complex66 = complex50.subtract((double) 1);
        org.apache.commons.math.complex.Complex complex67 = complex15.subtract(complex50);
        org.apache.commons.math.complex.Complex complex68 = complex12.multiply(complex67);
        org.apache.commons.math.complex.Complex complex70 = complex67.multiply((double) (short) 0);
        java.lang.String str71 = complex67.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex70", complex15.equals(complex70) ? complex15.hashCode() == complex70.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex6);
        double double10 = complex1.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex1.conjugate();
        double double12 = complex11.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex11", complex1.equals(complex11) ? complex1.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) '#');
        org.apache.commons.math.complex.Complex complex2 = complex1.cos();
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        double double4 = complex2.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex3.multiply(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex5", complex3.equals(complex5) ? complex3.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField5 = complex4.getField();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex4.pow(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex8.add((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex11 = complex2.subtract(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((-0.5634789001053149d));
        org.apache.commons.math.complex.ComplexField complexField15 = complex14.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex14", complex7.equals(complex14) ? complex7.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        double double9 = complex6.getReal();
        org.apache.commons.math.complex.Complex complex10 = complex6.cos();
        org.apache.commons.math.complex.Complex complex11 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex11.negate();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.cos();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex15.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex22 = complex20.divide(0.0d);
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex15.multiply(complex23);
        java.util.List<org.apache.commons.math.complex.Complex> complexList26 = complex15.nthRoot((int) ' ');
        org.apache.commons.math.complex.Complex complex27 = complex15.acos();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1, (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex31 = complex30.sinh();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = complex32.atan();
        double double35 = complex34.abs();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField37 = complex36.getField();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex40 = complex36.pow(complex39);
        org.apache.commons.math.complex.Complex complex42 = complex40.add((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex43 = complex34.subtract(complex40);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField45 = complex44.getField();
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex48 = complex44.pow(complex47);
        org.apache.commons.math.complex.Complex complex49 = complex43.divide(complex44);
        org.apache.commons.math.complex.Complex complex50 = complex31.subtract(complex44);
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ZERO;
        double double52 = complex51.getArgument();
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean54 = complex53.isNaN();
        org.apache.commons.math.complex.Complex complex55 = complex51.pow(complex53);
        org.apache.commons.math.complex.Complex complex57 = complex55.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex58 = complex55.sinh();
        org.apache.commons.math.complex.Complex complex59 = complex55.atan();
        org.apache.commons.math.complex.Complex complex60 = complex59.tanh();
        org.apache.commons.math.complex.Complex complex62 = complex59.multiply((double) 10);
        double double63 = complex59.getArgument();
        org.apache.commons.math.complex.Complex complex64 = complex50.pow(complex59);
        org.apache.commons.math.complex.Complex complex66 = complex50.subtract((double) 1);
        org.apache.commons.math.complex.Complex complex67 = complex15.subtract(complex50);
        org.apache.commons.math.complex.Complex complex68 = complex12.multiply(complex67);
        org.apache.commons.math.complex.Complex complex70 = complex67.multiply((double) (short) 0);
        java.lang.Object obj71 = complex70.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex70", complex15.equals(complex70) ? complex15.hashCode() == complex70.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        java.lang.String str2 = complex0.toString();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) '#', (double) 0.0f);
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex4.divide((double) 1.0f);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex15 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex12.sin();
        org.apache.commons.math.complex.Complex complex17 = complex16.asin();
        org.apache.commons.math.complex.Complex complex18 = complex16.sin();
        org.apache.commons.math.complex.Complex complex19 = complex7.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex7.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = complex21.log();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex28 = complex26.divide(0.0d);
        org.apache.commons.math.complex.Complex complex30 = complex28.pow((double) 10);
        boolean boolean31 = complex28.isInfinite();
        org.apache.commons.math.complex.Complex complex32 = complex28.asin();
        org.apache.commons.math.complex.Complex complex33 = complex21.subtract(complex28);
        org.apache.commons.math.complex.Complex complex34 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.ComplexField complexField37 = complex35.getField();
        org.apache.commons.math.complex.Complex complex39 = complex35.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex44 = complex42.divide(0.0d);
        org.apache.commons.math.complex.Complex complex45 = complex42.tanh();
        boolean boolean46 = complex39.equals((java.lang.Object) complex45);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex51 = complex49.divide(0.0d);
        org.apache.commons.math.complex.Complex complex52 = complex49.sinh();
        org.apache.commons.math.complex.Complex complex53 = complex49.asin();
        boolean boolean54 = complex45.equals((java.lang.Object) complex49);
        java.lang.Object obj55 = complex49.readResolve();
        org.apache.commons.math.complex.Complex complex56 = complex21.divide(complex49);
        org.apache.commons.math.complex.Complex complex57 = complex21.sinh();
        org.apache.commons.math.complex.Complex complex58 = complex21.asin();
        boolean boolean59 = complex7.equals((java.lang.Object) complex58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex58", complex8.equals(complex58) ? complex8.hashCode() == complex58.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(0.0d);
        org.apache.commons.math.complex.Complex complex2 = complex1.log();
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (short) 100, (double) '4');
        org.apache.commons.math.complex.Complex complex6 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex6.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex6", complex2.equals(complex6) ? complex2.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) '4');
        double double11 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex12.atan();
        double double15 = complex14.abs();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField17 = complex16.getField();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex16.pow(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex20.add((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex23 = complex14.subtract(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex8.add(complex14);
        org.apache.commons.math.complex.Complex complex25 = complex14.cos();
        double double26 = complex25.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex25", complex19.equals(complex25) ? complex19.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        java.lang.String str2 = complex0.toString();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        double double4 = complex0.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField5 = complex4.getField();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex4.pow(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex8.add((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex11 = complex2.subtract(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((-0.5634789001053149d));
        java.util.List<org.apache.commons.math.complex.Complex> complexList16 = complex14.nthRoot(100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex14", complex7.equals(complex14) ? complex7.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex4.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = complex5.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(0.0d);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) '#', (double) 0.0f);
        org.apache.commons.math.complex.ComplexField complexField14 = complex13.getField();
        org.apache.commons.math.complex.Complex complex16 = complex13.multiply((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex18 = complex13.multiply((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex19 = complex9.pow(complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex9", complex3.equals(complex9) ? complex3.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        java.lang.String str2 = complex0.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.add(1.0d);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = complex9.multiply(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex14.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex17 = complex14.sin();
        org.apache.commons.math.complex.Complex complex20 = complex14.createComplex(3.650603079495543E-137d, 0.0d);
        boolean boolean21 = complex0.equals((java.lang.Object) 0.0d);
        org.apache.commons.math.complex.Complex complex22 = complex0.cos();
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex23", complex0.equals(complex23) ? complex0.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex5 = complex0.exp();
        org.apache.commons.math.complex.Complex complex6 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.add(3.650603079495543E-137d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        org.apache.commons.math.complex.Complex complex6 = complex3.subtract((-1.5707963267948966d));
        org.apache.commons.math.complex.Complex complex7 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean11 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex8.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex12.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex15 = complex12.sinh();
        double double16 = complex12.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex12.cos();
        org.apache.commons.math.complex.Complex complex18 = complex12.atan();
        org.apache.commons.math.complex.Complex complex19 = complex18.acos();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex20.acos();
        org.apache.commons.math.complex.Complex complex22 = complex20.acos();
        boolean boolean23 = complex3.equals((java.lang.Object) complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex7", complex3.equals(complex7) ? complex3.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex14 = complex11.sin();
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField19 = complex18.getField();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = complex18.pow(complex21);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex24 = complex22.add(complex23);
        boolean boolean25 = complex14.equals((java.lang.Object) complex23);
        org.apache.commons.math.complex.Complex complex26 = complex23.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex32 = complex30.divide(0.0d);
        org.apache.commons.math.complex.Complex complex34 = complex32.pow((double) 10);
        org.apache.commons.math.complex.Complex complex36 = complex34.add(1.0d);
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField38 = complex37.getField();
        org.apache.commons.math.complex.Complex complex39 = complex34.multiply(complex37);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex44 = complex42.divide(0.0d);
        org.apache.commons.math.complex.Complex complex46 = complex44.pow((double) 10);
        org.apache.commons.math.complex.Complex complex48 = complex46.add(1.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList50 = complex48.nthRoot(10);
        org.apache.commons.math.complex.Complex complex51 = complex37.multiply(complex48);
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex53 = complex52.atan();
        org.apache.commons.math.complex.Complex complex54 = complex52.atan();
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex59 = complex57.divide(0.0d);
        org.apache.commons.math.complex.Complex complex60 = complex59.cosh();
        org.apache.commons.math.complex.Complex complex61 = complex52.multiply(complex60);
        org.apache.commons.math.complex.Complex complex62 = complex61.acos();
        org.apache.commons.math.complex.Complex complex63 = complex37.multiply(complex61);
        java.lang.String str64 = complex37.toString();
        org.apache.commons.math.complex.Complex complex65 = complex37.cos();
        boolean boolean66 = complex37.isNaN();
        org.apache.commons.math.complex.Complex complex68 = complex37.subtract(1.2796499552761733d);
        org.apache.commons.math.complex.Complex complex69 = complex27.divide(complex37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex65", complex21.equals(complex65) ? complex21.hashCode() == complex65.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex6 = complex4.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 10);
        org.apache.commons.math.complex.Complex complex10 = complex8.add(1.0d);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField12 = complex11.getField();
        org.apache.commons.math.complex.Complex complex13 = complex8.multiply(complex11);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex21 = complex19.divide(0.0d);
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex14.multiply(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.acos();
        org.apache.commons.math.complex.ComplexField complexField25 = complex23.getField();
        org.apache.commons.math.complex.Complex complex26 = complex13.divide(complex23);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex27.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cos();
        org.apache.commons.math.complex.Complex complex32 = complex30.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex33 = complex13.divide(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex1.multiply(complex30);
        org.apache.commons.math.complex.Complex complex35 = complex30.sin();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1, (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex39 = complex38.sinh();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex40.atan();
        double double43 = complex42.abs();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField45 = complex44.getField();
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex48 = complex44.pow(complex47);
        org.apache.commons.math.complex.Complex complex50 = complex48.add((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex51 = complex42.subtract(complex48);
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField53 = complex52.getField();
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex56 = complex52.pow(complex55);
        org.apache.commons.math.complex.Complex complex57 = complex51.divide(complex52);
        org.apache.commons.math.complex.Complex complex58 = complex39.subtract(complex52);
        org.apache.commons.math.complex.Complex complex59 = complex35.subtract(complex52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex47", complex30.equals(complex47) ? complex30.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex6);
        double double10 = complex1.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex1.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex11", complex1.equals(complex11) ? complex1.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = complex0.log();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) 10);
        boolean boolean10 = complex7.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex7.asin();
        org.apache.commons.math.complex.Complex complex12 = complex0.subtract(complex7);
        org.apache.commons.math.complex.Complex complex13 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.ComplexField complexField16 = complex14.getField();
        org.apache.commons.math.complex.Complex complex18 = complex14.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex21.tanh();
        boolean boolean25 = complex18.equals((java.lang.Object) complex24);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex30 = complex28.divide(0.0d);
        org.apache.commons.math.complex.Complex complex31 = complex28.sinh();
        org.apache.commons.math.complex.Complex complex32 = complex28.asin();
        boolean boolean33 = complex24.equals((java.lang.Object) complex28);
        java.lang.Object obj34 = complex28.readResolve();
        org.apache.commons.math.complex.Complex complex35 = complex0.divide(complex28);
        org.apache.commons.math.complex.Complex complex36 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex37 = complex0.asin();
        org.apache.commons.math.complex.Complex complex39 = complex37.pow(0.3028848683749714d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex37", complex0.equals(complex37) ? complex0.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex14 = complex11.sin();
        org.apache.commons.math.complex.Complex complex15 = complex11.negate();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        double double17 = complex16.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex16.log();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex23.pow((double) 10);
        boolean boolean26 = complex23.isInfinite();
        org.apache.commons.math.complex.Complex complex27 = complex23.asin();
        org.apache.commons.math.complex.Complex complex28 = complex16.subtract(complex23);
        org.apache.commons.math.complex.Complex complex29 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex30 = complex15.add(complex16);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex35 = complex33.divide(0.0d);
        org.apache.commons.math.complex.Complex complex37 = complex35.pow((double) 10);
        org.apache.commons.math.complex.Complex complex39 = complex37.add(1.0d);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField41 = complex40.getField();
        org.apache.commons.math.complex.Complex complex42 = complex37.multiply(complex40);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex47 = complex45.divide(0.0d);
        org.apache.commons.math.complex.Complex complex49 = complex47.pow((double) 10);
        org.apache.commons.math.complex.Complex complex51 = complex49.add(1.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList53 = complex51.nthRoot(10);
        org.apache.commons.math.complex.Complex complex54 = complex40.multiply(complex51);
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex56 = complex55.atan();
        org.apache.commons.math.complex.Complex complex57 = complex55.atan();
        org.apache.commons.math.complex.Complex complex60 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex62 = complex60.divide(0.0d);
        org.apache.commons.math.complex.Complex complex63 = complex62.cosh();
        org.apache.commons.math.complex.Complex complex64 = complex55.multiply(complex63);
        org.apache.commons.math.complex.Complex complex65 = complex64.acos();
        org.apache.commons.math.complex.Complex complex66 = complex40.multiply(complex64);
        org.apache.commons.math.complex.Complex complex68 = complex40.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex69 = complex15.subtract(complex68);
        org.apache.commons.math.complex.Complex complex70 = complex68.conjugate();
        org.apache.commons.math.complex.Complex complex71 = complex68.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex68 and complex70", complex68.equals(complex70) ? complex68.hashCode() == complex70.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex6 = complex4.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 10);
        org.apache.commons.math.complex.Complex complex10 = complex8.add(1.0d);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField12 = complex11.getField();
        org.apache.commons.math.complex.Complex complex13 = complex8.multiply(complex11);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex21 = complex19.divide(0.0d);
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex14.multiply(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.acos();
        org.apache.commons.math.complex.ComplexField complexField25 = complex23.getField();
        org.apache.commons.math.complex.Complex complex26 = complex13.divide(complex23);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex27.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cos();
        org.apache.commons.math.complex.Complex complex32 = complex30.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex33 = complex13.divide(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex1.multiply(complex30);
        org.apache.commons.math.complex.Complex complex35 = complex34.asin();
        org.apache.commons.math.complex.Complex complex36 = complex34.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex35", complex0.equals(complex35) ? complex0.hashCode() == complex35.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex6 = complex4.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 10);
        org.apache.commons.math.complex.Complex complex10 = complex8.add(1.0d);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField12 = complex11.getField();
        org.apache.commons.math.complex.Complex complex13 = complex8.multiply(complex11);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex21 = complex19.divide(0.0d);
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex14.multiply(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.acos();
        org.apache.commons.math.complex.ComplexField complexField25 = complex23.getField();
        org.apache.commons.math.complex.Complex complex26 = complex13.divide(complex23);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex27.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cos();
        org.apache.commons.math.complex.Complex complex32 = complex30.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex33 = complex13.divide(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex1.multiply(complex30);
        org.apache.commons.math.complex.Complex complex35 = complex30.sin();
        org.apache.commons.math.complex.Complex complex37 = complex35.pow(2.0530810787885983E-39d);
        org.apache.commons.math.complex.Complex complex38 = complex37.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex37", complex30.equals(complex37) ? complex30.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) '4');
        double double11 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex12.atan();
        double double15 = complex14.abs();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField17 = complex16.getField();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex16.pow(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex20.add((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex23 = complex14.subtract(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex8.add(complex14);
        org.apache.commons.math.complex.Complex complex25 = complex14.cos();
        org.apache.commons.math.complex.Complex complex26 = complex25.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex25", complex19.equals(complex25) ? complex19.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.tan();
        org.apache.commons.math.complex.Complex complex3 = complex1.asin();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex6 = complex4.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 10);
        org.apache.commons.math.complex.Complex complex10 = complex8.add(1.0d);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField12 = complex11.getField();
        org.apache.commons.math.complex.Complex complex13 = complex8.multiply(complex11);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex21 = complex19.divide(0.0d);
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex14.multiply(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.acos();
        org.apache.commons.math.complex.ComplexField complexField25 = complex23.getField();
        org.apache.commons.math.complex.Complex complex26 = complex13.divide(complex23);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex27.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cos();
        org.apache.commons.math.complex.Complex complex32 = complex30.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex33 = complex13.divide(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex1.multiply(complex30);
        org.apache.commons.math.complex.Complex complex35 = complex34.asin();
        org.apache.commons.math.complex.Complex complex37 = complex35.pow(0.7071067811865475d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex35", complex0.equals(complex35) ? complex0.hashCode() == complex35.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex5 = complex0.exp();
        org.apache.commons.math.complex.Complex complex6 = complex0.cos();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex7.pow(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex14 = complex11.log();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex16.atan();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean24 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex25 = complex21.pow(complex23);
        org.apache.commons.math.complex.Complex complex27 = complex25.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex28 = complex19.divide(complex27);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex29.atan();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex36 = complex34.divide(0.0d);
        org.apache.commons.math.complex.Complex complex37 = complex36.cosh();
        org.apache.commons.math.complex.Complex complex38 = complex29.multiply(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex19.pow(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex16.pow(complex19);
        org.apache.commons.math.complex.Complex complex41 = complex15.subtract(complex40);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.ComplexField complexField44 = complex42.getField();
        org.apache.commons.math.complex.Complex complex46 = complex42.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex51 = complex49.divide(0.0d);
        org.apache.commons.math.complex.Complex complex52 = complex49.tanh();
        boolean boolean53 = complex46.equals((java.lang.Object) complex52);
        org.apache.commons.math.complex.Complex complex54 = complex52.exp();
        boolean boolean55 = complex52.isNaN();
        org.apache.commons.math.complex.Complex complex56 = complex40.divide(complex52);
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex58 = complex57.atan();
        java.lang.Object obj59 = complex57.readResolve();
        org.apache.commons.math.complex.Complex complex61 = complex57.subtract(1.0d);
        org.apache.commons.math.complex.Complex complex62 = complex61.conjugate();
        org.apache.commons.math.complex.Complex complex63 = complex61.atan();
        org.apache.commons.math.complex.Complex complex64 = complex63.asin();
        org.apache.commons.math.complex.Complex complex65 = org.apache.commons.math.complex.Complex.ZERO;
        double double66 = complex65.getArgument();
        org.apache.commons.math.complex.Complex complex67 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean68 = complex67.isNaN();
        org.apache.commons.math.complex.Complex complex69 = complex65.pow(complex67);
        org.apache.commons.math.complex.Complex complex71 = complex69.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex72 = complex69.tan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList74 = complex69.nthRoot((int) '4');
        org.apache.commons.math.complex.Complex complex75 = complex64.pow(complex69);
        org.apache.commons.math.complex.Complex complex76 = complex40.multiply(complex69);
        org.apache.commons.math.complex.Complex complex77 = complex76.sqrt1z();
        org.apache.commons.math.complex.Complex complex78 = complex6.multiply(complex76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex6", complex5.equals(complex6) ? complex5.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex6 = complex2.asin();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField8 = complex7.getField();
        java.lang.String str9 = complex7.toString();
        org.apache.commons.math.complex.Complex complex10 = complex2.divide(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex2.acos();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.valueOf((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex15 = complex13.subtract((double) 1);
        org.apache.commons.math.complex.Complex complex16 = complex11.pow(complex13);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex21 = complex19.divide(0.0d);
        org.apache.commons.math.complex.Complex complex22 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex23 = complex19.asin();
        org.apache.commons.math.complex.Complex complex24 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex29 = complex27.divide(0.0d);
        org.apache.commons.math.complex.Complex complex31 = complex29.pow((double) 10);
        org.apache.commons.math.complex.Complex complex33 = complex31.add(1.0d);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField35 = complex34.getField();
        org.apache.commons.math.complex.Complex complex36 = complex31.multiply(complex34);
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex41 = complex39.divide(0.0d);
        org.apache.commons.math.complex.Complex complex43 = complex41.pow((double) 10);
        org.apache.commons.math.complex.Complex complex45 = complex43.add(1.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList47 = complex45.nthRoot(10);
        org.apache.commons.math.complex.Complex complex48 = complex34.multiply(complex45);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = complex49.atan();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex56 = complex54.divide(0.0d);
        org.apache.commons.math.complex.Complex complex57 = complex56.cosh();
        org.apache.commons.math.complex.Complex complex58 = complex49.multiply(complex57);
        java.lang.Object obj59 = complex58.readResolve();
        org.apache.commons.math.complex.Complex complex60 = complex48.pow(complex58);
        org.apache.commons.math.complex.Complex complex61 = complex60.cos();
        org.apache.commons.math.complex.Complex complex62 = complex19.divide(complex61);
        org.apache.commons.math.complex.Complex complex63 = complex61.tanh();
        org.apache.commons.math.complex.Complex complex64 = complex61.negate();
        org.apache.commons.math.complex.Complex complex65 = complex61.cos();
        org.apache.commons.math.complex.Complex complex66 = complex13.subtract(complex61);
        org.apache.commons.math.complex.Complex complex67 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex68 = complex13.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex67", complex13.equals(complex67) ? complex13.hashCode() == complex67.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        java.lang.String str2 = complex0.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.add(1.0d);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = complex9.multiply(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex14.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex17 = complex14.sin();
        org.apache.commons.math.complex.Complex complex20 = complex14.createComplex(3.650603079495543E-137d, 0.0d);
        boolean boolean21 = complex0.equals((java.lang.Object) 0.0d);
        org.apache.commons.math.complex.Complex complex22 = complex0.cos();
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        java.lang.Object obj24 = complex23.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex23", complex0.equals(complex23) ? complex0.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) '4');
        double double11 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex12.atan();
        double double15 = complex14.abs();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField17 = complex16.getField();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex16.pow(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex20.add((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex23 = complex14.subtract(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex8.add(complex14);
        org.apache.commons.math.complex.Complex complex25 = complex14.cos();
        org.apache.commons.math.complex.Complex complex26 = complex25.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex25", complex19.equals(complex25) ? complex19.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-0.0d), (double) 0);
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        java.lang.String str4 = complex3.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex9.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex12 = complex9.log();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        double double16 = complex15.getArgument();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean18 = complex17.isNaN();
        org.apache.commons.math.complex.Complex complex19 = complex15.pow(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex19.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex22 = complex19.log();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex13.subtract(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex24.tan();
        org.apache.commons.math.complex.Complex complex26 = complex3.multiply(complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex5", complex2.equals(complex5) ? complex2.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.negate();
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        double double3 = complex2.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(100.0d, (double) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        double double4 = complex3.getArgument();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex5.isNaN();
        org.apache.commons.math.complex.Complex complex7 = complex3.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex5.tan();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        double double10 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean12 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex13 = complex9.pow(complex11);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) '#', (double) (byte) 100);
        boolean boolean17 = complex16.isNaN();
        boolean boolean18 = complex13.equals((java.lang.Object) complex16);
        org.apache.commons.math.complex.Complex complex19 = complex13.negate();
        org.apache.commons.math.complex.Complex complex20 = complex13.acos();
        org.apache.commons.math.complex.Complex complex21 = complex8.subtract(complex13);
        org.apache.commons.math.complex.Complex complex22 = complex2.pow(complex8);
        org.apache.commons.math.complex.ComplexField complexField23 = complex22.getField();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex26 = complex22.subtract(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex26.conjugate();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex28.atan();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex35 = complex33.divide(0.0d);
        org.apache.commons.math.complex.Complex complex36 = complex35.cosh();
        org.apache.commons.math.complex.Complex complex37 = complex28.multiply(complex36);
        java.util.List<org.apache.commons.math.complex.Complex> complexList39 = complex28.nthRoot((int) ' ');
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        double double41 = complex40.getArgument();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean43 = complex42.isNaN();
        org.apache.commons.math.complex.Complex complex44 = complex40.pow(complex42);
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex46 = complex45.tanh();
        double double47 = complex46.getReal();
        org.apache.commons.math.complex.Complex complex48 = complex28.divide(complex46);
        org.apache.commons.math.complex.Complex complex49 = complex26.multiply(complex28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex26 and complex27", complex26.equals(complex27) ? complex26.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex6 = complex4.divide((double) (-1));
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex7", complex4.equals(complex7) ? complex4.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        org.apache.commons.math.complex.Complex complex24 = complex23.acos();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex29 = complex27.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex31 = complex29.divide((double) (-1));
        org.apache.commons.math.complex.Complex complex32 = complex31.sinh();
        org.apache.commons.math.complex.Complex complex33 = complex24.divide(complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex32", complex9.equals(complex32) ? complex9.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) '#', (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex3 = complex2.log();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField5 = complex4.getField();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow((double) '4');
        org.apache.commons.math.complex.Complex complex9 = complex4.pow((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex2.add(complex4);
        org.apache.commons.math.complex.Complex complex12 = complex4.acos();
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex12.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex13", complex12.equals(complex13) ? complex12.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(1.5707963267948966d, (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex8 = complex5.multiply((double) (-1.0f));
        double double9 = complex8.abs();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean13 = complex12.isNaN();
        org.apache.commons.math.complex.Complex complex14 = complex10.pow(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex14.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex17 = complex14.log();
        org.apache.commons.math.complex.Complex complex18 = complex17.acos();
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt1z();
        org.apache.commons.math.complex.Complex complex20 = complex18.atan();
        org.apache.commons.math.complex.ComplexField complexField21 = complex20.getField();
        boolean boolean22 = complex8.equals((java.lang.Object) complexField21);
        org.apache.commons.math.complex.Complex complex23 = complex8.atan();
        org.apache.commons.math.complex.Complex complex24 = complex8.sin();
        org.apache.commons.math.complex.Complex complex25 = complex3.pow(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex24.sin();
        org.apache.commons.math.complex.Complex complex29 = complex24.createComplex(1.5395872303089642d, 0.0d);
        org.apache.commons.math.complex.Complex complex30 = complex24.sin();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.valueOf(97.0d);
        java.lang.Object obj33 = complex32.readResolve();
        org.apache.commons.math.complex.Complex complex35 = complex32.multiply(104.9952379872535d);
        org.apache.commons.math.complex.Complex complex36 = complex35.conjugate();
        boolean boolean37 = complex30.equals((java.lang.Object) complex36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex35 and complex36", complex35.equals(complex36) ? complex35.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (byte) 100, (double) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) 0L);
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex8 = complex2.multiply(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex8.asin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        double double15 = complex14.abs();
        org.apache.commons.math.complex.Complex complex16 = complex14.exp();
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((double) 0);
        org.apache.commons.math.complex.Complex complex19 = complex16.atan();
        boolean boolean20 = complex9.equals((java.lang.Object) complex16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex9", complex5.equals(complex9) ? complex5.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) '#', (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex3 = complex2.log();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField5 = complex4.getField();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow((double) '4');
        org.apache.commons.math.complex.Complex complex9 = complex4.pow((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex10 = complex4.log();
        org.apache.commons.math.complex.Complex complex11 = complex2.add(complex4);
        org.apache.commons.math.complex.Complex complex12 = complex4.acos();
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex12.divide(97.51410154434075d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex13", complex12.equals(complex13) ? complex12.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex10.multiply(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex0.pow(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex22.atan();
        double double25 = complex24.abs();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField27 = complex26.getField();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex30 = complex26.pow(complex29);
        org.apache.commons.math.complex.Complex complex32 = complex30.add((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex33 = complex24.subtract(complex30);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField35 = complex34.getField();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex38 = complex34.pow(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex33.divide(complex34);
        org.apache.commons.math.complex.Complex complex40 = complex20.multiply(complex33);
        org.apache.commons.math.complex.Complex complex41 = complex40.asin();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = complex42.atan();
        org.apache.commons.math.complex.Complex complex45 = complex44.cos();
        org.apache.commons.math.complex.ComplexField complexField46 = complex45.getField();
        org.apache.commons.math.complex.Complex complex47 = complex40.add(complex45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex29 and complex45", complex29.equals(complex45) ? complex29.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = complex0.log();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) 10);
        boolean boolean10 = complex7.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex7.asin();
        org.apache.commons.math.complex.Complex complex12 = complex0.subtract(complex7);
        org.apache.commons.math.complex.Complex complex13 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.ComplexField complexField16 = complex14.getField();
        org.apache.commons.math.complex.Complex complex18 = complex14.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex21.tanh();
        boolean boolean25 = complex18.equals((java.lang.Object) complex24);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex30 = complex28.divide(0.0d);
        org.apache.commons.math.complex.Complex complex31 = complex28.sinh();
        org.apache.commons.math.complex.Complex complex32 = complex28.asin();
        boolean boolean33 = complex24.equals((java.lang.Object) complex28);
        java.lang.Object obj34 = complex28.readResolve();
        org.apache.commons.math.complex.Complex complex35 = complex0.divide(complex28);
        org.apache.commons.math.complex.Complex complex36 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex37 = complex0.asin();
        org.apache.commons.math.complex.Complex complex38 = complex37.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex37", complex0.equals(complex37) ? complex0.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = complex0.log();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) 10);
        boolean boolean10 = complex7.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex7.asin();
        org.apache.commons.math.complex.Complex complex12 = complex0.subtract(complex7);
        org.apache.commons.math.complex.Complex complex13 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.ComplexField complexField16 = complex14.getField();
        org.apache.commons.math.complex.Complex complex18 = complex14.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex21.tanh();
        boolean boolean25 = complex18.equals((java.lang.Object) complex24);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex30 = complex28.divide(0.0d);
        org.apache.commons.math.complex.Complex complex31 = complex28.sinh();
        org.apache.commons.math.complex.Complex complex32 = complex28.asin();
        boolean boolean33 = complex24.equals((java.lang.Object) complex28);
        java.lang.Object obj34 = complex28.readResolve();
        org.apache.commons.math.complex.Complex complex35 = complex0.divide(complex28);
        org.apache.commons.math.complex.Complex complex36 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex37 = complex0.asin();
        org.apache.commons.math.complex.Complex complex38 = complex37.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex37", complex0.equals(complex37) ? complex0.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(104.9952379872535d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField6 = complex5.getField();
        org.apache.commons.math.complex.Complex complex8 = complex5.pow((double) '4');
        org.apache.commons.math.complex.Complex complex10 = complex5.pow((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex11 = complex5.log();
        org.apache.commons.math.complex.Complex complex12 = complex11.exp();
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply(2.0530810787885983E-39d);
        org.apache.commons.math.complex.Complex complex15 = complex4.multiply(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex15", complex5.equals(complex15) ? complex5.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex10.multiply(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex0.pow(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex0.cos();
        org.apache.commons.math.complex.Complex complex22 = complex21.log();
        boolean boolean23 = complex22.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex22", complex0.equals(complex22) ? complex0.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = complex0.log();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) 10);
        boolean boolean10 = complex7.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex7.asin();
        org.apache.commons.math.complex.Complex complex12 = complex0.subtract(complex7);
        org.apache.commons.math.complex.Complex complex13 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.ComplexField complexField16 = complex14.getField();
        org.apache.commons.math.complex.Complex complex18 = complex14.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex21.tanh();
        boolean boolean25 = complex18.equals((java.lang.Object) complex24);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex30 = complex28.divide(0.0d);
        org.apache.commons.math.complex.Complex complex31 = complex28.sinh();
        org.apache.commons.math.complex.Complex complex32 = complex28.asin();
        boolean boolean33 = complex24.equals((java.lang.Object) complex28);
        java.lang.Object obj34 = complex28.readResolve();
        org.apache.commons.math.complex.Complex complex35 = complex0.divide(complex28);
        org.apache.commons.math.complex.Complex complex36 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex37 = complex0.asin();
        org.apache.commons.math.complex.Complex complex38 = complex0.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex37", complex0.equals(complex37) ? complex0.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.valueOf((double) (-1L), 2.0530810787885983E-39d);
        org.apache.commons.math.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex13 = complex11.divide(0.0d);
        org.apache.commons.math.complex.Complex complex15 = complex13.pow((double) 10);
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList19 = complex15.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex24 = complex22.divide(0.0d);
        double double25 = complex24.abs();
        org.apache.commons.math.complex.Complex complex26 = complex24.exp();
        org.apache.commons.math.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex26.negate();
        org.apache.commons.math.complex.Complex complex29 = complex15.divide(complex26);
        org.apache.commons.math.complex.Complex complex30 = complex8.multiply(complex26);
        org.apache.commons.math.complex.Complex complex31 = complex3.pow(complex8);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex36 = complex34.divide(0.0d);
        double double37 = complex36.abs();
        org.apache.commons.math.complex.Complex complex38 = complex36.exp();
        org.apache.commons.math.complex.Complex complex39 = complex36.negate();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.valueOf((double) '#');
        org.apache.commons.math.complex.Complex complex42 = complex41.cos();
        org.apache.commons.math.complex.Complex complex44 = complex42.multiply((double) 10);
        org.apache.commons.math.complex.Complex complex45 = complex44.sqrt();
        org.apache.commons.math.complex.Complex complex46 = complex39.pow(complex45);
        org.apache.commons.math.complex.Complex complex47 = complex8.pow(complex45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex31", complex3.equals(complex31) ? complex3.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = complex0.log();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) 10);
        boolean boolean10 = complex7.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex7.asin();
        org.apache.commons.math.complex.Complex complex12 = complex0.subtract(complex7);
        org.apache.commons.math.complex.Complex complex13 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.ComplexField complexField16 = complex14.getField();
        org.apache.commons.math.complex.Complex complex18 = complex14.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex21.tanh();
        boolean boolean25 = complex18.equals((java.lang.Object) complex24);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex30 = complex28.divide(0.0d);
        org.apache.commons.math.complex.Complex complex31 = complex28.sinh();
        org.apache.commons.math.complex.Complex complex32 = complex28.asin();
        boolean boolean33 = complex24.equals((java.lang.Object) complex28);
        java.lang.Object obj34 = complex28.readResolve();
        org.apache.commons.math.complex.Complex complex35 = complex0.divide(complex28);
        org.apache.commons.math.complex.Complex complex36 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex37 = complex0.asin();
        org.apache.commons.math.complex.Complex complex40 = complex0.createComplex((-0.5634789001053149d), 0.019950736973556517d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex37", complex0.equals(complex37) ? complex0.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        boolean boolean2 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex3 = complex0.tan();
        org.apache.commons.math.complex.Complex complex4 = complex0.asin();
        double double5 = complex0.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(104.9952379872535d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField6 = complex5.getField();
        org.apache.commons.math.complex.Complex complex8 = complex5.pow((double) '4');
        org.apache.commons.math.complex.Complex complex10 = complex5.pow((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex11 = complex5.log();
        org.apache.commons.math.complex.Complex complex12 = complex11.exp();
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply(2.0530810787885983E-39d);
        org.apache.commons.math.complex.Complex complex15 = complex4.multiply(complex12);
        java.lang.Object obj16 = complex12.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex15", complex5.equals(complex15) ? complex5.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(100.0d, (double) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        double double4 = complex3.getArgument();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex5.isNaN();
        org.apache.commons.math.complex.Complex complex7 = complex3.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex5.tan();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        double double10 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean12 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex13 = complex9.pow(complex11);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) '#', (double) (byte) 100);
        boolean boolean17 = complex16.isNaN();
        boolean boolean18 = complex13.equals((java.lang.Object) complex16);
        org.apache.commons.math.complex.Complex complex19 = complex13.negate();
        org.apache.commons.math.complex.Complex complex20 = complex13.acos();
        org.apache.commons.math.complex.Complex complex21 = complex8.subtract(complex13);
        org.apache.commons.math.complex.Complex complex22 = complex2.pow(complex8);
        org.apache.commons.math.complex.ComplexField complexField23 = complex22.getField();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex26 = complex22.subtract(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex26.conjugate();
        java.lang.Class<?> wildcardClass28 = complex27.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex26 and complex27", complex26.equals(complex27) ? complex26.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (short) -1);
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) '#', (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex5 = complex1.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        double double7 = complex6.abs();
        org.apache.commons.math.complex.Complex complex9 = complex6.subtract((double) 10);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex16 = complex14.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex16.pow((double) 10);
        org.apache.commons.math.complex.Complex complex20 = complex18.add(1.0d);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField22 = complex21.getField();
        org.apache.commons.math.complex.Complex complex23 = complex18.multiply(complex21);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex24.atan();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex31 = complex29.divide(0.0d);
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex33 = complex24.multiply(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex33.acos();
        org.apache.commons.math.complex.ComplexField complexField35 = complex33.getField();
        org.apache.commons.math.complex.Complex complex36 = complex23.divide(complex33);
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        org.apache.commons.math.complex.Complex complex39 = complex37.atan();
        org.apache.commons.math.complex.Complex complex40 = complex39.cos();
        org.apache.commons.math.complex.Complex complex42 = complex40.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex43 = complex23.divide(complex40);
        org.apache.commons.math.complex.Complex complex44 = complex11.multiply(complex40);
        org.apache.commons.math.complex.Complex complex45 = complex44.asin();
        org.apache.commons.math.complex.Complex complex46 = complex6.divide(complex44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex45", complex10.equals(complex45) ? complex10.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex8 = complex5.add(0.0d);
        java.lang.Class<?> wildcardClass9 = complex8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        java.util.List<org.apache.commons.math.complex.Complex> complexList11 = complex0.nthRoot((int) ' ');
        org.apache.commons.math.complex.Complex complex12 = complex0.acos();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1, (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex16 = complex15.sinh();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex17.atan();
        double double20 = complex19.abs();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField22 = complex21.getField();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex25 = complex21.pow(complex24);
        org.apache.commons.math.complex.Complex complex27 = complex25.add((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex19.subtract(complex25);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField30 = complex29.getField();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex33 = complex29.pow(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex28.divide(complex29);
        org.apache.commons.math.complex.Complex complex35 = complex16.subtract(complex29);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        double double37 = complex36.getArgument();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean39 = complex38.isNaN();
        org.apache.commons.math.complex.Complex complex40 = complex36.pow(complex38);
        org.apache.commons.math.complex.Complex complex42 = complex40.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex43 = complex40.sinh();
        org.apache.commons.math.complex.Complex complex44 = complex40.atan();
        org.apache.commons.math.complex.Complex complex45 = complex44.tanh();
        org.apache.commons.math.complex.Complex complex47 = complex44.multiply((double) 10);
        double double48 = complex44.getArgument();
        org.apache.commons.math.complex.Complex complex49 = complex35.pow(complex44);
        org.apache.commons.math.complex.Complex complex51 = complex35.subtract((double) 1);
        org.apache.commons.math.complex.Complex complex52 = complex0.subtract(complex35);
        org.apache.commons.math.complex.Complex complex53 = complex0.exp();
        org.apache.commons.math.complex.Complex complex54 = complex53.sqrt1z();
        org.apache.commons.math.complex.Complex complex55 = complex54.tanh();
        org.apache.commons.math.complex.Complex complex56 = complex55.negate();
        org.apache.commons.math.complex.Complex complex57 = complex55.asin();
        double double58 = complex57.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex57", complex0.equals(complex57) ? complex0.hashCode() == complex57.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(0.0d);
        org.apache.commons.math.complex.Complex complex2 = complex1.log();
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (short) 100, (double) '4');
        org.apache.commons.math.complex.Complex complex6 = complex2.conjugate();
        java.lang.Object obj7 = null;
        boolean boolean8 = complex2.equals(obj7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex6", complex2.equals(complex6) ? complex2.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply(10.0d);
        double double7 = complex4.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex4.atan();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.valueOf(1.5707963267948966d, (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex12 = complex11.exp();
        boolean boolean13 = complex12.isNaN();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex17 = complex14.multiply((double) (-1.0f));
        double double18 = complex17.abs();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex19.pow(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex23.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex26 = complex23.log();
        org.apache.commons.math.complex.Complex complex27 = complex26.acos();
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = complex27.atan();
        org.apache.commons.math.complex.ComplexField complexField30 = complex29.getField();
        boolean boolean31 = complex17.equals((java.lang.Object) complexField30);
        org.apache.commons.math.complex.Complex complex32 = complex17.atan();
        org.apache.commons.math.complex.Complex complex33 = complex17.sin();
        org.apache.commons.math.complex.Complex complex34 = complex12.pow(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex33.sin();
        org.apache.commons.math.complex.Complex complex38 = complex33.createComplex(1.5395872303089642d, 0.0d);
        org.apache.commons.math.complex.Complex complex41 = complex38.createComplex((-0.0d), (double) (byte) 0);
        boolean boolean42 = complex8.equals((java.lang.Object) complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex41", complex0.equals(complex41) ? complex0.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.valueOf((double) (-1L), 2.0530810787885983E-39d);
        org.apache.commons.math.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex13 = complex11.divide(0.0d);
        org.apache.commons.math.complex.Complex complex15 = complex13.pow((double) 10);
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList19 = complex15.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex24 = complex22.divide(0.0d);
        double double25 = complex24.abs();
        org.apache.commons.math.complex.Complex complex26 = complex24.exp();
        org.apache.commons.math.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex26.negate();
        org.apache.commons.math.complex.Complex complex29 = complex15.divide(complex26);
        org.apache.commons.math.complex.Complex complex30 = complex8.multiply(complex26);
        org.apache.commons.math.complex.Complex complex31 = complex3.pow(complex8);
        org.apache.commons.math.complex.Complex complex33 = complex31.subtract(5.304204855423443d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex31", complex3.equals(complex31) ? complex3.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex10.multiply(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex0.pow(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex0.cos();
        org.apache.commons.math.complex.Complex complex22 = complex21.log();
        org.apache.commons.math.complex.Complex complex24 = complex21.subtract(101.47112277246664d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex22", complex0.equals(complex22) ? complex0.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex10.multiply(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex0.pow(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex0.cos();
        org.apache.commons.math.complex.Complex complex22 = complex21.log();
        org.apache.commons.math.complex.ComplexField complexField23 = complex22.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex22", complex0.equals(complex22) ? complex0.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.negate();
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        double double3 = complex1.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = complex0.log();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) 10);
        boolean boolean10 = complex7.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex7.asin();
        org.apache.commons.math.complex.Complex complex12 = complex0.subtract(complex7);
        org.apache.commons.math.complex.Complex complex14 = complex0.pow(1.0d);
        org.apache.commons.math.complex.Complex complex15 = complex0.cos();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.valueOf(100.0d, (double) '#');
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex19.pow(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex21.tan();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        double double26 = complex25.getArgument();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean28 = complex27.isNaN();
        org.apache.commons.math.complex.Complex complex29 = complex25.pow(complex27);
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) '#', (double) (byte) 100);
        boolean boolean33 = complex32.isNaN();
        boolean boolean34 = complex29.equals((java.lang.Object) complex32);
        org.apache.commons.math.complex.Complex complex35 = complex29.negate();
        org.apache.commons.math.complex.Complex complex36 = complex29.acos();
        org.apache.commons.math.complex.Complex complex37 = complex24.subtract(complex29);
        org.apache.commons.math.complex.Complex complex38 = complex18.pow(complex24);
        org.apache.commons.math.complex.Complex complex39 = complex0.add(complex24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex38", complex15.equals(complex38) ? complex15.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex6 = complex4.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 10);
        org.apache.commons.math.complex.Complex complex10 = complex8.add(1.0d);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField12 = complex11.getField();
        org.apache.commons.math.complex.Complex complex13 = complex8.multiply(complex11);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex21 = complex19.divide(0.0d);
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex14.multiply(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.acos();
        org.apache.commons.math.complex.ComplexField complexField25 = complex23.getField();
        org.apache.commons.math.complex.Complex complex26 = complex13.divide(complex23);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex27.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.cos();
        org.apache.commons.math.complex.Complex complex32 = complex30.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex33 = complex13.divide(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex1.multiply(complex30);
        org.apache.commons.math.complex.Complex complex35 = complex34.asin();
        java.lang.Object obj36 = complex34.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex35", complex0.equals(complex35) ? complex0.hashCode() == complex35.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) '#', (double) 0.0f);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex3.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex9 = complex6.conjugate();
        org.apache.commons.math.complex.ComplexField complexField10 = complex6.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex9", complex6.equals(complex9) ? complex6.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        java.util.List<org.apache.commons.math.complex.Complex> complexList11 = complex0.nthRoot((int) ' ');
        org.apache.commons.math.complex.Complex complex12 = complex0.acos();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1, (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex16 = complex15.sinh();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex17.atan();
        double double20 = complex19.abs();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField22 = complex21.getField();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex25 = complex21.pow(complex24);
        org.apache.commons.math.complex.Complex complex27 = complex25.add((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex19.subtract(complex25);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField30 = complex29.getField();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex33 = complex29.pow(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex28.divide(complex29);
        org.apache.commons.math.complex.Complex complex35 = complex16.subtract(complex29);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        double double37 = complex36.getArgument();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean39 = complex38.isNaN();
        org.apache.commons.math.complex.Complex complex40 = complex36.pow(complex38);
        org.apache.commons.math.complex.Complex complex42 = complex40.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex43 = complex40.sinh();
        org.apache.commons.math.complex.Complex complex44 = complex40.atan();
        org.apache.commons.math.complex.Complex complex45 = complex44.tanh();
        org.apache.commons.math.complex.Complex complex47 = complex44.multiply((double) 10);
        double double48 = complex44.getArgument();
        org.apache.commons.math.complex.Complex complex49 = complex35.pow(complex44);
        org.apache.commons.math.complex.Complex complex51 = complex35.subtract((double) 1);
        org.apache.commons.math.complex.Complex complex52 = complex0.subtract(complex35);
        org.apache.commons.math.complex.Complex complex53 = complex0.exp();
        org.apache.commons.math.complex.Complex complex54 = complex53.sqrt1z();
        org.apache.commons.math.complex.Complex complex55 = complex54.tanh();
        org.apache.commons.math.complex.Complex complex56 = complex55.negate();
        org.apache.commons.math.complex.Complex complex57 = complex55.asin();
        org.apache.commons.math.complex.Complex complex58 = complex57.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex57", complex0.equals(complex57) ? complex0.hashCode() == complex57.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.negate();
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex2.pow((-100.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = complex0.log();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) 10);
        boolean boolean10 = complex7.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex7.asin();
        org.apache.commons.math.complex.Complex complex12 = complex0.subtract(complex7);
        org.apache.commons.math.complex.Complex complex13 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.ComplexField complexField16 = complex14.getField();
        org.apache.commons.math.complex.Complex complex18 = complex14.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex21.tanh();
        boolean boolean25 = complex18.equals((java.lang.Object) complex24);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex30 = complex28.divide(0.0d);
        org.apache.commons.math.complex.Complex complex31 = complex28.sinh();
        org.apache.commons.math.complex.Complex complex32 = complex28.asin();
        boolean boolean33 = complex24.equals((java.lang.Object) complex28);
        java.lang.Object obj34 = complex28.readResolve();
        org.apache.commons.math.complex.Complex complex35 = complex0.divide(complex28);
        org.apache.commons.math.complex.Complex complex36 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex37 = complex0.asin();
        boolean boolean38 = complex0.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex37", complex0.equals(complex37) ? complex0.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) '#', (double) 0.0f);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex3.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex9 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.subtract(0.7071067811865475d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex9", complex6.equals(complex9) ? complex6.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex14 = complex11.sin();
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField19 = complex18.getField();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = complex18.pow(complex21);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex24 = complex22.add(complex23);
        boolean boolean25 = complex14.equals((java.lang.Object) complex23);
        org.apache.commons.math.complex.Complex complex26 = complex23.conjugate();
        org.apache.commons.math.complex.Complex complex28 = complex23.add(10.04987562112089d);
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex(0.0d);
        org.apache.commons.math.complex.Complex complex31 = complex30.log();
        org.apache.commons.math.complex.Complex complex32 = complex30.asin();
        boolean boolean33 = complex28.equals((java.lang.Object) complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex32", complex9.equals(complex32) ? complex9.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex3.conjugate();
        double double6 = complex3.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex5", complex3.equals(complex5) ? complex3.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        java.lang.String str2 = complex0.toString();
        org.apache.commons.math.complex.Complex complex3 = complex0.negate();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        double double5 = complex4.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        java.lang.String str2 = complex0.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.add(1.0d);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = complex9.multiply(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex14.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex17 = complex14.sin();
        org.apache.commons.math.complex.Complex complex20 = complex14.createComplex(3.650603079495543E-137d, 0.0d);
        boolean boolean21 = complex0.equals((java.lang.Object) 0.0d);
        org.apache.commons.math.complex.Complex complex22 = complex0.cos();
        org.apache.commons.math.complex.Complex complex24 = complex0.pow((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        double double28 = complex27.getArgument();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math.complex.Complex complex31 = complex27.pow(complex29);
        org.apache.commons.math.complex.Complex complex33 = complex31.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex34 = complex26.pow(complex31);
        org.apache.commons.math.complex.Complex complex36 = complex26.multiply((double) 1.0f);
        org.apache.commons.math.complex.Complex complex38 = complex36.divide((-1.0d));
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex40 = complex39.atan();
        org.apache.commons.math.complex.Complex complex42 = complex39.multiply((double) (-1.0f));
        double double43 = complex42.abs();
        org.apache.commons.math.complex.Complex complex44 = complex42.tan();
        org.apache.commons.math.complex.Complex complex45 = complex38.subtract(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex44.tanh();
        org.apache.commons.math.complex.Complex complex47 = complex24.add(complex44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex26", complex22.equals(complex26) ? complex22.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply(10.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot(1);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) '#', (double) 0.0f);
        org.apache.commons.math.complex.Complex complex13 = complex6.add(complex12);
        org.apache.commons.math.complex.Complex complex15 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex17 = complex12.divide((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex12.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex18", complex12.equals(complex18) ? complex12.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 0, (double) 10.0f);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        double double4 = complex3.getArgument();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex5.isNaN();
        org.apache.commons.math.complex.Complex complex7 = complex3.pow(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex7.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean13 = complex12.isNaN();
        org.apache.commons.math.complex.Complex complex14 = complex10.pow(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex14.multiply(10.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex16.nthRoot(1);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) '#', (double) 0.0f);
        org.apache.commons.math.complex.Complex complex23 = complex16.add(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex22.divide(0.0d);
        org.apache.commons.math.complex.Complex complex28 = complex22.createComplex((double) 1.0f, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex29 = complex9.divide(complex22);
        org.apache.commons.math.complex.Complex complex30 = complex2.divide(complex22);
        org.apache.commons.math.complex.Complex complex31 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex32 = complex31.conjugate();
        double double33 = complex32.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex31 and complex32", complex31.equals(complex32) ? complex31.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) '4');
        double double11 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex12.atan();
        double double15 = complex14.abs();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField17 = complex16.getField();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex16.pow(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex20.add((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex23 = complex14.subtract(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex8.add(complex14);
        org.apache.commons.math.complex.Complex complex25 = complex14.cos();
        org.apache.commons.math.complex.Complex complex26 = complex25.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex25", complex19.equals(complex25) ? complex19.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex10.multiply(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex0.pow(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex0.cos();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex26 = complex24.divide(0.0d);
        org.apache.commons.math.complex.Complex complex28 = complex26.pow((double) 10);
        org.apache.commons.math.complex.Complex complex30 = complex28.add(1.0d);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField32 = complex31.getField();
        org.apache.commons.math.complex.Complex complex33 = complex28.multiply(complex31);
        org.apache.commons.math.complex.Complex complex35 = complex33.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex36 = complex33.sin();
        org.apache.commons.math.complex.Complex complex37 = complex33.negate();
        org.apache.commons.math.complex.Complex complex38 = complex0.add(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex40 = complex39.tan();
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) 10.0f, (double) (byte) -1);
        double double45 = complex44.getReal();
        org.apache.commons.math.complex.Complex complex47 = complex44.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex49 = complex47.divide(52.0d);
        org.apache.commons.math.complex.Complex complex50 = complex40.subtract(complex49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex41", complex21.equals(complex41) ? complex21.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex24.atan();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex31 = complex29.divide(0.0d);
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex33 = complex24.multiply(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex33.acos();
        org.apache.commons.math.complex.Complex complex35 = complex9.multiply(complex33);
        java.lang.String str36 = complex9.toString();
        org.apache.commons.math.complex.Complex complex37 = complex9.exp();
        org.apache.commons.math.complex.Complex complex38 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex40 = complex38.pow(0.33667481938672716d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex38", complex9.equals(complex38) ? complex9.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        java.util.List<org.apache.commons.math.complex.Complex> complexList11 = complex0.nthRoot((int) ' ');
        org.apache.commons.math.complex.Complex complex12 = complex0.acos();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1, (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex16 = complex15.sinh();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex17.atan();
        double double20 = complex19.abs();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField22 = complex21.getField();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex25 = complex21.pow(complex24);
        org.apache.commons.math.complex.Complex complex27 = complex25.add((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex19.subtract(complex25);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField30 = complex29.getField();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex33 = complex29.pow(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex28.divide(complex29);
        org.apache.commons.math.complex.Complex complex35 = complex16.subtract(complex29);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        double double37 = complex36.getArgument();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean39 = complex38.isNaN();
        org.apache.commons.math.complex.Complex complex40 = complex36.pow(complex38);
        org.apache.commons.math.complex.Complex complex42 = complex40.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex43 = complex40.sinh();
        org.apache.commons.math.complex.Complex complex44 = complex40.atan();
        org.apache.commons.math.complex.Complex complex45 = complex44.tanh();
        org.apache.commons.math.complex.Complex complex47 = complex44.multiply((double) 10);
        double double48 = complex44.getArgument();
        org.apache.commons.math.complex.Complex complex49 = complex35.pow(complex44);
        org.apache.commons.math.complex.Complex complex51 = complex35.subtract((double) 1);
        org.apache.commons.math.complex.Complex complex52 = complex0.subtract(complex35);
        org.apache.commons.math.complex.Complex complex53 = complex0.exp();
        org.apache.commons.math.complex.Complex complex54 = complex53.sqrt1z();
        org.apache.commons.math.complex.Complex complex55 = complex54.tanh();
        org.apache.commons.math.complex.Complex complex56 = complex55.negate();
        org.apache.commons.math.complex.Complex complex57 = complex55.asin();
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.valueOf((double) '#');
        org.apache.commons.math.complex.Complex complex60 = complex59.cos();
        double double61 = complex60.getImaginary();
        org.apache.commons.math.complex.Complex complex62 = complex60.sinh();
        org.apache.commons.math.complex.Complex complex63 = complex60.log();
        org.apache.commons.math.complex.Complex complex64 = complex57.pow(complex63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex57", complex0.equals(complex57) ? complex0.hashCode() == complex57.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow(100.0d);
        java.lang.String str4 = complex0.toString();
        org.apache.commons.math.complex.Complex complex5 = complex0.negate();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex7.pow(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex9.tan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        double double14 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean16 = complex15.isNaN();
        org.apache.commons.math.complex.Complex complex17 = complex13.pow(complex15);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) '#', (double) (byte) 100);
        boolean boolean21 = complex20.isNaN();
        boolean boolean22 = complex17.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex23 = complex17.negate();
        org.apache.commons.math.complex.Complex complex24 = complex17.acos();
        org.apache.commons.math.complex.Complex complex25 = complex12.subtract(complex17);
        boolean boolean26 = complex12.isInfinite();
        double double27 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex28 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex29 = complex12.conjugate();
        boolean boolean30 = complex5.equals((java.lang.Object) complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex29", complex7.equals(complex29) ? complex7.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.log();
        double double3 = complex1.getReal();
        java.lang.String str4 = complex1.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex8 = complex5.pow(100.0d);
        java.lang.String str9 = complex5.toString();
        org.apache.commons.math.complex.Complex complex10 = complex5.negate();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math.complex.Complex complex13 = complex1.add(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex13", complex10.equals(complex13) ? complex10.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex5 = complex4.asin();
        boolean boolean6 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex7 = complex4.exp();
        org.apache.commons.math.complex.Complex complex8 = complex7.conjugate();
        org.apache.commons.math.complex.Complex complex9 = complex8.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex8", complex0.equals(complex8) ? complex0.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 0, (double) 10.0f);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        double double4 = complex3.getArgument();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex5.isNaN();
        org.apache.commons.math.complex.Complex complex7 = complex3.pow(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex7.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean13 = complex12.isNaN();
        org.apache.commons.math.complex.Complex complex14 = complex10.pow(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex14.multiply(10.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex16.nthRoot(1);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) '#', (double) 0.0f);
        org.apache.commons.math.complex.Complex complex23 = complex16.add(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex22.divide(0.0d);
        org.apache.commons.math.complex.Complex complex28 = complex22.createComplex((double) 1.0f, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex29 = complex9.divide(complex22);
        org.apache.commons.math.complex.Complex complex30 = complex2.divide(complex22);
        org.apache.commons.math.complex.Complex complex31 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex32 = complex31.conjugate();
        java.lang.Object obj33 = complex32.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex31 and complex32", complex31.equals(complex32) ? complex31.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        java.lang.String str2 = complex0.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.add(1.0d);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = complex9.multiply(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex14.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex17 = complex14.sin();
        org.apache.commons.math.complex.Complex complex20 = complex14.createComplex(3.650603079495543E-137d, 0.0d);
        boolean boolean21 = complex0.equals((java.lang.Object) 0.0d);
        org.apache.commons.math.complex.Complex complex22 = complex0.cos();
        org.apache.commons.math.complex.Complex complex24 = complex22.subtract(97.51410154434075d);
        double double25 = complex22.getArgument();
        org.apache.commons.math.complex.Complex complex26 = complex22.acos();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex31 = complex29.divide(0.0d);
        org.apache.commons.math.complex.Complex complex33 = complex31.pow((double) 10);
        org.apache.commons.math.complex.Complex complex35 = complex33.add(1.0d);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField37 = complex36.getField();
        org.apache.commons.math.complex.Complex complex38 = complex33.multiply(complex36);
        org.apache.commons.math.complex.Complex complex40 = complex38.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex41 = complex38.sin();
        org.apache.commons.math.complex.Complex complex44 = complex41.createComplex((double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex45 = complex44.sqrt();
        org.apache.commons.math.complex.Complex complex47 = complex44.divide((double) (-1));
        org.apache.commons.math.complex.Complex complex49 = complex44.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex50 = complex44.conjugate();
        org.apache.commons.math.complex.Complex complex53 = complex50.createComplex(Double.POSITIVE_INFINITY, 5.304204855423443d);
        org.apache.commons.math.complex.Complex complex54 = complex50.atan();
        org.apache.commons.math.complex.Complex complex55 = complex22.multiply(complex50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex26", complex0.equals(complex26) ? complex0.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex24.atan();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex31 = complex29.divide(0.0d);
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex33 = complex24.multiply(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex33.acos();
        org.apache.commons.math.complex.Complex complex35 = complex9.multiply(complex33);
        java.lang.String str36 = complex9.toString();
        org.apache.commons.math.complex.Complex complex37 = complex9.exp();
        org.apache.commons.math.complex.Complex complex39 = complex37.add(1.5707963267948966d);
        org.apache.commons.math.complex.Complex complex40 = complex39.conjugate();
        org.apache.commons.math.complex.Complex complex41 = complex40.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex39 and complex40", complex39.equals(complex40) ? complex39.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex4 = complex1.createComplex((double) '#', 10.0d);
        org.apache.commons.math.complex.Complex complex5 = complex1.negate();
        org.apache.commons.math.complex.Complex complex7 = complex1.add(100.0d);
        org.apache.commons.math.complex.Complex complex8 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex8", complex1.equals(complex8) ? complex1.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex24.atan();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex31 = complex29.divide(0.0d);
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex33 = complex24.multiply(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex33.acos();
        org.apache.commons.math.complex.Complex complex35 = complex9.multiply(complex33);
        java.lang.String str36 = complex9.toString();
        org.apache.commons.math.complex.Complex complex37 = complex9.exp();
        org.apache.commons.math.complex.Complex complex38 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex39 = complex9.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex38", complex9.equals(complex38) ? complex9.hashCode() == complex38.hashCode() : true);
    }
}

