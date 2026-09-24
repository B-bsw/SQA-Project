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
        double double1 = complex0.abs();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 10, (double) (short) 0);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        double double4 = complex3.abs();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex8.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList11 = complex8.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex15 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex12.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex3.multiply(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex2.divide(complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex19", complex3.equals(complex19) ? complex3.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math.complex.Complex> complexList2 = complex0.nthRoot(1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.negate();
        org.apache.commons.math.complex.Complex complex5 = complex0.multiply(complex4);
        boolean boolean6 = complex0.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex14.multiply((int) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex1.reciprocal();
        org.apache.commons.math.complex.Complex complex5 = complex1.cos();
        org.apache.commons.math.complex.Complex complex7 = complex1.add((double) 0.0f);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math.complex.Complex complex18 = complex7.subtract(complex16);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.negate();
        boolean boolean21 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex24 = complex22.divide(0.0d);
        double double25 = complex22.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex29 = complex22.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex20.divide(complex29);
        double double31 = complex30.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex30", complex19.equals(complex30) ? complex19.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex19 = complex17.divide(0.0d);
        org.apache.commons.math.complex.Complex complex20 = complex17.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex17.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex25 = complex23.add((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex27 = complex23.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex28 = complex0.pow(complex27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex1.reciprocal();
        org.apache.commons.math.complex.Complex complex5 = complex1.cos();
        org.apache.commons.math.complex.Complex complex7 = complex1.add((double) 0.0f);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math.complex.Complex complex18 = complex7.subtract(complex16);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.negate();
        boolean boolean21 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex24 = complex22.divide(0.0d);
        double double25 = complex22.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex29 = complex22.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex20.divide(complex29);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex32 = complex31.negate();
        org.apache.commons.math.complex.Complex complex33 = complex29.subtract(complex31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex30", complex19.equals(complex30) ? complex19.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100.0f);
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        java.lang.String str3 = complex1.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.sin();
        boolean boolean25 = complex23.equals((java.lang.Object) true);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = complex29.atan();
        double double33 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex34 = complex23.divide(complex32);
        org.apache.commons.math.complex.Complex complex35 = complex34.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex34", complex21.equals(complex34) ? complex21.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex0.reciprocal();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex8.divide(complex11);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex17.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList20 = complex17.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex21.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex21.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex27 = complex17.pow(complex26);
        boolean boolean28 = complex8.equals((java.lang.Object) complex27);
        org.apache.commons.math.complex.Complex complex29 = complex27.sin();
        org.apache.commons.math.complex.Complex complex30 = complex4.multiply(complex27);
        java.lang.String str31 = complex4.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex30", complex27.equals(complex30) ? complex27.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 10L);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt1z();
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex4);
        java.lang.String str9 = complex1.toString();
        org.apache.commons.math.complex.Complex complex10 = complex1.conjugate();
        java.lang.Object obj11 = complex1.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.sin();
        boolean boolean25 = complex23.equals((java.lang.Object) true);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = complex29.atan();
        double double33 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex34 = complex23.divide(complex32);
        org.apache.commons.math.complex.Complex complex36 = new org.apache.commons.math.complex.Complex((double) 10L);
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex39 = complex37.divide(0.0d);
        org.apache.commons.math.complex.Complex complex40 = complex39.conjugate();
        org.apache.commons.math.complex.Complex complex41 = complex39.sqrt1z();
        boolean boolean42 = complex39.isInfinite();
        org.apache.commons.math.complex.Complex complex43 = complex36.add(complex39);
        java.lang.String str44 = complex36.toString();
        org.apache.commons.math.complex.Complex complex45 = complex32.multiply(complex36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex34", complex21.equals(complex34) ? complex21.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100.0f);
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex2.add(1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex14.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex0.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex8 = complex6.add(223.35075402042244d);
        org.apache.commons.math.complex.Complex complex10 = complex6.multiply((int) (short) 0);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf(0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex6.add(complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex12", complex10.equals(complex12) ? complex10.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math.complex.Complex> complexList2 = complex0.nthRoot(1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.negate();
        org.apache.commons.math.complex.Complex complex5 = complex0.multiply(complex4);
        double double6 = complex5.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.sin();
        boolean boolean25 = complex23.equals((java.lang.Object) true);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = complex29.atan();
        double double33 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex34 = complex23.divide(complex32);
        org.apache.commons.math.complex.Complex complex35 = complex23.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex34", complex21.equals(complex34) ? complex21.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.sin();
        org.apache.commons.math.complex.Complex complex25 = complex21.divide((double) (short) -1);
        org.apache.commons.math.complex.Complex complex27 = complex21.pow(224.04462830829536d);
        org.apache.commons.math.complex.Complex complex28 = complex21.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = complex28.reciprocal();
        double double30 = complex29.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex28 and complex29", complex28.equals(complex29) ? complex28.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.sin();
        boolean boolean25 = complex23.equals((java.lang.Object) true);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = complex29.atan();
        double double33 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex34 = complex23.divide(complex32);
        org.apache.commons.math.complex.Complex complex36 = complex23.multiply((double) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex34", complex21.equals(complex34) ? complex21.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex0.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex0.reciprocal();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex8.divide(complex11);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex17.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList20 = complex17.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex21.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex21.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex27 = complex17.pow(complex26);
        boolean boolean28 = complex8.equals((java.lang.Object) complex27);
        org.apache.commons.math.complex.Complex complex29 = complex27.sin();
        org.apache.commons.math.complex.Complex complex30 = complex4.multiply(complex27);
        double double31 = complex27.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex30", complex27.equals(complex30) ? complex27.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.sin();
        boolean boolean25 = complex23.equals((java.lang.Object) true);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = complex29.atan();
        double double33 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex34 = complex23.divide(complex32);
        double double35 = complex32.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex34", complex21.equals(complex34) ? complex21.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.sin();
        org.apache.commons.math.complex.Complex complex25 = complex21.divide((double) (short) -1);
        org.apache.commons.math.complex.Complex complex27 = complex21.pow(224.04462830829536d);
        org.apache.commons.math.complex.Complex complex28 = complex21.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = complex28.reciprocal();
        java.lang.String str30 = complex28.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex28 and complex29", complex28.equals(complex29) ? complex28.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(0.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.conjugate();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex13.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList16 = complex13.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex19 = complex17.divide(0.0d);
        org.apache.commons.math.complex.Complex complex20 = complex17.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex17.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex23 = complex13.pow(complex22);
        boolean boolean24 = complex4.equals((java.lang.Object) complex23);
        org.apache.commons.math.complex.Complex complex25 = complex23.sin();
        org.apache.commons.math.complex.Complex complex27 = complex23.divide((double) (short) -1);
        org.apache.commons.math.complex.Complex complex29 = complex23.pow(224.04462830829536d);
        org.apache.commons.math.complex.Complex complex30 = complex23.sqrt1z();
        org.apache.commons.math.complex.Complex complex31 = complex30.tan();
        org.apache.commons.math.complex.Complex complex32 = complex1.divide(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex1", complex0.equals(complex1) ? complex0.hashCode() == complex1.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math.complex.Complex complex19 = complex15.cos();
        org.apache.commons.math.complex.Complex complex20 = complex11.subtract(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex19.atan();
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex22.subtract((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex27 = complex24.createComplex((double) (short) 100, (-0.09966865249116202d));
        org.apache.commons.math.complex.Complex complex28 = complex8.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex24.conjugate();
        org.apache.commons.math.complex.Complex complex30 = complex29.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex29", complex22.equals(complex29) ? complex22.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex6.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList9 = complex6.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex10 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex6.asin();
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math.complex.Complex complex19 = complex13.divide(complex15);
        org.apache.commons.math.complex.Complex complex20 = complex1.subtract(complex15);
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex22", complex20.equals(complex22) ? complex20.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex14.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex8 = complex3.add(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex8.sin();
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex18 = complex16.divide(0.0d);
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex15.divide(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex11.subtract(complex15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex12", complex11.equals(complex12) ? complex11.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex1.reciprocal();
        org.apache.commons.math.complex.Complex complex5 = complex1.cos();
        org.apache.commons.math.complex.Complex complex7 = complex1.add((double) 0.0f);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math.complex.Complex complex18 = complex7.subtract(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex18.divide(8.837171286670872d);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex27 = complex25.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex28 = complex27.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList30 = complex27.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex31 = complex27.sinh();
        org.apache.commons.math.complex.Complex complex32 = complex27.asin();
        org.apache.commons.math.complex.Complex complex34 = complex32.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex38 = complex36.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex39 = complex36.reciprocal();
        org.apache.commons.math.complex.Complex complex40 = complex34.divide(complex36);
        org.apache.commons.math.complex.Complex complex41 = complex22.subtract(complex36);
        org.apache.commons.math.complex.Complex complex42 = complex41.atan();
        org.apache.commons.math.complex.Complex complex43 = complex41.conjugate();
        org.apache.commons.math.complex.Complex complex44 = complex18.divide(complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex41 and complex43", complex41.equals(complex43) ? complex41.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 10.0f, 0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex5 = complex3.divide((double) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex20 = complex18.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex21 = complex20.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList23 = complex20.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex24 = complex20.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex20.log();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex25.add(complex29);
        org.apache.commons.math.complex.Complex complex33 = complex29.subtract(90.0d);
        org.apache.commons.math.complex.Complex complex34 = complex29.tanh();
        org.apache.commons.math.complex.Complex complex35 = complex14.pow(complex34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex0.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex8 = complex6.add(223.35075402042244d);
        org.apache.commons.math.complex.Complex complex10 = complex6.multiply((int) (short) 0);
        org.apache.commons.math.complex.Complex complex11 = complex6.reciprocal();
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex(0.0d, 0.0d);
        boolean boolean15 = complex11.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex14", complex10.equals(complex14) ? complex10.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math.complex.Complex> complexList2 = complex0.nthRoot(1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.negate();
        org.apache.commons.math.complex.Complex complex5 = complex0.multiply(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex0.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.sin();
        org.apache.commons.math.complex.Complex complex24 = complex21.asin();
        org.apache.commons.math.complex.Complex complex25 = complex21.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex24", complex21.equals(complex24) ? complex21.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.sin();
        org.apache.commons.math.complex.Complex complex25 = complex21.divide((double) (short) -1);
        org.apache.commons.math.complex.Complex complex27 = complex21.pow(224.04462830829536d);
        org.apache.commons.math.complex.Complex complex28 = complex21.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = complex28.reciprocal();
        org.apache.commons.math.complex.Complex complex30 = complex29.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex28 and complex29", complex28.equals(complex29) ? complex28.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(2.2426113737960498E223d);
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.ComplexField complexField3 = complex1.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 100.0f);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf(35.138169410605144d);
        org.apache.commons.math.complex.Complex complex4 = complex1.subtract(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex4.negate();
        org.apache.commons.math.complex.Complex complex6 = complex4.conjugate();
        double double7 = complex4.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex1.reciprocal();
        org.apache.commons.math.complex.Complex complex5 = complex1.cos();
        org.apache.commons.math.complex.Complex complex7 = complex1.add((double) 0.0f);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math.complex.Complex complex18 = complex7.subtract(complex16);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.negate();
        boolean boolean21 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex22 = complex7.atan();
        org.apache.commons.math.complex.Complex complex24 = complex7.subtract((-0.09966865249116202d));
        org.apache.commons.math.complex.Complex complex25 = complex24.conjugate();
        org.apache.commons.math.complex.Complex complex27 = complex24.pow(3.113028995751033d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex24 and complex25", complex24.equals(complex25) ? complex24.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex1.reciprocal();
        org.apache.commons.math.complex.Complex complex5 = complex1.cos();
        org.apache.commons.math.complex.Complex complex7 = complex1.add((double) 0.0f);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math.complex.Complex complex18 = complex7.subtract(complex16);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.negate();
        boolean boolean21 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex24 = complex22.divide(0.0d);
        double double25 = complex22.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex29 = complex22.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex20.divide(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex29.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex30", complex19.equals(complex30) ? complex19.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex6.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList9 = complex6.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex10 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex6.asin();
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math.complex.Complex complex19 = complex13.divide(complex15);
        org.apache.commons.math.complex.Complex complex20 = complex1.subtract(complex15);
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex25 = complex23.divide(0.0d);
        org.apache.commons.math.complex.Complex complex26 = complex23.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex23.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex31 = complex29.add(223.35075402042244d);
        org.apache.commons.math.complex.Complex complex33 = complex29.multiply((int) (short) 0);
        org.apache.commons.math.complex.Complex complex34 = complex29.sqrt();
        org.apache.commons.math.complex.Complex complex35 = complex20.pow(complex29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex22", complex20.equals(complex22) ? complex20.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.negate();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        java.lang.Object obj4 = complex0.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.ComplexField complexField7 = complex5.getField();
        org.apache.commons.math.complex.Complex complex8 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex9 = complex8.log();
        org.apache.commons.math.complex.Complex complex10 = complex3.multiply(complex8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex6", complex3.equals(complex6) ? complex3.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex0.reciprocal();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex8.divide(complex11);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex17.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList20 = complex17.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex21.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex21.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex27 = complex17.pow(complex26);
        boolean boolean28 = complex8.equals((java.lang.Object) complex27);
        org.apache.commons.math.complex.Complex complex29 = complex27.sin();
        org.apache.commons.math.complex.Complex complex30 = complex4.multiply(complex27);
        org.apache.commons.math.complex.Complex complex31 = complex4.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex30", complex27.equals(complex30) ? complex27.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        java.lang.Object obj3 = complex1.readResolve();
        org.apache.commons.math.complex.Complex complex4 = complex1.exp();
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) ' ');
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex5.conjugate();
        boolean boolean10 = complex5.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex9", complex5.equals(complex9) ? complex5.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex15 = complex12.reciprocal();
        org.apache.commons.math.complex.Complex complex16 = complex10.divide(complex12);
        org.apache.commons.math.complex.Complex complex17 = complex12.cos();
        org.apache.commons.math.complex.Complex complex18 = complex12.cos();
        org.apache.commons.math.complex.Complex complex19 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex12.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex19", complex1.equals(complex19) ? complex1.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        double double3 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex0.atan();
        org.apache.commons.math.complex.Complex complex9 = complex0.conjugate();
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex9.log();
        org.apache.commons.math.complex.Complex complex12 = complex9.negate();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex15 = complex13.divide(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex13.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex13.sin();
        org.apache.commons.math.complex.Complex complex18 = complex12.divide(complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex12", complex13.equals(complex12) ? complex13.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(2.2426113737960498E223d);
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply((int) (byte) 0);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) (short) 10);
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract((double) 100);
        org.apache.commons.math.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math.complex.Complex complex12 = complex3.multiply(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex3.acos();
        org.apache.commons.math.complex.Complex complex14 = complex3.atan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        double double18 = complex15.getImaginary();
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex22 = complex15.add(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex22.negate();
        org.apache.commons.math.complex.Complex complex24 = complex23.conjugate();
        org.apache.commons.math.complex.Complex complex25 = complex23.atan();
        boolean boolean26 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex30 = complex28.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex31 = complex30.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList33 = complex30.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex34 = complex30.sinh();
        org.apache.commons.math.complex.Complex complex35 = complex34.asin();
        org.apache.commons.math.complex.Complex complex36 = complex35.reciprocal();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex39 = complex38.cosh();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex43 = complex41.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex44 = complex43.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList46 = complex43.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex47 = complex43.sinh();
        org.apache.commons.math.complex.Complex complex48 = complex43.asin();
        org.apache.commons.math.complex.Complex complex50 = complex48.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex54 = complex52.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex55 = complex52.reciprocal();
        org.apache.commons.math.complex.Complex complex56 = complex50.divide(complex52);
        org.apache.commons.math.complex.Complex complex57 = complex38.subtract(complex52);
        org.apache.commons.math.complex.Complex complex58 = complex36.divide(complex52);
        org.apache.commons.math.complex.Complex complex61 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex62 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex64 = complex62.divide(0.0d);
        org.apache.commons.math.complex.Complex complex65 = complex64.conjugate();
        org.apache.commons.math.complex.Complex complex66 = complex61.divide(complex64);
        org.apache.commons.math.complex.Complex complex67 = complex52.divide(complex66);
        org.apache.commons.math.complex.Complex complex68 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex70 = complex68.pow(0.0d);
        org.apache.commons.math.complex.Complex complex71 = complex66.divide(complex68);
        org.apache.commons.math.complex.Complex complex72 = complex23.subtract(complex68);
        org.apache.commons.math.complex.Complex complex73 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex75 = complex73.divide(0.0d);
        org.apache.commons.math.complex.Complex complex78 = complex75.createComplex((double) 100, (double) 1L);
        org.apache.commons.math.complex.Complex complex79 = complex68.subtract(complex78);
        org.apache.commons.math.complex.Complex complex80 = complex14.divide(complex68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex39", complex3.equals(complex39) ? complex3.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 10L);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt1z();
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex4);
        java.lang.String str9 = complex1.toString();
        org.apache.commons.math.complex.Complex complex10 = complex1.conjugate();
        boolean boolean11 = complex1.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math.complex.Complex> complexList2 = complex0.nthRoot(1);
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex4.reciprocal();
        org.apache.commons.math.complex.Complex complex9 = complex4.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex10 = complex0.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex15 = complex12.reciprocal();
        org.apache.commons.math.complex.Complex complex17 = complex12.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex19 = complex17.pow((double) (-1));
        org.apache.commons.math.complex.Complex complex21 = complex19.divide((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex22 = complex10.divide(complex19);
        double double23 = complex10.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex22", complex0.equals(complex22) ? complex0.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math.complex.Complex> complexList2 = complex0.nthRoot(1);
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex4.reciprocal();
        org.apache.commons.math.complex.Complex complex9 = complex4.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex10 = complex0.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex15 = complex12.reciprocal();
        org.apache.commons.math.complex.Complex complex17 = complex12.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex19 = complex17.pow((double) (-1));
        org.apache.commons.math.complex.Complex complex21 = complex19.divide((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex22 = complex10.divide(complex19);
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex22", complex0.equals(complex22) ? complex0.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        java.lang.Object obj3 = complex1.readResolve();
        org.apache.commons.math.complex.Complex complex4 = complex1.exp();
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex8 = complex5.conjugate();
        java.lang.Class<?> wildcardClass9 = complex5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        java.lang.Object obj3 = complex1.readResolve();
        org.apache.commons.math.complex.Complex complex4 = complex1.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply((int) (byte) 0);
        org.apache.commons.math.complex.Complex complex10 = complex8.pow((double) (short) 10);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex13 = complex11.divide(0.0d);
        double double14 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex18 = complex11.add(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex10.pow(complex17);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex23 = complex21.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex24 = complex23.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList26 = complex23.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex27 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex28 = complex23.asin();
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex10.add(complex29);
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex36 = complex34.divide(0.0d);
        org.apache.commons.math.complex.Complex complex37 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex38 = complex33.divide(complex36);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex42 = complex40.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex43 = complex42.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList45 = complex42.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex48 = complex46.divide(0.0d);
        org.apache.commons.math.complex.Complex complex49 = complex46.tanh();
        org.apache.commons.math.complex.Complex complex51 = complex46.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex52 = complex42.pow(complex51);
        boolean boolean53 = complex33.equals((java.lang.Object) complex52);
        org.apache.commons.math.complex.Complex complex54 = complex52.sin();
        boolean boolean55 = complex29.equals((java.lang.Object) complex52);
        org.apache.commons.math.complex.Complex complex56 = complex52.conjugate();
        org.apache.commons.math.complex.Complex complex57 = complex4.pow(complex52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex52 and complex56", complex52.equals(complex56) ? complex52.hashCode() == complex56.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex6.reciprocal();
        org.apache.commons.math.complex.Complex complex10 = complex6.cos();
        org.apache.commons.math.complex.Complex complex11 = complex2.subtract(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex16.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList19 = complex16.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex16.asin();
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        boolean boolean23 = complex2.equals((java.lang.Object) complex22);
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply((int) 'a');
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((-0.0d));
        org.apache.commons.math.complex.Complex complex29 = complex25.multiply((-2.094672689364676E-87d));
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) 1, 11013.232920103323d);
        org.apache.commons.math.complex.Complex complex33 = complex32.cos();
        org.apache.commons.math.complex.Complex complex34 = complex25.pow(complex32);
        org.apache.commons.math.complex.Complex complex36 = complex32.add((-3.141592653589793d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex34", complex27.equals(complex34) ? complex27.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex1.atan();
        org.apache.commons.math.complex.Complex complex6 = complex1.add((double) 1);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex10 = complex8.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList13 = complex10.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex14 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex15 = complex10.asin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex17 = complex10.divide(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex16.divide(10.0d);
        double double20 = complex16.getReal();
        org.apache.commons.math.complex.Complex complex23 = complex16.createComplex((double) (short) 10, (double) 0L);
        org.apache.commons.math.complex.Complex complex24 = complex1.pow(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex24.asin();
        org.apache.commons.math.complex.Complex complex27 = complex24.divide((double) 1L);
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex33 = complex31.divide(0.0d);
        org.apache.commons.math.complex.Complex complex34 = complex33.conjugate();
        org.apache.commons.math.complex.Complex complex35 = complex30.divide(complex33);
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex39 = complex37.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex40 = complex39.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList42 = complex39.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex45 = complex43.divide(0.0d);
        org.apache.commons.math.complex.Complex complex46 = complex43.tanh();
        org.apache.commons.math.complex.Complex complex48 = complex43.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex49 = complex39.pow(complex48);
        boolean boolean50 = complex30.equals((java.lang.Object) complex49);
        org.apache.commons.math.complex.Complex complex51 = complex49.sin();
        org.apache.commons.math.complex.Complex complex52 = complex49.asin();
        org.apache.commons.math.complex.Complex complex53 = complex24.subtract(complex49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex52", complex17.equals(complex52) ? complex17.hashCode() == complex52.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(10.0d);
        org.apache.commons.math.complex.Complex complex2 = complex1.log();
        org.apache.commons.math.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        java.lang.Object obj7 = complex5.readResolve();
        org.apache.commons.math.complex.Complex complex8 = complex5.exp();
        org.apache.commons.math.complex.Complex complex9 = complex5.tan();
        org.apache.commons.math.complex.Complex complex11 = complex9.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex12 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex1.add(complex9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex12", complex9.equals(complex12) ? complex9.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex0.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex8 = complex6.add(223.35075402042244d);
        org.apache.commons.math.complex.Complex complex10 = complex6.multiply((int) (short) 0);
        org.apache.commons.math.complex.Complex complex11 = complex6.reciprocal();
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex(0.0d, 0.0d);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex23 = complex21.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex24 = complex21.reciprocal();
        org.apache.commons.math.complex.Complex complex25 = complex21.cos();
        org.apache.commons.math.complex.Complex complex26 = complex17.subtract(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex17.sinh();
        org.apache.commons.math.complex.Complex complex28 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex29 = complex28.acos();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex32 = complex30.divide(0.0d);
        org.apache.commons.math.complex.Complex complex33 = complex30.tanh();
        org.apache.commons.math.complex.Complex complex35 = complex30.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = complex28.add(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex14.add(complex36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex14", complex10.equals(complex14) ? complex10.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex7.asin();
        org.apache.commons.math.complex.Complex complex9 = complex8.reciprocal();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex16.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList19 = complex16.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex16.asin();
        org.apache.commons.math.complex.Complex complex23 = complex21.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex27 = complex25.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex28 = complex25.reciprocal();
        org.apache.commons.math.complex.Complex complex29 = complex23.divide(complex25);
        org.apache.commons.math.complex.Complex complex30 = complex11.subtract(complex25);
        org.apache.commons.math.complex.Complex complex31 = complex9.divide(complex25);
        org.apache.commons.math.complex.Complex complex32 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.valueOf(1.0d);
        org.apache.commons.math.complex.Complex complex35 = complex25.add(complex34);
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex39 = complex37.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex40 = complex39.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList42 = complex39.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex43 = complex39.sinh();
        org.apache.commons.math.complex.Complex complex44 = complex39.asin();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex46 = complex39.divide(complex45);
        org.apache.commons.math.complex.Complex complex47 = complex39.negate();
        org.apache.commons.math.complex.Complex complex48 = complex47.acos();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math.complex.Complex> complexList51 = complex49.nthRoot(1);
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex55 = complex53.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex56 = complex53.reciprocal();
        org.apache.commons.math.complex.Complex complex58 = complex53.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex59 = complex49.divide(complex58);
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex63 = complex61.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex64 = complex61.reciprocal();
        org.apache.commons.math.complex.Complex complex65 = complex61.cos();
        org.apache.commons.math.complex.Complex complex67 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex69 = complex67.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex70 = complex69.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList72 = complex69.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex73 = complex69.sinh();
        org.apache.commons.math.complex.Complex complex74 = complex69.asin();
        org.apache.commons.math.complex.Complex complex75 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex76 = complex69.divide(complex75);
        org.apache.commons.math.complex.Complex complex78 = complex75.divide(10.0d);
        org.apache.commons.math.complex.Complex complex79 = complex61.add(complex78);
        org.apache.commons.math.complex.Complex complex80 = complex59.divide(complex78);
        org.apache.commons.math.complex.Complex complex83 = complex59.createComplex((double) (-1), 10.0d);
        org.apache.commons.math.complex.Complex complex84 = complex83.negate();
        org.apache.commons.math.complex.Complex complex85 = complex84.sin();
        org.apache.commons.math.complex.Complex complex86 = complex48.add(complex84);
        boolean boolean87 = complex35.equals((java.lang.Object) complex48);
        org.apache.commons.math.complex.Complex complex89 = complex48.multiply((int) (byte) 0);
        org.apache.commons.math.complex.Complex complex90 = complex89.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex89", complex30.equals(complex89) ? complex30.hashCode() == complex89.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10L);
        org.apache.commons.math.complex.Complex complex2 = complex1.tan();
        org.apache.commons.math.complex.Complex complex3 = complex1.reciprocal();
        org.apache.commons.math.complex.Complex complex5 = complex3.multiply((double) 1.0f);
        org.apache.commons.math.complex.Complex complex7 = complex3.pow(11013.232920103323d);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) 10L);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex13 = complex11.divide(0.0d);
        org.apache.commons.math.complex.Complex complex14 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex13.sqrt1z();
        boolean boolean16 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex17 = complex10.add(complex13);
        java.lang.String str18 = complex10.toString();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex22 = complex20.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex22.cos();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex27 = complex25.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex28 = complex27.cos();
        org.apache.commons.math.complex.Complex complex29 = complex22.subtract(complex27);
        double double30 = complex29.getImaginary();
        org.apache.commons.math.complex.Complex complex31 = complex29.atan();
        org.apache.commons.math.complex.Complex complex32 = complex29.reciprocal();
        org.apache.commons.math.complex.Complex complex34 = complex32.multiply(35.138169410605144d);
        org.apache.commons.math.complex.Complex complex35 = complex10.add(complex32);
        org.apache.commons.math.complex.Complex complex36 = complex7.divide(complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex29", complex7.equals(complex29) ? complex7.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math.complex.Complex> complexList2 = complex0.nthRoot(1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.negate();
        org.apache.commons.math.complex.Complex complex5 = complex0.multiply(complex4);
        java.lang.Object obj6 = complex5.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        double double3 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex7.negate();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex11.tan();
        org.apache.commons.math.complex.Complex complex14 = complex8.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex18 = complex16.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex18.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList21 = complex18.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex22 = complex18.sinh();
        org.apache.commons.math.complex.Complex complex23 = complex18.asin();
        org.apache.commons.math.complex.Complex complex25 = complex18.pow(0.0d);
        org.apache.commons.math.complex.Complex complex26 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex27 = complex8.subtract(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex26", complex18.equals(complex26) ? complex18.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex1.reciprocal();
        org.apache.commons.math.complex.Complex complex5 = complex1.cos();
        org.apache.commons.math.complex.Complex complex7 = complex1.add((double) 0.0f);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math.complex.Complex complex18 = complex7.subtract(complex16);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.negate();
        boolean boolean21 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex24 = complex22.divide(0.0d);
        double double25 = complex22.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex29 = complex22.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex20.divide(complex29);
        java.lang.Object obj31 = complex29.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex30", complex19.equals(complex30) ? complex19.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math.complex.Complex complex10 = complex3.pow(0.0d);
        org.apache.commons.math.complex.Complex complex11 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex3.add(100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex11", complex3.equals(complex11) ? complex3.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math.complex.Complex complex10 = complex3.pow(0.0d);
        org.apache.commons.math.complex.Complex complex11 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex3.subtract(1.222149000029709E43d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex11", complex3.equals(complex11) ? complex3.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.asin();
        org.apache.commons.math.complex.Complex complex3 = complex1.pow(1.0000000000000113E99d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex1", complex0.equals(complex1) ? complex0.hashCode() == complex1.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex5.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex15 = complex5.pow(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex0.multiply(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex0.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = complex0.negate();
        org.apache.commons.math.complex.Complex complex2 = complex1.reciprocal();
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex4.nthRoot(1);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex10 = complex8.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex11 = complex8.reciprocal();
        org.apache.commons.math.complex.Complex complex13 = complex8.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex14 = complex4.divide(complex13);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex18 = complex16.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex16.reciprocal();
        org.apache.commons.math.complex.Complex complex20 = complex16.cos();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex24 = complex22.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex25 = complex24.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList27 = complex24.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex28 = complex24.sinh();
        org.apache.commons.math.complex.Complex complex29 = complex24.asin();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex31 = complex24.divide(complex30);
        org.apache.commons.math.complex.Complex complex33 = complex30.divide(10.0d);
        org.apache.commons.math.complex.Complex complex34 = complex16.add(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex14.divide(complex33);
        org.apache.commons.math.complex.Complex complex38 = complex14.createComplex((double) (-1), 10.0d);
        org.apache.commons.math.complex.Complex complex39 = complex38.negate();
        org.apache.commons.math.complex.Complex complex40 = complex3.pow(complex38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 10L);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt1z();
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex1.add(complex4);
        java.lang.String str9 = complex1.toString();
        org.apache.commons.math.complex.Complex complex10 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        double double3 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex0.atan();
        org.apache.commons.math.complex.Complex complex9 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex0.pow((double) 100L);
        org.apache.commons.math.complex.Complex complex13 = complex0.divide((double) (-1));
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex13", complex9.equals(complex13) ? complex9.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-0.0d), 224.04462830829536d);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex3.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex3.reciprocal();
        org.apache.commons.math.complex.Complex complex8 = complex7.cos();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex20 = complex18.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex21 = complex20.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList23 = complex20.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex26 = complex24.divide(0.0d);
        org.apache.commons.math.complex.Complex complex27 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex29 = complex24.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex30 = complex20.pow(complex29);
        boolean boolean31 = complex11.equals((java.lang.Object) complex30);
        org.apache.commons.math.complex.Complex complex32 = complex30.sin();
        org.apache.commons.math.complex.Complex complex33 = complex7.multiply(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex2.add(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex33", complex30.equals(complex33) ? complex30.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        double double3 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex0.atan();
        org.apache.commons.math.complex.Complex complex9 = complex0.conjugate();
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex13 = complex9.createComplex(100.0199980003999d, (double) 100L);
        org.apache.commons.math.complex.Complex complex14 = complex9.acos();
        org.apache.commons.math.complex.Complex complex15 = complex14.reciprocal();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex22 = complex20.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex22.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList25 = complex22.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex26 = complex22.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex22.asin();
        org.apache.commons.math.complex.Complex complex29 = complex27.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex33 = complex31.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex34 = complex31.reciprocal();
        org.apache.commons.math.complex.Complex complex35 = complex29.divide(complex31);
        org.apache.commons.math.complex.Complex complex36 = complex17.subtract(complex31);
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex39 = complex15.divide(complex36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex36 and complex38", complex36.equals(complex38) ? complex36.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math.complex.Complex complex10 = complex3.subtract(complex8);
        double double11 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex16.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList19 = complex16.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex22 = complex20.divide(0.0d);
        org.apache.commons.math.complex.Complex complex23 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex25 = complex20.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex26 = complex16.pow(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex26.sqrt1z();
        org.apache.commons.math.complex.Complex complex28 = complex12.divide(complex27);
        boolean boolean29 = complex27.isInfinite();
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((-0.09966865249116202d));
        org.apache.commons.math.complex.Complex complex33 = complex31.subtract((double) 1L);
        org.apache.commons.math.complex.Complex complex34 = complex33.conjugate();
        org.apache.commons.math.complex.Complex complex35 = complex27.pow(complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex33 and complex34", complex33.equals(complex34) ? complex33.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.sin();
        boolean boolean25 = complex23.equals((java.lang.Object) true);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = complex29.atan();
        double double33 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex34 = complex23.divide(complex32);
        org.apache.commons.math.complex.Complex complex37 = complex32.createComplex((double) (short) 0, (double) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex34", complex21.equals(complex34) ? complex21.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.add(100.0d);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex7 = complex5.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex8 = complex5.atan();
        org.apache.commons.math.complex.Complex complex10 = complex5.add((double) 1);
        org.apache.commons.math.complex.Complex complex11 = complex5.atan();
        org.apache.commons.math.complex.Complex complex12 = complex3.divide(complex11);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex14.atan();
        org.apache.commons.math.complex.Complex complex19 = complex14.add((double) 1);
        boolean boolean20 = complex11.equals((java.lang.Object) 1);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex21.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex21.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex28 = complex21.divide((-1.0d));
        org.apache.commons.math.complex.Complex complex29 = complex21.log();
        org.apache.commons.math.complex.Complex complex30 = complex21.negate();
        org.apache.commons.math.complex.Complex complex31 = complex11.subtract(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex35 = complex33.divide(0.0d);
        org.apache.commons.math.complex.Complex complex36 = complex33.tanh();
        org.apache.commons.math.complex.Complex complex37 = complex33.reciprocal();
        org.apache.commons.math.complex.Complex complex38 = complex37.cos();
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex38.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex32.pow(complex40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex28 and complex37", complex28.equals(complex37) ? complex28.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) '4');
        org.apache.commons.math.complex.Complex complex3 = complex1.add((-1.0d));
        org.apache.commons.math.complex.Complex complex4 = complex3.conjugate();
        boolean boolean5 = complex3.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex1.reciprocal();
        org.apache.commons.math.complex.Complex complex5 = complex1.cos();
        org.apache.commons.math.complex.Complex complex7 = complex1.add((double) 0.0f);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math.complex.Complex complex18 = complex7.subtract(complex16);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.negate();
        boolean boolean21 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex22 = complex7.atan();
        org.apache.commons.math.complex.Complex complex24 = complex7.subtract((-0.09966865249116202d));
        org.apache.commons.math.complex.Complex complex25 = complex24.conjugate();
        org.apache.commons.math.complex.Complex complex27 = complex24.add(2.2426113737960498E223d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex24 and complex25", complex24.equals(complex25) ? complex24.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = complex0.negate();
        org.apache.commons.math.complex.Complex complex2 = complex1.reciprocal();
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex4.divide(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.sqrt();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex12 = complex10.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex13 = complex10.reciprocal();
        org.apache.commons.math.complex.Complex complex14 = complex10.cos();
        org.apache.commons.math.complex.Complex complex15 = complex6.subtract(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        org.apache.commons.math.complex.Complex complex18 = complex16.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((int) (byte) 0);
        java.lang.Object obj22 = complex19.readResolve();
        org.apache.commons.math.complex.Complex complex23 = complex18.divide(complex19);
        org.apache.commons.math.complex.Complex complex25 = complex19.subtract((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex26 = complex19.exp();
        org.apache.commons.math.complex.Complex complex28 = complex19.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex30 = complex19.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex31 = complex30.sqrt();
        org.apache.commons.math.complex.Complex complex32 = complex2.multiply(complex31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = complex1.tanh();
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        boolean boolean4 = complex2.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex9 = complex7.divide((double) 100L);
        boolean boolean10 = complex7.isInfinite();
        boolean boolean11 = complex7.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = complex7.tan();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.valueOf((double) 1.0f);
        org.apache.commons.math.complex.Complex complex15 = complex14.reciprocal();
        org.apache.commons.math.complex.Complex complex16 = complex12.pow(complex14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex15", complex14.equals(complex15) ? complex14.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        double double3 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex0.atan();
        org.apache.commons.math.complex.Complex complex9 = complex0.cos();
        org.apache.commons.math.complex.Complex complex10 = complex9.reciprocal();
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex10.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex11", complex10.equals(complex11) ? complex10.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.sin();
        boolean boolean25 = complex23.equals((java.lang.Object) true);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = complex29.atan();
        double double33 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex34 = complex23.divide(complex32);
        org.apache.commons.math.complex.Complex complex36 = complex34.subtract(141.43549766589717d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex34", complex21.equals(complex34) ? complex21.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = complex7.divide(0.0d);
        org.apache.commons.math.complex.Complex complex10 = complex7.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex7.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex13 = complex3.pow(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex12.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex12.pow(complex19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex19", complex13.equals(complex19) ? complex13.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100.0f);
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex2.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        java.lang.Object obj3 = complex1.readResolve();
        org.apache.commons.math.complex.Complex complex4 = complex1.exp();
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) ' ');
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex5.conjugate();
        double double10 = complex9.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex9", complex5.equals(complex9) ? complex5.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract((double) (short) 1);
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex8.nthRoot((int) (short) 10);
        org.apache.commons.math.complex.Complex complex13 = complex8.log();
        org.apache.commons.math.complex.Complex complex14 = complex8.sinh();
        boolean boolean15 = complex8.isInfinite();
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) 10L);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex20 = complex18.divide(0.0d);
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        boolean boolean23 = complex20.isInfinite();
        org.apache.commons.math.complex.Complex complex24 = complex17.add(complex20);
        java.lang.String str25 = complex17.toString();
        org.apache.commons.math.complex.Complex complex26 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex27 = complex8.subtract(complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex26", complex1.equals(complex26) ? complex1.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.sin();
        org.apache.commons.math.complex.Complex complex25 = complex21.divide((double) (short) -1);
        org.apache.commons.math.complex.Complex complex27 = complex21.pow(224.04462830829536d);
        org.apache.commons.math.complex.Complex complex28 = complex21.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = complex28.reciprocal();
        org.apache.commons.math.complex.Complex complex30 = complex29.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex28 and complex29", complex28.equals(complex29) ? complex28.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex6.reciprocal();
        org.apache.commons.math.complex.Complex complex10 = complex6.cos();
        org.apache.commons.math.complex.Complex complex11 = complex2.subtract(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex14 = complex12.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((int) (byte) 0);
        java.lang.Object obj18 = complex15.readResolve();
        org.apache.commons.math.complex.Complex complex19 = complex14.divide(complex15);
        org.apache.commons.math.complex.Complex complex20 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex21 = complex14.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex20", complex12.equals(complex20) ? complex12.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.sin();
        org.apache.commons.math.complex.Complex complex24 = complex21.asin();
        double double25 = complex21.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex24", complex21.equals(complex24) ? complex21.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex6.reciprocal();
        org.apache.commons.math.complex.Complex complex10 = complex6.cos();
        org.apache.commons.math.complex.Complex complex11 = complex2.subtract(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex16.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList19 = complex16.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex16.asin();
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        boolean boolean23 = complex2.equals((java.lang.Object) complex22);
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply((int) 'a');
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((-0.0d));
        org.apache.commons.math.complex.Complex complex29 = complex25.multiply((-2.094672689364676E-87d));
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) 1, 11013.232920103323d);
        org.apache.commons.math.complex.Complex complex33 = complex32.cos();
        org.apache.commons.math.complex.Complex complex34 = complex25.pow(complex32);
        double double35 = complex25.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex34", complex27.equals(complex34) ? complex27.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex3.log();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex9.divide(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex8.add(complex12);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex17 = complex15.pow(0.0d);
        double double18 = complex15.getArgument();
        org.apache.commons.math.complex.Complex complex19 = complex8.add(complex15);
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((int) (byte) 0);
        org.apache.commons.math.complex.Complex complex23 = complex21.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex27 = complex26.cos();
        org.apache.commons.math.complex.Complex complex28 = complex26.atan();
        double double29 = complex28.getImaginary();
        org.apache.commons.math.complex.Complex complex30 = complex28.cos();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex33 = complex31.divide(0.0d);
        org.apache.commons.math.complex.Complex complex34 = complex31.tanh();
        org.apache.commons.math.complex.Complex complex35 = complex31.reciprocal();
        org.apache.commons.math.complex.Complex complex36 = complex35.cos();
        org.apache.commons.math.complex.Complex complex38 = complex35.subtract((double) 100.0f);
        org.apache.commons.math.complex.Complex complex39 = complex35.asin();
        org.apache.commons.math.complex.Complex complex40 = complex35.cos();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex44 = complex42.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex45 = complex44.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList47 = complex44.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex48 = complex44.sinh();
        org.apache.commons.math.complex.Complex complex49 = complex44.asin();
        org.apache.commons.math.complex.Complex complex51 = complex49.subtract((double) (short) 1);
        java.util.List<org.apache.commons.math.complex.Complex> complexList53 = complex49.nthRoot((int) (short) 10);
        org.apache.commons.math.complex.Complex complex54 = complex49.log();
        org.apache.commons.math.complex.Complex complex55 = complex35.subtract(complex54);
        org.apache.commons.math.complex.Complex complex56 = complex30.subtract(complex35);
        boolean boolean57 = complex56.isNaN();
        org.apache.commons.math.complex.Complex complex58 = complex23.pow(complex56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex27", complex12.equals(complex27) ? complex12.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex3.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex5.acos();
        org.apache.commons.math.complex.Complex complex8 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex9.subtract((double) ' ');
        org.apache.commons.math.complex.Complex complex12 = complex9.sin();
        org.apache.commons.math.complex.Complex complex13 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex19 = complex17.divide(0.0d);
        org.apache.commons.math.complex.Complex complex20 = complex19.conjugate();
        org.apache.commons.math.complex.Complex complex21 = complex16.divide(complex19);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex25 = complex23.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex26 = complex25.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList28 = complex25.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex31 = complex29.divide(0.0d);
        org.apache.commons.math.complex.Complex complex32 = complex29.tanh();
        org.apache.commons.math.complex.Complex complex34 = complex29.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex35 = complex25.pow(complex34);
        boolean boolean36 = complex16.equals((java.lang.Object) complex35);
        org.apache.commons.math.complex.Complex complex37 = complex35.sin();
        boolean boolean39 = complex37.equals((java.lang.Object) true);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex43 = complex42.cosh();
        org.apache.commons.math.complex.Complex complex44 = complex40.divide(complex43);
        org.apache.commons.math.complex.Complex complex45 = complex43.sqrt1z();
        org.apache.commons.math.complex.Complex complex46 = complex43.atan();
        double double47 = complex46.getImaginary();
        org.apache.commons.math.complex.Complex complex48 = complex37.divide(complex46);
        org.apache.commons.math.complex.Complex complex49 = complex13.pow(complex48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex48", complex0.equals(complex48) ? complex0.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex15 = complex12.reciprocal();
        org.apache.commons.math.complex.Complex complex16 = complex10.divide(complex12);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex19 = complex17.multiply((int) (byte) 0);
        org.apache.commons.math.complex.Complex complex21 = complex19.pow((double) (short) 10);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex24 = complex22.divide(0.0d);
        double double25 = complex22.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex29 = complex22.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex21.pow(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex30.tan();
        org.apache.commons.math.complex.Complex complex32 = complex12.divide(complex30);
        org.apache.commons.math.complex.Complex complex33 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex34 = complex12.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex33", complex1.equals(complex33) ? complex1.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex1.reciprocal();
        org.apache.commons.math.complex.Complex complex5 = complex1.cos();
        org.apache.commons.math.complex.Complex complex7 = complex1.add((double) 0.0f);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math.complex.Complex complex18 = complex7.subtract(complex16);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.negate();
        boolean boolean21 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex24 = complex22.divide(0.0d);
        double double25 = complex22.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex29 = complex22.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex20.divide(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex30.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex30", complex19.equals(complex30) ? complex19.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math.complex.Complex complex19 = complex15.cos();
        org.apache.commons.math.complex.Complex complex20 = complex11.subtract(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex19.atan();
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex22.subtract((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex27 = complex24.createComplex((double) (short) 100, (-0.09966865249116202d));
        org.apache.commons.math.complex.Complex complex28 = complex8.multiply(complex24);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.valueOf(100.0d);
        org.apache.commons.math.complex.Complex complex31 = complex30.cos();
        org.apache.commons.math.complex.Complex complex32 = complex28.divide(complex31);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.negate();
        double double35 = complex34.getReal();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex38 = complex36.divide(0.0d);
        org.apache.commons.math.complex.Complex complex39 = complex38.conjugate();
        org.apache.commons.math.complex.Complex complex40 = complex38.sqrt1z();
        org.apache.commons.math.complex.Complex complex41 = complex38.exp();
        org.apache.commons.math.complex.Complex complex42 = complex41.sinh();
        org.apache.commons.math.complex.Complex complex43 = complex34.multiply(complex42);
        org.apache.commons.math.complex.Complex complex44 = complex32.multiply(complex34);
        org.apache.commons.math.complex.Complex complex46 = complex34.multiply((int) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex33 and complex44", complex33.equals(complex44) ? complex33.hashCode() == complex44.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex0.reciprocal();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex8.divide(complex11);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex17.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList20 = complex17.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex21.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex21.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex27 = complex17.pow(complex26);
        boolean boolean28 = complex8.equals((java.lang.Object) complex27);
        org.apache.commons.math.complex.Complex complex29 = complex27.sin();
        org.apache.commons.math.complex.Complex complex30 = complex4.multiply(complex27);
        org.apache.commons.math.complex.Complex complex31 = complex30.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex30", complex27.equals(complex30) ? complex27.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math.complex.Complex complex10 = complex3.pow(0.0d);
        org.apache.commons.math.complex.Complex complex11 = complex3.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex3.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex12", complex3.equals(complex12) ? complex3.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex15 = complex12.reciprocal();
        org.apache.commons.math.complex.Complex complex16 = complex10.divide(complex12);
        org.apache.commons.math.complex.Complex complex17 = complex12.cos();
        org.apache.commons.math.complex.Complex complex18 = complex12.cos();
        org.apache.commons.math.complex.Complex complex19 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex12.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex19", complex1.equals(complex19) ? complex1.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex2.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex11.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex15.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex11.pow(complex20);
        boolean boolean22 = complex2.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.sin();
        org.apache.commons.math.complex.Complex complex25 = complex21.multiply((double) 1.0f);
        boolean boolean26 = complex21.isNaN();
        java.lang.String str27 = complex21.toString();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex30 = complex28.pow(0.0d);
        org.apache.commons.math.complex.Complex complex31 = complex30.conjugate();
        org.apache.commons.math.complex.Complex complex32 = complex31.sqrt();
        java.lang.Object obj33 = complex31.readResolve();
        org.apache.commons.math.complex.Complex complex36 = complex31.createComplex(35.138169410605144d, (double) 0);
        org.apache.commons.math.complex.Complex complex37 = complex36.reciprocal();
        org.apache.commons.math.complex.Complex complex38 = complex36.sqrt();
        org.apache.commons.math.complex.Complex complex40 = complex36.divide((-90.0d));
        org.apache.commons.math.complex.Complex complex41 = complex21.multiply(complex36);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.valueOf(1.5707806810662743d, 1.5707963267948966d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList46 = complex44.nthRoot((int) (byte) 1);
        org.apache.commons.math.complex.Complex complex47 = complex36.divide(complex44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex41", complex21.equals(complex41) ? complex21.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10L);
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.pow((double) 1.0f);
        org.apache.commons.math.complex.Complex complex5 = complex2.conjugate();
        double double6 = complex5.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex5", complex2.equals(complex5) ? complex2.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math.complex.Complex> complexList2 = complex0.nthRoot(1);
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex4.reciprocal();
        org.apache.commons.math.complex.Complex complex9 = complex4.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex10 = complex0.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex15 = complex14.cos();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex19 = complex17.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex20 = complex19.cos();
        org.apache.commons.math.complex.Complex complex21 = complex14.subtract(complex19);
        boolean boolean22 = complex9.equals((java.lang.Object) complex19);
        org.apache.commons.math.complex.Complex complex24 = complex9.multiply((int) '4');
        org.apache.commons.math.complex.Complex complex26 = complex24.subtract((double) '4');
        org.apache.commons.math.complex.Complex complex27 = complex24.conjugate();
        org.apache.commons.math.complex.Complex complex28 = complex24.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex24 and complex27", complex24.equals(complex27) ? complex24.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex15 = complex12.reciprocal();
        org.apache.commons.math.complex.Complex complex16 = complex10.divide(complex12);
        org.apache.commons.math.complex.Complex complex17 = complex12.cos();
        org.apache.commons.math.complex.Complex complex18 = complex12.cos();
        org.apache.commons.math.complex.Complex complex19 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex12.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex19", complex1.equals(complex19) ? complex1.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply((int) (byte) 0);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) (short) 10);
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract((double) 100);
        org.apache.commons.math.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math.complex.Complex complex12 = complex3.multiply(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex3.acos();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.sqrt();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.valueOf(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = complex18.divide(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex18.pow((-0.01d));
        org.apache.commons.math.complex.Complex complex25 = complex13.add(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex16", complex3.equals(complex16) ? complex3.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math.complex.Complex complex10 = complex3.pow(0.0d);
        org.apache.commons.math.complex.Complex complex11 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex15 = complex13.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex16 = complex15.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex15.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex19 = complex15.sinh();
        org.apache.commons.math.complex.Complex complex20 = complex15.asin();
        org.apache.commons.math.complex.Complex complex22 = complex20.subtract((double) (short) 1);
        java.util.List<org.apache.commons.math.complex.Complex> complexList24 = complex20.nthRoot((int) (short) 10);
        org.apache.commons.math.complex.Complex complex26 = complex20.add((double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex26.conjugate();
        org.apache.commons.math.complex.Complex complex28 = complex26.tan();
        boolean boolean29 = complex3.equals((java.lang.Object) complex28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex11", complex3.equals(complex11) ? complex3.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex10 = complex3.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex9.divide(10.0d);
        double double13 = complex9.getReal();
        org.apache.commons.math.complex.Complex complex16 = complex9.createComplex((double) (short) 10, (double) 0L);
        org.apache.commons.math.complex.Complex complex17 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        boolean boolean19 = complex17.isNaN();
        org.apache.commons.math.complex.Complex complex20 = complex17.sin();
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex23 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex20.multiply(complex23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex23", complex22.equals(complex23) ? complex22.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex5 = complex1.createComplex(11013.232920103323d, 1.5422561509319916d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math.complex.Complex complex10 = complex3.subtract(complex8);
        double double11 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex13 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex13.cos();
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex15.createComplex((double) (short) 100, (double) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex15", complex14.equals(complex15) ? complex14.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10L);
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.pow((double) 1.0f);
        org.apache.commons.math.complex.Complex complex5 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex5", complex2.equals(complex5) ? complex2.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math.complex.Complex> complexList2 = complex0.nthRoot(1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.negate();
        org.apache.commons.math.complex.Complex complex5 = complex0.multiply(complex4);
        java.lang.String str6 = complex4.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        double double3 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex0.atan();
        org.apache.commons.math.complex.Complex complex9 = complex0.conjugate();
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex9.log();
        org.apache.commons.math.complex.Complex complex13 = complex11.add(3.166218219036781d);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex17 = complex16.cos();
        org.apache.commons.math.complex.Complex complex18 = complex16.atan();
        org.apache.commons.math.complex.Complex complex19 = complex13.multiply(complex16);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex22 = complex20.divide(0.0d);
        org.apache.commons.math.complex.Complex complex23 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex28 = complex26.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex29 = complex26.reciprocal();
        org.apache.commons.math.complex.Complex complex30 = complex26.cos();
        org.apache.commons.math.complex.Complex complex31 = complex22.subtract(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex30.atan();
        org.apache.commons.math.complex.Complex complex33 = complex30.atan();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex36 = complex34.pow(0.0d);
        org.apache.commons.math.complex.Complex complex37 = complex33.divide(complex36);
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((int) (short) -1);
        org.apache.commons.math.complex.Complex complex40 = complex37.negate();
        org.apache.commons.math.complex.Complex complex42 = complex37.divide(11013.232874703393d);
        org.apache.commons.math.complex.Complex complex43 = complex16.multiply(complex42);
        org.apache.commons.math.complex.Complex complex46 = complex16.createComplex(100.00499987500623d, 224.04462830829536d);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex50 = complex48.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex51 = complex50.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList53 = complex50.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex54 = complex50.sinh();
        org.apache.commons.math.complex.Complex complex55 = complex50.log();
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex58 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex59 = complex58.cosh();
        org.apache.commons.math.complex.Complex complex60 = complex56.divide(complex59);
        org.apache.commons.math.complex.Complex complex61 = complex55.add(complex59);
        org.apache.commons.math.complex.Complex complex62 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex64 = complex62.pow(0.0d);
        double double65 = complex62.getArgument();
        org.apache.commons.math.complex.Complex complex66 = complex55.add(complex62);
        org.apache.commons.math.complex.Complex complex68 = complex66.multiply((int) (byte) 0);
        org.apache.commons.math.complex.Complex complex70 = complex68.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex71 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex73 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex74 = complex73.cosh();
        org.apache.commons.math.complex.Complex complex75 = complex71.divide(complex74);
        org.apache.commons.math.complex.Complex complex76 = complex75.sqrt1z();
        org.apache.commons.math.complex.Complex complex78 = complex75.multiply((int) (short) 10);
        org.apache.commons.math.complex.Complex complex79 = complex68.subtract(complex78);
        org.apache.commons.math.complex.Complex complex80 = complex68.conjugate();
        org.apache.commons.math.complex.Complex complex81 = complex16.add(complex68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex59", complex17.equals(complex59) ? complex17.hashCode() == complex59.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) (short) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex4.divide(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex4.reciprocal();
        org.apache.commons.math.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math.complex.Complex complex11 = complex8.subtract((double) 100.0f);
        org.apache.commons.math.complex.Complex complex12 = complex8.asin();
        org.apache.commons.math.complex.Complex complex13 = complex2.divide(complex8);
        double double14 = complex8.abs();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        double double18 = complex15.getImaginary();
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex22 = complex15.add(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex15.atan();
        org.apache.commons.math.complex.Complex complex24 = complex15.conjugate();
        org.apache.commons.math.complex.ComplexField complexField25 = complex24.getField();
        org.apache.commons.math.complex.Complex complex26 = complex24.log();
        org.apache.commons.math.complex.Complex complex27 = complex24.negate();
        org.apache.commons.math.complex.Complex complex28 = complex8.pow(complex24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex27", complex4.equals(complex27) ? complex4.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 1.0f, 10.0d);
        boolean boolean3 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex5 = complex2.multiply(224.04462830829536d);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex8 = complex6.divide(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex15 = complex12.reciprocal();
        org.apache.commons.math.complex.Complex complex16 = complex12.cos();
        org.apache.commons.math.complex.Complex complex17 = complex8.subtract(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex22 = complex20.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex22.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList25 = complex22.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex26 = complex22.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex22.asin();
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        boolean boolean29 = complex8.equals((java.lang.Object) complex28);
        org.apache.commons.math.complex.Complex complex32 = complex8.createComplex((double) (short) 10, (double) (-1L));
        org.apache.commons.math.complex.Complex complex33 = complex32.sqrt();
        org.apache.commons.math.complex.Complex complex34 = complex32.reciprocal();
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((double) 0.0f);
        org.apache.commons.math.complex.Complex complex37 = complex5.divide(complex34);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex39 = complex38.negate();
        org.apache.commons.math.complex.Complex complex40 = complex39.reciprocal();
        org.apache.commons.math.complex.Complex complex41 = complex40.conjugate();
        boolean boolean42 = complex34.equals((java.lang.Object) complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex36 and complex41", complex36.equals(complex41) ? complex36.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math.complex.Complex complex10 = complex3.subtract(complex8);
        double double11 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex13 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex13.cos();
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex15.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex15", complex14.equals(complex15) ? complex14.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math.complex.Complex complex10 = complex3.subtract(complex8);
        double double11 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex13 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex13.cos();
        org.apache.commons.math.complex.Complex complex15 = complex14.acos();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.valueOf(0.0d, (double) 1);
        org.apache.commons.math.complex.Complex complex21 = complex18.createComplex(3.113028995751033d, (double) '#');
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex25 = complex23.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex26 = complex25.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList28 = complex25.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex29 = complex25.sinh();
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex35 = complex33.divide(0.0d);
        org.apache.commons.math.complex.Complex complex36 = complex35.conjugate();
        org.apache.commons.math.complex.Complex complex37 = complex32.divide(complex35);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex40 = complex38.divide(0.0d);
        org.apache.commons.math.complex.Complex complex41 = complex32.add(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex29.multiply(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex42.cos();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex45 = complex44.negate();
        org.apache.commons.math.complex.Complex complex46 = complex42.multiply(complex44);
        boolean boolean47 = complex18.equals((java.lang.Object) complex46);
        org.apache.commons.math.complex.Complex complex48 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex49 = complex18.log();
        org.apache.commons.math.complex.Complex complex50 = complex14.divide(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex15", complex10.equals(complex15) ? complex10.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex5 = complex1.negate();
        org.apache.commons.math.complex.Complex complex6 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (byte) 10, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        boolean boolean11 = complex6.equals((java.lang.Object) complex10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex6", complex1.equals(complex6) ? complex1.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        double double3 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex0.atan();
        org.apache.commons.math.complex.Complex complex9 = complex0.conjugate();
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex9.log();
        org.apache.commons.math.complex.Complex complex12 = complex9.negate();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex16.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList19 = complex16.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex20.asin();
        org.apache.commons.math.complex.Complex complex22 = complex21.log();
        java.lang.String str23 = complex22.toString();
        org.apache.commons.math.complex.Complex complex24 = complex22.tan();
        org.apache.commons.math.complex.Complex complex25 = complex24.exp();
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = complex9.pow(complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex12", complex0.equals(complex12) ? complex0.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.negate();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex10 = complex9.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex9.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex13 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex9.asin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex16 = complex9.divide(complex15);
        org.apache.commons.math.complex.Complex complex18 = complex15.multiply((int) (byte) -1);
        org.apache.commons.math.complex.Complex complex19 = complex4.subtract(complex15);
        org.apache.commons.math.complex.Complex complex20 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex21 = complex3.divide(complex20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex3", complex1.equals(complex3) ? complex1.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10L);
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.subtract((double) 1.0f);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex7.cos();
        org.apache.commons.math.complex.Complex complex10 = complex7.add(0.0d);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex13 = complex11.divide(0.0d);
        org.apache.commons.math.complex.Complex complex14 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex19 = complex17.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex20 = complex19.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex19.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex24 = complex19.asin();
        org.apache.commons.math.complex.Complex complex26 = complex24.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex30 = complex28.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex31 = complex28.reciprocal();
        org.apache.commons.math.complex.Complex complex32 = complex26.divide(complex28);
        boolean boolean33 = complex13.equals((java.lang.Object) complex32);
        org.apache.commons.math.complex.Complex complex34 = complex13.negate();
        org.apache.commons.math.complex.Complex complex35 = complex34.sqrt();
        double double36 = complex34.abs();
        org.apache.commons.math.complex.Complex complex37 = complex10.divide(complex34);
        boolean boolean38 = complex37.isNaN();
        org.apache.commons.math.complex.Complex complex39 = complex4.divide(complex37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex8", complex2.equals(complex8) ? complex2.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math.complex.Complex complex10 = complex3.subtract(complex8);
        double double11 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex13 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex13.cos();
        org.apache.commons.math.complex.Complex complex15 = complex14.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex15", complex10.equals(complex15) ? complex10.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        double double3 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex0.atan();
        org.apache.commons.math.complex.Complex complex9 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex0.pow((double) 100L);
        org.apache.commons.math.complex.Complex complex13 = complex0.divide((double) (-1));
        org.apache.commons.math.complex.Complex complex14 = complex0.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex13", complex9.equals(complex13) ? complex9.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.log();
        org.apache.commons.math.complex.Complex complex5 = complex2.pow((double) 100);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex10 = complex7.atan();
        org.apache.commons.math.complex.Complex complex12 = complex7.add((double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex7.atan();
        org.apache.commons.math.complex.Complex complex14 = complex5.divide(complex7);
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt1z();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        java.lang.Object obj19 = complex17.readResolve();
        org.apache.commons.math.complex.Complex complex20 = complex17.atan();
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = complex14.subtract(complex20);
        org.apache.commons.math.complex.Complex complex23 = complex20.exp();
        org.apache.commons.math.complex.Complex complex24 = complex20.log();
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex30 = complex28.divide(0.0d);
        org.apache.commons.math.complex.Complex complex31 = complex30.conjugate();
        org.apache.commons.math.complex.Complex complex32 = complex27.divide(complex30);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex36 = complex34.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex37 = complex36.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList39 = complex36.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex42 = complex40.divide(0.0d);
        org.apache.commons.math.complex.Complex complex43 = complex40.tanh();
        org.apache.commons.math.complex.Complex complex45 = complex40.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex46 = complex36.pow(complex45);
        boolean boolean47 = complex27.equals((java.lang.Object) complex46);
        org.apache.commons.math.complex.Complex complex48 = complex46.sin();
        boolean boolean50 = complex48.equals((java.lang.Object) true);
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex54 = complex53.cosh();
        org.apache.commons.math.complex.Complex complex55 = complex51.divide(complex54);
        org.apache.commons.math.complex.Complex complex56 = complex54.sqrt1z();
        org.apache.commons.math.complex.Complex complex57 = complex54.atan();
        double double58 = complex57.getImaginary();
        org.apache.commons.math.complex.Complex complex59 = complex48.divide(complex57);
        org.apache.commons.math.complex.Complex complex60 = complex20.subtract(complex48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex46 and complex59", complex46.equals(complex59) ? complex46.hashCode() == complex59.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex9.reciprocal();
        org.apache.commons.math.complex.Complex complex13 = complex9.cos();
        org.apache.commons.math.complex.Complex complex14 = complex5.subtract(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex5.sinh();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex19 = complex17.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex20 = complex19.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex19.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex24 = complex19.asin();
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        boolean boolean26 = complex5.equals((java.lang.Object) complex25);
        org.apache.commons.math.complex.Complex complex28 = complex25.multiply((int) 'a');
        org.apache.commons.math.complex.Complex complex29 = complex25.sin();
        boolean boolean31 = complex25.equals((java.lang.Object) (short) -1);
        org.apache.commons.math.complex.Complex complex32 = complex1.add(complex25);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex36 = complex34.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex37 = complex36.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList39 = complex36.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex40 = complex36.sinh();
        org.apache.commons.math.complex.Complex complex41 = complex36.log();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex45 = complex44.cosh();
        org.apache.commons.math.complex.Complex complex46 = complex42.divide(complex45);
        org.apache.commons.math.complex.Complex complex47 = complex41.add(complex45);
        double double48 = complex45.getReal();
        org.apache.commons.math.complex.Complex complex49 = complex45.sqrt();
        org.apache.commons.math.complex.Complex complex50 = complex45.log();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex53 = complex52.cosh();
        org.apache.commons.math.complex.ComplexField complexField54 = complex52.getField();
        org.apache.commons.math.complex.Complex complex55 = complex52.sqrt();
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.valueOf(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex58 = complex57.sin();
        org.apache.commons.math.complex.Complex complex59 = complex55.divide(complex57);
        java.lang.Object obj60 = complex55.readResolve();
        org.apache.commons.math.complex.Complex complex61 = complex55.log();
        boolean boolean62 = complex50.equals((java.lang.Object) complex55);
        org.apache.commons.math.complex.Complex complex63 = complex55.conjugate();
        org.apache.commons.math.complex.Complex complex64 = complex1.multiply(complex63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex55 and complex63", complex55.equals(complex63) ? complex55.hashCode() == complex63.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply(100);
        org.apache.commons.math.complex.Complex complex8 = complex4.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex9 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 10);
        org.apache.commons.math.complex.Complex complex13 = complex11.add(100.0d);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex15.atan();
        org.apache.commons.math.complex.Complex complex20 = complex15.add((double) 1);
        org.apache.commons.math.complex.Complex complex21 = complex15.atan();
        org.apache.commons.math.complex.Complex complex22 = complex13.divide(complex21);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex26 = complex24.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex27 = complex24.atan();
        org.apache.commons.math.complex.Complex complex29 = complex24.add((double) 1);
        boolean boolean30 = complex21.equals((java.lang.Object) 1);
        boolean boolean31 = complex9.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex32 = complex21.cos();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex35 = complex33.divide(0.0d);
        org.apache.commons.math.complex.Complex complex36 = complex33.tanh();
        org.apache.commons.math.complex.Complex complex37 = complex33.reciprocal();
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((int) (short) 10);
        org.apache.commons.math.complex.Complex complex40 = complex37.asin();
        boolean boolean41 = complex32.equals((java.lang.Object) complex40);
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 10);
        org.apache.commons.math.complex.Complex complex45 = complex43.add(100.0d);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex49 = complex47.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex50 = complex47.atan();
        org.apache.commons.math.complex.Complex complex52 = complex47.add((double) 1);
        org.apache.commons.math.complex.Complex complex53 = complex47.atan();
        org.apache.commons.math.complex.Complex complex54 = complex45.divide(complex53);
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex58 = complex56.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex59 = complex56.atan();
        org.apache.commons.math.complex.Complex complex61 = complex56.add((double) 1);
        boolean boolean62 = complex53.equals((java.lang.Object) 1);
        org.apache.commons.math.complex.Complex complex63 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex65 = complex63.divide(0.0d);
        org.apache.commons.math.complex.Complex complex66 = complex63.tanh();
        org.apache.commons.math.complex.Complex complex68 = complex63.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex70 = complex63.divide((-1.0d));
        org.apache.commons.math.complex.Complex complex71 = complex63.log();
        org.apache.commons.math.complex.Complex complex72 = complex63.negate();
        org.apache.commons.math.complex.Complex complex73 = complex53.subtract(complex72);
        org.apache.commons.math.complex.Complex complex75 = complex73.subtract((double) (short) -1);
        org.apache.commons.math.complex.Complex complex78 = org.apache.commons.math.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex79 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex80 = complex78.add(complex79);
        org.apache.commons.math.complex.Complex complex81 = complex78.reciprocal();
        org.apache.commons.math.complex.Complex complex82 = complex78.sin();
        org.apache.commons.math.complex.Complex complex83 = complex73.divide(complex82);
        org.apache.commons.math.complex.Complex complex84 = complex73.sqrt();
        boolean boolean85 = complex40.equals((java.lang.Object) complex73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex37 and complex70", complex37.equals(complex70) ? complex37.hashCode() == complex70.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        java.lang.Object obj5 = complex2.readResolve();
        org.apache.commons.math.complex.Complex complex6 = complex2.tan();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex10 = complex8.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex15 = complex13.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex16 = complex15.cos();
        org.apache.commons.math.complex.Complex complex17 = complex10.subtract(complex15);
        org.apache.commons.math.complex.Complex complex18 = complex2.pow(complex10);
        org.apache.commons.math.complex.Complex complex20 = complex2.add(0.5707963267948966d);
        java.lang.String str21 = complex20.toString();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        java.lang.Object obj25 = complex23.readResolve();
        org.apache.commons.math.complex.Complex complex26 = complex23.exp();
        org.apache.commons.math.complex.Complex complex27 = complex23.tan();
        org.apache.commons.math.complex.Complex complex29 = complex27.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex30 = complex27.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex20.pow(complex27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex24", complex3.equals(complex24) ? complex3.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = complex1.tanh();
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        boolean boolean4 = complex3.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex6.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList9 = complex6.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex10 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex6.asin();
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math.complex.Complex complex19 = complex13.divide(complex15);
        org.apache.commons.math.complex.Complex complex20 = complex1.subtract(complex15);
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex22.multiply((int) (byte) 0);
        org.apache.commons.math.complex.Complex complex26 = complex24.pow((double) (short) 10);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex29 = complex27.divide(0.0d);
        double double30 = complex27.getImaginary();
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex34 = complex27.add(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex26.pow(complex33);
        org.apache.commons.math.complex.Complex complex36 = complex33.conjugate();
        org.apache.commons.math.complex.Complex complex37 = complex33.sqrt1z();
        org.apache.commons.math.complex.Complex complex38 = complex20.add(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex38.log();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex43 = complex41.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex44 = complex43.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList46 = complex43.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex47 = complex43.sinh();
        org.apache.commons.math.complex.Complex complex48 = complex43.asin();
        org.apache.commons.math.complex.Complex complex50 = complex48.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex54 = complex52.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex55 = complex52.reciprocal();
        org.apache.commons.math.complex.Complex complex56 = complex50.divide(complex52);
        org.apache.commons.math.complex.Complex complex57 = complex52.cos();
        double double58 = complex57.getArgument();
        org.apache.commons.math.complex.Complex complex60 = complex57.multiply((int) (byte) 0);
        org.apache.commons.math.complex.Complex complex61 = complex39.multiply(complex57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex60", complex20.equals(complex60) ? complex20.hashCode() == complex60.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex0.subtract((double) '#');
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex8 = complex6.add(223.35075402042244d);
        org.apache.commons.math.complex.Complex complex10 = complex6.multiply((int) (short) 0);
        org.apache.commons.math.complex.Complex complex11 = complex6.reciprocal();
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex(0.0d, 0.0d);
        org.apache.commons.math.complex.Complex complex15 = complex11.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex14", complex10.equals(complex14) ? complex10.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math.complex.Complex complex10 = complex3.subtract(complex8);
        double double11 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex14 = complex10.multiply((int) (short) 10);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex23 = complex21.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex24 = complex21.reciprocal();
        org.apache.commons.math.complex.Complex complex25 = complex21.cos();
        org.apache.commons.math.complex.Complex complex26 = complex17.subtract(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex17.sinh();
        org.apache.commons.math.complex.Complex complex28 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex29 = complex28.negate();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.log();
        org.apache.commons.math.complex.Complex complex32 = complex31.sqrt();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex35 = complex33.multiply((int) (byte) 0);
        org.apache.commons.math.complex.Complex complex37 = complex35.pow((double) (short) 10);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex40 = complex38.divide(0.0d);
        double double41 = complex38.getImaginary();
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex45 = complex38.add(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex37.pow(complex44);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex50 = complex48.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex51 = complex50.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList53 = complex50.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex54 = complex50.sinh();
        org.apache.commons.math.complex.Complex complex55 = complex50.asin();
        org.apache.commons.math.complex.Complex complex56 = complex55.cosh();
        org.apache.commons.math.complex.Complex complex57 = complex37.add(complex56);
        org.apache.commons.math.complex.Complex complex59 = complex37.multiply((int) (short) 0);
        org.apache.commons.math.complex.Complex complex61 = complex59.subtract((double) 100L);
        org.apache.commons.math.complex.Complex complex62 = complex59.tanh();
        org.apache.commons.math.complex.Complex complex63 = complex32.multiply(complex59);
        org.apache.commons.math.complex.Complex complex64 = complex59.tan();
        double double65 = complex64.getImaginary();
        org.apache.commons.math.complex.Complex complex66 = complex10.add(complex64);
        org.apache.commons.math.complex.Complex complex67 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex68 = complex67.negate();
        org.apache.commons.math.complex.Complex complex69 = complex68.reciprocal();
        org.apache.commons.math.complex.Complex complex70 = complex69.conjugate();
        org.apache.commons.math.complex.Complex complex71 = complex66.subtract(complex69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex70", complex10.equals(complex70) ? complex10.hashCode() == complex70.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex3 = complex1.add(0.04819550471662474d);
        org.apache.commons.math.complex.Complex complex5 = complex1.subtract(3.166218219036781d);
        boolean boolean6 = complex5.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.valueOf((double) 10L);
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 1.0f);
        org.apache.commons.math.complex.Complex complex12 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex5.subtract(complex9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex12", complex9.equals(complex12) ? complex9.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex6.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList9 = complex6.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex10 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex6.asin();
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex15.reciprocal();
        org.apache.commons.math.complex.Complex complex19 = complex13.divide(complex15);
        org.apache.commons.math.complex.Complex complex20 = complex1.subtract(complex15);
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex22.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex22", complex20.equals(complex22) ? complex20.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        java.lang.Object obj3 = complex1.readResolve();
        org.apache.commons.math.complex.Complex complex4 = complex1.exp();
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex8 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.valueOf(100.0d);
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex11.exp();
        org.apache.commons.math.complex.Complex complex13 = complex8.add(complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex4 = complex2.add(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 0);
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex10 = complex6.add((double) 'a');
        org.apache.commons.math.complex.Complex complex11 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex6.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex11", complex6.equals(complex11) ? complex6.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 'a');
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide(0.0d);
        double double3 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex0.atan();
        org.apache.commons.math.complex.Complex complex9 = complex0.conjugate();
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex15 = complex14.reciprocal();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 0);
        org.apache.commons.math.complex.Complex complex20 = complex18.pow((double) (short) 10);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        double double24 = complex21.getImaginary();
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math.complex.Complex complex28 = complex21.add(complex27);
        org.apache.commons.math.complex.Complex complex29 = complex20.pow(complex27);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex33 = complex31.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex34 = complex33.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList36 = complex33.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex37 = complex33.sinh();
        org.apache.commons.math.complex.Complex complex38 = complex33.asin();
        org.apache.commons.math.complex.Complex complex39 = complex38.cosh();
        org.apache.commons.math.complex.Complex complex40 = complex20.add(complex39);
        org.apache.commons.math.complex.Complex complex41 = complex40.cos();
        org.apache.commons.math.complex.Complex complex42 = complex40.tan();
        org.apache.commons.math.complex.Complex complex43 = complex14.add(complex40);
        org.apache.commons.math.complex.Complex complex44 = complex14.exp();
        boolean boolean45 = complex11.equals((java.lang.Object) complex44);
        org.apache.commons.math.complex.Complex complex47 = complex44.multiply((int) ' ');
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex51 = complex49.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex52 = complex51.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList54 = complex51.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex55 = complex51.sinh();
        org.apache.commons.math.complex.Complex complex56 = complex51.asin();
        org.apache.commons.math.complex.Complex complex58 = complex56.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex60 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex62 = complex60.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex63 = complex60.reciprocal();
        org.apache.commons.math.complex.Complex complex64 = complex58.divide(complex60);
        org.apache.commons.math.complex.Complex complex65 = complex60.log();
        org.apache.commons.math.complex.Complex complex66 = complex60.conjugate();
        org.apache.commons.math.complex.Complex complex67 = complex47.add(complex66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex31 and complex66", complex31.equals(complex66) ? complex31.hashCode() == complex66.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math.complex.Complex complex10 = complex3.pow(0.0d);
        org.apache.commons.math.complex.Complex complex11 = complex3.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex12", complex3.equals(complex12) ? complex3.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex3.log();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex9.divide(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex8.add(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex12.subtract(90.0d);
        org.apache.commons.math.complex.Complex complex17 = complex12.conjugate();
        java.lang.Object obj18 = null;
        boolean boolean19 = complex12.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex17", complex12.equals(complex17) ? complex12.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.cos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math.complex.Complex complex10 = complex3.subtract(complex8);
        double double11 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex13 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex13.cos();
        org.apache.commons.math.complex.Complex complex15 = complex14.acos();
        double double16 = complex15.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex15", complex10.equals(complex15) ? complex10.hashCode() == complex15.hashCode() : true);
    }
}

