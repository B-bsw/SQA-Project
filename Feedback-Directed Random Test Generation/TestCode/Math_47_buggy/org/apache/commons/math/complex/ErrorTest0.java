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
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        org.apache.commons.math.complex.Complex complex5 = complex2.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex2.nthRoot((int) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex7.pow(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex14 = complex6.pow(complex11);
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        boolean boolean16 = complex2.equals((java.lang.Object) complex14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex6.atan();
        org.apache.commons.math.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math.complex.Complex complex10 = complex8.asin();
        boolean boolean11 = complex5.equals((java.lang.Object) complex10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex10", complex0.equals(complex10) ? complex0.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
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
        org.apache.commons.math.complex.Complex complex11 = complex6.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex10", complex6.equals(complex10) ? complex6.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.asin();
        double double3 = complex2.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
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
        org.apache.commons.math.complex.Complex complex19 = complex14.subtract(10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex17", complex6.equals(complex17) ? complex6.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        org.apache.commons.math.complex.Complex complex20 = complex14.createComplex((double) (byte) 10, (double) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex17", complex6.equals(complex17) ? complex6.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        boolean boolean2 = complex1.isNaN();
        org.apache.commons.math.complex.Complex complex3 = complex1.asin();
        java.lang.Object obj4 = complex1.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex3", complex1.equals(complex3) ? complex1.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
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
        org.apache.commons.math.complex.Complex complex18 = complex5.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex17", complex6.equals(complex17) ? complex6.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
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
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField16 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        double double21 = complex20.abs();
        org.apache.commons.math.complex.Complex complex22 = complex15.add(complex20);
        org.apache.commons.math.complex.Complex complex23 = complex8.subtract(complex15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex20", complex6.equals(complex20) ? complex6.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
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
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) '#', (double) 'a');
        boolean boolean14 = complex10.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex10", complex6.equals(complex10) ? complex6.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        java.lang.Object obj7 = complex6.readResolve();
        org.apache.commons.math.complex.Complex complex8 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        double double10 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean12 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex13 = complex9.pow(complex11);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex16 = complex13.tan();
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (short) -1, (double) 'a');
        java.lang.String str20 = complex16.toString();
        org.apache.commons.math.complex.Complex complex21 = complex8.multiply(complex16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex8", complex6.equals(complex8) ? complex6.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        org.apache.commons.math.complex.Complex complex21 = complex19.divide((double) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex19", complex0.equals(complex19) ? complex0.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        java.lang.Object obj7 = complex6.readResolve();
        org.apache.commons.math.complex.Complex complex8 = complex6.conjugate();
        double double9 = complex8.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex8", complex6.equals(complex8) ? complex6.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
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
        org.apache.commons.math.complex.ComplexField complexField25 = complex24.getField();
        org.apache.commons.math.complex.Complex complex27 = complex24.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex28 = complex24.atan();
        org.apache.commons.math.complex.Complex complex29 = complex28.cos();
        org.apache.commons.math.complex.Complex complex30 = complex29.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex23.divide(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex29 and complex30", complex29.equals(complex30) ? complex29.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) 100);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        double double29 = complex28.getArgument();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean31 = complex30.isNaN();
        org.apache.commons.math.complex.Complex complex32 = complex28.pow(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex32.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex35 = complex26.divide(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex34.sin();
        org.apache.commons.math.complex.Complex complex37 = complex25.pow(complex36);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex38.atan();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex45 = complex43.divide(0.0d);
        org.apache.commons.math.complex.Complex complex46 = complex45.cosh();
        org.apache.commons.math.complex.Complex complex47 = complex38.multiply(complex46);
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex52 = complex50.divide(0.0d);
        org.apache.commons.math.complex.Complex complex54 = complex52.pow((double) 10);
        boolean boolean55 = complex52.isInfinite();
        org.apache.commons.math.complex.Complex complex56 = complex52.asin();
        org.apache.commons.math.complex.Complex complex57 = complex46.subtract(complex56);
        org.apache.commons.math.complex.Complex complex58 = complex36.subtract(complex56);
        boolean boolean59 = complex22.equals((java.lang.Object) complex58);
        org.apache.commons.math.complex.Complex complex60 = complex58.conjugate();
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ZERO;
        double double62 = complex61.getArgument();
        org.apache.commons.math.complex.Complex complex63 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean64 = complex63.isNaN();
        org.apache.commons.math.complex.Complex complex65 = complex61.pow(complex63);
        org.apache.commons.math.complex.Complex complex66 = complex63.tan();
        org.apache.commons.math.complex.Complex complex67 = complex66.cos();
        java.lang.Object obj68 = complex67.readResolve();
        org.apache.commons.math.complex.Complex complex69 = complex67.conjugate();
        org.apache.commons.math.complex.Complex complex70 = complex60.divide(complex67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex67 and complex69", complex67.equals(complex69) ? complex67.hashCode() == complex69.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex14", complex0.equals(complex14) ? complex0.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
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
        org.apache.commons.math.complex.Complex complex22 = complex21.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex21", complex4.equals(complex21) ? complex4.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.valueOf((double) '4');
        org.apache.commons.math.complex.Complex complex20 = complex19.conjugate();
        org.apache.commons.math.complex.Complex complex21 = complex12.multiply(complex20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex20", complex19.equals(complex20) ? complex19.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) -1, (double) 0L);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        double double4 = complex2.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        double double2 = complex1.abs();
        double double3 = complex1.getImaginary();
        org.apache.commons.math.complex.Complex complex4 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex5 = complex4.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex4", complex1.equals(complex4) ? complex1.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
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
        double double22 = complex21.getImaginary();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        double double24 = complex23.getArgument();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean26 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex27 = complex23.pow(complex25);
        org.apache.commons.math.complex.Complex complex29 = complex27.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex31 = complex27.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex32 = complex31.asin();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex37 = complex35.divide(0.0d);
        org.apache.commons.math.complex.Complex complex39 = complex37.pow((double) 10);
        boolean boolean40 = complex37.isInfinite();
        org.apache.commons.math.complex.Complex complex41 = complex37.asin();
        java.lang.Object obj42 = complex37.readResolve();
        org.apache.commons.math.complex.Complex complex43 = complex31.divide(complex37);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        double double45 = complex44.getArgument();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean47 = complex46.isNaN();
        org.apache.commons.math.complex.Complex complex48 = complex44.pow(complex46);
        org.apache.commons.math.complex.Complex complex49 = complex46.tan();
        org.apache.commons.math.complex.Complex complex50 = complex49.cos();
        org.apache.commons.math.complex.Complex complex51 = complex43.subtract(complex49);
        org.apache.commons.math.complex.Complex complex52 = complex51.sqrt1z();
        org.apache.commons.math.complex.Complex complex53 = complex21.subtract(complex52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex50", complex18.equals(complex50) ? complex18.hashCode() == complex50.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) 100);
        org.apache.commons.math.complex.Complex complex12 = complex9.asin();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex12.atan();
        org.apache.commons.math.complex.Complex complex16 = complex14.multiply(0.009999666686665238d);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.valueOf((double) '4');
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex16.pow(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex19", complex18.equals(complex19) ? complex18.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex3.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex3", complex1.equals(complex3) ? complex1.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        org.apache.commons.math.complex.Complex complex5 = complex2.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = complex11.atan();
        org.apache.commons.math.complex.Complex complex14 = complex13.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList16 = complex13.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex17 = complex10.multiply(complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex14", complex1.equals(complex14) ? complex1.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) -1, (double) 0L);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex5 = complex3.subtract(1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) '4');
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        double double3 = complex1.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 0, (double) 0);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
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
        org.apache.commons.math.complex.Complex complex20 = complex18.negate();
        java.lang.Object obj21 = complex20.readResolve();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex25 = complex23.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex26 = complex23.tan();
        double double27 = complex26.getArgument();
        org.apache.commons.math.complex.Complex complex28 = complex20.multiply(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex20.asin();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        double double31 = complex30.getArgument();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean33 = complex32.isNaN();
        org.apache.commons.math.complex.Complex complex34 = complex30.pow(complex32);
        org.apache.commons.math.complex.Complex complex36 = complex34.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex38 = complex34.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex39 = complex38.asin();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex44 = complex42.divide(0.0d);
        org.apache.commons.math.complex.Complex complex46 = complex44.pow((double) 10);
        boolean boolean47 = complex44.isInfinite();
        org.apache.commons.math.complex.Complex complex48 = complex44.asin();
        java.lang.Object obj49 = complex44.readResolve();
        org.apache.commons.math.complex.Complex complex50 = complex38.divide(complex44);
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ZERO;
        double double52 = complex51.getArgument();
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean54 = complex53.isNaN();
        org.apache.commons.math.complex.Complex complex55 = complex51.pow(complex53);
        org.apache.commons.math.complex.Complex complex56 = complex53.tan();
        org.apache.commons.math.complex.Complex complex57 = complex56.cos();
        org.apache.commons.math.complex.Complex complex58 = complex50.subtract(complex56);
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex63 = complex61.divide(0.0d);
        org.apache.commons.math.complex.Complex complex65 = complex63.pow((double) 10);
        boolean boolean66 = complex63.isInfinite();
        org.apache.commons.math.complex.Complex complex67 = complex63.asin();
        org.apache.commons.math.complex.Complex complex69 = complex67.add(Double.NaN);
        org.apache.commons.math.complex.ComplexField complexField70 = complex67.getField();
        org.apache.commons.math.complex.Complex complex71 = complex58.pow(complex67);
        boolean boolean72 = complex29.equals((java.lang.Object) complex71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex57", complex18.equals(complex57) ? complex18.hashCode() == complex57.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
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
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex33 = complex32.sqrt();
        org.apache.commons.math.complex.Complex complex34 = complex32.sqrt1z();
        org.apache.commons.math.complex.Complex complex35 = complex32.acos();
        boolean boolean36 = complex30.equals((java.lang.Object) complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex35", complex0.equals(complex35) ? complex0.hashCode() == complex35.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        double double5 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex0.exp();
        org.apache.commons.math.complex.Complex complex7 = complex0.cos();
        org.apache.commons.math.complex.ComplexField complexField8 = complex7.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex7", complex6.equals(complex7) ? complex6.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex0.add((double) (byte) 0);
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex9 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex14 = complex12.divide(0.0d);
        boolean boolean15 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex9.multiply(complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex9", complex0.equals(complex9) ? complex0.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        java.lang.Object obj7 = complex6.readResolve();
        org.apache.commons.math.complex.Complex complex8 = complex6.conjugate();
        java.util.List<org.apache.commons.math.complex.Complex> complexList10 = complex8.nthRoot(10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex8", complex6.equals(complex8) ? complex6.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        java.lang.Object obj7 = complex6.readResolve();
        org.apache.commons.math.complex.Complex complex8 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        double double10 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean12 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex13 = complex9.pow(complex11);
        org.apache.commons.math.complex.Complex complex15 = complex13.pow((double) (-1));
        java.lang.String str16 = complex13.toString();
        org.apache.commons.math.complex.Complex complex17 = complex13.negate();
        org.apache.commons.math.complex.Complex complex18 = complex6.subtract(complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex8", complex6.equals(complex8) ? complex6.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.asin();
        org.apache.commons.math.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = complex11.acos();
        org.apache.commons.math.complex.Complex complex15 = complex9.add(complex14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex14", complex0.equals(complex14) ? complex0.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
        double double27 = complex25.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex26", complex9.equals(complex26) ? complex9.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
        org.apache.commons.math.complex.Complex complex27 = complex26.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex26", complex9.equals(complex26) ? complex9.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
        java.lang.Object obj22 = complex20.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex21", complex4.equals(complex21) ? complex4.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex5.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex6", complex5.equals(complex6) ? complex5.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        double double2 = complex1.abs();
        double double3 = complex1.getImaginary();
        org.apache.commons.math.complex.Complex complex4 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex7.divide(0.0d);
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) 10);
        org.apache.commons.math.complex.Complex complex13 = complex11.add(1.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList15 = complex13.nthRoot(10);
        org.apache.commons.math.complex.Complex complex16 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex17 = complex16.sqrt();
        org.apache.commons.math.complex.Complex complex18 = complex1.subtract(complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex4", complex1.equals(complex4) ? complex1.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(1.5707963267948966d, 0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        double double5 = complex4.getArgument();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex8 = complex4.pow(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex8.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        org.apache.commons.math.complex.Complex complex13 = complex3.multiply(complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        double double5 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex0.exp();
        org.apache.commons.math.complex.Complex complex7 = complex0.cos();
        double double8 = complex0.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex7", complex6.equals(complex7) ? complex6.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex0.add((double) (byte) 0);
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex9 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex6.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex9", complex0.equals(complex9) ? complex0.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex15", complex6.equals(complex15) ? complex6.hashCode() == complex15.hashCode() : true);
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
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex16 = complex14.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex16.pow((double) 10);
        org.apache.commons.math.complex.Complex complex20 = complex18.add(1.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot(10);
        org.apache.commons.math.complex.Complex complex23 = complex9.multiply(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex24.cos();
        org.apache.commons.math.complex.Complex complex26 = complex25.acos();
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex26", complex9.equals(complex26) ? complex9.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = complex1.acos();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex5.atan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex12 = complex10.divide(0.0d);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        double double14 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean16 = complex15.isNaN();
        org.apache.commons.math.complex.Complex complex17 = complex13.pow(complex15);
        org.apache.commons.math.complex.Complex complex19 = complex17.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex20 = complex17.sinh();
        boolean boolean21 = complex12.equals((java.lang.Object) complex17);
        org.apache.commons.math.complex.Complex complex22 = complex17.asin();
        org.apache.commons.math.complex.Complex complex23 = complex7.add(complex17);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex28 = complex26.divide(0.0d);
        org.apache.commons.math.complex.Complex complex30 = complex28.pow((double) 10);
        boolean boolean31 = complex28.isInfinite();
        org.apache.commons.math.complex.Complex complex32 = complex28.asin();
        org.apache.commons.math.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math.complex.ComplexField complexField34 = complex33.getField();
        org.apache.commons.math.complex.Complex complex35 = complex23.pow(complex33);
        org.apache.commons.math.complex.Complex complex36 = complex23.exp();
        org.apache.commons.math.complex.Complex complex37 = complex4.multiply(complex36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex19 = complex18.sinh();
        org.apache.commons.math.complex.Complex complex20 = complex18.sin();
        org.apache.commons.math.complex.Complex complex21 = complex20.acos();
        org.apache.commons.math.complex.Complex complex22 = complex21.tan();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        double double24 = complex23.getArgument();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean26 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex27 = complex23.pow(complex25);
        org.apache.commons.math.complex.Complex complex29 = complex27.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex30 = complex29.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex29.tanh();
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex21.divide(complex31);
        org.apache.commons.math.complex.Complex complex36 = complex31.createComplex((double) (-1.0f), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex38 = complex36.subtract((-0.0d));
        org.apache.commons.math.complex.Complex complex41 = complex36.createComplex(97.00515450222221d, (double) 10L);
        boolean boolean42 = complex16.equals((java.lang.Object) complex36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        java.lang.String str5 = complex4.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math.complex.Complex complex6 = complex2.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
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
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        double double12 = complex11.getArgument();
        double double13 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex14 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        double double16 = complex15.getArgument();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean18 = complex17.isNaN();
        org.apache.commons.math.complex.Complex complex19 = complex15.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex17.tan();
        org.apache.commons.math.complex.Complex complex21 = complex20.cos();
        java.lang.Object obj22 = complex21.readResolve();
        org.apache.commons.math.complex.ComplexField complexField23 = complex21.getField();
        double double24 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex25 = complex21.conjugate();
        boolean boolean26 = complex14.equals((java.lang.Object) complex21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex25", complex21.equals(complex25) ? complex21.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) 1L, (double) (byte) 0);
        org.apache.commons.math.complex.Complex complex8 = complex2.subtract(complex7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex14", complex0.equals(complex14) ? complex0.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.asin();
        org.apache.commons.math.complex.Complex complex3 = complex1.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) -1, (double) 0L);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        double double4 = complex2.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.conjugate();
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex3", complex1.equals(complex3) ? complex1.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex10 = complex8.divide(0.0d);
        org.apache.commons.math.complex.ComplexField complexField11 = complex8.getField();
        org.apache.commons.math.complex.Complex complex12 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.ComplexField complexField14 = complex13.getField();
        org.apache.commons.math.complex.Complex complex15 = complex5.add(complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        org.apache.commons.math.complex.Complex complex13 = complex11.exp();
        org.apache.commons.math.complex.Complex complex15 = complex13.divide(100.0d);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        boolean boolean18 = complex17.isNaN();
        org.apache.commons.math.complex.Complex complex19 = complex17.asin();
        org.apache.commons.math.complex.Complex complex20 = complex15.divide(complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex19", complex0.equals(complex19) ? complex0.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.ComplexField complexField12 = complex9.getField();
        org.apache.commons.math.complex.Complex complex13 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex13.acos();
        org.apache.commons.math.complex.Complex complex15 = complex13.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex14", complex9.equals(complex14) ? complex9.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.ComplexField complexField12 = complex9.getField();
        org.apache.commons.math.complex.Complex complex13 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex13.acos();
        java.lang.Object obj15 = complex14.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex14", complex9.equals(complex14) ? complex9.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
        org.apache.commons.math.complex.Complex complex20 = complex2.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex19", complex0.equals(complex19) ? complex0.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        java.lang.String str16 = complex15.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex15", complex6.equals(complex15) ? complex6.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        boolean boolean2 = complex1.isNaN();
        org.apache.commons.math.complex.Complex complex3 = complex1.asin();
        java.lang.Class<?> wildcardClass4 = complex1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex3", complex1.equals(complex3) ? complex1.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex4 = complex1.pow((double) 0);
        org.apache.commons.math.complex.Complex complex5 = complex1.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(1.5707963267948966d, 0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        double double4 = complex3.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.sin();
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (-1));
        org.apache.commons.math.complex.Complex complex12 = complex0.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.valueOf((double) 100, 32.0d);
        org.apache.commons.math.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex12.add(complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex13", complex11.equals(complex13) ? complex11.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        java.lang.Object obj7 = complex6.readResolve();
        org.apache.commons.math.complex.Complex complex8 = complex6.conjugate();
        java.lang.String str9 = complex6.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex8", complex6.equals(complex8) ? complex6.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.ComplexField complexField12 = complex9.getField();
        org.apache.commons.math.complex.Complex complex13 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex13.acos();
        double double15 = complex13.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex14", complex9.equals(complex14) ? complex9.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex0.add((double) (byte) 0);
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex9 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex9.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex9", complex0.equals(complex9) ? complex0.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex3.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex3", complex1.equals(complex3) ? complex1.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        double double18 = complex17.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex17", complex6.equals(complex17) ? complex6.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        org.apache.commons.math.complex.Complex complex29 = complex26.createComplex(141.4213562373095d, 0.009999666686665238d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex26", complex22.equals(complex26) ? complex22.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        boolean boolean5 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex7 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex8 = complex2.asin();
        org.apache.commons.math.complex.Complex complex9 = complex2.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex8", complex2.equals(complex8) ? complex2.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        double double5 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex0.exp();
        org.apache.commons.math.complex.Complex complex7 = complex0.cos();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex12 = complex9.tan();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.atan();
        org.apache.commons.math.complex.Complex complex15 = complex12.log();
        org.apache.commons.math.complex.Complex complex16 = complex12.cos();
        org.apache.commons.math.complex.Complex complex17 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex12.atan();
        org.apache.commons.math.complex.Complex complex19 = complex7.add(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex7", complex6.equals(complex7) ? complex6.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex7.pow(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex14 = complex13.sinh();
        org.apache.commons.math.complex.Complex complex15 = complex13.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex13.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex13.multiply((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex19.divide((double) (-1L));
        org.apache.commons.math.complex.Complex complex22 = complex4.pow(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex4.asin();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex27 = complex26.sqrt();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        double double29 = complex28.getArgument();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean31 = complex30.isNaN();
        org.apache.commons.math.complex.Complex complex32 = complex28.pow(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex32.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex35 = complex32.sinh();
        org.apache.commons.math.complex.Complex complex36 = complex32.atan();
        org.apache.commons.math.complex.Complex complex39 = complex36.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex41 = complex39.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex42 = complex27.pow(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex41.log();
        org.apache.commons.math.complex.Complex complex44 = complex43.exp();
        org.apache.commons.math.complex.Complex complex45 = complex23.subtract(complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex23", complex0.equals(complex23) ? complex0.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        double double7 = complex5.abs();
        java.lang.String str8 = complex5.toString();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex12 = complex9.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        double double15 = complex14.abs();
        org.apache.commons.math.complex.Complex complex16 = complex9.add(complex14);
        org.apache.commons.math.complex.ComplexField complexField17 = complex9.getField();
        org.apache.commons.math.complex.Complex complex18 = complex9.negate();
        org.apache.commons.math.complex.Complex complex19 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex5.add(complex19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex14", complex6.equals(complex14) ? complex6.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex0.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex0.cos();
        org.apache.commons.math.complex.Complex complex11 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex0.createComplex((double) 0.0f, (double) (-1.0f));
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex19.pow(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex23.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex26 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex23.atan();
        org.apache.commons.math.complex.Complex complex30 = complex27.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex33 = complex18.pow(complex32);
        double double34 = complex33.getReal();
        org.apache.commons.math.complex.Complex complex35 = complex33.negate();
        java.lang.Object obj36 = complex35.readResolve();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        org.apache.commons.math.complex.Complex complex40 = complex38.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex41 = complex38.tan();
        double double42 = complex41.getArgument();
        org.apache.commons.math.complex.Complex complex43 = complex35.multiply(complex41);
        org.apache.commons.math.complex.Complex complex44 = complex35.asin();
        org.apache.commons.math.complex.Complex complex46 = complex44.multiply(Double.NaN);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        double double48 = complex47.getArgument();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean50 = complex49.isNaN();
        org.apache.commons.math.complex.Complex complex51 = complex47.pow(complex49);
        org.apache.commons.math.complex.Complex complex53 = complex51.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex54 = complex51.sinh();
        org.apache.commons.math.complex.Complex complex55 = complex51.atan();
        org.apache.commons.math.complex.Complex complex57 = complex55.pow((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex58 = complex57.tan();
        org.apache.commons.math.complex.Complex complex59 = complex44.pow(complex58);
        org.apache.commons.math.complex.Complex complex60 = complex0.divide(complex44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex33", complex10.equals(complex33) ? complex10.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 1.0f, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        double double4 = complex3.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex3.divide((double) 10.0f);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10);
        org.apache.commons.math.complex.Complex complex15 = complex13.add(1.0d);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex18 = complex16.add((double) 100);
        boolean boolean19 = complex3.equals((java.lang.Object) 100);
        org.apache.commons.math.complex.Complex complex20 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex22 = complex3.multiply((double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex3.negate();
        org.apache.commons.math.complex.Complex complex25 = complex23.pow((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex27 = complex23.add(1.5707963267948966d);
        org.apache.commons.math.complex.Complex complex28 = complex23.conjugate();
        org.apache.commons.math.complex.Complex complex29 = complex2.subtract(complex23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex28", complex3.equals(complex28) ? complex3.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        org.apache.commons.math.complex.Complex complex19 = complex14.divide((double) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex17", complex6.equals(complex17) ? complex6.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(1.5707963267948966d, 0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        boolean boolean4 = complex2.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        double double22 = complex20.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex21", complex4.equals(complex21) ? complex4.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        double double7 = complex5.abs();
        java.lang.Object obj8 = complex5.readResolve();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        double double10 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean12 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex13 = complex9.pow(complex11);
        org.apache.commons.math.complex.Complex complex15 = complex13.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex16 = complex15.sinh();
        org.apache.commons.math.complex.Complex complex17 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        double double24 = complex23.getArgument();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean26 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex27 = complex23.pow(complex25);
        org.apache.commons.math.complex.Complex complex29 = complex27.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex30 = complex27.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex27.atan();
        org.apache.commons.math.complex.Complex complex34 = complex31.createComplex((double) (byte) 0, 0.0d);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex37 = complex22.pow(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex36.log();
        org.apache.commons.math.complex.Complex complex39 = complex38.sin();
        org.apache.commons.math.complex.Complex complex40 = complex39.conjugate();
        org.apache.commons.math.complex.Complex complex41 = complex15.divide(complex39);
        org.apache.commons.math.complex.Complex complex42 = complex5.pow(complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex37", complex6.equals(complex37) ? complex6.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        org.apache.commons.math.complex.Complex complex17 = complex0.asin();
        org.apache.commons.math.complex.Complex complex18 = complex0.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex17", complex0.equals(complex17) ? complex0.hashCode() == complex17.hashCode() : true);
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
        double double5 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex0.exp();
        org.apache.commons.math.complex.Complex complex7 = complex0.cos();
        org.apache.commons.math.complex.Complex complex8 = complex0.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex7", complex6.equals(complex7) ? complex6.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        org.apache.commons.math.complex.Complex complex21 = complex18.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex20", complex5.equals(complex20) ? complex5.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        org.apache.commons.math.complex.Complex complex11 = complex10.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex10", complex6.equals(complex10) ? complex6.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.asin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList4 = complex2.nthRoot((int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.valueOf(0.0d, (double) '#');
        org.apache.commons.math.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math.complex.Complex complex10 = complex5.pow(complex8);
        double double11 = complex10.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex10", complex5.equals(complex10) ? complex5.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) -1, (double) 0L);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        boolean boolean5 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex7 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex8 = complex2.asin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        double double12 = complex11.getArgument();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex11.pow(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex15.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex18 = complex9.divide(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex17.sin();
        double double20 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex21 = complex8.add(complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex8", complex0.equals(complex8) ? complex0.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) '4');
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex1.divide((-10.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        org.apache.commons.math.complex.Complex complex21 = complex18.divide(100.0d);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex22.atan();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex29 = complex27.divide(0.0d);
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex22.multiply(complex30);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex36 = complex34.divide(0.0d);
        org.apache.commons.math.complex.Complex complex38 = complex36.pow((double) 10);
        boolean boolean39 = complex36.isInfinite();
        org.apache.commons.math.complex.Complex complex40 = complex36.asin();
        org.apache.commons.math.complex.Complex complex41 = complex30.subtract(complex40);
        org.apache.commons.math.complex.ComplexField complexField42 = complex40.getField();
        org.apache.commons.math.complex.Complex complex43 = complex40.sqrt();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex46 = complex44.atan();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex51 = complex49.divide(0.0d);
        org.apache.commons.math.complex.Complex complex52 = complex51.cosh();
        org.apache.commons.math.complex.Complex complex53 = complex44.multiply(complex52);
        org.apache.commons.math.complex.Complex complex54 = complex43.add(complex44);
        org.apache.commons.math.complex.Complex complex55 = complex54.tanh();
        boolean boolean56 = complex18.equals((java.lang.Object) complex55);
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex61 = complex59.divide(0.0d);
        org.apache.commons.math.complex.Complex complex63 = complex61.pow((double) 10);
        org.apache.commons.math.complex.Complex complex65 = complex63.add(1.0d);
        org.apache.commons.math.complex.Complex complex66 = complex65.acos();
        org.apache.commons.math.complex.Complex complex68 = complex66.add((double) 100);
        org.apache.commons.math.complex.Complex complex71 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex73 = complex71.divide(0.0d);
        org.apache.commons.math.complex.Complex complex75 = complex73.pow((double) 10);
        org.apache.commons.math.complex.Complex complex77 = complex75.add(1.0d);
        org.apache.commons.math.complex.Complex complex78 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField79 = complex78.getField();
        org.apache.commons.math.complex.Complex complex80 = complex75.multiply(complex78);
        org.apache.commons.math.complex.Complex complex83 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex85 = complex83.divide(0.0d);
        org.apache.commons.math.complex.Complex complex87 = complex85.pow((double) 10);
        org.apache.commons.math.complex.Complex complex89 = complex87.add(1.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList91 = complex89.nthRoot(10);
        org.apache.commons.math.complex.Complex complex92 = complex78.multiply(complex89);
        org.apache.commons.math.complex.Complex complex93 = complex78.sqrt();
        org.apache.commons.math.complex.Complex complex94 = complex93.cos();
        org.apache.commons.math.complex.Complex complex95 = complex68.pow(complex93);
        org.apache.commons.math.complex.Complex complex96 = complex68.tanh();
        org.apache.commons.math.complex.Complex complex97 = complex55.pow(complex68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex94", complex18.equals(complex94) ? complex18.hashCode() == complex94.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        org.apache.commons.math.complex.Complex complex26 = complex24.cosh();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.valueOf((double) 100, 32.0d);
        org.apache.commons.math.complex.Complex complex30 = complex29.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex29.negate();
        java.util.List<org.apache.commons.math.complex.Complex> complexList33 = complex29.nthRoot((int) '4');
        org.apache.commons.math.complex.Complex complex34 = complex29.sinh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList36 = complex29.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex37 = complex26.add(complex29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex25 and complex26", complex25.equals(complex26) ? complex25.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        org.apache.commons.math.complex.Complex complex47 = complex45.asin();
        org.apache.commons.math.complex.Complex complex48 = complex47.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex29 and complex47", complex29.equals(complex47) ? complex29.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.sin();
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (-1));
        org.apache.commons.math.complex.Complex complex12 = complex0.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex13", complex11.equals(complex13) ? complex11.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex0.add((double) (byte) 0);
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex9 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex6.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex9", complex0.equals(complex9) ? complex0.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        org.apache.commons.math.complex.Complex complex17 = complex8.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex16", complex8.equals(complex16) ? complex8.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        double double6 = complex5.abs();
        org.apache.commons.math.complex.Complex complex7 = complex0.add(complex5);
        org.apache.commons.math.complex.ComplexField complexField8 = complex0.getField();
        org.apache.commons.math.complex.Complex complex9 = complex0.negate();
        org.apache.commons.math.complex.Complex complex10 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex0.log();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        double double13 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean15 = complex14.isNaN();
        org.apache.commons.math.complex.Complex complex16 = complex12.pow(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex16.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex20 = complex16.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean24 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex25 = complex21.pow(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex23.tan();
        org.apache.commons.math.complex.Complex complex27 = complex26.cos();
        java.lang.Object obj28 = complex27.readResolve();
        org.apache.commons.math.complex.Complex complex29 = complex27.sin();
        boolean boolean30 = complex16.equals((java.lang.Object) complex27);
        double double31 = complex16.getReal();
        org.apache.commons.math.complex.Complex complex32 = complex16.negate();
        boolean boolean33 = complex0.equals((java.lang.Object) complex16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex27", complex5.equals(complex27) ? complex5.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        boolean boolean6 = complex5.isNaN();
        org.apache.commons.math.complex.Complex complex7 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex5.sinh();
        org.apache.commons.math.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math.complex.Complex complex11 = complex8.multiply(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex9", complex7.equals(complex9) ? complex7.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.asin();
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) 100, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex7.pow(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex6.pow(complex11);
        org.apache.commons.math.complex.Complex complex15 = complex6.add(0.5403023058681398d);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex15.exp();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex24 = complex22.divide(0.0d);
        org.apache.commons.math.complex.Complex complex26 = complex24.pow((double) 10);
        org.apache.commons.math.complex.Complex complex28 = complex26.add(1.0d);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField30 = complex29.getField();
        org.apache.commons.math.complex.Complex complex31 = complex26.multiply(complex29);
        org.apache.commons.math.complex.Complex complex33 = complex31.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex35 = complex31.multiply((double) '#');
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex36.sinh();
        org.apache.commons.math.complex.Complex complex39 = complex38.negate();
        org.apache.commons.math.complex.Complex complex40 = complex31.multiply(complex38);
        org.apache.commons.math.complex.Complex complex41 = complex40.cos();
        org.apache.commons.math.complex.Complex complex44 = complex41.createComplex((double) (short) 10, (double) (short) -1);
        org.apache.commons.math.complex.Complex complex45 = complex19.add(complex44);
        boolean boolean46 = complex2.equals((java.lang.Object) complex45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 1, (double) (byte) 0);
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex4.atan();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        double double13 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean15 = complex14.isNaN();
        org.apache.commons.math.complex.Complex complex16 = complex12.pow(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex19 = complex16.sinh();
        boolean boolean20 = complex11.equals((java.lang.Object) complex16);
        org.apache.commons.math.complex.Complex complex21 = complex16.asin();
        org.apache.commons.math.complex.Complex complex22 = complex6.add(complex16);
        boolean boolean23 = complex16.isInfinite();
        org.apache.commons.math.complex.Complex complex24 = complex3.multiply(complex16);
        org.apache.commons.math.complex.Complex complex25 = complex3.sin();
        org.apache.commons.math.complex.Complex complex26 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex27 = complex26.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex26", complex3.equals(complex26) ? complex3.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex3 = complex0.divide((double) 10.0f);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10L);
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex7.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex7", complex4.equals(complex7) ? complex4.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        org.apache.commons.math.complex.Complex complex14 = complex13.log();
        org.apache.commons.math.complex.Complex complex15 = complex13.conjugate();
        java.lang.Class<?> wildcardClass16 = complex13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex15", complex0.equals(complex15) ? complex0.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.ComplexField complexField2 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex5 = complex0.acos();
        org.apache.commons.math.complex.Complex complex6 = complex0.acos();
        org.apache.commons.math.complex.Complex complex7 = complex6.log();
        org.apache.commons.math.complex.Complex complex9 = complex7.divide((double) 10L);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.valueOf((double) 1L);
        org.apache.commons.math.complex.Complex complex12 = complex9.subtract(complex11);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        double double16 = complex15.getArgument();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean18 = complex17.isNaN();
        org.apache.commons.math.complex.Complex complex19 = complex15.pow(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex19.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex22 = complex13.divide(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex11.divide(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex11.acos();
        double double25 = complex11.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex24", complex0.equals(complex24) ? complex0.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        org.apache.commons.math.complex.Complex complex14 = complex13.log();
        org.apache.commons.math.complex.Complex complex15 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex15", complex0.equals(complex15) ? complex0.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        java.lang.Object obj5 = complex2.readResolve();
        org.apache.commons.math.complex.Complex complex6 = complex2.exp();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex2.nthRoot(100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex6", complex3.equals(complex6) ? complex3.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex31 = complex29.divide(0.0d);
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex33 = complex31.negate();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex35 = complex34.atan();
        org.apache.commons.math.complex.Complex complex37 = complex35.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex38 = complex35.negate();
        org.apache.commons.math.complex.Complex complex39 = complex31.divide(complex38);
        java.lang.String str40 = complex38.toString();
        org.apache.commons.math.complex.Complex complex41 = complex38.sqrt();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = complex42.atan();
        org.apache.commons.math.complex.Complex complex45 = complex44.cos();
        org.apache.commons.math.complex.Complex complex46 = complex44.tanh();
        org.apache.commons.math.complex.Complex complex47 = complex38.multiply(complex46);
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex52 = complex50.divide(0.0d);
        org.apache.commons.math.complex.Complex complex54 = complex52.pow((double) 10);
        org.apache.commons.math.complex.Complex complex56 = complex54.add(1.0d);
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField58 = complex57.getField();
        org.apache.commons.math.complex.Complex complex59 = complex54.multiply(complex57);
        org.apache.commons.math.complex.Complex complex61 = complex59.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex62 = complex59.sin();
        org.apache.commons.math.complex.Complex complex63 = complex59.sqrt();
        org.apache.commons.math.complex.Complex complex64 = complex63.cos();
        org.apache.commons.math.complex.Complex complex65 = complex47.pow(complex64);
        org.apache.commons.math.complex.Complex complex66 = complex25.multiply(complex64);
        org.apache.commons.math.complex.Complex complex67 = complex25.cosh();
        boolean boolean68 = complex25.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex45 and complex67", complex45.equals(complex67) ? complex45.hashCode() == complex67.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        boolean boolean6 = complex5.isNaN();
        org.apache.commons.math.complex.Complex complex7 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex5.sinh();
        org.apache.commons.math.complex.Complex complex9 = complex8.cos();
        org.apache.commons.math.complex.Complex complex10 = complex9.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex9", complex7.equals(complex9) ? complex7.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        org.apache.commons.math.complex.Complex complex26 = complex24.cosh();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        double double28 = complex27.getArgument();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math.complex.Complex complex31 = complex27.pow(complex29);
        org.apache.commons.math.complex.Complex complex32 = complex31.sqrt();
        org.apache.commons.math.complex.Complex complex33 = complex31.sqrt();
        org.apache.commons.math.complex.Complex complex36 = complex33.createComplex((double) 100L, 10.000018486549509d);
        org.apache.commons.math.complex.Complex complex37 = complex24.multiply(complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex25 and complex26", complex25.equals(complex26) ? complex25.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex23.pow((double) 10);
        boolean boolean26 = complex23.isInfinite();
        org.apache.commons.math.complex.Complex complex27 = complex23.asin();
        org.apache.commons.math.complex.Complex complex28 = complex27.negate();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = complex29.acos();
        org.apache.commons.math.complex.Complex complex31 = complex28.pow(complex29);
        org.apache.commons.math.complex.Complex complex32 = complex16.multiply(complex28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex30", complex9.equals(complex30) ? complex9.hashCode() == complex30.hashCode() : true);
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
        org.apache.commons.math.complex.Complex complex24 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex24.cos();
        org.apache.commons.math.complex.Complex complex26 = complex24.cosh();
        java.lang.Object obj27 = complex24.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex25 and complex26", complex25.equals(complex26) ? complex25.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 1, (double) (byte) 0);
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex4.atan();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        double double13 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean15 = complex14.isNaN();
        org.apache.commons.math.complex.Complex complex16 = complex12.pow(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex19 = complex16.sinh();
        boolean boolean20 = complex11.equals((java.lang.Object) complex16);
        org.apache.commons.math.complex.Complex complex21 = complex16.asin();
        org.apache.commons.math.complex.Complex complex22 = complex6.add(complex16);
        boolean boolean23 = complex16.isInfinite();
        org.apache.commons.math.complex.Complex complex24 = complex3.multiply(complex16);
        org.apache.commons.math.complex.Complex complex25 = complex3.sin();
        org.apache.commons.math.complex.Complex complex26 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex28 = complex3.add(51.99038372622383d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex26", complex3.equals(complex26) ? complex3.hashCode() == complex26.hashCode() : true);
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
        org.apache.commons.math.complex.Complex complex24 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        org.apache.commons.math.complex.Complex complex26 = complex24.asin();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        double double28 = complex27.getArgument();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math.complex.Complex complex31 = complex27.pow(complex29);
        org.apache.commons.math.complex.Complex complex33 = complex31.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex34 = complex31.asin();
        org.apache.commons.math.complex.Complex complex36 = complex34.add((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex39 = complex34.createComplex((double) 100.0f, (-1.0d));
        org.apache.commons.math.complex.Complex complex40 = complex39.asin();
        org.apache.commons.math.complex.Complex complex41 = complex26.divide(complex39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex26", complex9.equals(complex26) ? complex9.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        org.apache.commons.math.complex.Complex complex14 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex15.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex22 = complex20.divide(0.0d);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        double double24 = complex23.getArgument();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean26 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex27 = complex23.pow(complex25);
        org.apache.commons.math.complex.Complex complex29 = complex27.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex30 = complex27.sinh();
        boolean boolean31 = complex22.equals((java.lang.Object) complex27);
        org.apache.commons.math.complex.Complex complex32 = complex27.asin();
        org.apache.commons.math.complex.Complex complex33 = complex17.add(complex27);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex38 = complex36.divide(0.0d);
        org.apache.commons.math.complex.Complex complex40 = complex38.pow((double) 10);
        boolean boolean41 = complex38.isInfinite();
        org.apache.commons.math.complex.Complex complex42 = complex38.asin();
        org.apache.commons.math.complex.Complex complex43 = complex42.conjugate();
        org.apache.commons.math.complex.ComplexField complexField44 = complex43.getField();
        org.apache.commons.math.complex.Complex complex45 = complex33.pow(complex43);
        org.apache.commons.math.complex.Complex complex46 = complex33.sqrt1z();
        org.apache.commons.math.complex.Complex complex48 = complex46.subtract(97.51922887307919d);
        org.apache.commons.math.complex.Complex complex49 = complex48.log();
        org.apache.commons.math.complex.Complex complex50 = complex14.divide(complex48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex14", complex12.equals(complex14) ? complex12.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        org.apache.commons.math.complex.Complex complex15 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex15.log();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex21 = complex19.divide(0.0d);
        org.apache.commons.math.complex.ComplexField complexField22 = complex19.getField();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        double double26 = complex25.getArgument();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean28 = complex27.isNaN();
        org.apache.commons.math.complex.Complex complex29 = complex25.pow(complex27);
        org.apache.commons.math.complex.Complex complex31 = complex29.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex32 = complex24.pow(complex29);
        org.apache.commons.math.complex.Complex complex33 = complex32.tanh();
        org.apache.commons.math.complex.Complex complex34 = complex33.log();
        org.apache.commons.math.complex.Complex complex35 = complex19.add(complex34);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = complex36.atan();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex43 = complex41.divide(0.0d);
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        org.apache.commons.math.complex.Complex complex45 = complex36.multiply(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex45.acos();
        org.apache.commons.math.complex.Complex complex47 = complex46.negate();
        org.apache.commons.math.complex.Complex complex50 = complex46.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex51 = complex46.sin();
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.valueOf((double) '4');
        org.apache.commons.math.complex.Complex complex54 = complex53.acos();
        org.apache.commons.math.complex.Complex complex55 = complex54.acos();
        org.apache.commons.math.complex.Complex complex57 = complex55.subtract((double) 1);
        org.apache.commons.math.complex.Complex complex58 = complex51.add(complex55);
        org.apache.commons.math.complex.Complex complex59 = complex35.pow(complex55);
        org.apache.commons.math.complex.Complex complex60 = complex16.multiply(complex59);
        org.apache.commons.math.complex.Complex complex61 = complex16.asin();
        org.apache.commons.math.complex.Complex complex64 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex66 = complex64.divide(0.0d);
        org.apache.commons.math.complex.Complex complex68 = complex66.pow((double) 10);
        org.apache.commons.math.complex.Complex complex70 = complex68.add(1.0d);
        org.apache.commons.math.complex.Complex complex71 = complex70.acos();
        org.apache.commons.math.complex.Complex complex72 = complex71.sinh();
        org.apache.commons.math.complex.Complex complex73 = complex72.sqrt();
        org.apache.commons.math.complex.Complex complex74 = complex16.multiply(complex72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex61", complex6.equals(complex61) ? complex6.hashCode() == complex61.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        org.apache.commons.math.complex.Complex complex17 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex0.multiply((double) 'a');
        org.apache.commons.math.complex.Complex complex20 = complex0.negate();
        org.apache.commons.math.complex.Complex complex22 = complex20.pow((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = complex20.add(1.5707963267948966d);
        org.apache.commons.math.complex.Complex complex25 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex26 = complex25.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex25", complex0.equals(complex25) ? complex0.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex3 = complex0.divide((double) 10.0f);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(10.000249990625546d);
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex1.add((-0.019228399099707208d));
        org.apache.commons.math.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex10 = complex6.pow(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex6.add((double) (byte) 0);
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex12.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex1.multiply(complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex15", complex6.equals(complex15) ? complex6.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
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
        org.apache.commons.math.complex.Complex complex13 = complex12.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex12", complex0.equals(complex12) ? complex0.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        java.lang.String str2 = complex1.toString();
        org.apache.commons.math.complex.Complex complex4 = complex1.pow(10.0d);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex10 = complex6.pow(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex6.add((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex14 = complex6.multiply(97.0d);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        org.apache.commons.math.complex.Complex complex17 = complex6.multiply(complex16);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField19 = complex18.getField();
        org.apache.commons.math.complex.Complex complex21 = complex18.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex22 = complex6.pow(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex6.asin();
        org.apache.commons.math.complex.Complex complex24 = complex5.subtract(complex6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex23", complex6.equals(complex23) ? complex6.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        double double2 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex3 = complex0.sqrt1z();
        boolean boolean4 = complex0.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex5", complex3.equals(complex5) ? complex3.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) 10.0f);
        org.apache.commons.math.complex.Complex complex11 = complex8.log();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        double double13 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean15 = complex14.isNaN();
        org.apache.commons.math.complex.Complex complex16 = complex12.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex14.tan();
        org.apache.commons.math.complex.Complex complex18 = complex17.cos();
        double double19 = complex17.abs();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.ComplexField complexField22 = complex20.getField();
        org.apache.commons.math.complex.Complex complex24 = complex20.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex25 = complex20.acos();
        org.apache.commons.math.complex.Complex complex26 = complex17.subtract(complex20);
        org.apache.commons.math.complex.Complex complex27 = complex11.subtract(complex26);
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) 1.0f);
        org.apache.commons.math.complex.Complex complex30 = complex27.add(complex29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex29", complex18.equals(complex29) ? complex18.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex7 = complex4.multiply(2.718784345442416d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex5", complex3.equals(complex5) ? complex3.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        org.apache.commons.math.complex.Complex complex47 = complex45.asin();
        double double48 = complex45.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex29 and complex47", complex29.equals(complex47) ? complex29.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex4 = complex1.exp();
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        double double7 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex10 = complex6.pow(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex8.tan();
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        java.lang.Object obj13 = complex12.readResolve();
        org.apache.commons.math.complex.ComplexField complexField14 = complex12.getField();
        double double15 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex17 = complex1.multiply(complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex16", complex12.equals(complex16) ? complex12.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 0, (double) 0);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex5 = complex2.multiply((-0.8657694832396586d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        org.apache.commons.math.complex.Complex complex20 = complex19.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex19", complex0.equals(complex19) ? complex0.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex4 = complex1.pow((double) 0);
        org.apache.commons.math.complex.Complex complex5 = complex1.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex3 = complex0.divide((double) 10.0f);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 0);
        org.apache.commons.math.complex.Complex complex2 = complex1.cos();
        org.apache.commons.math.complex.Complex complex3 = complex1.exp();
        org.apache.commons.math.complex.Complex complex5 = complex1.multiply((-139.85055991051462d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex9.conjugate();
        double double13 = complex9.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex12", complex9.equals(complex12) ? complex9.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        org.apache.commons.math.complex.Complex complex20 = complex19.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex19", complex0.equals(complex19) ? complex0.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        boolean boolean5 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex7 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex8 = complex2.asin();
        org.apache.commons.math.complex.Complex complex11 = complex2.createComplex(0.007070949964270685d, (double) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex8", complex2.equals(complex8) ? complex2.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        org.apache.commons.math.complex.Complex complex11 = complex6.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex10", complex6.equals(complex10) ? complex6.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        org.apache.commons.math.complex.Complex complex19 = complex14.multiply(2.356343099746926d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex17", complex6.equals(complex17) ? complex6.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 0, (double) 0);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex2.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        boolean boolean5 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex7 = complex2.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex8 = complex2.asin();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((-0.019228399099707208d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex8", complex0.equals(complex8) ? complex0.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        double double5 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex0.exp();
        org.apache.commons.math.complex.Complex complex7 = complex0.cos();
        org.apache.commons.math.complex.Complex complex8 = complex0.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex7", complex6.equals(complex7) ? complex6.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        org.apache.commons.math.complex.Complex complex15 = complex11.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex14", complex0.equals(complex14) ? complex0.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex4 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex6 = complex4.pow(1.0d);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex7.pow(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex11.divide((double) (short) 0);
        org.apache.commons.math.complex.Complex complex14 = complex13.sinh();
        org.apache.commons.math.complex.Complex complex15 = complex13.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex13.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex13.multiply((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex19.divide((double) (-1L));
        org.apache.commons.math.complex.Complex complex22 = complex4.pow(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex4.asin();
        org.apache.commons.math.complex.Complex complex25 = complex23.divide(0.6349639147847361d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex23", complex0.equals(complex23) ? complex0.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 0.0d);
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex(100.54784733847407d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10);
        org.apache.commons.math.complex.Complex complex15 = complex13.add(1.0d);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField17 = complex16.getField();
        org.apache.commons.math.complex.Complex complex18 = complex13.multiply(complex16);
        org.apache.commons.math.complex.ComplexField complexField19 = complex16.getField();
        org.apache.commons.math.complex.Complex complex21 = complex16.pow(0.0d);
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.ComplexField complexField23 = complex22.getField();
        org.apache.commons.math.complex.ComplexField complexField24 = complex22.getField();
        org.apache.commons.math.complex.Complex complex25 = complex6.pow(complex22);
        boolean boolean26 = complex4.equals((java.lang.Object) complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex4", complex2.equals(complex4) ? complex2.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
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
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        double double22 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean24 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex25 = complex21.pow(complex23);
        org.apache.commons.math.complex.Complex complex27 = complex25.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.cos();
        org.apache.commons.math.complex.Complex complex30 = complex27.divide(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex18.divide(complex28);
        org.apache.commons.math.complex.Complex complex32 = complex28.acos();
        org.apache.commons.math.complex.ComplexField complexField33 = complex32.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex32", complex9.equals(complex32) ? complex9.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        double double17 = complex15.getReal();
        org.apache.commons.math.complex.Complex complex18 = complex15.log();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.acos();
        boolean boolean21 = complex18.equals((java.lang.Object) complex20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex20", complex9.equals(complex20) ? complex9.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (-0.0d));
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        org.apache.commons.math.complex.Complex complex16 = complex5.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex15", complex6.equals(complex15) ? complex6.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        org.apache.commons.math.complex.Complex complex44 = complex43.conjugate();
        org.apache.commons.math.complex.Complex complex45 = complex44.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex44", complex0.equals(complex44) ? complex0.hashCode() == complex44.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        org.apache.commons.math.complex.Complex complex16 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex21 = complex19.divide(0.0d);
        org.apache.commons.math.complex.Complex complex23 = complex21.pow((double) 10);
        org.apache.commons.math.complex.Complex complex25 = complex23.add(1.0d);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField27 = complex26.getField();
        org.apache.commons.math.complex.Complex complex28 = complex23.multiply(complex26);
        org.apache.commons.math.complex.ComplexField complexField29 = complex26.getField();
        org.apache.commons.math.complex.Complex complex30 = complex26.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.acos();
        org.apache.commons.math.complex.Complex complex32 = complex14.multiply(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex31", complex9.equals(complex31) ? complex9.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        org.apache.commons.math.complex.Complex complex13 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        double double17 = complex16.getArgument();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean19 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex20 = complex16.pow(complex18);
        org.apache.commons.math.complex.Complex complex22 = complex20.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex23 = complex15.pow(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex23.tanh();
        org.apache.commons.math.complex.Complex complex25 = complex24.asin();
        org.apache.commons.math.complex.Complex complex26 = complex25.cos();
        org.apache.commons.math.complex.Complex complex28 = complex25.subtract((double) 100);
        org.apache.commons.math.complex.Complex complex29 = complex25.conjugate();
        org.apache.commons.math.complex.Complex complex32 = complex25.createComplex(32.0d, 32.0d);
        org.apache.commons.math.complex.Complex complex33 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex34 = complex13.subtract(complex25);
        org.apache.commons.math.complex.Complex complex35 = complex34.negate();
        org.apache.commons.math.complex.Complex complex36 = complex34.tan();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ZERO;
        double double40 = complex39.getArgument();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean42 = complex41.isNaN();
        org.apache.commons.math.complex.Complex complex43 = complex39.pow(complex41);
        org.apache.commons.math.complex.Complex complex45 = complex43.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex47 = complex43.add((double) 10.0f);
        org.apache.commons.math.complex.Complex complex48 = complex47.asin();
        org.apache.commons.math.complex.Complex complex50 = complex48.pow((double) 10);
        org.apache.commons.math.complex.Complex complex51 = complex38.subtract(complex48);
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex55 = complex51.subtract(complex54);
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ZERO;
        double double57 = complex56.getArgument();
        org.apache.commons.math.complex.Complex complex58 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean59 = complex58.isNaN();
        org.apache.commons.math.complex.Complex complex60 = complex56.pow(complex58);
        org.apache.commons.math.complex.Complex complex61 = complex58.tan();
        org.apache.commons.math.complex.Complex complex62 = complex61.cos();
        double double63 = complex61.abs();
        org.apache.commons.math.complex.ComplexField complexField64 = complex61.getField();
        org.apache.commons.math.complex.Complex complex65 = complex51.pow(complex61);
        org.apache.commons.math.complex.Complex complex66 = complex65.sqrt();
        org.apache.commons.math.complex.Complex complex67 = complex65.asin();
        org.apache.commons.math.complex.Complex complex68 = complex34.divide(complex67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex62", complex15.equals(complex62) ? complex15.hashCode() == complex62.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex0.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10);
        boolean boolean14 = complex11.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex11.asin();
        org.apache.commons.math.complex.Complex complex16 = complex15.negate();
        org.apache.commons.math.complex.Complex complex18 = complex15.add((double) 100);
        org.apache.commons.math.complex.Complex complex19 = complex0.add(complex15);
        org.apache.commons.math.complex.Complex complex20 = complex0.asin();
        org.apache.commons.math.complex.Complex complex21 = complex0.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex20", complex0.equals(complex20) ? complex0.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((-0.4429679074828778d));
        org.apache.commons.math.complex.Complex complex2 = complex1.tanh();
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        java.lang.Object obj4 = complex2.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex2.divide(0.0d);
        org.apache.commons.math.complex.Complex complex6 = complex4.pow((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(1.0d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex6.multiply(complex9);
        org.apache.commons.math.complex.ComplexField complexField12 = complex9.getField();
        org.apache.commons.math.complex.Complex complex14 = complex9.pow(0.0d);
        double double15 = complex9.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex9.asin();
        java.lang.Object obj17 = complex16.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex16", complex9.equals(complex16) ? complex9.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        double double18 = complex14.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex17", complex6.equals(complex17) ? complex6.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex7 = complex4.asin();
        org.apache.commons.math.complex.Complex complex9 = complex7.add((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = complex10.atan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex17 = complex15.divide(0.0d);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex10.multiply(complex18);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math.complex.Complex complex24 = complex22.divide(0.0d);
        org.apache.commons.math.complex.Complex complex26 = complex24.pow((double) 10);
        boolean boolean27 = complex24.isInfinite();
        org.apache.commons.math.complex.Complex complex28 = complex24.asin();
        org.apache.commons.math.complex.Complex complex29 = complex18.subtract(complex28);
        org.apache.commons.math.complex.ComplexField complexField30 = complex28.getField();
        org.apache.commons.math.complex.Complex complex31 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex32 = complex28.cos();
        org.apache.commons.math.complex.Complex complex33 = complex28.atan();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField35 = complex34.getField();
        org.apache.commons.math.complex.Complex complex37 = complex34.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex38 = complex34.atan();
        org.apache.commons.math.complex.Complex complex39 = complex38.cos();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex43 = complex41.pow(100.0d);
        org.apache.commons.math.complex.Complex complex45 = complex43.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex46 = complex38.divide(complex45);
        org.apache.commons.math.complex.Complex complex47 = complex46.sin();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.ComplexField complexField49 = complex48.getField();
        org.apache.commons.math.complex.Complex complex51 = complex48.pow((double) (-1L));
        org.apache.commons.math.complex.Complex complex52 = complex48.sqrt();
        org.apache.commons.math.complex.Complex complex53 = complex46.multiply(complex52);
        org.apache.commons.math.complex.Complex complex54 = complex28.multiply(complex52);
        org.apache.commons.math.complex.Complex complex55 = complex9.multiply(complex28);
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex58 = org.apache.commons.math.complex.Complex.ZERO;
        double double59 = complex58.getArgument();
        org.apache.commons.math.complex.Complex complex60 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean61 = complex60.isNaN();
        org.apache.commons.math.complex.Complex complex62 = complex58.pow(complex60);
        org.apache.commons.math.complex.Complex complex64 = complex62.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex65 = complex57.pow(complex62);
        org.apache.commons.math.complex.Complex complex66 = complex65.tanh();
        org.apache.commons.math.complex.Complex complex67 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex68 = complex67.cos();
        org.apache.commons.math.complex.Complex complex70 = complex68.divide((double) 100);
        org.apache.commons.math.complex.Complex complex71 = complex68.sinh();
        org.apache.commons.math.complex.Complex complex72 = complex66.multiply(complex68);
        boolean boolean73 = complex72.isNaN();
        org.apache.commons.math.complex.Complex complex74 = complex72.negate();
        org.apache.commons.math.complex.Complex complex75 = complex74.exp();
        org.apache.commons.math.complex.Complex complex77 = complex75.subtract(32.0d);
        boolean boolean78 = complex55.equals((java.lang.Object) complex77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex39 and complex57", complex39.equals(complex57) ? complex39.hashCode() == complex57.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(6.96419413859206d);
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex1.pow(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((-0.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex12", complex0.equals(complex12) ? complex0.hashCode() == complex12.hashCode() : true);
    }
}

