package org.apache.commons.math3.complex;

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
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math3.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex16.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10, (double) (short) 0);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.ZERO;
        double double4 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex8.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList11 = complex8.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex15 = complex12.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex12.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex18 = complex8.pow(complex17);
        org.apache.commons.math3.complex.Complex complex19 = complex3.multiply(complex17);
        org.apache.commons.math3.complex.Complex complex20 = complex2.divide(complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex19", complex3.equals(complex19) ? complex3.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math3.complex.Complex> complexList2 = complex0.nthRoot(1);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex4 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex0.multiply(complex4);
        boolean boolean6 = complex0.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math3.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex18 = complex14.multiply((int) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.add((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex11.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math3.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex7.subtract(complex16);
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex20 = complex19.negate();
        boolean boolean21 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex24 = complex22.divide(0.0d);
        double double25 = complex22.getImaginary();
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex29 = complex22.add(complex28);
        org.apache.commons.math3.complex.Complex complex30 = complex20.divide(complex29);
        double double31 = complex30.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex30", complex19.equals(complex30) ? complex19.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math3.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex19 = complex17.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex20 = complex17.tanh();
        org.apache.commons.math3.complex.Complex complex22 = complex17.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math3.complex.Complex complex25 = complex23.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex23.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex28 = complex0.pow(complex27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.add((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex11.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math3.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex7.subtract(complex16);
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex20 = complex19.negate();
        boolean boolean21 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex24 = complex22.divide(0.0d);
        double double25 = complex22.getImaginary();
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex29 = complex22.add(complex28);
        org.apache.commons.math3.complex.Complex complex30 = complex20.divide(complex29);
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex32 = complex31.negate();
        org.apache.commons.math3.complex.Complex complex33 = complex29.subtract(complex31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex30", complex19.equals(complex30) ? complex19.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex2 = complex1.conjugate();
        java.lang.String str3 = complex1.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex21.sin();
        boolean boolean25 = complex23.equals((java.lang.Object) true);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex26.divide(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math3.complex.Complex complex32 = complex29.atan();
        double double33 = complex32.getImaginary();
        org.apache.commons.math3.complex.Complex complex34 = complex23.divide(complex32);
        org.apache.commons.math3.complex.Complex complex35 = complex34.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex34", complex21.equals(complex34) ? complex21.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math3.complex.Complex complex8 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex8.divide(complex11);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex17.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex17.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex24 = complex21.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex21.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex27 = complex17.pow(complex26);
        boolean boolean28 = complex8.equals((java.lang.Object) complex27);
        org.apache.commons.math3.complex.Complex complex29 = complex27.sin();
        org.apache.commons.math3.complex.Complex complex30 = complex4.multiply(complex27);
        java.lang.String str31 = complex4.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex30", complex27.equals(complex30) ? complex27.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 10L);
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.sqrt1z();
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math3.complex.Complex complex8 = complex1.add(complex4);
        java.lang.String str9 = complex1.toString();
        org.apache.commons.math3.complex.Complex complex10 = complex1.conjugate();
        java.lang.Object obj11 = complex1.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex21.sin();
        boolean boolean25 = complex23.equals((java.lang.Object) true);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex26.divide(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math3.complex.Complex complex32 = complex29.atan();
        double double33 = complex32.getImaginary();
        org.apache.commons.math3.complex.Complex complex34 = complex23.divide(complex32);
        org.apache.commons.math3.complex.Complex complex36 = new org.apache.commons.math3.complex.Complex((double) 10L);
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex39 = complex37.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex40 = complex39.conjugate();
        org.apache.commons.math3.complex.Complex complex41 = complex39.sqrt1z();
        boolean boolean42 = complex39.isInfinite();
        org.apache.commons.math3.complex.Complex complex43 = complex36.add(complex39);
        java.lang.String str44 = complex36.toString();
        org.apache.commons.math3.complex.Complex complex45 = complex32.multiply(complex36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex34", complex21.equals(complex34) ? complex21.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex4 = complex2.add(1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math3.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex14.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math3.complex.Complex complex5 = complex0.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex6.add(223.35075402042244d);
        org.apache.commons.math3.complex.Complex complex10 = complex6.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf(0.0d);
        org.apache.commons.math3.complex.Complex complex13 = complex6.add(complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex12", complex10.equals(complex12) ? complex10.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math3.complex.Complex> complexList2 = complex0.nthRoot(1);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex4 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex0.multiply(complex4);
        double double6 = complex5.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex21.sin();
        boolean boolean25 = complex23.equals((java.lang.Object) true);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex26.divide(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math3.complex.Complex complex32 = complex29.atan();
        double double33 = complex32.getImaginary();
        org.apache.commons.math3.complex.Complex complex34 = complex23.divide(complex32);
        org.apache.commons.math3.complex.Complex complex35 = complex23.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex34", complex21.equals(complex34) ? complex21.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex21.sin();
        org.apache.commons.math3.complex.Complex complex25 = complex21.divide((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex27 = complex21.pow(224.04462830829536d);
        org.apache.commons.math3.complex.Complex complex28 = complex21.sqrt1z();
        org.apache.commons.math3.complex.Complex complex29 = complex28.reciprocal();
        double double30 = complex29.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex28 and complex29", complex28.equals(complex29) ? complex28.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex21.sin();
        boolean boolean25 = complex23.equals((java.lang.Object) true);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex26.divide(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math3.complex.Complex complex32 = complex29.atan();
        double double33 = complex32.getImaginary();
        org.apache.commons.math3.complex.Complex complex34 = complex23.divide(complex32);
        org.apache.commons.math3.complex.Complex complex36 = complex23.multiply((double) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex34", complex21.equals(complex34) ? complex21.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math3.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex0.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math3.complex.Complex complex8 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex8.divide(complex11);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex17.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex17.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex24 = complex21.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex21.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex27 = complex17.pow(complex26);
        boolean boolean28 = complex8.equals((java.lang.Object) complex27);
        org.apache.commons.math3.complex.Complex complex29 = complex27.sin();
        org.apache.commons.math3.complex.Complex complex30 = complex4.multiply(complex27);
        double double31 = complex27.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex30", complex27.equals(complex30) ? complex27.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex21.sin();
        boolean boolean25 = complex23.equals((java.lang.Object) true);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex26.divide(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math3.complex.Complex complex32 = complex29.atan();
        double double33 = complex32.getImaginary();
        org.apache.commons.math3.complex.Complex complex34 = complex23.divide(complex32);
        double double35 = complex32.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex34", complex21.equals(complex34) ? complex21.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex21.sin();
        org.apache.commons.math3.complex.Complex complex25 = complex21.divide((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex27 = complex21.pow(224.04462830829536d);
        org.apache.commons.math3.complex.Complex complex28 = complex21.sqrt1z();
        org.apache.commons.math3.complex.Complex complex29 = complex28.reciprocal();
        java.lang.String str30 = complex28.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex28 and complex29", complex28.equals(complex29) ? complex28.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.asin();
        org.apache.commons.math3.complex.Complex complex4 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex7.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex11.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex14 = complex13.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList16 = complex13.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex19 = complex17.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex20 = complex17.tanh();
        org.apache.commons.math3.complex.Complex complex22 = complex17.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex23 = complex13.pow(complex22);
        boolean boolean24 = complex4.equals((java.lang.Object) complex23);
        org.apache.commons.math3.complex.Complex complex25 = complex23.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex23.divide((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex29 = complex23.pow(224.04462830829536d);
        org.apache.commons.math3.complex.Complex complex30 = complex23.sqrt1z();
        org.apache.commons.math3.complex.Complex complex31 = complex30.tan();
        org.apache.commons.math3.complex.Complex complex32 = complex1.divide(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex1", complex0.equals(complex1) ? complex0.hashCode() == complex1.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = complex15.cos();
        org.apache.commons.math3.complex.Complex complex20 = complex11.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex19.atan();
        org.apache.commons.math3.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex22.subtract((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex27 = complex24.createComplex((double) (short) 100, (-0.09966865249116202d));
        org.apache.commons.math3.complex.Complex complex28 = complex8.multiply(complex24);
        org.apache.commons.math3.complex.Complex complex29 = complex24.conjugate();
        org.apache.commons.math3.complex.Complex complex30 = complex29.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex29", complex22.equals(complex29) ? complex22.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex7 = complex6.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList9 = complex6.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex6.sinh();
        org.apache.commons.math3.complex.Complex complex11 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex13 = complex11.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = complex13.divide(complex15);
        org.apache.commons.math3.complex.Complex complex20 = complex1.subtract(complex15);
        org.apache.commons.math3.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math3.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math3.complex.Complex complex23 = complex22.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex22", complex20.equals(complex22) ? complex20.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math3.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex14.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex8 = complex3.add(0.0d);
        org.apache.commons.math3.complex.Complex complex9 = complex8.sqrt1z();
        org.apache.commons.math3.complex.Complex complex10 = complex8.sqrt();
        org.apache.commons.math3.complex.Complex complex11 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex18 = complex16.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math3.complex.Complex complex20 = complex15.divide(complex18);
        org.apache.commons.math3.complex.Complex complex21 = complex11.subtract(complex15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex12", complex11.equals(complex12) ? complex11.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.add((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex11.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math3.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex7.subtract(complex16);
        org.apache.commons.math3.complex.Complex complex20 = complex18.divide(8.837171286670872d);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex25.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex28 = complex27.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList30 = complex27.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex31 = complex27.sinh();
        org.apache.commons.math3.complex.Complex complex32 = complex27.asin();
        org.apache.commons.math3.complex.Complex complex34 = complex32.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex38 = complex36.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex39 = complex36.reciprocal();
        org.apache.commons.math3.complex.Complex complex40 = complex34.divide(complex36);
        org.apache.commons.math3.complex.Complex complex41 = complex22.subtract(complex36);
        org.apache.commons.math3.complex.Complex complex42 = complex41.atan();
        org.apache.commons.math3.complex.Complex complex43 = complex41.conjugate();
        org.apache.commons.math3.complex.Complex complex44 = complex18.divide(complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex41 and complex43", complex41.equals(complex43) ? complex41.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10.0f, 0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex5 = complex3.divide((double) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math3.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex18.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex21 = complex20.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList23 = complex20.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex20.sinh();
        org.apache.commons.math3.complex.Complex complex25 = complex20.log();
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex26.divide(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex25.add(complex29);
        org.apache.commons.math3.complex.Complex complex33 = complex29.subtract(90.0d);
        org.apache.commons.math3.complex.Complex complex34 = complex29.tanh();
        org.apache.commons.math3.complex.Complex complex35 = complex14.pow(complex34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math3.complex.Complex complex5 = complex0.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex6.add(223.35075402042244d);
        org.apache.commons.math3.complex.Complex complex10 = complex6.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex11 = complex6.reciprocal();
        org.apache.commons.math3.complex.Complex complex14 = complex11.createComplex(0.0d, 0.0d);
        boolean boolean15 = complex11.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex14", complex10.equals(complex14) ? complex10.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math3.complex.Complex> complexList2 = complex0.nthRoot(1);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex4 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex0.multiply(complex4);
        org.apache.commons.math3.complex.Complex complex6 = complex0.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex21.sin();
        org.apache.commons.math3.complex.Complex complex24 = complex21.asin();
        org.apache.commons.math3.complex.Complex complex25 = complex21.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex24", complex21.equals(complex24) ? complex21.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex21.sin();
        org.apache.commons.math3.complex.Complex complex25 = complex21.divide((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex27 = complex21.pow(224.04462830829536d);
        org.apache.commons.math3.complex.Complex complex28 = complex21.sqrt1z();
        org.apache.commons.math3.complex.Complex complex29 = complex28.reciprocal();
        org.apache.commons.math3.complex.Complex complex30 = complex29.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex28 and complex29", complex28.equals(complex29) ? complex28.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(2.2426113737960498E223d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField3 = complex1.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf(35.138169410605144d);
        org.apache.commons.math3.complex.Complex complex4 = complex1.subtract(complex3);
        org.apache.commons.math3.complex.Complex complex5 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.conjugate();
        double double7 = complex4.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.add((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex11.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math3.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex7.subtract(complex16);
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex20 = complex19.negate();
        boolean boolean21 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math3.complex.Complex complex22 = complex7.atan();
        org.apache.commons.math3.complex.Complex complex24 = complex7.subtract((-0.09966865249116202d));
        org.apache.commons.math3.complex.Complex complex25 = complex24.conjugate();
        org.apache.commons.math3.complex.Complex complex27 = complex24.pow(3.113028995751033d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex24 and complex25", complex24.equals(complex25) ? complex24.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.add((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex11.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math3.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex7.subtract(complex16);
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex20 = complex19.negate();
        boolean boolean21 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex24 = complex22.divide(0.0d);
        double double25 = complex22.getImaginary();
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex29 = complex22.add(complex28);
        org.apache.commons.math3.complex.Complex complex30 = complex20.divide(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex29.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex30", complex19.equals(complex30) ? complex19.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex7 = complex6.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList9 = complex6.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex6.sinh();
        org.apache.commons.math3.complex.Complex complex11 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex13 = complex11.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = complex13.divide(complex15);
        org.apache.commons.math3.complex.Complex complex20 = complex1.subtract(complex15);
        org.apache.commons.math3.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math3.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex25 = complex23.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex26 = complex23.tanh();
        org.apache.commons.math3.complex.Complex complex28 = complex23.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math3.complex.Complex complex31 = complex29.add(223.35075402042244d);
        org.apache.commons.math3.complex.Complex complex33 = complex29.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex34 = complex29.sqrt();
        org.apache.commons.math3.complex.Complex complex35 = complex20.pow(complex29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex22", complex20.equals(complex22) ? complex20.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.negate();
        org.apache.commons.math3.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = complex0.cos();
        java.lang.Object obj4 = complex0.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math3.complex.ComplexField complexField7 = complex5.getField();
        org.apache.commons.math3.complex.Complex complex8 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex9 = complex8.log();
        org.apache.commons.math3.complex.Complex complex10 = complex3.multiply(complex8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex6", complex3.equals(complex6) ? complex3.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math3.complex.Complex complex8 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex8.divide(complex11);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex17.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex17.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex24 = complex21.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex21.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex27 = complex17.pow(complex26);
        boolean boolean28 = complex8.equals((java.lang.Object) complex27);
        org.apache.commons.math3.complex.Complex complex29 = complex27.sin();
        org.apache.commons.math3.complex.Complex complex30 = complex4.multiply(complex27);
        org.apache.commons.math3.complex.Complex complex31 = complex4.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex30", complex27.equals(complex30) ? complex27.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex3.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex11 = complex3.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.divide((double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex11", complex3.equals(complex11) ? complex3.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex14 = complex12.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex15 = complex12.reciprocal();
        org.apache.commons.math3.complex.Complex complex16 = complex10.divide(complex12);
        org.apache.commons.math3.complex.Complex complex17 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex19 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex20 = complex12.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex19", complex1.equals(complex19) ? complex1.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        double double3 = complex0.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex9 = complex0.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math3.complex.Complex complex11 = complex9.log();
        org.apache.commons.math3.complex.Complex complex12 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex15 = complex13.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex16 = complex13.tanh();
        org.apache.commons.math3.complex.Complex complex17 = complex13.sin();
        org.apache.commons.math3.complex.Complex complex18 = complex12.divide(complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex12", complex13.equals(complex12) ? complex13.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        double double3 = complex0.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex9 = complex0.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math3.complex.Complex complex11 = complex9.log();
        org.apache.commons.math3.complex.Complex complex12 = complex9.negate();
        java.lang.Class<?> wildcardClass13 = complex9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex12", complex0.equals(complex12) ? complex0.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(2.2426113737960498E223d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex3 = complex2.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        double double3 = complex0.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex9 = complex0.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math3.complex.Complex complex11 = complex9.log();
        org.apache.commons.math3.complex.Complex complex12 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex9.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex12", complex0.equals(complex12) ? complex0.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex21.sin();
        boolean boolean25 = complex23.equals((java.lang.Object) true);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math3.complex.Complex complex30 = complex26.divide(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math3.complex.Complex complex32 = complex29.atan();
        double double33 = complex32.getImaginary();
        org.apache.commons.math3.complex.Complex complex34 = complex23.divide(complex32);
        org.apache.commons.math3.complex.ComplexField complexField35 = complex23.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex34", complex21.equals(complex34) ? complex21.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math3.complex.Complex> complexList2 = complex0.nthRoot(1);
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex7 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex4.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex10 = complex0.divide(complex9);
        org.apache.commons.math3.complex.Complex complex11 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex12 = complex0.exp();
        org.apache.commons.math3.complex.Complex complex13 = complex0.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex0.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex14.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex14", complex12.equals(complex14) ? complex12.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math3.complex.Complex complex5 = complex0.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex6.add(223.35075402042244d);
        org.apache.commons.math3.complex.Complex complex10 = complex6.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex11 = complex6.reciprocal();
        org.apache.commons.math3.complex.Complex complex14 = complex11.createComplex(0.0d, 0.0d);
        org.apache.commons.math3.complex.Complex complex17 = complex14.createComplex((-0.01d), (double) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex14", complex10.equals(complex14) ? complex10.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex7 = complex6.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList9 = complex6.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex6.sinh();
        org.apache.commons.math3.complex.Complex complex11 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex13 = complex11.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = complex13.divide(complex15);
        org.apache.commons.math3.complex.Complex complex20 = complex1.subtract(complex15);
        org.apache.commons.math3.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex24 = complex22.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex25 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex22.reciprocal();
        org.apache.commons.math3.complex.Complex complex27 = complex26.cos();
        org.apache.commons.math3.complex.Complex complex28 = complex20.pow(complex27);
        org.apache.commons.math3.complex.Complex complex29 = complex20.negate();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex33 = complex31.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex34 = complex33.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList36 = complex33.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex37 = complex33.sinh();
        org.apache.commons.math3.complex.Complex complex38 = complex33.asin();
        org.apache.commons.math3.complex.Complex complex39 = complex38.cosh();
        org.apache.commons.math3.complex.Complex complex40 = complex38.asin();
        org.apache.commons.math3.complex.Complex complex41 = complex38.sqrt1z();
        org.apache.commons.math3.complex.Complex complex42 = complex38.tan();
        boolean boolean43 = complex20.equals((java.lang.Object) complex42);
        org.apache.commons.math3.complex.Complex complex44 = complex20.conjugate();
        org.apache.commons.math3.complex.Complex complex46 = complex44.multiply((int) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex44", complex20.equals(complex44) ? complex20.hashCode() == complex44.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.log();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex9.divide(complex12);
        org.apache.commons.math3.complex.Complex complex14 = complex8.add(complex12);
        org.apache.commons.math3.complex.Complex complex16 = complex12.subtract(90.0d);
        org.apache.commons.math3.complex.Complex complex17 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex20 = complex12.createComplex(Double.NaN, (double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex17", complex12.equals(complex17) ? complex12.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex2 = complex0.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide(0.0d);
        double double8 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex5.add(complex11);
        org.apache.commons.math3.complex.Complex complex13 = complex4.pow(complex11);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex17.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex17.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex21 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex22 = complex17.asin();
        org.apache.commons.math3.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex4.add(complex23);
        org.apache.commons.math3.complex.Complex complex27 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex30 = complex28.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex31 = complex30.conjugate();
        org.apache.commons.math3.complex.Complex complex32 = complex27.divide(complex30);
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex36 = complex34.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex37 = complex36.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList39 = complex36.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex40 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex42 = complex40.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex43 = complex40.tanh();
        org.apache.commons.math3.complex.Complex complex45 = complex40.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex46 = complex36.pow(complex45);
        boolean boolean47 = complex27.equals((java.lang.Object) complex46);
        org.apache.commons.math3.complex.Complex complex48 = complex46.sin();
        boolean boolean49 = complex23.equals((java.lang.Object) complex46);
        org.apache.commons.math3.complex.Complex complex50 = complex46.conjugate();
        org.apache.commons.math3.complex.Complex complex51 = complex46.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex46 and complex50", complex46.equals(complex50) ? complex46.hashCode() == complex50.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(224.04462830829536d);
        org.apache.commons.math3.complex.Complex complex4 = complex1.createComplex(1.3576483865217719d, 2.276056593552136d);
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex5.tanh();
        org.apache.commons.math3.complex.Complex complex9 = complex5.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex10.atan();
        double double12 = complex11.getImaginary();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex14.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex17 = complex16.cos();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex21 = complex19.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex22 = complex21.cos();
        org.apache.commons.math3.complex.Complex complex23 = complex16.subtract(complex21);
        double double24 = complex23.getImaginary();
        org.apache.commons.math3.complex.Complex complex25 = complex23.atan();
        org.apache.commons.math3.complex.Complex complex26 = complex25.negate();
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.valueOf((double) 10.0f, 0.0d);
        org.apache.commons.math3.complex.Complex complex30 = complex26.add(complex29);
        org.apache.commons.math3.complex.Complex complex31 = complex11.add(complex29);
        org.apache.commons.math3.complex.Complex complex32 = complex11.sqrt1z();
        org.apache.commons.math3.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math3.complex.Complex complex34 = complex1.pow(complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex32 and complex33", complex32.equals(complex33) ? complex32.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math3.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex19 = complex17.divide(0.0d);
        double double20 = complex17.getImaginary();
        org.apache.commons.math3.complex.Complex complex23 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex24 = complex17.add(complex23);
        org.apache.commons.math3.complex.Complex complex26 = complex17.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex28 = complex17.multiply((double) '4');
        org.apache.commons.math3.complex.Complex complex29 = complex17.atan();
        org.apache.commons.math3.complex.Complex complex30 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex31 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex32 = complex14.subtract(complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math3.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex18 = complex14.subtract(0.9999999958776927d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((-1.0d));
        org.apache.commons.math3.complex.Complex complex2 = complex1.conjugate();
        double double3 = complex2.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex3.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex11 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex12 = complex3.conjugate();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf(100.0d);
        org.apache.commons.math3.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math3.complex.Complex complex16 = complex12.multiply(complex15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex12", complex3.equals(complex12) ? complex3.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex3 = complex1.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex8 = complex3.add(0.0d);
        org.apache.commons.math3.complex.Complex complex10 = complex3.pow((-3.4335987083042983d));
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex13 = complex12.cosh();
        java.lang.Object obj14 = complex12.readResolve();
        org.apache.commons.math3.complex.Complex complex15 = complex12.atan();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex17.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex20 = complex19.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList22 = complex19.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex23 = complex19.sinh();
        org.apache.commons.math3.complex.Complex complex24 = complex19.log();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex28 = complex27.cosh();
        org.apache.commons.math3.complex.Complex complex29 = complex25.divide(complex28);
        org.apache.commons.math3.complex.Complex complex30 = complex24.add(complex28);
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex33 = complex31.pow(0.0d);
        double double34 = complex31.getArgument();
        org.apache.commons.math3.complex.Complex complex35 = complex24.add(complex31);
        org.apache.commons.math3.complex.Complex complex37 = complex35.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex38 = complex15.add(complex35);
        org.apache.commons.math3.complex.Complex complex39 = org.apache.commons.math3.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex39.nthRoot(1);
        double double42 = complex39.getImaginary();
        org.apache.commons.math3.complex.Complex complex43 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex45 = complex43.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex47 = complex45.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex48 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex50 = complex48.divide(0.0d);
        double double51 = complex48.getImaginary();
        org.apache.commons.math3.complex.Complex complex54 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex55 = complex48.add(complex54);
        org.apache.commons.math3.complex.Complex complex56 = complex47.pow(complex54);
        org.apache.commons.math3.complex.Complex complex57 = complex56.tan();
        org.apache.commons.math3.complex.Complex complex58 = complex39.divide(complex56);
        org.apache.commons.math3.complex.Complex complex59 = complex58.sin();
        org.apache.commons.math3.complex.Complex complex60 = complex38.pow(complex59);
        org.apache.commons.math3.complex.Complex complex61 = complex10.pow(complex59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex25", complex10.equals(complex25) ? complex10.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex3.subtract(complex8);
        double double11 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math3.complex.Complex complex13 = complex12.negate();
        org.apache.commons.math3.complex.Complex complex14 = complex13.cos();
        org.apache.commons.math3.complex.Complex complex15 = complex13.sinh();
        org.apache.commons.math3.complex.ComplexField complexField16 = complex13.getField();
        org.apache.commons.math3.complex.Complex complex19 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex22 = complex20.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex23 = complex22.conjugate();
        org.apache.commons.math3.complex.Complex complex24 = complex19.divide(complex22);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex28 = complex26.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex29 = complex28.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList31 = complex28.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex34 = complex32.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex35 = complex32.tanh();
        org.apache.commons.math3.complex.Complex complex37 = complex32.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex38 = complex28.pow(complex37);
        boolean boolean39 = complex19.equals((java.lang.Object) complex38);
        org.apache.commons.math3.complex.Complex complex40 = complex38.sin();
        org.apache.commons.math3.complex.Complex complex42 = complex38.divide((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex44 = complex38.pow(224.04462830829536d);
        org.apache.commons.math3.complex.Complex complex45 = complex38.sqrt1z();
        org.apache.commons.math3.complex.Complex complex46 = complex45.tan();
        org.apache.commons.math3.complex.Complex complex47 = complex45.sqrt();
        boolean boolean48 = complex13.equals((java.lang.Object) complex45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex45", complex14.equals(complex45) ? complex14.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = complex15.cos();
        org.apache.commons.math3.complex.Complex complex20 = complex11.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex19.atan();
        org.apache.commons.math3.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex22.subtract((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex27 = complex24.createComplex((double) (short) 100, (-0.09966865249116202d));
        org.apache.commons.math3.complex.Complex complex28 = complex8.multiply(complex24);
        org.apache.commons.math3.complex.Complex complex29 = complex24.conjugate();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex33 = complex31.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex34 = complex33.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList36 = complex33.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex37 = complex33.sinh();
        org.apache.commons.math3.complex.Complex complex38 = complex33.asin();
        org.apache.commons.math3.complex.Complex complex40 = complex33.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex41 = complex33.tanh();
        org.apache.commons.math3.complex.Complex complex42 = complex41.cosh();
        org.apache.commons.math3.complex.Complex complex44 = complex41.multiply((-0.04983432624558102d));
        org.apache.commons.math3.complex.Complex complex45 = complex24.pow(complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex29", complex22.equals(complex29) ? complex22.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = complex15.cos();
        org.apache.commons.math3.complex.Complex complex20 = complex11.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex19.atan();
        org.apache.commons.math3.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex22.subtract((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex27 = complex24.createComplex((double) (short) 100, (-0.09966865249116202d));
        org.apache.commons.math3.complex.Complex complex28 = complex8.multiply(complex24);
        org.apache.commons.math3.complex.Complex complex29 = complex24.conjugate();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex33 = complex31.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex34 = complex33.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList36 = complex33.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex37 = complex33.sinh();
        org.apache.commons.math3.complex.Complex complex38 = complex33.asin();
        org.apache.commons.math3.complex.Complex complex40 = complex38.subtract((double) (short) 1);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList42 = complex38.nthRoot((int) (short) 10);
        org.apache.commons.math3.complex.Complex complex44 = complex38.add((double) 1);
        org.apache.commons.math3.complex.Complex complex46 = complex44.multiply(3.141592653589793d);
        org.apache.commons.math3.complex.Complex complex47 = complex29.subtract(complex44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex29", complex22.equals(complex29) ? complex22.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.divide(complex3);
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract(1.5707963267948966d);
        org.apache.commons.math3.complex.Complex complex8 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = complex8.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = complex15.cos();
        org.apache.commons.math3.complex.Complex complex20 = complex11.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex19.atan();
        org.apache.commons.math3.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex22.subtract((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex27 = complex24.createComplex((double) (short) 100, (-0.09966865249116202d));
        org.apache.commons.math3.complex.Complex complex28 = complex8.multiply(complex24);
        org.apache.commons.math3.complex.Complex complex29 = complex24.conjugate();
        org.apache.commons.math3.complex.Complex complex30 = complex24.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex29", complex22.equals(complex29) ? complex22.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.asin();
        org.apache.commons.math3.complex.Complex complex2 = complex0.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex1", complex0.equals(complex1) ? complex0.hashCode() == complex1.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.divide(complex3);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex6", complex5.equals(complex6) ? complex5.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex10 = complex3.divide(complex9);
        org.apache.commons.math3.complex.Complex complex12 = complex9.divide(10.0d);
        double double13 = complex9.getReal();
        org.apache.commons.math3.complex.Complex complex16 = complex9.createComplex((double) (short) 10, (double) 0L);
        org.apache.commons.math3.complex.Complex complex17 = complex9.sinh();
        org.apache.commons.math3.complex.Complex complex18 = complex17.sinh();
        boolean boolean19 = complex17.isNaN();
        org.apache.commons.math3.complex.Complex complex21 = complex17.multiply(1.0000000000000113E97d);
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex24 = complex23.cosh();
        java.lang.Object obj25 = complex23.readResolve();
        org.apache.commons.math3.complex.Complex complex26 = complex23.exp();
        org.apache.commons.math3.complex.Complex complex27 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex29 = complex27.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex30 = complex27.conjugate();
        org.apache.commons.math3.complex.Complex complex31 = complex17.pow(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex30", complex27.equals(complex30) ? complex27.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.log();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex9.divide(complex12);
        org.apache.commons.math3.complex.Complex complex14 = complex8.add(complex12);
        org.apache.commons.math3.complex.Complex complex16 = complex12.subtract(90.0d);
        org.apache.commons.math3.complex.Complex complex17 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex19 = complex17.pow((-3.141592653589793d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex17", complex12.equals(complex17) ? complex12.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.divide(complex3);
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract(1.5707963267948966d);
        org.apache.commons.math3.complex.Complex complex8 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = complex5.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex14 = complex12.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex15 = complex12.reciprocal();
        org.apache.commons.math3.complex.Complex complex16 = complex10.divide(complex12);
        org.apache.commons.math3.complex.Complex complex17 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex19 = complex12.conjugate();
        java.lang.String str20 = complex19.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex19", complex1.equals(complex19) ? complex1.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math3.complex.Complex complex8 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex8.divide(complex11);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex17.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex17.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex24 = complex21.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex21.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex27 = complex17.pow(complex26);
        boolean boolean28 = complex8.equals((java.lang.Object) complex27);
        org.apache.commons.math3.complex.Complex complex29 = complex27.sin();
        org.apache.commons.math3.complex.Complex complex30 = complex4.multiply(complex27);
        org.apache.commons.math3.complex.Complex complex31 = complex27.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex30", complex27.equals(complex30) ? complex27.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf(35.138169410605144d);
        org.apache.commons.math3.complex.Complex complex4 = complex1.subtract(complex3);
        org.apache.commons.math3.complex.Complex complex5 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex4.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        double double7 = complex6.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex14.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex17 = complex16.cos();
        org.apache.commons.math3.complex.Complex complex18 = complex11.subtract(complex16);
        double double19 = complex18.getImaginary();
        org.apache.commons.math3.complex.Complex complex20 = complex18.atan();
        org.apache.commons.math3.complex.Complex complex21 = complex20.negate();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 10.0f, 0.0d);
        org.apache.commons.math3.complex.Complex complex25 = complex21.add(complex24);
        org.apache.commons.math3.complex.Complex complex26 = complex6.add(complex24);
        org.apache.commons.math3.complex.Complex complex27 = complex6.sqrt1z();
        org.apache.commons.math3.complex.Complex complex28 = complex27.conjugate();
        org.apache.commons.math3.complex.Complex complex29 = complex27.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex28", complex27.equals(complex28) ? complex27.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.NaN;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex5 = complex2.atan();
        org.apache.commons.math3.complex.Complex complex6 = complex0.add(complex2);
        org.apache.commons.math3.complex.Complex complex7 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply((int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex7", complex2.equals(complex7) ? complex2.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        double double3 = complex0.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex9 = complex0.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math3.complex.Complex complex11 = complex9.log();
        org.apache.commons.math3.complex.Complex complex12 = complex9.negate();
        org.apache.commons.math3.complex.Complex complex14 = complex9.divide((-3.4335987083042983d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex12", complex0.equals(complex12) ? complex0.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math3.complex.Complex complex8 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex8.divide(complex11);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex17.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex17.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex24 = complex21.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex21.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex27 = complex17.pow(complex26);
        boolean boolean28 = complex8.equals((java.lang.Object) complex27);
        org.apache.commons.math3.complex.Complex complex29 = complex27.sin();
        org.apache.commons.math3.complex.Complex complex30 = complex4.multiply(complex27);
        org.apache.commons.math3.complex.Complex complex32 = new org.apache.commons.math3.complex.Complex((double) 10L);
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex35 = complex33.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex36 = complex35.conjugate();
        org.apache.commons.math3.complex.Complex complex37 = complex35.sqrt1z();
        boolean boolean38 = complex35.isInfinite();
        org.apache.commons.math3.complex.Complex complex39 = complex32.add(complex35);
        org.apache.commons.math3.complex.Complex complex40 = complex39.acos();
        org.apache.commons.math3.complex.Complex complex41 = complex4.add(complex40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex30", complex27.equals(complex30) ? complex27.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math3.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex16.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.reciprocal();
        java.lang.String str5 = complex0.toString();
        org.apache.commons.math3.complex.Complex complex6 = complex0.sin();
        org.apache.commons.math3.complex.Complex complex7 = complex0.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex7.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex7", complex4.equals(complex7) ? complex4.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.NaN;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex5 = complex2.atan();
        org.apache.commons.math3.complex.Complex complex6 = complex0.add(complex2);
        org.apache.commons.math3.complex.Complex complex8 = complex0.multiply(1.0955307783953592d);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math3.complex.Complex complex11 = complex8.pow(complex9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex7 = complex6.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList9 = complex6.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex6.sinh();
        org.apache.commons.math3.complex.Complex complex11 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex13 = complex11.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = complex13.divide(complex15);
        org.apache.commons.math3.complex.Complex complex20 = complex1.subtract(complex15);
        org.apache.commons.math3.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex24 = complex22.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex25 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex22.reciprocal();
        org.apache.commons.math3.complex.Complex complex27 = complex26.cos();
        org.apache.commons.math3.complex.Complex complex28 = complex20.pow(complex27);
        org.apache.commons.math3.complex.Complex complex29 = complex20.negate();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex33 = complex31.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex34 = complex33.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList36 = complex33.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex37 = complex33.sinh();
        org.apache.commons.math3.complex.Complex complex38 = complex33.asin();
        org.apache.commons.math3.complex.Complex complex39 = complex38.cosh();
        org.apache.commons.math3.complex.Complex complex40 = complex38.asin();
        org.apache.commons.math3.complex.Complex complex41 = complex38.sqrt1z();
        org.apache.commons.math3.complex.Complex complex42 = complex38.tan();
        boolean boolean43 = complex20.equals((java.lang.Object) complex42);
        org.apache.commons.math3.complex.Complex complex44 = complex20.conjugate();
        org.apache.commons.math3.complex.Complex complex45 = complex20.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex44", complex20.equals(complex44) ? complex20.hashCode() == complex44.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex4 = complex1.divide((-14143.549766589716d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10L);
        double double2 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex3 = complex1.exp();
        double double4 = complex3.getArgument();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex8 = complex7.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = complex3.pow(complex7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex8", complex7.equals(complex8) ? complex7.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex3.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex11 = complex3.tanh();
        org.apache.commons.math3.complex.Complex complex12 = complex3.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex15 = complex13.divide(0.0d);
        double double16 = complex13.getImaginary();
        org.apache.commons.math3.complex.Complex complex19 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex20 = complex13.add(complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex13.atan();
        org.apache.commons.math3.complex.Complex complex23 = complex13.multiply((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex25 = complex13.multiply(complex24);
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex30 = complex28.add(complex29);
        org.apache.commons.math3.complex.Complex complex32 = complex28.pow((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex33 = complex32.sinh();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex38 = complex36.add(complex37);
        org.apache.commons.math3.complex.Complex complex39 = complex36.reciprocal();
        boolean boolean40 = complex32.equals((java.lang.Object) complex36);
        org.apache.commons.math3.complex.Complex complex41 = complex36.cosh();
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex44 = complex42.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex45 = complex42.tanh();
        org.apache.commons.math3.complex.Complex complex47 = complex42.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex48 = complex47.sqrt();
        org.apache.commons.math3.complex.Complex complex49 = complex47.acos();
        org.apache.commons.math3.complex.Complex complex51 = complex47.divide((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex52 = complex41.subtract(complex51);
        org.apache.commons.math3.complex.Complex complex53 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex55 = complex53.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex56 = complex55.conjugate();
        org.apache.commons.math3.complex.Complex complex57 = complex55.sqrt();
        org.apache.commons.math3.complex.Complex complex59 = complex57.multiply(100);
        org.apache.commons.math3.complex.Complex complex61 = complex57.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex62 = complex52.divide(complex61);
        org.apache.commons.math3.complex.Complex complex64 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex65 = complex64.cosh();
        java.lang.Object obj66 = complex64.readResolve();
        org.apache.commons.math3.complex.Complex complex67 = complex64.atan();
        org.apache.commons.math3.complex.Complex complex68 = complex64.acos();
        org.apache.commons.math3.complex.Complex complex69 = complex61.divide(complex68);
        org.apache.commons.math3.complex.Complex complex70 = complex24.multiply(complex69);
        org.apache.commons.math3.complex.Complex complex71 = complex3.add(complex70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex12", complex3.equals(complex12) ? complex3.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex7.asin();
        org.apache.commons.math3.complex.Complex complex9 = complex8.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex14.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex17 = complex16.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex16.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex21 = complex16.asin();
        org.apache.commons.math3.complex.Complex complex23 = complex21.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex25.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex28 = complex25.reciprocal();
        org.apache.commons.math3.complex.Complex complex29 = complex23.divide(complex25);
        org.apache.commons.math3.complex.Complex complex30 = complex11.subtract(complex25);
        org.apache.commons.math3.complex.Complex complex31 = complex9.divide(complex25);
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex37 = complex35.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex38 = complex37.conjugate();
        org.apache.commons.math3.complex.Complex complex39 = complex34.divide(complex37);
        org.apache.commons.math3.complex.Complex complex40 = complex25.divide(complex39);
        org.apache.commons.math3.complex.Complex complex41 = complex25.atan();
        java.lang.Object obj42 = complex25.readResolve();
        org.apache.commons.math3.complex.Complex complex44 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex46 = complex44.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex47 = complex46.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList49 = complex46.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex50 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex52 = complex50.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex53 = complex50.tanh();
        org.apache.commons.math3.complex.Complex complex55 = complex50.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex56 = complex46.pow(complex55);
        org.apache.commons.math3.complex.Complex complex57 = complex55.conjugate();
        org.apache.commons.math3.complex.Complex complex59 = complex55.divide(224.04462830829536d);
        org.apache.commons.math3.complex.Complex complex60 = complex55.conjugate();
        org.apache.commons.math3.complex.Complex complex61 = complex25.add(complex55);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList63 = complex55.nthRoot((int) '4');
        org.apache.commons.math3.complex.Complex complex64 = complex55.atan();
        org.apache.commons.math3.complex.Complex complex66 = new org.apache.commons.math3.complex.Complex(10.0d);
        boolean boolean68 = complex66.equals((java.lang.Object) 100.0d);
        org.apache.commons.math3.complex.Complex complex69 = complex66.tan();
        org.apache.commons.math3.complex.Complex complex70 = complex66.log();
        org.apache.commons.math3.complex.Complex complex71 = complex70.conjugate();
        org.apache.commons.math3.complex.Complex complex72 = complex55.divide(complex70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex70 and complex71", complex70.equals(complex71) ? complex70.hashCode() == complex71.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.negate();
        org.apache.commons.math3.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = complex0.cos();
        double double4 = complex3.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex2 = complex0.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 100);
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex6.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = complex6.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex13 = complex11.pow((double) (-1));
        org.apache.commons.math3.complex.Complex complex14 = complex11.sqrt1z();
        org.apache.commons.math3.complex.Complex complex15 = complex2.pow(complex11);
        org.apache.commons.math3.complex.Complex complex17 = new org.apache.commons.math3.complex.Complex(224.04462830829536d);
        org.apache.commons.math3.complex.Complex complex18 = complex2.add(complex17);
        java.lang.String str19 = complex17.toString();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex26 = complex24.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex27 = complex26.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex26.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex30 = complex26.sinh();
        org.apache.commons.math3.complex.Complex complex31 = complex26.asin();
        org.apache.commons.math3.complex.Complex complex33 = complex31.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex37 = complex35.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex38 = complex35.reciprocal();
        org.apache.commons.math3.complex.Complex complex39 = complex33.divide(complex35);
        org.apache.commons.math3.complex.Complex complex40 = complex21.subtract(complex35);
        org.apache.commons.math3.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex44 = complex42.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex45 = complex42.tanh();
        org.apache.commons.math3.complex.Complex complex46 = complex42.reciprocal();
        org.apache.commons.math3.complex.Complex complex47 = complex46.cos();
        org.apache.commons.math3.complex.Complex complex48 = complex40.pow(complex47);
        org.apache.commons.math3.complex.Complex complex49 = complex40.negate();
        org.apache.commons.math3.complex.Complex complex51 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex53 = complex51.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex54 = complex53.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList56 = complex53.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex57 = complex53.sinh();
        org.apache.commons.math3.complex.Complex complex58 = complex53.asin();
        org.apache.commons.math3.complex.Complex complex59 = complex58.cosh();
        org.apache.commons.math3.complex.Complex complex60 = complex58.asin();
        org.apache.commons.math3.complex.Complex complex61 = complex58.sqrt1z();
        org.apache.commons.math3.complex.Complex complex62 = complex58.tan();
        boolean boolean63 = complex40.equals((java.lang.Object) complex62);
        org.apache.commons.math3.complex.Complex complex64 = complex40.conjugate();
        org.apache.commons.math3.complex.Complex complex65 = complex17.multiply(complex64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex40 and complex64", complex40.equals(complex64) ? complex40.hashCode() == complex64.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(3.113028995751033d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex3.add(100.0d);
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex9 = complex7.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex10 = complex7.atan();
        org.apache.commons.math3.complex.Complex complex12 = complex7.add((double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex7.atan();
        org.apache.commons.math3.complex.Complex complex14 = complex5.divide(complex13);
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex18 = complex16.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex19 = complex16.atan();
        org.apache.commons.math3.complex.Complex complex21 = complex16.add((double) 1);
        boolean boolean22 = complex13.equals((java.lang.Object) 1);
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex25 = complex23.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex26 = complex23.tanh();
        org.apache.commons.math3.complex.Complex complex28 = complex23.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex30 = complex23.divide((-1.0d));
        org.apache.commons.math3.complex.Complex complex31 = complex23.log();
        org.apache.commons.math3.complex.Complex complex32 = complex23.negate();
        org.apache.commons.math3.complex.Complex complex33 = complex13.subtract(complex32);
        org.apache.commons.math3.complex.Complex complex35 = complex33.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex36 = complex1.pow(complex35);
        org.apache.commons.math3.complex.Complex complex39 = new org.apache.commons.math3.complex.Complex((double) (byte) 10, (double) (short) 1);
        org.apache.commons.math3.complex.Complex complex41 = complex39.divide(0.7853981633974483d);
        org.apache.commons.math3.complex.Complex complex44 = complex41.createComplex((double) 0.0f, (double) (-1L));
        org.apache.commons.math3.complex.Complex complex45 = complex35.multiply(complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex44", complex30.equals(complex44) ? complex30.hashCode() == complex44.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex14 = complex12.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex15 = complex12.reciprocal();
        org.apache.commons.math3.complex.Complex complex16 = complex10.divide(complex12);
        org.apache.commons.math3.complex.Complex complex17 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex19 = complex12.cos();
        boolean boolean20 = complex12.isInfinite();
        boolean boolean21 = complex12.isNaN();
        org.apache.commons.math3.complex.Complex complex22 = complex12.log();
        org.apache.commons.math3.complex.Complex complex23 = complex22.conjugate();
        java.lang.String str24 = complex23.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex23", complex22.equals(complex23) ? complex22.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math3.complex.Complex> complexList2 = complex0.nthRoot(1);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex4 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex5 = complex0.multiply(complex4);
        org.apache.commons.math3.complex.Complex complex6 = complex5.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.ComplexField complexField3 = complex1.getField();
        org.apache.commons.math3.complex.Complex complex4 = complex1.sqrt();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf(Double.POSITIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math3.complex.Complex complex8 = complex4.divide(complex6);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex9.divide(complex12);
        org.apache.commons.math3.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math3.complex.Complex complex15 = complex12.atan();
        org.apache.commons.math3.complex.Complex complex16 = complex12.tanh();
        org.apache.commons.math3.complex.Complex complex18 = complex16.divide(100.0199980003999d);
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex21 = complex19.divide(0.0d);
        double double22 = complex19.getImaginary();
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex26 = complex19.add(complex25);
        org.apache.commons.math3.complex.Complex complex27 = complex19.atan();
        org.apache.commons.math3.complex.Complex complex28 = complex19.conjugate();
        org.apache.commons.math3.complex.Complex complex30 = complex19.add((double) (-1));
        org.apache.commons.math3.complex.Complex complex31 = complex18.multiply(complex19);
        org.apache.commons.math3.complex.Complex complex32 = complex19.asin();
        org.apache.commons.math3.complex.Complex complex33 = complex8.subtract(complex32);
        org.apache.commons.math3.complex.Complex complex34 = complex8.tanh();
        org.apache.commons.math3.complex.Complex complex35 = complex34.atan();
        double double36 = complex34.getArgument();
        org.apache.commons.math3.complex.Complex complex37 = complex34.conjugate();
        double double38 = complex34.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex37", complex8.equals(complex37) ? complex8.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        double double3 = complex0.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex11 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex15 = complex13.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex16 = complex15.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList18 = complex15.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex19 = complex15.sinh();
        org.apache.commons.math3.complex.Complex complex20 = complex15.asin();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex24 = complex23.conjugate();
        org.apache.commons.math3.complex.Complex complex25 = complex23.sqrt();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex27.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex30 = complex27.reciprocal();
        org.apache.commons.math3.complex.Complex complex31 = complex27.cos();
        org.apache.commons.math3.complex.Complex complex32 = complex23.subtract(complex31);
        org.apache.commons.math3.complex.Complex complex33 = complex31.atan();
        org.apache.commons.math3.complex.Complex complex34 = complex33.cosh();
        org.apache.commons.math3.complex.Complex complex36 = complex34.subtract((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex39 = complex36.createComplex((double) (short) 100, (-0.09966865249116202d));
        org.apache.commons.math3.complex.Complex complex40 = complex20.multiply(complex36);
        org.apache.commons.math3.complex.Complex complex41 = complex36.conjugate();
        org.apache.commons.math3.complex.Complex complex42 = complex8.pow(complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex34 and complex41", complex34.equals(complex41) ? complex34.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex8 = complex3.add(0.0d);
        org.apache.commons.math3.complex.Complex complex9 = complex8.sqrt1z();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex12 = complex10.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex14 = complex12.acos();
        org.apache.commons.math3.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.conjugate();
        org.apache.commons.math3.complex.Complex complex17 = complex8.multiply(complex16);
        boolean boolean18 = complex17.isNaN();
        org.apache.commons.math3.complex.Complex complex20 = complex17.subtract(3.141592653589793d);
        org.apache.commons.math3.complex.Complex complex23 = complex17.createComplex((double) ' ', 35.138169410605144d);
        org.apache.commons.math3.complex.Complex complex25 = complex17.pow(1.6344197869546497d);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex28 = complex26.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex29 = complex26.tanh();
        org.apache.commons.math3.complex.Complex complex31 = complex26.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math3.complex.Complex complex34 = complex32.add(223.35075402042244d);
        org.apache.commons.math3.complex.Complex complex36 = complex32.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex37 = complex32.reciprocal();
        org.apache.commons.math3.complex.Complex complex40 = complex37.createComplex(0.0d, 0.0d);
        org.apache.commons.math3.complex.Complex complex41 = complex25.add(complex40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex36 and complex40", complex36.equals(complex40) ? complex36.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex7 = complex6.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList9 = complex6.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex6.sinh();
        org.apache.commons.math3.complex.Complex complex11 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex13 = complex11.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = complex13.divide(complex15);
        org.apache.commons.math3.complex.Complex complex20 = complex1.subtract(complex15);
        org.apache.commons.math3.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex24 = complex22.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex25 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex22.reciprocal();
        org.apache.commons.math3.complex.Complex complex27 = complex26.cos();
        org.apache.commons.math3.complex.Complex complex28 = complex20.pow(complex27);
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex31 = complex29.divide(0.0d);
        double double32 = complex29.getImaginary();
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex35 = complex33.divide(0.0d);
        double double36 = complex33.getImaginary();
        org.apache.commons.math3.complex.Complex complex39 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex40 = complex33.add(complex39);
        org.apache.commons.math3.complex.Complex complex41 = complex29.subtract(complex33);
        org.apache.commons.math3.complex.Complex complex42 = complex33.log();
        org.apache.commons.math3.complex.Complex complex43 = complex27.subtract(complex42);
        org.apache.commons.math3.complex.Complex complex46 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math3.complex.Complex complex47 = complex46.cos();
        org.apache.commons.math3.complex.Complex complex49 = complex46.add(0.0d);
        org.apache.commons.math3.complex.Complex complex50 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex52 = complex50.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex53 = complex52.conjugate();
        org.apache.commons.math3.complex.Complex complex54 = complex52.sqrt();
        org.apache.commons.math3.complex.Complex complex56 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex58 = complex56.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex59 = complex58.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList61 = complex58.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex62 = complex58.sinh();
        org.apache.commons.math3.complex.Complex complex63 = complex58.asin();
        org.apache.commons.math3.complex.Complex complex65 = complex63.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex67 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex69 = complex67.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex70 = complex67.reciprocal();
        org.apache.commons.math3.complex.Complex complex71 = complex65.divide(complex67);
        boolean boolean72 = complex52.equals((java.lang.Object) complex71);
        org.apache.commons.math3.complex.Complex complex73 = complex52.negate();
        org.apache.commons.math3.complex.Complex complex74 = complex73.sqrt();
        double double75 = complex73.abs();
        org.apache.commons.math3.complex.Complex complex76 = complex49.divide(complex73);
        boolean boolean77 = complex27.equals((java.lang.Object) complex76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex47", complex2.equals(complex47) ? complex2.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(11013.232874703393d, 0.5707963267948966d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.NaN;
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex8 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex9 = complex3.add(complex5);
        org.apache.commons.math3.complex.Complex complex10 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex11 = complex2.add(complex5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex10", complex5.equals(complex10) ? complex5.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf(35.138169410605144d);
        org.apache.commons.math3.complex.Complex complex4 = complex1.subtract(complex3);
        org.apache.commons.math3.complex.Complex complex5 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex6.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex4 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex6.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = complex6.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex2.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex12 = complex2.sinh();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex14.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex17 = complex16.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex16.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex21 = complex16.asin();
        org.apache.commons.math3.complex.Complex complex22 = complex21.cosh();
        boolean boolean23 = complex2.equals((java.lang.Object) complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex2.createComplex((double) (short) 10, (double) (-1L));
        org.apache.commons.math3.complex.Complex complex28 = complex26.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex31 = complex29.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex32 = complex29.tanh();
        org.apache.commons.math3.complex.Complex complex34 = complex29.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex36 = complex29.divide((-1.0d));
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) (-1L));
        org.apache.commons.math3.complex.Complex complex41 = new org.apache.commons.math3.complex.Complex((double) 10L, (double) (-1L));
        org.apache.commons.math3.complex.Complex complex42 = complex36.multiply(complex41);
        org.apache.commons.math3.complex.Complex complex43 = complex26.subtract(complex36);
        org.apache.commons.math3.complex.Complex complex44 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex46 = complex44.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex47 = complex44.tanh();
        org.apache.commons.math3.complex.Complex complex48 = complex44.reciprocal();
        org.apache.commons.math3.complex.Complex complex49 = complex48.cos();
        org.apache.commons.math3.complex.Complex complex50 = complex49.atan();
        double double51 = complex50.getImaginary();
        org.apache.commons.math3.complex.Complex complex53 = complex50.divide(11013.232906849877d);
        org.apache.commons.math3.complex.Complex complex54 = complex26.divide(complex50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex36 and complex48", complex36.equals(complex48) ? complex36.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf(35.138169410605144d);
        org.apache.commons.math3.complex.Complex complex4 = complex1.subtract(complex3);
        org.apache.commons.math3.complex.Complex complex5 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex4.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.divide(complex3);
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract(1.5707963267948966d);
        org.apache.commons.math3.complex.Complex complex8 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = complex8.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        java.lang.Object obj3 = complex1.readResolve();
        org.apache.commons.math3.complex.Complex complex4 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex8 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = complex5.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex4 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex6.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = complex6.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex2.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex12 = complex2.sinh();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex14.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex17 = complex16.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex16.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex21 = complex16.asin();
        org.apache.commons.math3.complex.Complex complex22 = complex21.cosh();
        boolean boolean23 = complex2.equals((java.lang.Object) complex22);
        org.apache.commons.math3.complex.Complex complex25 = complex22.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((-0.0d));
        org.apache.commons.math3.complex.Complex complex28 = complex25.sqrt1z();
        org.apache.commons.math3.complex.Complex complex30 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex32 = complex30.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex33 = complex32.cos();
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex37 = complex35.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex38 = complex37.cos();
        org.apache.commons.math3.complex.Complex complex39 = complex32.subtract(complex37);
        double double40 = complex39.getImaginary();
        org.apache.commons.math3.complex.Complex complex41 = complex39.atan();
        org.apache.commons.math3.complex.Complex complex42 = complex39.sinh();
        org.apache.commons.math3.complex.Complex complex43 = complex42.cos();
        org.apache.commons.math3.complex.Complex complex44 = complex43.cos();
        org.apache.commons.math3.complex.Complex complex45 = complex28.multiply(complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex39", complex27.equals(complex39) ? complex27.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.divide(complex3);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex8 = complex5.multiply((-0.01d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex6", complex5.equals(complex6) ? complex5.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(2.2426113737960498E223d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex3 = complex1.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex14 = complex12.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex15 = complex12.reciprocal();
        org.apache.commons.math3.complex.Complex complex16 = complex10.divide(complex12);
        org.apache.commons.math3.complex.Complex complex17 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex19 = complex12.cos();
        boolean boolean20 = complex12.isInfinite();
        boolean boolean21 = complex12.isNaN();
        org.apache.commons.math3.complex.Complex complex22 = complex12.log();
        org.apache.commons.math3.complex.Complex complex23 = complex22.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField24 = complex22.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex23", complex22.equals(complex23) ? complex22.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex7 = complex6.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList9 = complex6.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex6.sinh();
        org.apache.commons.math3.complex.Complex complex11 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex13 = complex11.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = complex13.divide(complex15);
        org.apache.commons.math3.complex.Complex complex20 = complex1.subtract(complex15);
        org.apache.commons.math3.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex24 = complex22.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex25 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex22.reciprocal();
        org.apache.commons.math3.complex.Complex complex27 = complex26.cos();
        org.apache.commons.math3.complex.Complex complex28 = complex20.pow(complex27);
        org.apache.commons.math3.complex.Complex complex29 = complex20.negate();
        org.apache.commons.math3.complex.Complex complex30 = complex29.sin();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex33 = complex31.divide(0.0d);
        double double34 = complex31.getImaginary();
        org.apache.commons.math3.complex.Complex complex37 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex38 = complex31.add(complex37);
        org.apache.commons.math3.complex.Complex complex39 = complex31.atan();
        org.apache.commons.math3.complex.Complex complex40 = complex31.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField41 = complex40.getField();
        org.apache.commons.math3.complex.Complex complex42 = complex40.log();
        org.apache.commons.math3.complex.Complex complex44 = complex42.add(3.166218219036781d);
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math3.complex.Complex complex48 = complex47.cos();
        org.apache.commons.math3.complex.Complex complex49 = complex47.atan();
        org.apache.commons.math3.complex.Complex complex50 = complex44.multiply(complex47);
        org.apache.commons.math3.complex.Complex complex52 = complex50.divide(0.9999999958776927d);
        org.apache.commons.math3.complex.Complex complex53 = complex29.subtract(complex50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex48", complex2.equals(complex48) ? complex2.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(224.04462830829536d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex10 = complex5.asin();
        org.apache.commons.math3.complex.Complex complex12 = complex10.subtract((double) (short) 1);
        double double13 = complex12.abs();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex17.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex17.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex21 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex22 = complex21.asin();
        org.apache.commons.math3.complex.Complex complex23 = complex22.reciprocal();
        boolean boolean24 = complex12.equals((java.lang.Object) complex23);
        org.apache.commons.math3.complex.Complex complex25 = complex1.multiply(complex12);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((int) (byte) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex27.cos();
        org.apache.commons.math3.complex.Complex complex30 = complex27.divide((double) 10.0f);
        org.apache.commons.math3.complex.Complex complex32 = complex27.divide((-31.41592653589793d));
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex34 = complex33.negate();
        double double35 = complex34.getReal();
        org.apache.commons.math3.complex.Complex complex36 = complex27.multiply(complex34);
        org.apache.commons.math3.complex.Complex complex37 = complex27.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex33 and complex36", complex33.equals(complex36) ? complex33.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex7.asin();
        org.apache.commons.math3.complex.Complex complex9 = complex8.log();
        java.lang.String str10 = complex9.toString();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex9.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex16 = complex14.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex17 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex18 = complex14.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = complex18.cos();
        org.apache.commons.math3.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math3.complex.Complex complex21 = complex9.add(complex19);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex24 = complex22.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex25 = complex24.conjugate();
        org.apache.commons.math3.complex.Complex complex26 = complex24.sqrt();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex30 = complex28.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex31 = complex28.reciprocal();
        org.apache.commons.math3.complex.Complex complex32 = complex28.cos();
        org.apache.commons.math3.complex.Complex complex33 = complex24.subtract(complex32);
        org.apache.commons.math3.complex.Complex complex34 = complex32.atan();
        org.apache.commons.math3.complex.Complex complex36 = complex34.subtract(0.0d);
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((int) (byte) 0);
        java.lang.Object obj40 = complex37.readResolve();
        org.apache.commons.math3.complex.Complex complex41 = complex36.divide(complex37);
        org.apache.commons.math3.complex.Complex complex42 = complex9.add(complex36);
        org.apache.commons.math3.complex.Complex complex44 = complex42.pow(3.141064209151921d);
        org.apache.commons.math3.complex.Complex complex45 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex47 = complex45.divide(0.0d);
        double double48 = complex45.getImaginary();
        org.apache.commons.math3.complex.Complex complex51 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex52 = complex45.add(complex51);
        org.apache.commons.math3.complex.Complex complex54 = complex45.divide((double) (-1));
        org.apache.commons.math3.complex.Complex complex55 = complex54.negate();
        java.lang.Object obj56 = complex55.readResolve();
        org.apache.commons.math3.complex.Complex complex57 = complex55.sqrt();
        org.apache.commons.math3.complex.Complex complex58 = complex44.divide(complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex54", complex18.equals(complex54) ? complex18.hashCode() == complex54.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.add(100.0d);
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex7 = complex5.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex8 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex10 = complex5.add((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex12 = complex3.divide(complex11);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex14.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex17 = complex16.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex16.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex21 = complex16.asin();
        org.apache.commons.math3.complex.Complex complex23 = complex16.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex24 = complex16.tanh();
        org.apache.commons.math3.complex.Complex complex25 = complex11.multiply(complex24);
        org.apache.commons.math3.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math3.complex.Complex complex27 = complex25.cos();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex30 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex31 = complex30.cosh();
        org.apache.commons.math3.complex.Complex complex32 = complex28.divide(complex31);
        org.apache.commons.math3.complex.Complex complex33 = complex32.sqrt1z();
        org.apache.commons.math3.complex.Complex complex34 = complex33.conjugate();
        org.apache.commons.math3.complex.Complex complex35 = complex27.pow(complex34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex23 and complex34", complex23.equals(complex34) ? complex23.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(10.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex3.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex9 = complex8.log();
        org.apache.commons.math3.complex.Complex complex11 = complex8.pow((double) 100);
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex15 = complex13.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex16 = complex13.atan();
        org.apache.commons.math3.complex.Complex complex18 = complex13.add((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex13.atan();
        org.apache.commons.math3.complex.Complex complex20 = complex11.divide(complex13);
        org.apache.commons.math3.complex.Complex complex21 = complex20.sqrt1z();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex24 = complex23.cosh();
        java.lang.Object obj25 = complex23.readResolve();
        org.apache.commons.math3.complex.Complex complex26 = complex23.atan();
        org.apache.commons.math3.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math3.complex.Complex complex28 = complex20.subtract(complex26);
        org.apache.commons.math3.complex.Complex complex29 = complex5.multiply(complex28);
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math3.complex.Complex complex33 = complex32.cos();
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex38 = complex36.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex40 = complex38.subtract((double) 100);
        org.apache.commons.math3.complex.Complex complex41 = complex40.exp();
        org.apache.commons.math3.complex.Complex complex42 = complex33.multiply(complex41);
        org.apache.commons.math3.complex.Complex complex43 = complex33.acos();
        org.apache.commons.math3.complex.Complex complex44 = complex5.divide(complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex24 and complex33", complex24.equals(complex33) ? complex24.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex4 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex6.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = complex6.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex2.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math3.complex.Complex complex13 = complex10.atan();
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((-1));
        org.apache.commons.math3.complex.Complex complex16 = complex15.cos();
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex17", complex16.equals(complex17) ? complex16.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 10L);
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math3.complex.Complex complex6 = complex4.sqrt1z();
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math3.complex.Complex complex8 = complex1.add(complex4);
        java.lang.String str9 = complex1.toString();
        org.apache.commons.math3.complex.Complex complex10 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex11 = complex1.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex10 = complex3.divide(complex9);
        org.apache.commons.math3.complex.Complex complex11 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex3.atan();
        org.apache.commons.math3.complex.Complex complex14 = complex3.multiply((double) (-1));
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex18 = complex16.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex19 = complex16.reciprocal();
        org.apache.commons.math3.complex.Complex complex20 = complex16.cos();
        org.apache.commons.math3.complex.Complex complex22 = complex16.add((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex23 = complex16.atan();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex25.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex28 = complex27.cos();
        org.apache.commons.math3.complex.Complex complex29 = complex23.multiply(complex28);
        org.apache.commons.math3.complex.Complex complex30 = complex3.pow(complex29);
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex32 = complex31.negate();
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex36 = complex34.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex37 = complex36.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList39 = complex36.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex40 = complex36.sinh();
        org.apache.commons.math3.complex.Complex complex41 = complex36.asin();
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex43 = complex36.divide(complex42);
        org.apache.commons.math3.complex.Complex complex45 = complex42.multiply((int) (byte) -1);
        org.apache.commons.math3.complex.Complex complex46 = complex31.subtract(complex42);
        org.apache.commons.math3.complex.Complex complex47 = complex31.acos();
        boolean boolean48 = complex31.isNaN();
        org.apache.commons.math3.complex.Complex complex50 = complex31.multiply(223.35075402042244d);
        boolean boolean51 = complex29.equals((java.lang.Object) complex50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex47", complex12.equals(complex47) ? complex12.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) '4');
        org.apache.commons.math3.complex.Complex complex3 = complex1.add((-1.0d));
        org.apache.commons.math3.complex.Complex complex4 = complex3.conjugate();
        boolean boolean5 = complex4.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.divide(complex3);
        org.apache.commons.math3.complex.Complex complex5 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex6.nthRoot(1);
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex10.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex13 = complex10.reciprocal();
        org.apache.commons.math3.complex.Complex complex15 = complex10.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex16 = complex6.divide(complex15);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex18.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex21 = complex18.reciprocal();
        org.apache.commons.math3.complex.Complex complex22 = complex18.cos();
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex26 = complex24.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex27 = complex26.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex26.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex30 = complex26.sinh();
        org.apache.commons.math3.complex.Complex complex31 = complex26.asin();
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex33 = complex26.divide(complex32);
        org.apache.commons.math3.complex.Complex complex35 = complex32.divide(10.0d);
        org.apache.commons.math3.complex.Complex complex36 = complex18.add(complex35);
        org.apache.commons.math3.complex.Complex complex37 = complex16.divide(complex35);
        org.apache.commons.math3.complex.Complex complex40 = complex16.createComplex((double) (-1), 10.0d);
        org.apache.commons.math3.complex.Complex complex41 = complex40.negate();
        org.apache.commons.math3.complex.Complex complex42 = complex41.sin();
        org.apache.commons.math3.complex.Complex complex45 = complex42.createComplex(3.141592653589793d, (double) (-1L));
        double double46 = complex45.getReal();
        org.apache.commons.math3.complex.Complex complex48 = complex45.multiply((-0.0d));
        org.apache.commons.math3.complex.Complex complex49 = complex4.pow(complex48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex48", complex0.equals(complex48) ? complex0.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        java.lang.Object obj3 = complex1.readResolve();
        org.apache.commons.math3.complex.Complex complex4 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) ' ');
        double double8 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex5.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex9", complex5.equals(complex9) ? complex5.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        java.lang.Object obj3 = complex1.readResolve();
        org.apache.commons.math3.complex.Complex complex4 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) ' ');
        double double8 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex9", complex5.equals(complex9) ? complex5.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex4 = complex2.sqrt();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex6.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = complex6.cos();
        org.apache.commons.math3.complex.Complex complex11 = complex2.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex12 = complex2.sinh();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex14.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex17 = complex16.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex16.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex21 = complex16.asin();
        org.apache.commons.math3.complex.Complex complex22 = complex21.cosh();
        boolean boolean23 = complex2.equals((java.lang.Object) complex22);
        org.apache.commons.math3.complex.Complex complex25 = complex22.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((-0.0d));
        org.apache.commons.math3.complex.Complex complex30 = org.apache.commons.math3.complex.Complex.valueOf(100.0199980003999d, (double) 0);
        org.apache.commons.math3.complex.Complex complex32 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex34 = complex32.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex35 = complex34.cos();
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex39 = complex37.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex40 = complex39.cos();
        org.apache.commons.math3.complex.Complex complex41 = complex34.subtract(complex39);
        double double42 = complex41.getImaginary();
        org.apache.commons.math3.complex.Complex complex43 = complex41.atan();
        org.apache.commons.math3.complex.Complex complex44 = complex41.reciprocal();
        org.apache.commons.math3.complex.Complex complex45 = complex30.subtract(complex41);
        org.apache.commons.math3.complex.Complex complex46 = complex27.pow(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex41", complex27.equals(complex41) ? complex27.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(2.2426113737960498E223d);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow(0.04819550471662474d);
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 1.0f, 10.0d);
        boolean boolean7 = complex6.isInfinite();
        org.apache.commons.math3.complex.Complex complex9 = complex6.multiply(224.04462830829536d);
        org.apache.commons.math3.complex.Complex complex10 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex16 = complex14.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex13.divide(complex16);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex20.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex23 = complex22.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList25 = complex22.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex28 = complex26.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex29 = complex26.tanh();
        org.apache.commons.math3.complex.Complex complex31 = complex26.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex32 = complex22.pow(complex31);
        boolean boolean33 = complex13.equals((java.lang.Object) complex32);
        org.apache.commons.math3.complex.Complex complex34 = complex13.sqrt();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex38 = complex36.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex39 = complex38.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex38.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex42 = complex38.sinh();
        org.apache.commons.math3.complex.Complex complex43 = complex38.asin();
        org.apache.commons.math3.complex.Complex complex44 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex45 = complex38.divide(complex44);
        org.apache.commons.math3.complex.Complex complex47 = complex44.divide(10.0d);
        double double48 = complex44.getReal();
        org.apache.commons.math3.complex.Complex complex51 = complex44.createComplex((double) (short) 10, (double) 0L);
        org.apache.commons.math3.complex.Complex complex52 = complex13.multiply(complex51);
        org.apache.commons.math3.complex.Complex complex53 = complex10.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex54 = complex3.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex57 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex58 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex60 = complex58.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex61 = complex60.conjugate();
        org.apache.commons.math3.complex.Complex complex62 = complex57.divide(complex60);
        org.apache.commons.math3.complex.Complex complex64 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex66 = complex64.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex67 = complex66.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList69 = complex66.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex70 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex72 = complex70.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex73 = complex70.tanh();
        org.apache.commons.math3.complex.Complex complex75 = complex70.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex76 = complex66.pow(complex75);
        boolean boolean77 = complex57.equals((java.lang.Object) complex76);
        org.apache.commons.math3.complex.Complex complex78 = complex76.sin();
        org.apache.commons.math3.complex.Complex complex80 = complex76.divide((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex81 = complex10.multiply(complex76);
        org.apache.commons.math3.complex.Complex complex82 = complex76.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex32 and complex81", complex32.equals(complex81) ? complex32.hashCode() == complex81.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex1.cos();
        org.apache.commons.math3.complex.Complex complex7 = complex1.add((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex11.sinh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math3.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex7.subtract(complex16);
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex20 = complex19.negate();
        boolean boolean21 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math3.complex.Complex complex22 = complex7.atan();
        org.apache.commons.math3.complex.Complex complex24 = complex7.subtract((-0.09966865249116202d));
        org.apache.commons.math3.complex.Complex complex25 = complex24.conjugate();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex29 = complex27.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex30 = complex29.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList32 = complex29.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex33 = complex29.sinh();
        org.apache.commons.math3.complex.Complex complex34 = complex33.asin();
        org.apache.commons.math3.complex.Complex complex35 = complex34.reciprocal();
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math3.complex.Complex complex40 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex42 = complex40.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex43 = complex42.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList45 = complex42.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex46 = complex42.sinh();
        org.apache.commons.math3.complex.Complex complex47 = complex42.asin();
        org.apache.commons.math3.complex.Complex complex49 = complex47.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex51 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex53 = complex51.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex54 = complex51.reciprocal();
        org.apache.commons.math3.complex.Complex complex55 = complex49.divide(complex51);
        org.apache.commons.math3.complex.Complex complex56 = complex37.subtract(complex51);
        org.apache.commons.math3.complex.Complex complex57 = complex35.divide(complex51);
        org.apache.commons.math3.complex.Complex complex58 = complex25.multiply(complex51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex24 and complex25", complex24.equals(complex25) ? complex24.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(10.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex4 = complex3.conjugate();
        double double5 = complex3.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math3.complex.Complex complex8 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex8.divide(complex11);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex17.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex17.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex24 = complex21.tanh();
        org.apache.commons.math3.complex.Complex complex26 = complex21.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex27 = complex17.pow(complex26);
        boolean boolean28 = complex8.equals((java.lang.Object) complex27);
        org.apache.commons.math3.complex.Complex complex29 = complex27.sin();
        org.apache.commons.math3.complex.Complex complex30 = complex4.multiply(complex27);
        org.apache.commons.math3.complex.Complex complex32 = complex4.pow((double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex30", complex27.equals(complex30) ? complex27.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.NaN;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex5 = complex2.atan();
        org.apache.commons.math3.complex.Complex complex6 = complex0.add(complex2);
        org.apache.commons.math3.complex.Complex complex7 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = complex7.add(223.35075402042244d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex7", complex2.equals(complex7) ? complex2.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        double double3 = complex0.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex9 = complex0.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math3.complex.Complex complex11 = complex9.log();
        org.apache.commons.math3.complex.Complex complex12 = complex9.negate();
        double double13 = complex9.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex12", complex0.equals(complex12) ? complex0.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 1L, (double) (-1));
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply(0);
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math3.complex.Complex> complexList7 = complex5.nthRoot(1);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex14 = complex9.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex15 = complex5.divide(complex14);
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex17.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex20 = complex17.reciprocal();
        org.apache.commons.math3.complex.Complex complex21 = complex17.cos();
        org.apache.commons.math3.complex.Complex complex23 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex25 = complex23.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex26 = complex25.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList28 = complex25.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex29 = complex25.sinh();
        org.apache.commons.math3.complex.Complex complex30 = complex25.asin();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex32 = complex25.divide(complex31);
        org.apache.commons.math3.complex.Complex complex34 = complex31.divide(10.0d);
        org.apache.commons.math3.complex.Complex complex35 = complex17.add(complex34);
        org.apache.commons.math3.complex.Complex complex36 = complex15.divide(complex34);
        org.apache.commons.math3.complex.Complex complex39 = complex15.createComplex((double) (-1), 10.0d);
        org.apache.commons.math3.complex.Complex complex41 = complex15.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex42 = complex15.sin();
        org.apache.commons.math3.complex.Complex complex44 = complex15.multiply((int) (byte) 1);
        org.apache.commons.math3.complex.Complex complex46 = complex44.add(223.35075402042244d);
        org.apache.commons.math3.complex.Complex complex48 = complex46.multiply(229.46769498480433d);
        org.apache.commons.math3.complex.Complex complex49 = complex4.add(complex48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex7.asin();
        org.apache.commons.math3.complex.Complex complex9 = complex8.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex14.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex17 = complex16.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex16.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex21 = complex16.asin();
        org.apache.commons.math3.complex.Complex complex23 = complex21.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex25.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex28 = complex25.reciprocal();
        org.apache.commons.math3.complex.Complex complex29 = complex23.divide(complex25);
        org.apache.commons.math3.complex.Complex complex30 = complex11.subtract(complex25);
        org.apache.commons.math3.complex.Complex complex31 = complex9.divide(complex25);
        org.apache.commons.math3.complex.Complex complex32 = complex31.reciprocal();
        org.apache.commons.math3.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex36 = complex34.divide(0.0d);
        double double37 = complex34.getImaginary();
        org.apache.commons.math3.complex.Complex complex40 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex41 = complex34.add(complex40);
        org.apache.commons.math3.complex.Complex complex42 = complex34.atan();
        org.apache.commons.math3.complex.Complex complex43 = complex34.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField44 = complex43.getField();
        org.apache.commons.math3.complex.Complex complex47 = complex43.createComplex(100.0199980003999d, (double) 100L);
        org.apache.commons.math3.complex.Complex complex48 = complex43.acos();
        org.apache.commons.math3.complex.Complex complex49 = complex32.subtract(complex43);
        org.apache.commons.math3.complex.Complex complex50 = complex49.tan();
        org.apache.commons.math3.complex.Complex complex51 = complex50.sqrt();
        org.apache.commons.math3.complex.Complex complex52 = complex50.tanh();
        org.apache.commons.math3.complex.Complex complex55 = new org.apache.commons.math3.complex.Complex((double) 1, (double) 10.0f);
        org.apache.commons.math3.complex.Complex complex58 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) 1);
        org.apache.commons.math3.complex.Complex complex61 = complex58.createComplex(3.113028995751033d, (double) '#');
        org.apache.commons.math3.complex.Complex complex62 = complex58.sqrt();
        org.apache.commons.math3.complex.Complex complex64 = new org.apache.commons.math3.complex.Complex(10.0d);
        boolean boolean66 = complex64.equals((java.lang.Object) 100.0d);
        org.apache.commons.math3.complex.Complex complex67 = complex62.subtract(complex64);
        org.apache.commons.math3.complex.Complex complex68 = complex55.pow(complex64);
        org.apache.commons.math3.complex.Complex complex69 = complex68.cos();
        org.apache.commons.math3.complex.Complex complex70 = complex52.add(complex68);
        org.apache.commons.math3.complex.Complex complex73 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math3.complex.Complex complex74 = complex73.cos();
        java.lang.Object obj75 = complex74.readResolve();
        boolean boolean76 = complex74.isInfinite();
        org.apache.commons.math3.complex.Complex complex77 = complex68.pow(complex74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex74", complex12.equals(complex74) ? complex12.hashCode() == complex74.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex7.asin();
        org.apache.commons.math3.complex.Complex complex9 = complex8.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex14.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex17 = complex16.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex16.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex21 = complex16.asin();
        org.apache.commons.math3.complex.Complex complex23 = complex21.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex25.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex28 = complex25.reciprocal();
        org.apache.commons.math3.complex.Complex complex29 = complex23.divide(complex25);
        org.apache.commons.math3.complex.Complex complex30 = complex11.subtract(complex25);
        org.apache.commons.math3.complex.Complex complex31 = complex9.divide(complex25);
        org.apache.commons.math3.complex.Complex complex32 = complex25.tanh();
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf(1.0d);
        org.apache.commons.math3.complex.Complex complex35 = complex25.add(complex34);
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex39 = complex37.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex40 = complex39.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList42 = complex39.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex43 = complex39.sinh();
        org.apache.commons.math3.complex.Complex complex44 = complex39.asin();
        org.apache.commons.math3.complex.Complex complex45 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex46 = complex39.divide(complex45);
        org.apache.commons.math3.complex.Complex complex47 = complex39.negate();
        org.apache.commons.math3.complex.Complex complex48 = complex47.acos();
        org.apache.commons.math3.complex.Complex complex49 = org.apache.commons.math3.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math3.complex.Complex> complexList51 = complex49.nthRoot(1);
        org.apache.commons.math3.complex.Complex complex53 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex55 = complex53.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex56 = complex53.reciprocal();
        org.apache.commons.math3.complex.Complex complex58 = complex53.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex59 = complex49.divide(complex58);
        org.apache.commons.math3.complex.Complex complex61 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex63 = complex61.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex64 = complex61.reciprocal();
        org.apache.commons.math3.complex.Complex complex65 = complex61.cos();
        org.apache.commons.math3.complex.Complex complex67 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex69 = complex67.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex70 = complex69.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList72 = complex69.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex73 = complex69.sinh();
        org.apache.commons.math3.complex.Complex complex74 = complex69.asin();
        org.apache.commons.math3.complex.Complex complex75 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex76 = complex69.divide(complex75);
        org.apache.commons.math3.complex.Complex complex78 = complex75.divide(10.0d);
        org.apache.commons.math3.complex.Complex complex79 = complex61.add(complex78);
        org.apache.commons.math3.complex.Complex complex80 = complex59.divide(complex78);
        org.apache.commons.math3.complex.Complex complex83 = complex59.createComplex((double) (-1), 10.0d);
        org.apache.commons.math3.complex.Complex complex84 = complex83.negate();
        org.apache.commons.math3.complex.Complex complex85 = complex84.sin();
        org.apache.commons.math3.complex.Complex complex86 = complex48.add(complex84);
        boolean boolean87 = complex35.equals((java.lang.Object) complex48);
        org.apache.commons.math3.complex.Complex complex89 = complex48.multiply((int) (byte) 0);
        double double90 = complex89.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex89", complex30.equals(complex89) ? complex30.hashCode() == complex89.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.negate();
        org.apache.commons.math3.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = complex0.cos();
        double double4 = complex3.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(224.04462830829536d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex10 = complex5.asin();
        org.apache.commons.math3.complex.Complex complex12 = complex10.subtract((double) (short) 1);
        double double13 = complex12.abs();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex17.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex17.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex21 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex22 = complex21.asin();
        org.apache.commons.math3.complex.Complex complex23 = complex22.reciprocal();
        boolean boolean24 = complex12.equals((java.lang.Object) complex23);
        org.apache.commons.math3.complex.Complex complex25 = complex1.multiply(complex12);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((int) (byte) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex27.cos();
        org.apache.commons.math3.complex.Complex complex30 = complex27.divide((double) 10.0f);
        org.apache.commons.math3.complex.Complex complex32 = complex27.divide((-31.41592653589793d));
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex34 = complex33.negate();
        double double35 = complex34.getReal();
        org.apache.commons.math3.complex.Complex complex36 = complex27.multiply(complex34);
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex39 = complex37.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex42 = complex39.createComplex((double) 100, (double) 1L);
        org.apache.commons.math3.complex.Complex complex43 = complex42.sqrt();
        org.apache.commons.math3.complex.Complex complex44 = complex43.conjugate();
        double double45 = complex43.getArgument();
        org.apache.commons.math3.complex.Complex complex46 = complex34.subtract(complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex33 and complex36", complex33.equals(complex36) ? complex33.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex7 = complex6.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList9 = complex6.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex6.sinh();
        org.apache.commons.math3.complex.Complex complex11 = complex6.asin();
        org.apache.commons.math3.complex.Complex complex13 = complex11.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = complex13.divide(complex15);
        org.apache.commons.math3.complex.Complex complex20 = complex1.subtract(complex15);
        org.apache.commons.math3.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math3.complex.Complex complex22 = complex20.conjugate();
        double double23 = complex22.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex22", complex20.equals(complex22) ? complex20.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex5.sqrt();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex9.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = complex9.cos();
        org.apache.commons.math3.complex.Complex complex14 = complex5.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex15 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex19 = complex17.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex20 = complex19.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList22 = complex19.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex23 = complex19.sinh();
        org.apache.commons.math3.complex.Complex complex24 = complex19.asin();
        org.apache.commons.math3.complex.Complex complex25 = complex24.cosh();
        boolean boolean26 = complex5.equals((java.lang.Object) complex25);
        org.apache.commons.math3.complex.Complex complex28 = complex25.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex29 = complex25.sin();
        boolean boolean31 = complex25.equals((java.lang.Object) (short) -1);
        org.apache.commons.math3.complex.Complex complex32 = complex1.add(complex25);
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex37 = complex35.add(complex36);
        org.apache.commons.math3.complex.Complex complex39 = complex35.pow((double) (short) 0);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex39.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex43 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex44 = complex43.cosh();
        org.apache.commons.math3.complex.ComplexField complexField45 = complex43.getField();
        org.apache.commons.math3.complex.Complex complex46 = complex39.add(complex43);
        org.apache.commons.math3.complex.Complex complex47 = complex1.subtract(complex39);
        org.apache.commons.math3.complex.Complex complex48 = complex39.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField49 = complex48.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex39 and complex48", complex39.equals(complex48) ? complex39.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.divide(complex3);
        org.apache.commons.math3.complex.Complex complex5 = complex3.negate();
        org.apache.commons.math3.complex.Complex complex7 = complex5.subtract(1.5707963267948966d);
        org.apache.commons.math3.complex.Complex complex8 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = complex8.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex3.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex11 = complex3.conjugate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex11", complex3.equals(complex11) ? complex3.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math3.complex.Complex complex5 = complex2.exp();
        org.apache.commons.math3.complex.ComplexField complexField6 = complex2.getField();
        org.apache.commons.math3.complex.Complex complex8 = complex2.multiply((int) (short) -1);
        org.apache.commons.math3.complex.Complex complex9 = complex2.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex12 = complex10.divide(0.0d);
        double double13 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex17 = complex10.add(complex16);
        org.apache.commons.math3.complex.Complex complex18 = complex10.atan();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex21 = complex19.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex22 = complex19.tanh();
        org.apache.commons.math3.complex.Complex complex24 = complex19.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math3.complex.Complex complex27 = complex25.add((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex28 = complex10.multiply(complex25);
        org.apache.commons.math3.complex.Complex complex29 = complex9.multiply(complex28);
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex33 = complex31.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex34 = complex33.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList36 = complex33.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex37 = complex33.sinh();
        org.apache.commons.math3.complex.Complex complex38 = complex33.asin();
        org.apache.commons.math3.complex.Complex complex40 = complex33.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex41 = complex33.tanh();
        org.apache.commons.math3.complex.Complex complex42 = complex33.conjugate();
        org.apache.commons.math3.complex.Complex complex43 = complex9.divide(complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex33 and complex42", complex33.equals(complex42) ? complex33.hashCode() == complex42.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.asin();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex4 = complex3.cosh();
        java.lang.Object obj5 = complex3.readResolve();
        org.apache.commons.math3.complex.Complex complex6 = complex3.exp();
        org.apache.commons.math3.complex.Complex complex7 = complex3.tan();
        org.apache.commons.math3.complex.Complex complex9 = complex7.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex12 = complex7.createComplex((double) (-1.0f), 11013.232920103323d);
        org.apache.commons.math3.complex.Complex complex13 = complex1.subtract(complex7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex1", complex0.equals(complex1) ? complex0.hashCode() == complex1.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex3.subtract(complex8);
        double double11 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math3.complex.Complex complex14 = complex10.multiply((int) (short) 10);
        org.apache.commons.math3.complex.Complex complex15 = complex10.cosh();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex18.createComplex(3.113028995751033d, (double) '#');
        org.apache.commons.math3.complex.Complex complex22 = complex18.sqrt();
        org.apache.commons.math3.complex.Complex complex23 = complex22.log();
        org.apache.commons.math3.complex.Complex complex26 = complex23.createComplex((double) 0L, (-0.11065722117389565d));
        boolean boolean27 = complex26.isNaN();
        org.apache.commons.math3.complex.Complex complex28 = complex10.divide(complex26);
        org.apache.commons.math3.complex.Complex complex29 = complex28.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex28", complex10.equals(complex28) ? complex10.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math3.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex21.sin();
        org.apache.commons.math3.complex.Complex complex25 = complex21.divide((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex27 = complex21.pow(224.04462830829536d);
        org.apache.commons.math3.complex.Complex complex28 = complex21.sqrt1z();
        org.apache.commons.math3.complex.Complex complex29 = complex28.reciprocal();
        org.apache.commons.math3.complex.Complex complex30 = complex28.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex28 and complex29", complex28.equals(complex29) ? complex28.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(10.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex4 = complex3.conjugate();
        org.apache.commons.math3.complex.Complex complex6 = complex3.multiply((int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex14 = complex12.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex15 = complex12.reciprocal();
        org.apache.commons.math3.complex.Complex complex16 = complex10.divide(complex12);
        org.apache.commons.math3.complex.Complex complex17 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex19 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex21 = complex12.divide(0.04819550471662474d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex19", complex1.equals(complex19) ? complex1.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        java.lang.Object obj3 = complex1.readResolve();
        org.apache.commons.math3.complex.Complex complex4 = complex1.atan();
        org.apache.commons.math3.complex.Complex complex5 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex9 = complex7.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex10 = complex9.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex9.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex13 = complex9.sinh();
        org.apache.commons.math3.complex.Complex complex14 = complex9.asin();
        org.apache.commons.math3.complex.Complex complex16 = complex14.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex16.divide((double) 'a');
        org.apache.commons.math3.complex.Complex complex19 = complex16.tan();
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex21 = complex20.negate();
        org.apache.commons.math3.complex.Complex complex22 = complex21.reciprocal();
        org.apache.commons.math3.complex.Complex complex24 = complex22.pow((double) 10L);
        org.apache.commons.math3.complex.Complex complex25 = complex19.subtract(complex24);
        org.apache.commons.math3.complex.Complex complex26 = complex25.reciprocal();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex27.nthRoot(1);
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex33 = complex31.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex34 = complex31.reciprocal();
        org.apache.commons.math3.complex.Complex complex36 = complex31.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex37 = complex27.divide(complex36);
        org.apache.commons.math3.complex.Complex complex39 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex41 = complex39.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex42 = complex39.reciprocal();
        org.apache.commons.math3.complex.Complex complex43 = complex39.cos();
        org.apache.commons.math3.complex.Complex complex45 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex47 = complex45.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex48 = complex47.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList50 = complex47.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex51 = complex47.sinh();
        org.apache.commons.math3.complex.Complex complex52 = complex47.asin();
        org.apache.commons.math3.complex.Complex complex53 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex54 = complex47.divide(complex53);
        org.apache.commons.math3.complex.Complex complex56 = complex53.divide(10.0d);
        org.apache.commons.math3.complex.Complex complex57 = complex39.add(complex56);
        org.apache.commons.math3.complex.Complex complex58 = complex37.divide(complex56);
        org.apache.commons.math3.complex.Complex complex61 = complex37.createComplex((double) (-1), 10.0d);
        org.apache.commons.math3.complex.Complex complex63 = complex37.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex64 = complex37.sin();
        org.apache.commons.math3.complex.Complex complex66 = complex37.multiply((int) (byte) 1);
        org.apache.commons.math3.complex.Complex complex68 = complex66.add(223.35075402042244d);
        org.apache.commons.math3.complex.Complex complex70 = complex68.multiply(229.46769498480433d);
        org.apache.commons.math3.complex.Complex complex71 = complex25.pow(complex70);
        org.apache.commons.math3.complex.Complex complex72 = complex5.pow(complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex5", complex1.equals(complex5) ? complex1.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(10.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex4 = complex3.conjugate();
        double double5 = complex3.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex7.asin();
        org.apache.commons.math3.complex.Complex complex9 = complex8.log();
        java.lang.String str10 = complex9.toString();
        org.apache.commons.math3.complex.Complex complex11 = complex9.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex9.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex16 = complex14.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex17 = complex14.tanh();
        org.apache.commons.math3.complex.Complex complex18 = complex14.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = complex18.cos();
        org.apache.commons.math3.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math3.complex.Complex complex21 = complex9.add(complex19);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex24 = complex22.divide(0.0d);
        double double25 = complex22.getImaginary();
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex29 = complex22.add(complex28);
        org.apache.commons.math3.complex.Complex complex30 = complex22.atan();
        org.apache.commons.math3.complex.Complex complex31 = complex22.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField32 = complex31.getField();
        org.apache.commons.math3.complex.Complex complex33 = complex31.log();
        org.apache.commons.math3.complex.Complex complex35 = complex33.add(3.166218219036781d);
        org.apache.commons.math3.complex.Complex complex38 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math3.complex.Complex complex39 = complex38.cos();
        org.apache.commons.math3.complex.Complex complex40 = complex38.atan();
        org.apache.commons.math3.complex.Complex complex41 = complex35.multiply(complex38);
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex44 = complex42.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex45 = complex44.conjugate();
        org.apache.commons.math3.complex.Complex complex46 = complex44.sqrt();
        org.apache.commons.math3.complex.Complex complex48 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex50 = complex48.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex51 = complex48.reciprocal();
        org.apache.commons.math3.complex.Complex complex52 = complex48.cos();
        org.apache.commons.math3.complex.Complex complex53 = complex44.subtract(complex52);
        org.apache.commons.math3.complex.Complex complex54 = complex52.atan();
        org.apache.commons.math3.complex.Complex complex55 = complex52.atan();
        org.apache.commons.math3.complex.Complex complex56 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex58 = complex56.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex59 = complex55.divide(complex58);
        org.apache.commons.math3.complex.Complex complex61 = complex59.multiply((int) (short) -1);
        org.apache.commons.math3.complex.Complex complex62 = complex59.negate();
        org.apache.commons.math3.complex.Complex complex64 = complex59.divide(11013.232874703393d);
        org.apache.commons.math3.complex.Complex complex65 = complex38.multiply(complex64);
        org.apache.commons.math3.complex.Complex complex66 = complex9.add(complex64);
        org.apache.commons.math3.complex.Complex complex67 = complex64.cos();
        org.apache.commons.math3.complex.Complex complex68 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex70 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex71 = complex70.cosh();
        org.apache.commons.math3.complex.Complex complex72 = complex68.divide(complex71);
        org.apache.commons.math3.complex.Complex complex73 = complex71.sqrt1z();
        org.apache.commons.math3.complex.Complex complex74 = complex71.atan();
        org.apache.commons.math3.complex.Complex complex76 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex78 = complex76.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex79 = complex76.reciprocal();
        org.apache.commons.math3.complex.Complex complex80 = complex76.cos();
        org.apache.commons.math3.complex.Complex complex82 = complex76.add((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex84 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex86 = complex84.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex87 = complex86.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList89 = complex86.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex90 = complex86.sinh();
        org.apache.commons.math3.complex.Complex complex91 = complex90.asin();
        org.apache.commons.math3.complex.Complex complex92 = complex91.reciprocal();
        org.apache.commons.math3.complex.Complex complex93 = complex82.subtract(complex91);
        org.apache.commons.math3.complex.Complex complex94 = complex71.add(complex82);
        org.apache.commons.math3.complex.Complex complex95 = complex71.exp();
        org.apache.commons.math3.complex.Complex complex96 = complex95.tanh();
        org.apache.commons.math3.complex.Complex complex97 = complex96.conjugate();
        org.apache.commons.math3.complex.Complex complex98 = complex96.tan();
        org.apache.commons.math3.complex.Complex complex99 = complex67.subtract(complex96);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex39 and complex71", complex39.equals(complex71) ? complex39.hashCode() == complex71.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex11.sqrt();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math3.complex.Complex complex19 = complex15.cos();
        org.apache.commons.math3.complex.Complex complex20 = complex11.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex21 = complex19.atan();
        org.apache.commons.math3.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex22.subtract((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex27 = complex24.createComplex((double) (short) 100, (-0.09966865249116202d));
        org.apache.commons.math3.complex.Complex complex28 = complex8.multiply(complex24);
        org.apache.commons.math3.complex.Complex complex29 = complex24.conjugate();
        org.apache.commons.math3.complex.Complex complex30 = complex29.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex29", complex22.equals(complex29) ? complex22.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(2.2426113737960498E223d);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow(0.04819550471662474d);
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 1.0f, 10.0d);
        boolean boolean7 = complex6.isInfinite();
        org.apache.commons.math3.complex.Complex complex9 = complex6.multiply(224.04462830829536d);
        org.apache.commons.math3.complex.Complex complex10 = complex6.tan();
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex16 = complex14.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex18 = complex13.divide(complex16);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex22 = complex20.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex23 = complex22.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList25 = complex22.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex28 = complex26.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex29 = complex26.tanh();
        org.apache.commons.math3.complex.Complex complex31 = complex26.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex32 = complex22.pow(complex31);
        boolean boolean33 = complex13.equals((java.lang.Object) complex32);
        org.apache.commons.math3.complex.Complex complex34 = complex13.sqrt();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex38 = complex36.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex39 = complex38.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex38.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex42 = complex38.sinh();
        org.apache.commons.math3.complex.Complex complex43 = complex38.asin();
        org.apache.commons.math3.complex.Complex complex44 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex45 = complex38.divide(complex44);
        org.apache.commons.math3.complex.Complex complex47 = complex44.divide(10.0d);
        double double48 = complex44.getReal();
        org.apache.commons.math3.complex.Complex complex51 = complex44.createComplex((double) (short) 10, (double) 0L);
        org.apache.commons.math3.complex.Complex complex52 = complex13.multiply(complex51);
        org.apache.commons.math3.complex.Complex complex53 = complex10.subtract(complex13);
        org.apache.commons.math3.complex.Complex complex54 = complex3.subtract(complex10);
        org.apache.commons.math3.complex.Complex complex57 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex58 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex60 = complex58.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex61 = complex60.conjugate();
        org.apache.commons.math3.complex.Complex complex62 = complex57.divide(complex60);
        org.apache.commons.math3.complex.Complex complex64 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex66 = complex64.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex67 = complex66.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList69 = complex66.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex70 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex72 = complex70.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex73 = complex70.tanh();
        org.apache.commons.math3.complex.Complex complex75 = complex70.subtract((double) '#');
        org.apache.commons.math3.complex.Complex complex76 = complex66.pow(complex75);
        boolean boolean77 = complex57.equals((java.lang.Object) complex76);
        org.apache.commons.math3.complex.Complex complex78 = complex76.sin();
        org.apache.commons.math3.complex.Complex complex80 = complex76.divide((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex81 = complex10.multiply(complex76);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList83 = complex76.nthRoot((int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex32 and complex81", complex32.equals(complex81) ? complex32.hashCode() == complex81.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        java.lang.Object obj3 = complex1.readResolve();
        org.apache.commons.math3.complex.Complex complex4 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex8 = complex5.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = complex5.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(224.04462830829536d);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex5.sinh();
        org.apache.commons.math3.complex.Complex complex10 = complex5.asin();
        org.apache.commons.math3.complex.Complex complex12 = complex10.subtract((double) (short) 1);
        double double13 = complex12.abs();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex17.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex17.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex21 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex22 = complex21.asin();
        org.apache.commons.math3.complex.Complex complex23 = complex22.reciprocal();
        boolean boolean24 = complex12.equals((java.lang.Object) complex23);
        org.apache.commons.math3.complex.Complex complex25 = complex1.multiply(complex12);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((int) (byte) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex27.cos();
        org.apache.commons.math3.complex.Complex complex30 = complex27.divide((double) 10.0f);
        org.apache.commons.math3.complex.Complex complex32 = complex27.divide((-31.41592653589793d));
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex34 = complex33.negate();
        double double35 = complex34.getReal();
        org.apache.commons.math3.complex.Complex complex36 = complex27.multiply(complex34);
        org.apache.commons.math3.complex.Complex complex38 = complex34.multiply((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex33 and complex36", complex33.equals(complex36) ? complex33.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.divide(complex3);
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex8 = complex7.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex11 = complex9.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math3.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math3.complex.Complex complex14 = complex8.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex15 = complex3.pow(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex3.sqrt1z();
        org.apache.commons.math3.complex.Complex complex17 = complex3.sqrt();
        org.apache.commons.math3.complex.Complex complex18 = complex17.conjugate();
        org.apache.commons.math3.complex.Complex complex19 = complex18.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex18", complex17.equals(complex18) ? complex17.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex7.asin();
        org.apache.commons.math3.complex.Complex complex9 = complex8.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex16 = complex14.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex17 = complex16.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex16.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex21 = complex16.asin();
        org.apache.commons.math3.complex.Complex complex23 = complex21.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex27 = complex25.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex28 = complex25.reciprocal();
        org.apache.commons.math3.complex.Complex complex29 = complex23.divide(complex25);
        org.apache.commons.math3.complex.Complex complex30 = complex11.subtract(complex25);
        org.apache.commons.math3.complex.Complex complex31 = complex9.divide(complex25);
        org.apache.commons.math3.complex.Complex complex32 = complex25.tanh();
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.valueOf(1.0d);
        org.apache.commons.math3.complex.Complex complex35 = complex25.add(complex34);
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex39 = complex37.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex40 = complex39.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList42 = complex39.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex43 = complex39.sinh();
        org.apache.commons.math3.complex.Complex complex44 = complex39.asin();
        org.apache.commons.math3.complex.Complex complex45 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex46 = complex39.divide(complex45);
        org.apache.commons.math3.complex.Complex complex47 = complex39.negate();
        org.apache.commons.math3.complex.Complex complex48 = complex47.acos();
        org.apache.commons.math3.complex.Complex complex49 = org.apache.commons.math3.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math3.complex.Complex> complexList51 = complex49.nthRoot(1);
        org.apache.commons.math3.complex.Complex complex53 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex55 = complex53.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex56 = complex53.reciprocal();
        org.apache.commons.math3.complex.Complex complex58 = complex53.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex59 = complex49.divide(complex58);
        org.apache.commons.math3.complex.Complex complex61 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex63 = complex61.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex64 = complex61.reciprocal();
        org.apache.commons.math3.complex.Complex complex65 = complex61.cos();
        org.apache.commons.math3.complex.Complex complex67 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex69 = complex67.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex70 = complex69.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList72 = complex69.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex73 = complex69.sinh();
        org.apache.commons.math3.complex.Complex complex74 = complex69.asin();
        org.apache.commons.math3.complex.Complex complex75 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex76 = complex69.divide(complex75);
        org.apache.commons.math3.complex.Complex complex78 = complex75.divide(10.0d);
        org.apache.commons.math3.complex.Complex complex79 = complex61.add(complex78);
        org.apache.commons.math3.complex.Complex complex80 = complex59.divide(complex78);
        org.apache.commons.math3.complex.Complex complex83 = complex59.createComplex((double) (-1), 10.0d);
        org.apache.commons.math3.complex.Complex complex84 = complex83.negate();
        org.apache.commons.math3.complex.Complex complex85 = complex84.sin();
        org.apache.commons.math3.complex.Complex complex86 = complex48.add(complex84);
        boolean boolean87 = complex35.equals((java.lang.Object) complex48);
        org.apache.commons.math3.complex.Complex complex89 = complex48.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass90 = complex48.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex89", complex30.equals(complex89) ? complex30.hashCode() == complex89.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex7.conjugate();
        java.lang.Object obj9 = complex7.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex8", complex7.equals(complex8) ? complex7.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math3.complex.Complex complex10 = complex3.subtract(complex8);
        org.apache.commons.math3.complex.Complex complex12 = complex3.multiply((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply(0.9999999958776927d);
        org.apache.commons.math3.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math3.complex.Complex complex16 = complex15.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex15", complex14.equals(complex15) ? complex14.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        double double3 = complex0.getImaginary();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex9 = complex0.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math3.complex.Complex complex11 = complex9.log();
        org.apache.commons.math3.complex.Complex complex13 = complex11.add(3.166218219036781d);
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex16.cos();
        org.apache.commons.math3.complex.Complex complex18 = complex16.atan();
        org.apache.commons.math3.complex.Complex complex19 = complex13.multiply(complex16);
        org.apache.commons.math3.complex.Complex complex21 = complex19.divide(0.9999999958776927d);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex25 = complex24.cosh();
        org.apache.commons.math3.complex.Complex complex26 = complex22.divide(complex25);
        org.apache.commons.math3.complex.Complex complex27 = complex25.sqrt1z();
        org.apache.commons.math3.complex.Complex complex28 = complex27.sqrt1z();
        org.apache.commons.math3.complex.Complex complex29 = complex27.acos();
        org.apache.commons.math3.complex.ComplexField complexField30 = complex27.getField();
        org.apache.commons.math3.complex.Complex complex31 = complex27.sqrt1z();
        org.apache.commons.math3.complex.Complex complex32 = complex27.exp();
        org.apache.commons.math3.complex.Complex complex33 = complex19.multiply(complex27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex25", complex17.equals(complex25) ? complex17.hashCode() == complex25.hashCode() : true);
    }
}

