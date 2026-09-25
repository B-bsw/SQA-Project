package org.apache.commons.math.geometry;

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
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.subtract(vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D6, vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        double double14 = org.apache.commons.math.geometry.Vector3D.distance(vector3D12, vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D12.subtract(vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D6, vector3D15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D8", vector3D6.equals(vector3D8) ? vector3D6.hashCode() == vector3D8.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D4.subtract((double) 'a', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D6, (double) '4', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D11, vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D23, (double) '4', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D31.subtract((double) 'a', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D28, vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.subtract((double) 'a', vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D40, (double) '4', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D48.subtract((double) 'a', vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D45, vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D53 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D18, (double) 100.0f, vector3D31, 10.0d, vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D54 = new org.apache.commons.math.geometry.Vector3D((double) (short) 100, vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D57 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D54, (double) (short) -1, vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D60 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D63 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D60.subtract(vector3D63);
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D64, vector3D65);
        double double67 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D57, vector3D64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D18 and vector3D66", vector3D18.equals(vector3D66) ? vector3D18.hashCode() == vector3D66.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D4, (double) '4', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D9, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D25 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D19, (double) 'a', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        double double31 = vector3D29.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D33.subtract((double) 'a', vector3D35);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.subtract((double) 'a', vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D42 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D35, (double) '4', vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D29.add(vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D47.subtract((double) 'a', vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D49.negate();
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D42, (double) 10, vector3D45, 0.0d, vector3D51, (double) 1L, vector3D53);
        double double55 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D25, vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.MINUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D61 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D64 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D65 = vector3D61.subtract(vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D65, vector3D66);
        org.apache.commons.math.geometry.Vector3D vector3D68 = new org.apache.commons.math.geometry.Vector3D(96.00520819205592d, vector3D16, 96.00520819205592d, vector3D25, (double) (byte) 10, vector3D57, (double) (-1), vector3D65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D16 and vector3D67", vector3D16.equals(vector3D67) ? vector3D16.hashCode() == vector3D67.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D3, (double) '4', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D15.negate();
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D16.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D15 and vector3D16", vector3D15.equals(vector3D16) ? vector3D15.hashCode() == vector3D16.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        boolean boolean2 = vector3D1.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D7.subtract(vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D12 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D10);
        boolean boolean13 = vector3D10.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D17.subtract(vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D((double) (short) 100, vector3D1, (double) 10L, vector3D10, (double) 1.0f, vector3D20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D12 and vector3D21", vector3D12.equals(vector3D21) ? vector3D12.hashCode() == vector3D21.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.subtract(vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D6, vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double10 = vector3D9.getDelta();
        double double11 = org.apache.commons.math.geometry.Vector3D.distance(vector3D7, vector3D9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D8", vector3D6.equals(vector3D8) ? vector3D6.hashCode() == vector3D8.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        double double4 = vector3D2.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D6.subtract(vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.negate();
        double double10 = vector3D6.getDelta();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D9", vector3D6.equals(vector3D9) ? vector3D6.hashCode() == vector3D9.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.subtract(vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D6, vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D8.scalarMultiply(110.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D8", vector3D6.equals(vector3D8) ? vector3D6.hashCode() == vector3D8.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        double double4 = vector3D2.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D6.subtract(vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.negate();
        double double10 = vector3D6.getAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D9", vector3D6.equals(vector3D9) ? vector3D6.hashCode() == vector3D9.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.subtract(vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D6, vector3D7);
        double double9 = vector3D8.getNorm1();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D8", vector3D6.equals(vector3D8) ? vector3D6.hashCode() == vector3D8.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D1, (double) 'a', vector3D3);
        double double8 = vector3D7.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D7.orthogonal();
        double double10 = vector3D7.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D11.negate();
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        double double17 = vector3D15.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D23, (double) '4', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D31.subtract((double) 'a', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D28, vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.subtract((double) 'a', vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D40, (double) '4', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D48.subtract((double) 'a', vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D45, vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D55.subtract((double) 'a', vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D60.subtract((double) 'a', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D64 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D57, (double) '4', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D68 = vector3D65.subtract((double) 'a', vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D62, vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D70 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D35, (double) 100.0f, vector3D48, 10.0d, vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D18, vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = vector3D73.subtract((double) 'a', vector3D75);
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D18.add((double) 1L, vector3D73);
        double double78 = org.apache.commons.math.geometry.Vector3D.distance(vector3D12, vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D79 = vector3D73.negate();
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D7, vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D81 = vector3D80.negate();
        double double82 = vector3D81.getDelta();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D35 and vector3D81", vector3D35.equals(vector3D81) ? vector3D35.hashCode() == vector3D81.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D3, (double) '4', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D15.negate();
        double double17 = vector3D15.getAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D15 and vector3D16", vector3D15.equals(vector3D16) ? vector3D15.hashCode() == vector3D16.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double1 = vector3D0.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D5.subtract((double) 'a', vector3D7);
        double double9 = vector3D7.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D13, (double) '4', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D7.add(vector3D20);
        boolean boolean22 = vector3D7.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D26.subtract(vector3D29);
        double double31 = vector3D26.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D26.negate();
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D7.subtract(10.0d, vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D((double) (short) 100, (double) 10L, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) 0, vector3D3, 0.0d, vector3D33, (double) (short) -1, vector3D38);
        double double40 = org.apache.commons.math.geometry.Vector3D.distance(vector3D0, vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.negate();
        double double42 = vector3D38.getDelta();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D39 and vector3D41", vector3D39.equals(vector3D41) ? vector3D39.hashCode() == vector3D41.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) 0, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D4.subtract((double) 'a', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D6, (double) '4', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D11, vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        double double23 = vector3D21.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D27, (double) '4', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D21.add(vector3D34);
        double double36 = org.apache.commons.math.geometry.Vector3D.distance(vector3D14, vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D2, vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D2.orthogonal();
        double double39 = vector3D2.getNormSq();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D37 and vector3D38", vector3D37.equals(vector3D38) ? vector3D37.hashCode() == vector3D38.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        boolean boolean5 = vector3D4.isNaN();
        java.lang.String str6 = vector3D4.toString();
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((-157.07963267948966d), vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        double double12 = vector3D10.getNorm();
        double double13 = org.apache.commons.math.geometry.Vector3D.angle(vector3D4, vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D4.orthogonal();
        double double15 = vector3D14.getNorm1();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D14", vector3D8.equals(vector3D14) ? vector3D8.hashCode() == vector3D14.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double1 = vector3D0.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D5.subtract((double) 'a', vector3D7);
        double double9 = vector3D7.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D13, (double) '4', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D7.add(vector3D20);
        boolean boolean22 = vector3D7.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D26.subtract(vector3D29);
        double double31 = vector3D26.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D26.negate();
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D7.subtract(10.0d, vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D((double) (short) 100, (double) 10L, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) 0, vector3D3, 0.0d, vector3D33, (double) (short) -1, vector3D38);
        double double40 = org.apache.commons.math.geometry.Vector3D.distance(vector3D0, vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.negate();
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D48.subtract((double) 'a', vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D52 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D45, (double) '4', vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D56 = vector3D53.subtract((double) 'a', vector3D55);
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D50, vector3D53);
        boolean boolean58 = vector3D50.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        double double61 = vector3D60.getX();
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D63.subtract((double) 'a', vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D68.subtract((double) 'a', vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D72 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D65, (double) '4', vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = vector3D73.subtract((double) 'a', vector3D75);
        org.apache.commons.math.geometry.Vector3D vector3D77 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D70, vector3D73);
        boolean boolean78 = vector3D70.isInfinite();
        double double79 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D60, vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D80 = vector3D50.add(0.0d, vector3D60);
        org.apache.commons.math.geometry.Vector3D vector3D84 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        boolean boolean85 = vector3D84.isNaN();
        java.lang.String str86 = vector3D84.toString();
        org.apache.commons.math.geometry.Vector3D vector3D87 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D60, vector3D84);
        double double88 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D41, vector3D84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D39 and vector3D41", vector3D39.equals(vector3D41) ? vector3D39.hashCode() == vector3D41.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D4.subtract(vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D9 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D23 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D16, (double) '4', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D24.subtract((double) 'a', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D21, vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D31.subtract((double) 'a', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract((double) 'a', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D40 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D33, (double) '4', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D38, vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D48.subtract((double) 'a', vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D56 = vector3D53.subtract((double) 'a', vector3D55);
        org.apache.commons.math.geometry.Vector3D vector3D57 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D50, (double) '4', vector3D55);
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D58.subtract((double) 'a', vector3D60);
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D55, vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D63 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D28, (double) 100.0f, vector3D41, 10.0d, vector3D55);
        org.apache.commons.math.geometry.Vector3D vector3D64 = new org.apache.commons.math.geometry.Vector3D((double) 100, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D68 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, (double) (byte) -1, 0.0d);
        double double69 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D28, vector3D68);
        org.apache.commons.math.geometry.Vector3D vector3D74 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D75 = new org.apache.commons.math.geometry.Vector3D((double) 1, vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D79 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        double double80 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D76, vector3D79);
        double double81 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D74, vector3D76);
        double double82 = vector3D76.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D83 = new org.apache.commons.math.geometry.Vector3D(1.6404870725894243d, vector3D7, 100.0199980003999d, vector3D68, 3.796077390275217d, vector3D76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D9 and vector3D28", vector3D9.equals(vector3D28) ? vector3D9.hashCode() == vector3D28.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        boolean boolean5 = vector3D4.isNaN();
        java.lang.String str6 = vector3D4.toString();
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((-157.07963267948966d), vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        double double12 = vector3D10.getNorm();
        double double13 = org.apache.commons.math.geometry.Vector3D.angle(vector3D4, vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D4.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        boolean boolean20 = vector3D19.isNaN();
        java.lang.String str21 = vector3D19.toString();
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D((-157.07963267948966d), vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D23.subtract((double) 'a', vector3D25);
        double double27 = vector3D25.getNorm();
        double double28 = org.apache.commons.math.geometry.Vector3D.angle(vector3D19, vector3D25);
        boolean boolean29 = vector3D19.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.subtract((double) 'a', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D34, (double) '4', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = vector3D42.subtract((double) 'a', vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D39, vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D49.subtract((double) 'a', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D54.subtract((double) 'a', vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D58 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D51, (double) '4', vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = vector3D59.subtract((double) 'a', vector3D61);
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D56, vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D69 = vector3D66.subtract((double) 'a', vector3D68);
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D74 = vector3D71.subtract((double) 'a', vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D75 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D68, (double) '4', vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D78 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D79 = vector3D76.subtract((double) 'a', vector3D78);
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D73, vector3D76);
        org.apache.commons.math.geometry.Vector3D vector3D81 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D46, (double) 100.0f, vector3D59, 10.0d, vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D82 = vector3D73.orthogonal();
        double double83 = org.apache.commons.math.geometry.Vector3D.angle(vector3D19, vector3D73);
        double double84 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D4, vector3D19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D14", vector3D8.equals(vector3D14) ? vector3D8.hashCode() == vector3D14.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D3, (double) '4', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        double double20 = vector3D18.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D31 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D24, (double) '4', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D18.add(vector3D31);
        double double33 = org.apache.commons.math.geometry.Vector3D.distance(vector3D11, vector3D18);
        double double34 = vector3D11.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract((double) 'a', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D38, (double) '4', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D43, vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        double double55 = vector3D53.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D57.subtract((double) 'a', vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = vector3D62.subtract((double) 'a', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D66 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D59, (double) '4', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D53.add(vector3D66);
        double double68 = org.apache.commons.math.geometry.Vector3D.distance(vector3D46, vector3D53);
        double double69 = vector3D53.getNorm1();
        double double70 = vector3D53.getNormSq();
        double double71 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D11, vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D72 = vector3D11.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D74.subtract((double) 'a', vector3D76);
        org.apache.commons.math.geometry.Vector3D vector3D79 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D81 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D82 = vector3D79.subtract((double) 'a', vector3D81);
        org.apache.commons.math.geometry.Vector3D vector3D83 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D76, (double) '4', vector3D81);
        org.apache.commons.math.geometry.Vector3D vector3D84 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D86 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D87 = vector3D84.subtract((double) 'a', vector3D86);
        org.apache.commons.math.geometry.Vector3D vector3D88 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D81, vector3D84);
        org.apache.commons.math.geometry.Vector3D vector3D89 = vector3D88.negate();
        boolean boolean90 = vector3D72.equals((java.lang.Object) vector3D88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D15 and vector3D89", vector3D15.equals(vector3D89) ? vector3D15.hashCode() == vector3D89.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D3, (double) '4', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D15.negate();
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        double double21 = vector3D20.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D16.add(vector3D20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D15 and vector3D16", vector3D15.equals(vector3D16) ? vector3D15.hashCode() == vector3D16.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.ZERO;
        org.apache.commons.math.geometry.Vector3D vector3D1 = vector3D0.negate();
        boolean boolean2 = vector3D1.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D0 and vector3D1", vector3D0.equals(vector3D1) ? vector3D0.hashCode() == vector3D1.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D1, (double) 'a', vector3D3);
        double double8 = vector3D7.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D7.orthogonal();
        double double10 = vector3D7.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D11.negate();
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        double double17 = vector3D15.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D23, (double) '4', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D31.subtract((double) 'a', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D28, vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.subtract((double) 'a', vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D40, (double) '4', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D48.subtract((double) 'a', vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D45, vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D55.subtract((double) 'a', vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D60.subtract((double) 'a', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D64 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D57, (double) '4', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D68 = vector3D65.subtract((double) 'a', vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D62, vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D70 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D35, (double) 100.0f, vector3D48, 10.0d, vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D18, vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = vector3D73.subtract((double) 'a', vector3D75);
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D18.add((double) 1L, vector3D73);
        double double78 = org.apache.commons.math.geometry.Vector3D.distance(vector3D12, vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D79 = vector3D73.negate();
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D7, vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D81 = vector3D80.negate();
        org.apache.commons.math.geometry.Vector3D vector3D82 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D84 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D85 = vector3D82.subtract((double) 'a', vector3D84);
        double double86 = vector3D84.getX();
        org.apache.commons.math.geometry.Vector3D vector3D87 = vector3D81.add(vector3D84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D35 and vector3D81", vector3D35.equals(vector3D81) ? vector3D35.hashCode() == vector3D81.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D6 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D3.subtract(vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D6);
        double double9 = vector3D8.getY();
        org.apache.commons.math.geometry.Vector3D vector3D14 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D18 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D21 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D18.subtract(vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D23 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D14, (double) (byte) 10, vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        double double29 = vector3D27.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D22, (double) '4', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double32 = vector3D31.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D22, vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        boolean boolean38 = vector3D37.isNaN();
        java.lang.String str39 = vector3D37.toString();
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D22.subtract(vector3D37);
        double double41 = org.apache.commons.math.geometry.Vector3D.distance(vector3D8, vector3D37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D22", vector3D8.equals(vector3D22) ? vector3D8.hashCode() == vector3D22.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D8.subtract(vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D4, (double) (byte) 10, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.subtract((double) 'a', vector3D17);
        double double19 = vector3D17.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D12, (double) '4', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double22 = vector3D21.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D12, vector3D21);
        double double24 = vector3D23.getNorm1();
        double double25 = vector3D23.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D27.negate();
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        double double33 = vector3D31.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D31.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.subtract((double) 'a', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = vector3D42.subtract((double) 'a', vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D46 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D39, (double) '4', vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D47.subtract((double) 'a', vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D44, vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D54.subtract((double) 'a', vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = vector3D59.subtract((double) 'a', vector3D61);
        org.apache.commons.math.geometry.Vector3D vector3D63 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D56, (double) '4', vector3D61);
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D64.subtract((double) 'a', vector3D66);
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D61, vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D74 = vector3D71.subtract((double) 'a', vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D78 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D79 = vector3D76.subtract((double) 'a', vector3D78);
        org.apache.commons.math.geometry.Vector3D vector3D80 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D73, (double) '4', vector3D78);
        org.apache.commons.math.geometry.Vector3D vector3D81 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D83 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D84 = vector3D81.subtract((double) 'a', vector3D83);
        org.apache.commons.math.geometry.Vector3D vector3D85 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D78, vector3D81);
        org.apache.commons.math.geometry.Vector3D vector3D86 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D51, (double) 100.0f, vector3D64, 10.0d, vector3D78);
        org.apache.commons.math.geometry.Vector3D vector3D87 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D34, vector3D78);
        org.apache.commons.math.geometry.Vector3D vector3D89 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D91 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D92 = vector3D89.subtract((double) 'a', vector3D91);
        org.apache.commons.math.geometry.Vector3D vector3D93 = vector3D34.add((double) 1L, vector3D89);
        double double94 = org.apache.commons.math.geometry.Vector3D.distance(vector3D28, vector3D89);
        org.apache.commons.math.geometry.Vector3D vector3D95 = vector3D23.add((double) 100, vector3D89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D21 and vector3D87", vector3D21.equals(vector3D87) ? vector3D21.hashCode() == vector3D87.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D(1.9762183008101064d, 1.385650041748201d);
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D4, (double) 'a', vector3D6);
        double double11 = vector3D10.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D10.orthogonal();
        double double13 = vector3D10.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D14.negate();
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        double double20 = vector3D18.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D18.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D24.subtract((double) 'a', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D33 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D26, (double) '4', vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D34.subtract((double) 'a', vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D31, vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D50 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D43, (double) '4', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D48, vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D58.subtract((double) 'a', vector3D60);
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D63.subtract((double) 'a', vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D67 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D60, (double) '4', vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D68.subtract((double) 'a', vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D72 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D65, vector3D68);
        org.apache.commons.math.geometry.Vector3D vector3D73 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D38, (double) 100.0f, vector3D51, 10.0d, vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D21, vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D78 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D79 = vector3D76.subtract((double) 'a', vector3D78);
        org.apache.commons.math.geometry.Vector3D vector3D80 = vector3D21.add((double) 1L, vector3D76);
        double double81 = org.apache.commons.math.geometry.Vector3D.distance(vector3D15, vector3D76);
        org.apache.commons.math.geometry.Vector3D vector3D82 = vector3D76.negate();
        org.apache.commons.math.geometry.Vector3D vector3D83 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D10, vector3D76);
        org.apache.commons.math.geometry.Vector3D vector3D84 = vector3D83.negate();
        org.apache.commons.math.geometry.Vector3D vector3D85 = vector3D2.add(vector3D84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D38 and vector3D84", vector3D38.equals(vector3D84) ? vector3D38.hashCode() == vector3D84.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D1 = vector3D0.negate();
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        double double6 = vector3D4.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D4.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract((double) 'a', vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.subtract((double) 'a', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D12, (double) '4', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D20.subtract((double) 'a', vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D17, vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D29, (double) '4', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.subtract((double) 'a', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D34, vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D44.subtract((double) 'a', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D49.subtract((double) 'a', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D53 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D46, (double) '4', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D54.subtract((double) 'a', vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D51, vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D59 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D24, (double) 100.0f, vector3D37, 10.0d, vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D7, vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = vector3D62.subtract((double) 'a', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D7.add((double) 1L, vector3D62);
        double double67 = org.apache.commons.math.geometry.Vector3D.distance(vector3D1, vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D74 = vector3D71.subtract((double) 'a', vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D75 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D69, (double) 'a', vector3D71);
        double double76 = vector3D75.getNormInf();
        boolean boolean77 = vector3D75.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D78 = vector3D75.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D79 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double80 = vector3D79.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D81 = vector3D78.subtract(vector3D79);
        double double82 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D1, vector3D79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D60 and vector3D79", vector3D60.equals(vector3D79) ? vector3D60.hashCode() == vector3D79.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.subtract(vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D6, vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D18.subtract((double) 'a', vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D15, (double) '4', vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D23.subtract((double) 'a', vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D20, vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.subtract((double) 'a', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D32, (double) '4', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D37, vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D47.subtract((double) 'a', vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D52.subtract((double) 'a', vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D56 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D49, (double) '4', vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D57.subtract((double) 'a', vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D54, vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D62 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D27, (double) 100.0f, vector3D40, 10.0d, vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D63 = new org.apache.commons.math.geometry.Vector3D((double) (short) 100, vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D8.add(3970.0d, vector3D63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D8", vector3D6.equals(vector3D8) ? vector3D6.hashCode() == vector3D8.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double1 = vector3D0.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D5.subtract((double) 'a', vector3D7);
        double double9 = vector3D7.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D13, (double) '4', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D7.add(vector3D20);
        boolean boolean22 = vector3D7.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D26.subtract(vector3D29);
        double double31 = vector3D26.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D26.negate();
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D7.subtract(10.0d, vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D((double) (short) 100, (double) 10L, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) 0, vector3D3, 0.0d, vector3D33, (double) (short) -1, vector3D38);
        double double40 = org.apache.commons.math.geometry.Vector3D.distance(vector3D0, vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.negate();
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        double double47 = vector3D45.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D49.subtract((double) 'a', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D54.subtract((double) 'a', vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D58 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D51, (double) '4', vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D45.add(vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D63.subtract((double) 'a', vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D65.negate();
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D58, (double) 10, vector3D61, 0.0d, vector3D67, (double) 1L, vector3D69);
        double double71 = vector3D69.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = vector3D73.subtract((double) 'a', vector3D75);
        org.apache.commons.math.geometry.Vector3D vector3D78 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D81 = vector3D78.subtract((double) 'a', vector3D80);
        org.apache.commons.math.geometry.Vector3D vector3D82 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D75, (double) '4', vector3D80);
        org.apache.commons.math.geometry.Vector3D vector3D83 = vector3D69.add(vector3D82);
        double double84 = org.apache.commons.math.geometry.Vector3D.angle(vector3D41, vector3D82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D39 and vector3D41", vector3D39.equals(vector3D41) ? vector3D39.hashCode() == vector3D41.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D6 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D3.subtract(vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D7, vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.subtract((double) 'a', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D13, (double) 'a', vector3D15);
        double double20 = vector3D19.getNorm1();
        java.lang.String str21 = vector3D19.toString();
        double double22 = vector3D19.getNormInf();
        double double23 = vector3D19.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D24 = new org.apache.commons.math.geometry.Vector3D((double) ' ', vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D25 = new org.apache.commons.math.geometry.Vector3D((-0.0d), vector3D8, (double) (byte) 0, vector3D24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D7 and vector3D9", vector3D7.equals(vector3D9) ? vector3D7.hashCode() == vector3D9.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D5.subtract((double) 'a', vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D9 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D3, (double) 'a', vector3D5);
        double double10 = vector3D9.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D9.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        double double17 = vector3D15.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D21.negate();
        double double24 = vector3D21.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.subtract((double) 'a', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D32, (double) '4', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D37, vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        double double49 = vector3D47.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D56.subtract((double) 'a', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D60 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D53, (double) '4', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D47.add(vector3D60);
        double double62 = org.apache.commons.math.geometry.Vector3D.distance(vector3D40, vector3D47);
        double double63 = org.apache.commons.math.geometry.Vector3D.distance(vector3D25, vector3D47);
        double double64 = org.apache.commons.math.geometry.Vector3D.distance(vector3D21, vector3D47);
        double double65 = org.apache.commons.math.geometry.Vector3D.angle(vector3D18, vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D66 = new org.apache.commons.math.geometry.Vector3D((-0.009999666686665238d), vector3D9, (double) 10L, vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D71 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D75 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D78 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D79 = vector3D75.subtract(vector3D78);
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D81 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D79, vector3D80);
        org.apache.commons.math.geometry.Vector3D vector3D82 = new org.apache.commons.math.geometry.Vector3D(63.00793600809346d, vector3D18, 0.3796077390275217d, vector3D71, 100.0199980003999d, vector3D79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D44 and vector3D81", vector3D44.equals(vector3D81) ? vector3D44.hashCode() == vector3D81.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) 0, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D4.subtract((double) 'a', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D6, (double) '4', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D11, vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        double double23 = vector3D21.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D27, (double) '4', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D21.add(vector3D34);
        double double36 = org.apache.commons.math.geometry.Vector3D.distance(vector3D14, vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D2, vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D2.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D49 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D42, (double) '4', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D42.subtract(0.0d, vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D2.subtract(vector3D52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D37 and vector3D38", vector3D37.equals(vector3D38) ? vector3D37.hashCode() == vector3D38.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) 0, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D4.subtract((double) 'a', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D6, (double) '4', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D11, vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        double double23 = vector3D21.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D27, (double) '4', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D21.add(vector3D34);
        double double36 = org.apache.commons.math.geometry.Vector3D.distance(vector3D14, vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D2, vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D2.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D39.subtract((double) 'a', vector3D41);
        double double43 = vector3D41.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D50.subtract((double) 'a', vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D54 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D47, (double) '4', vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D41.add(vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D57.subtract((double) 'a', vector3D59);
        double double61 = vector3D59.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D59.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D41.subtract((double) 10L, vector3D63);
        double double65 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D2, vector3D41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D37 and vector3D38", vector3D37.equals(vector3D38) ? vector3D37.hashCode() == vector3D38.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        boolean boolean5 = vector3D4.isNaN();
        java.lang.String str6 = vector3D4.toString();
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((-157.07963267948966d), vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        double double12 = vector3D10.getNorm();
        double double13 = org.apache.commons.math.geometry.Vector3D.angle(vector3D4, vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D4.orthogonal();
        boolean boolean15 = vector3D4.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D14", vector3D8.equals(vector3D14) ? vector3D8.hashCode() == vector3D14.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D4, (double) '4', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D9, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D24.subtract((double) 'a', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D28 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D21, (double) '4', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D26, vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract((double) 'a', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D38, (double) '4', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D43, vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D16, (double) 100.0f, vector3D29, 10.0d, vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D43.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D43.scalarMultiply((double) 1L);
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D57.subtract((double) 'a', vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = vector3D62.subtract((double) 'a', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D66 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D59, (double) '4', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D70 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, 97.0d);
        org.apache.commons.math.geometry.Vector3D vector3D71 = new org.apache.commons.math.geometry.Vector3D(2.7045347671598794d, vector3D59, 1.9762183008101064d, vector3D70);
        double double72 = org.apache.commons.math.geometry.Vector3D.angle(vector3D54, vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = vector3D73.subtract((double) 'a', vector3D75);
        double double77 = vector3D75.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D79 = vector3D75.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D81 = vector3D79.subtract(vector3D80);
        org.apache.commons.math.geometry.Vector3D vector3D82 = vector3D79.negate();
        double double83 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D54, vector3D79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D16 and vector3D82", vector3D16.equals(vector3D82) ? vector3D16.hashCode() == vector3D82.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double1 = vector3D0.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D5.subtract((double) 'a', vector3D7);
        double double9 = vector3D7.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D13, (double) '4', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D7.add(vector3D20);
        boolean boolean22 = vector3D7.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D26.subtract(vector3D29);
        double double31 = vector3D26.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D26.negate();
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D7.subtract(10.0d, vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D((double) (short) 100, (double) 10L, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) 0, vector3D3, 0.0d, vector3D33, (double) (short) -1, vector3D38);
        double double40 = org.apache.commons.math.geometry.Vector3D.distance(vector3D0, vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.negate();
        org.apache.commons.math.geometry.Vector3D vector3D46 = new org.apache.commons.math.geometry.Vector3D(0.9866275920404853d, 3.796077390275217d, 1.7045347671598796d);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) 10.0f, vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D55 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D49, (double) 'a', vector3D51);
        double double56 = vector3D55.getNorm1();
        java.lang.String str57 = vector3D55.toString();
        double double58 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D47, vector3D55);
        double double59 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D38, vector3D47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D39 and vector3D41", vector3D39.equals(vector3D41) ? vector3D39.hashCode() == vector3D41.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D4, (double) '4', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D15 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, 97.0d);
        org.apache.commons.math.geometry.Vector3D vector3D16 = new org.apache.commons.math.geometry.Vector3D(2.7045347671598794d, vector3D4, 1.9762183008101064d, vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D18.subtract((double) 'a', vector3D20);
        double double22 = vector3D20.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D20.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D31.subtract((double) 'a', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D35 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D28, (double) '4', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract((double) 'a', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D33, vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D48.subtract((double) 'a', vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D52 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D45, (double) '4', vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D56 = vector3D53.subtract((double) 'a', vector3D55);
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D50, vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D60.subtract((double) 'a', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D68 = vector3D65.subtract((double) 'a', vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D69 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D62, (double) '4', vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D72 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D73 = vector3D70.subtract((double) 'a', vector3D72);
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D67, vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D75 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D40, (double) 100.0f, vector3D53, 10.0d, vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D23, vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D78 = vector3D76.scalarMultiply(1.5707963267948966d);
        org.apache.commons.math.geometry.Vector3D vector3D79 = vector3D15.add((-157.07963267948966d), vector3D78);
        double double80 = vector3D15.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D81 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D83 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D84 = vector3D81.subtract((double) 'a', vector3D83);
        double double85 = vector3D83.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D87 = vector3D83.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D88 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D89 = vector3D87.subtract(vector3D88);
        boolean boolean90 = vector3D15.equals((java.lang.Object) vector3D88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D76 and vector3D89", vector3D76.equals(vector3D89) ? vector3D76.hashCode() == vector3D89.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        double double4 = vector3D2.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D5.negate();
        double double7 = vector3D6.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        double double9 = vector3D8.getX();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D13, (double) '4', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D18, vector3D21);
        boolean boolean26 = vector3D18.isInfinite();
        double double27 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D8, vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D6, vector3D8);
        double double29 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D2, vector3D28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D25 and vector3D28", vector3D25.equals(vector3D28) ? vector3D25.hashCode() == vector3D28.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D4, (double) '4', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D9, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D17.subtract((double) 'a', vector3D19);
        double double21 = vector3D19.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D23.subtract((double) 'a', vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D28.subtract((double) 'a', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D25, (double) '4', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D19.add(vector3D32);
        double double34 = org.apache.commons.math.geometry.Vector3D.distance(vector3D12, vector3D19);
        double double35 = vector3D19.getNorm1();
        double double36 = vector3D19.getX();
        boolean boolean37 = vector3D19.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D19.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D50 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D43, (double) '4', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D54 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D58 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D61 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D62 = vector3D58.subtract(vector3D61);
        org.apache.commons.math.geometry.Vector3D vector3D63 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D54, (double) (byte) 10, vector3D62);
        boolean boolean64 = vector3D63.isNaN();
        double double65 = org.apache.commons.math.geometry.Vector3D.angle(vector3D48, vector3D63);
        org.apache.commons.math.geometry.Vector3D vector3D68 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        double double69 = org.apache.commons.math.geometry.Vector3D.angle(vector3D48, vector3D68);
        org.apache.commons.math.geometry.Vector3D vector3D74 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D77 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D78 = vector3D74.subtract(vector3D77);
        org.apache.commons.math.geometry.Vector3D vector3D79 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D77);
        boolean boolean80 = vector3D77.isInfinite();
        double double81 = vector3D77.getNorm1();
        double double82 = vector3D77.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D85 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D87 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D89 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D90 = vector3D87.subtract((double) 'a', vector3D89);
        org.apache.commons.math.geometry.Vector3D vector3D91 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D85, (double) 'a', vector3D87);
        org.apache.commons.math.geometry.Vector3D vector3D92 = new org.apache.commons.math.geometry.Vector3D(3.796077390275217d, vector3D38, 1.4711276743037347d, vector3D48, 410.5732779186945d, vector3D77, 13802.0d, vector3D91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D16 and vector3D79", vector3D16.equals(vector3D79) ? vector3D16.hashCode() == vector3D79.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D3, (double) '4', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D15.negate();
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D17.subtract((double) 'a', vector3D19);
        double double21 = vector3D19.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D23.subtract((double) 'a', vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D28.subtract((double) 'a', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D25, (double) '4', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D19.add(vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.subtract((double) 'a', vector3D37);
        double double39 = vector3D37.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D37.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D19.subtract((double) 10L, vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D54 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D51.subtract(vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D56 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D47, (double) (byte) 10, vector3D55);
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D41.subtract((double) 0, vector3D55);
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D58.subtract((double) 'a', vector3D60);
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        double double63 = org.apache.commons.math.geometry.Vector3D.distance(vector3D61, vector3D62);
        boolean boolean64 = vector3D57.equals((java.lang.Object) double63);
        double double65 = vector3D57.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D57.negate();
        double double67 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D16, vector3D57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D15 and vector3D16", vector3D15.equals(vector3D16) ? vector3D15.hashCode() == vector3D16.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, (double) 0L, 100.0d);
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D4.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 10L, vector3D10);
        double double12 = vector3D8.getX();
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        double double20 = vector3D16.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        double double26 = vector3D24.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D28.subtract((double) 'a', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D33.subtract((double) 'a', vector3D35);
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D30, (double) '4', vector3D35);
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D24.add(vector3D37);
        double double39 = vector3D38.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = vector3D42.subtract((double) 'a', vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D47.subtract((double) 'a', vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D44, (double) '4', vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D52.subtract((double) 'a', vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D49, vector3D52);
        double double57 = vector3D56.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double60 = vector3D59.getDelta();
        double double61 = vector3D59.getX();
        org.apache.commons.math.geometry.Vector3D vector3D65 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D66 = new org.apache.commons.math.geometry.Vector3D((double) 1, vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D70 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D74 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D77 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D78 = vector3D74.subtract(vector3D77);
        org.apache.commons.math.geometry.Vector3D vector3D79 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D70, (double) (byte) 10, vector3D78);
        double double80 = org.apache.commons.math.geometry.Vector3D.distance(vector3D65, vector3D70);
        double double81 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D59, vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D82 = new org.apache.commons.math.geometry.Vector3D(100.00499987500625d, vector3D16, 0.7977721804575484d, vector3D38, 62.0d, vector3D56, 110.0d, vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D83 = vector3D8.add((double) 10.0f, vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D84 = new org.apache.commons.math.geometry.Vector3D(1.5709551021528867d, vector3D4, 1.0d, vector3D8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D5 and vector3D16", vector3D5.equals(vector3D16) ? vector3D5.hashCode() == vector3D16.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        double double4 = vector3D2.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D10, (double) '4', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D18.subtract((double) 'a', vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D15, vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D27, (double) '4', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.subtract((double) 'a', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D32, vector3D35);
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = vector3D42.subtract((double) 'a', vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D47.subtract((double) 'a', vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D44, (double) '4', vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D52.subtract((double) 'a', vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D49, vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D57 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D22, (double) 100.0f, vector3D35, 10.0d, vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D5, vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D64 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D68 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D71 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D72 = vector3D68.subtract(vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D73 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D64, (double) (byte) 10, vector3D72);
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D77 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D78 = vector3D75.subtract((double) 'a', vector3D77);
        double double79 = vector3D77.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D80 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D72, (double) '4', vector3D77);
        org.apache.commons.math.geometry.Vector3D vector3D81 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double82 = vector3D81.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D83 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D72, vector3D81);
        org.apache.commons.math.geometry.Vector3D vector3D84 = vector3D58.add((-0.009999666686665238d), vector3D72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D58 and vector3D81", vector3D58.equals(vector3D81) ? vector3D58.hashCode() == vector3D81.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D3, (double) '4', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D15.negate();
        double double17 = vector3D15.getDelta();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D15 and vector3D16", vector3D15.equals(vector3D16) ? vector3D15.hashCode() == vector3D16.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D3, (double) '4', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D15.negate();
        double double17 = vector3D15.getNormInf();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D15 and vector3D16", vector3D15.equals(vector3D16) ? vector3D15.hashCode() == vector3D16.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        boolean boolean1 = vector3D0.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D12 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D5, (double) '4', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D10, vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D18.subtract((double) 'a', vector3D20);
        double double22 = vector3D20.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D24.subtract((double) 'a', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D33 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D26, (double) '4', vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D20.add(vector3D33);
        double double35 = org.apache.commons.math.geometry.Vector3D.distance(vector3D13, vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D(0.0d, 2.7045347671598794d, (double) 1);
        double double40 = org.apache.commons.math.geometry.Vector3D.distance(vector3D13, vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        double double42 = vector3D41.getY();
        double double43 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D13, vector3D41);
        double double44 = vector3D41.getY();
        org.apache.commons.math.geometry.Vector3D vector3D45 = vector3D0.add(vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D48 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D48.subtract(vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D52, vector3D53);
        double double55 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D0, vector3D52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D17 and vector3D54", vector3D17.equals(vector3D54) ? vector3D17.hashCode() == vector3D54.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        double double5 = vector3D3.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D9, (double) '4', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D3.add(vector3D16);
        boolean boolean18 = vector3D3.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D25 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D22.subtract(vector3D25);
        double double27 = vector3D22.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D22.negate();
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D3.subtract(10.0d, vector3D28);
        boolean boolean30 = vector3D29.isInfinite();
        boolean boolean31 = vector3D29.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D35 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D35.subtract(vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D39, vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D42 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, vector3D29, 11881.0d, vector3D39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D26 and vector3D41", vector3D26.equals(vector3D41) ? vector3D26.hashCode() == vector3D41.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((double) 0, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D5.subtract((double) 'a', vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract((double) 'a', vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D14 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D7, (double) '4', vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.subtract((double) 'a', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D12, vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D20.subtract((double) 'a', vector3D22);
        double double24 = vector3D22.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D31.subtract((double) 'a', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D35 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D28, (double) '4', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D22.add(vector3D35);
        double double37 = org.apache.commons.math.geometry.Vector3D.distance(vector3D15, vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D3, vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D3.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D40 = new org.apache.commons.math.geometry.Vector3D((double) (short) 100, vector3D3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D38 and vector3D39", vector3D38.equals(vector3D39) ? vector3D38.hashCode() == vector3D39.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.subtract(vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D6, vector3D7);
        double double9 = vector3D8.getNormInf();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D8", vector3D6.equals(vector3D8) ? vector3D6.hashCode() == vector3D8.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D(3721.0d, 15.880462799471664d);
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D2.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D4.subtract((double) 'a', vector3D6);
        double double8 = vector3D6.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract((double) 'a', vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.subtract((double) 'a', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D12, (double) '4', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D6.add(vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        double double26 = vector3D24.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D24.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D6.subtract((double) 10L, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D34 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D41 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D38.subtract(vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D43 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D34, (double) (byte) 10, vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D28.subtract((double) 0, vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        double double50 = org.apache.commons.math.geometry.Vector3D.distance(vector3D48, vector3D49);
        boolean boolean51 = vector3D44.equals((java.lang.Object) double50);
        double double52 = vector3D44.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D44.negate();
        double double54 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D2, vector3D53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D28 and vector3D53", vector3D28.equals(vector3D53) ? vector3D28.hashCode() == vector3D53.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        double double4 = vector3D2.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D11, (double) '4', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D16, vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D31.subtract((double) 'a', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D35 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D28, (double) '4', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract((double) 'a', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D33, vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D48.subtract((double) 'a', vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D52 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D45, (double) '4', vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D56 = vector3D53.subtract((double) 'a', vector3D55);
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D50, vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D58 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D23, (double) 100.0f, vector3D36, 10.0d, vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D59 = new org.apache.commons.math.geometry.Vector3D((double) 100, vector3D23);
        double double60 = vector3D59.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D2, vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D69 = vector3D66.subtract((double) 'a', vector3D68);
        org.apache.commons.math.geometry.Vector3D vector3D70 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D64, (double) 'a', vector3D66);
        double double71 = vector3D70.getNormInf();
        boolean boolean72 = vector3D70.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D73 = vector3D70.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double75 = vector3D74.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D76 = vector3D73.subtract(vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D80 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D83 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D84 = vector3D80.subtract(vector3D83);
        org.apache.commons.math.geometry.Vector3D vector3D85 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D83);
        org.apache.commons.math.geometry.Vector3D vector3D86 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D74, vector3D85);
        org.apache.commons.math.geometry.Vector3D vector3D90 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        boolean boolean91 = vector3D90.isNaN();
        double double92 = vector3D90.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D93 = vector3D74.subtract(vector3D90);
        org.apache.commons.math.geometry.Vector3D vector3D94 = vector3D93.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D95 = vector3D2.subtract((double) (-1.0f), vector3D94);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D23 and vector3D85", vector3D23.equals(vector3D85) ? vector3D23.hashCode() == vector3D85.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D4.subtract((double) 'a', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D2, (double) 'a', vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract((double) 'a', vector3D12);
        double double14 = vector3D12.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D25 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D18, (double) '4', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D12.add(vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D32.negate();
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D25, (double) 10, vector3D28, 0.0d, vector3D34, (double) 1L, vector3D36);
        double double38 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D8, vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D39.subtract((double) 'a', vector3D41);
        double double43 = vector3D41.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D50.subtract((double) 'a', vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D54 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D47, (double) '4', vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D41.add(vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D34, vector3D54);
        double double57 = vector3D56.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D58 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D59.negate();
        double double61 = vector3D60.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        double double63 = vector3D62.getX();
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D68 = vector3D65.subtract((double) 'a', vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D72 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D73 = vector3D70.subtract((double) 'a', vector3D72);
        org.apache.commons.math.geometry.Vector3D vector3D74 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D67, (double) '4', vector3D72);
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D77 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D78 = vector3D75.subtract((double) 'a', vector3D77);
        org.apache.commons.math.geometry.Vector3D vector3D79 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D72, vector3D75);
        boolean boolean80 = vector3D72.isInfinite();
        double double81 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D62, vector3D72);
        org.apache.commons.math.geometry.Vector3D vector3D82 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D60, vector3D62);
        double double83 = org.apache.commons.math.geometry.Vector3D.distance(vector3D58, vector3D62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D56 and vector3D82", vector3D56.equals(vector3D82) ? vector3D56.hashCode() == vector3D82.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D3.negate();
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.negate();
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D11.negate();
        double double14 = vector3D11.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.subtract((double) 'a', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D20.subtract((double) 'a', vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D22, (double) '4', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D27, vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.subtract((double) 'a', vector3D37);
        double double39 = vector3D37.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D50 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D43, (double) '4', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D37.add(vector3D50);
        double double52 = org.apache.commons.math.geometry.Vector3D.distance(vector3D30, vector3D37);
        double double53 = org.apache.commons.math.geometry.Vector3D.distance(vector3D15, vector3D37);
        double double54 = org.apache.commons.math.geometry.Vector3D.distance(vector3D11, vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D56.negate();
        double double58 = vector3D57.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D59 = new org.apache.commons.math.geometry.Vector3D((double) 10, vector3D37, (double) (-1), vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D57.negate();
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D7, vector3D60);
        boolean boolean62 = vector3D61.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D7 and vector3D61", vector3D7.equals(vector3D61) ? vector3D7.hashCode() == vector3D61.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, (double) 0L, 100.0d);
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D3.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        double double10 = vector3D8.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D17.subtract((double) 'a', vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D21 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D14, (double) '4', vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D8.add(vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D28.negate();
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D21, (double) 10, vector3D24, 0.0d, vector3D30, (double) 1L, vector3D32);
        boolean boolean34 = vector3D30.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D4.add(vector3D30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D4 and vector3D6", vector3D4.equals(vector3D6) ? vector3D4.hashCode() == vector3D6.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D1, (double) 'a', vector3D3);
        double double8 = vector3D7.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D7.orthogonal();
        double double10 = vector3D7.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D11.negate();
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        double double17 = vector3D15.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D23, (double) '4', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D31.subtract((double) 'a', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D28, vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.subtract((double) 'a', vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D40, (double) '4', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D48.subtract((double) 'a', vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D45, vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D55.subtract((double) 'a', vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D60.subtract((double) 'a', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D64 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D57, (double) '4', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D68 = vector3D65.subtract((double) 'a', vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D62, vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D70 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D35, (double) 100.0f, vector3D48, 10.0d, vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D18, vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = vector3D73.subtract((double) 'a', vector3D75);
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D18.add((double) 1L, vector3D73);
        double double78 = org.apache.commons.math.geometry.Vector3D.distance(vector3D12, vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D79 = vector3D73.negate();
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D7, vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D81 = vector3D80.negate();
        boolean boolean82 = vector3D80.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D35 and vector3D81", vector3D35.equals(vector3D81) ? vector3D35.hashCode() == vector3D81.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D3, (double) '4', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D11);
        boolean boolean16 = vector3D8.isInfinite();
        double double17 = vector3D8.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D21 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D24 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D21.subtract(vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D8.subtract(vector3D26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D15 and vector3D26", vector3D15.equals(vector3D26) ? vector3D15.hashCode() == vector3D26.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D12 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D5, (double) '4', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D10, vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D20.subtract((double) 'a', vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D22, (double) '4', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D27, vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.subtract((double) 'a', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = vector3D42.subtract((double) 'a', vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D46 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D39, (double) '4', vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D47.subtract((double) 'a', vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D44, vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D52 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D17, (double) 100.0f, vector3D30, 10.0d, vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D44.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D44.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D58 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D61 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D62 = vector3D58.subtract(vector3D61);
        double double63 = vector3D58.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D58.negate();
        double double65 = vector3D58.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D66 = new org.apache.commons.math.geometry.Vector3D(Double.POSITIVE_INFINITY, vector3D44, 2.0d, vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D69 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D72 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D73 = vector3D69.subtract(vector3D72);
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D73, vector3D74);
        boolean boolean76 = vector3D44.equals((java.lang.Object) vector3D74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D17 and vector3D75", vector3D17.equals(vector3D75) ? vector3D17.hashCode() == vector3D75.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D4, (double) '4', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D9, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D16.negate();
        org.apache.commons.math.geometry.Vector3D vector3D21 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        boolean boolean22 = vector3D21.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D((double) 1, 390649.2033325663d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D28 = new org.apache.commons.math.geometry.Vector3D(2.318371739030372d, vector3D17, 10.187104776591076d, vector3D21, 96.0d, vector3D27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D16 and vector3D17", vector3D16.equals(vector3D17) ? vector3D16.hashCode() == vector3D17.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D1, (double) 'a', vector3D3);
        double double8 = vector3D7.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D7.orthogonal();
        double double10 = vector3D7.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D11.negate();
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        double double17 = vector3D15.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D23, (double) '4', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D31.subtract((double) 'a', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D28, vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.subtract((double) 'a', vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D40, (double) '4', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D48.subtract((double) 'a', vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D45, vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D55.subtract((double) 'a', vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D60.subtract((double) 'a', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D64 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D57, (double) '4', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D68 = vector3D65.subtract((double) 'a', vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D62, vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D70 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D35, (double) 100.0f, vector3D48, 10.0d, vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D18, vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = vector3D73.subtract((double) 'a', vector3D75);
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D18.add((double) 1L, vector3D73);
        double double78 = org.apache.commons.math.geometry.Vector3D.distance(vector3D12, vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D79 = vector3D73.negate();
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D7, vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D81 = vector3D80.negate();
        double double82 = vector3D80.getNorm1();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D35 and vector3D81", vector3D35.equals(vector3D81) ? vector3D35.hashCode() == vector3D81.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D6 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D3.subtract(vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract((double) 'a', vector3D12);
        double double14 = vector3D12.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D25 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D18, (double) '4', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D12.add(vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D32.negate();
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D25, (double) 10, vector3D28, 0.0d, vector3D34, (double) 1L, vector3D36);
        java.lang.String str38 = vector3D37.toString();
        double double39 = vector3D37.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        double double47 = vector3D45.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D49.subtract((double) 'a', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D54.subtract((double) 'a', vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D58 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D51, (double) '4', vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D45.add(vector3D58);
        boolean boolean60 = vector3D45.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D45.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D61.scalarMultiply((double) (short) 100);
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D61.negate();
        org.apache.commons.math.geometry.Vector3D vector3D65 = vector3D41.subtract(60763.70453476716d, vector3D61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D41", vector3D8.equals(vector3D41) ? vector3D8.hashCode() == vector3D41.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        double double6 = vector3D4.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D10, (double) '4', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D4.add(vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D24.negate();
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D17, (double) 10, vector3D20, 0.0d, vector3D26, (double) 1L, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D33.subtract((double) 'a', vector3D35);
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D31, (double) 'a', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D39.subtract((double) 'a', vector3D41);
        double double43 = vector3D41.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D50.subtract((double) 'a', vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D54 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D47, (double) '4', vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D41.add(vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = vector3D59.subtract((double) 'a', vector3D61);
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D61.negate();
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D54, (double) 10, vector3D57, 0.0d, vector3D63, (double) 1L, vector3D65);
        double double67 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D37, vector3D63);
        org.apache.commons.math.geometry.Vector3D vector3D68 = vector3D63.normalize();
        double double69 = org.apache.commons.math.geometry.Vector3D.angle(vector3D17, vector3D63);
        org.apache.commons.math.geometry.Vector3D vector3D70 = vector3D63.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D71 = new org.apache.commons.math.geometry.Vector3D(94.82950365512707d, vector3D70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D31 and vector3D70", vector3D31.equals(vector3D70) ? vector3D31.hashCode() == vector3D70.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D6 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D3.subtract(vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        double double14 = org.apache.commons.math.geometry.Vector3D.distance(vector3D12, vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D18.subtract((double) 'a', vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D23.subtract((double) 'a', vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D20, (double) '4', vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D28.subtract((double) 'a', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D25, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.subtract((double) 'a', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D44 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D37, (double) '4', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D42, vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D52.subtract((double) 'a', vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D57.subtract((double) 'a', vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D61 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D54, (double) '4', vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = vector3D62.subtract((double) 'a', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D59, vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D67 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D32, (double) 100.0f, vector3D45, 10.0d, vector3D59);
        double double68 = vector3D45.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D69 = new org.apache.commons.math.geometry.Vector3D((double) ' ', vector3D6, (double) 10L, vector3D13, (double) 10.0f, vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D6.scalarMultiply((-1.0d));
        org.apache.commons.math.geometry.Vector3D vector3D76 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, (double) 0L, 100.0d);
        org.apache.commons.math.geometry.Vector3D vector3D77 = new org.apache.commons.math.geometry.Vector3D((double) 1.0f, vector3D76);
        org.apache.commons.math.geometry.Vector3D vector3D78 = vector3D6.subtract(vector3D76);
        org.apache.commons.math.geometry.Vector3D vector3D82 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D85 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D86 = vector3D82.subtract(vector3D85);
        org.apache.commons.math.geometry.Vector3D vector3D87 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D85);
        boolean boolean88 = vector3D85.isInfinite();
        double double89 = vector3D85.getNorm1();
        boolean boolean90 = vector3D76.equals((java.lang.Object) double89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D32 and vector3D87", vector3D32.equals(vector3D87) ? vector3D32.hashCode() == vector3D87.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D1, (double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        double double13 = vector3D11.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.subtract((double) 'a', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D20.subtract((double) 'a', vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D24 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D17, (double) '4', vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D11.add(vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D31.negate();
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D24, (double) 10, vector3D27, 0.0d, vector3D33, (double) 1L, vector3D35);
        double double37 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D7, vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.subtract((double) 'a', vector3D40);
        double double42 = vector3D40.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D44.subtract((double) 'a', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D49.subtract((double) 'a', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D53 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D46, (double) '4', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D40.add(vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D33, vector3D53);
        double double56 = vector3D55.getNorm1();
        double double57 = vector3D55.getNorm();
        boolean boolean58 = vector3D55.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D55.negate();
        double double60 = vector3D59.getNormInf();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D55 and vector3D59", vector3D55.equals(vector3D59) ? vector3D55.hashCode() == vector3D59.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.subtract(vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D6, vector3D7);
        double double9 = vector3D6.getDelta();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D8", vector3D6.equals(vector3D8) ? vector3D6.hashCode() == vector3D8.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double1 = vector3D0.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D5.subtract((double) 'a', vector3D7);
        double double9 = vector3D7.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D13, (double) '4', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D7.add(vector3D20);
        boolean boolean22 = vector3D7.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D26.subtract(vector3D29);
        double double31 = vector3D26.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D26.negate();
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D7.subtract(10.0d, vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D((double) (short) 100, (double) 10L, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) 0, vector3D3, 0.0d, vector3D33, (double) (short) -1, vector3D38);
        double double40 = org.apache.commons.math.geometry.Vector3D.distance(vector3D0, vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.negate();
        double double42 = vector3D38.getNormInf();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D39 and vector3D41", vector3D39.equals(vector3D41) ? vector3D39.hashCode() == vector3D41.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D1 = vector3D0.negate();
        double double2 = vector3D1.getDelta();
        java.lang.String str3 = vector3D1.toString();
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D1.scalarMultiply((-0.5543384707620473d));
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D7.negate();
        double double9 = vector3D8.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        double double11 = vector3D10.getX();
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D18.subtract((double) 'a', vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D15, (double) '4', vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D23.subtract((double) 'a', vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D20, vector3D23);
        boolean boolean28 = vector3D20.isInfinite();
        double double29 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D10, vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D1.subtract(5.151226388999179d, vector3D30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D27 and vector3D30", vector3D27.equals(vector3D30) ? vector3D27.hashCode() == vector3D30.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        double double6 = vector3D5.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D0.add((double) 1.0f, vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D7.subtract(1.7045347671598796d, vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        double double17 = vector3D15.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D24.subtract((double) 'a', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D28 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D21, (double) '4', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D15.add(vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        double double34 = vector3D32.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract((double) 'a', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D38, (double) '4', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D32.add(vector3D45);
        boolean boolean47 = vector3D32.isNaN();
        double double48 = org.apache.commons.math.geometry.Vector3D.distance(vector3D28, vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D50.subtract((double) 'a', vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D55.subtract((double) 'a', vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D59 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D52, (double) '4', vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D60.subtract((double) 'a', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D57, vector3D60);
        double double65 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D32, vector3D64);
        double double66 = org.apache.commons.math.geometry.Vector3D.distance(vector3D7, vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D70 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D73 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D74 = vector3D70.subtract(vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D75 = vector3D74.negate();
        org.apache.commons.math.geometry.Vector3D vector3D76 = vector3D7.add(3.645842844974827d, vector3D75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D64 and vector3D75", vector3D64.equals(vector3D75) ? vector3D64.hashCode() == vector3D75.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        boolean boolean5 = vector3D4.isNaN();
        java.lang.String str6 = vector3D4.toString();
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((-157.07963267948966d), vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        double double12 = vector3D10.getNorm();
        double double13 = org.apache.commons.math.geometry.Vector3D.angle(vector3D4, vector3D10);
        boolean boolean14 = vector3D4.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D17.subtract((double) 'a', vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D19, (double) '4', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D24, vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D34.subtract((double) 'a', vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D39.subtract((double) 'a', vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D43 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D36, (double) '4', vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D44.subtract((double) 'a', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D41, vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D56.subtract((double) 'a', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D60 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D53, (double) '4', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D61.subtract((double) 'a', vector3D63);
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D58, vector3D61);
        org.apache.commons.math.geometry.Vector3D vector3D66 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D31, (double) 100.0f, vector3D44, 10.0d, vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D58.orthogonal();
        double double68 = org.apache.commons.math.geometry.Vector3D.angle(vector3D4, vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D69 = vector3D4.negate();
        org.apache.commons.math.geometry.Vector3D vector3D73 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D76 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D73.subtract(vector3D76);
        org.apache.commons.math.geometry.Vector3D vector3D78 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D76);
        double double79 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D69, vector3D76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D31 and vector3D78", vector3D31.equals(vector3D78) ? vector3D31.hashCode() == vector3D78.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D3, (double) '4', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        double double20 = vector3D18.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D31 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D24, (double) '4', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D18.add(vector3D31);
        double double33 = org.apache.commons.math.geometry.Vector3D.distance(vector3D11, vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D(0.0d, 2.7045347671598794d, (double) 1);
        double double38 = org.apache.commons.math.geometry.Vector3D.distance(vector3D11, vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D41, (double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D((double) (short) 100, (double) 10L, (double) (short) 0);
        double double52 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D43, vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D37.subtract((double) (byte) 100, vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D54.negate();
        double double56 = vector3D55.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        double double58 = vector3D57.getX();
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D60.subtract((double) 'a', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D68 = vector3D65.subtract((double) 'a', vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D69 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D62, (double) '4', vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D72 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D73 = vector3D70.subtract((double) 'a', vector3D72);
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D67, vector3D70);
        boolean boolean75 = vector3D67.isInfinite();
        double double76 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D57, vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D77 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D55, vector3D57);
        double double78 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D43, vector3D57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D15 and vector3D77", vector3D15.equals(vector3D77) ? vector3D15.hashCode() == vector3D77.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        double double6 = vector3D4.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D10, (double) '4', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D4.add(vector3D17);
        boolean boolean19 = vector3D4.isNaN();
        java.lang.String str20 = vector3D4.toString();
        double double21 = vector3D4.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D(1.0d, vector3D4, (double) '#', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.ZERO;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D26, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D(1.4142135623730951d, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D30.negate();
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D31.scalarMultiply((-51.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D28 and vector3D31", vector3D28.equals(vector3D31) ? vector3D28.hashCode() == vector3D31.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        double double5 = vector3D3.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D9, (double) '4', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D3.add(vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        double double23 = vector3D21.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D21.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D3.subtract((double) 10L, vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D31 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D35 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D35.subtract(vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D40 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D31, (double) (byte) 10, vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D25.subtract((double) 0, vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = vector3D42.subtract((double) 'a', vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        double double47 = org.apache.commons.math.geometry.Vector3D.distance(vector3D45, vector3D46);
        boolean boolean48 = vector3D41.equals((java.lang.Object) double47);
        double double49 = vector3D41.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D53 = new org.apache.commons.math.geometry.Vector3D(1.8324833568180172d, (-0.7977721804575484d));
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D58.subtract((double) 'a', vector3D60);
        org.apache.commons.math.geometry.Vector3D vector3D62 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D56, (double) 'a', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D67 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D70 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D67.subtract(vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D72 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D70);
        boolean boolean73 = vector3D70.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D74 = vector3D70.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D75 = new org.apache.commons.math.geometry.Vector3D((-1570.7963267948967d), vector3D41, 37938.75931778749d, vector3D53, 2.7045347671598794d, vector3D58, 23.535679819706345d, vector3D74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D25 and vector3D72", vector3D25.equals(vector3D72) ? vector3D25.hashCode() == vector3D72.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, (double) 0L, 100.0d);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D8, (double) '4', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D13, vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D23.subtract((double) 'a', vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D28.subtract((double) 'a', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D25, (double) '4', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D33.subtract((double) 'a', vector3D35);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D30, vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D49 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D42, (double) '4', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D50.subtract((double) 'a', vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D47, vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D55 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D20, (double) 100.0f, vector3D33, 10.0d, vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D57.subtract((double) 'a', vector3D59);
        double double61 = vector3D59.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D63.subtract((double) 'a', vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D68.subtract((double) 'a', vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D72 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D65, (double) '4', vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D73 = vector3D59.add(vector3D72);
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D77 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D79 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D80 = vector3D77.subtract((double) 'a', vector3D79);
        org.apache.commons.math.geometry.Vector3D vector3D81 = vector3D79.negate();
        org.apache.commons.math.geometry.Vector3D vector3D83 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D84 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D72, (double) 10, vector3D75, 0.0d, vector3D81, (double) 1L, vector3D83);
        double double85 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D47, vector3D81);
        org.apache.commons.math.geometry.Vector3D vector3D86 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        double double87 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D81, vector3D86);
        org.apache.commons.math.geometry.Vector3D vector3D88 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D89 = vector3D88.negate();
        org.apache.commons.math.geometry.Vector3D vector3D90 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D81, vector3D89);
        org.apache.commons.math.geometry.Vector3D vector3D91 = vector3D3.add(vector3D90);
        org.apache.commons.math.geometry.Vector3D vector3D92 = vector3D3.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D93 = vector3D3.normalize();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D92", vector3D6.equals(vector3D92) ? vector3D6.hashCode() == vector3D92.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D6 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D3.subtract(vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D6);
        boolean boolean9 = vector3D6.isInfinite();
        double double10 = vector3D6.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D16 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D23 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D20.subtract(vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D25 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D16, (double) (byte) 10, vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        double double31 = vector3D29.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D32 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D24, (double) '4', vector3D29);
        boolean boolean33 = vector3D32.isNaN();
        double double34 = vector3D32.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D6.subtract(15.880462799471664d, vector3D32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D24", vector3D8.equals(vector3D24) ? vector3D8.hashCode() == vector3D24.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D4, (double) '4', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D9, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D24.subtract((double) 'a', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D28 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D21, (double) '4', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D26, vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract((double) 'a', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D38, (double) '4', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D43, vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D16, (double) 100.0f, vector3D29, 10.0d, vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D43.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D52.add((-1.0d), vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D59 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D60 = new org.apache.commons.math.geometry.Vector3D((double) 1, vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D64 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        double double65 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D61, vector3D64);
        double double66 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D59, vector3D61);
        double double67 = vector3D59.getZ();
        java.lang.String str68 = vector3D59.toString();
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D55, vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D70 = vector3D59.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D16 and vector3D69", vector3D16.equals(vector3D69) ? vector3D16.hashCode() == vector3D69.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D1, (double) 'a', vector3D3);
        double double8 = vector3D7.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D7.orthogonal();
        double double10 = vector3D9.getY();
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D16 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D13.subtract(vector3D16);
        double double18 = vector3D13.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D13.negate();
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D20.subtract((double) 'a', vector3D22);
        double double24 = vector3D22.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D31.subtract((double) 'a', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D35 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D28, (double) '4', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D22.add(vector3D35);
        boolean boolean37 = vector3D22.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D49 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D42, (double) '4', vector3D47);
        double double50 = vector3D49.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D53.normalize();
        double double55 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D52, vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D61 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D65 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D68 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D69 = vector3D65.subtract(vector3D68);
        org.apache.commons.math.geometry.Vector3D vector3D70 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D61, (double) (byte) 10, vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D72 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = vector3D72.subtract((double) 'a', vector3D74);
        double double76 = vector3D74.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D77 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D69, (double) '4', vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D78 = new org.apache.commons.math.geometry.Vector3D((-0.0d), vector3D49, 1.0d, vector3D54, (double) 10, vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D79 = vector3D22.add(vector3D78);
        org.apache.commons.math.geometry.Vector3D vector3D83 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D84 = new org.apache.commons.math.geometry.Vector3D((double) 1, vector3D83);
        double double85 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D79, vector3D84);
        double double86 = vector3D84.getNorm1();
        double double87 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D19, vector3D84);
        double double88 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D9, vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D92 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, (double) 0L, 100.0d);
        org.apache.commons.math.geometry.Vector3D vector3D93 = vector3D92.orthogonal();
        java.lang.Class<?> wildcardClass94 = vector3D92.getClass();
        boolean boolean95 = vector3D9.equals((java.lang.Object) wildcardClass94);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D3 and vector3D93", vector3D3.equals(vector3D93) ? vector3D3.hashCode() == vector3D93.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, (double) 0L, 100.0d);
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D4.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D9 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D(174.33839494026037d, vector3D5, 1.4556766474320948d, vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.subtract((double) 'a', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D13, (double) 'a', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        double double25 = vector3D23.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D29, (double) '4', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D23.add(vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = vector3D43.negate();
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D36, (double) 10, vector3D39, 0.0d, vector3D45, (double) 1L, vector3D47);
        double double49 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D19, vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D45.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D(62.0d, vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D52.subtract((double) 'a', vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D56 = vector3D54.negate();
        double double57 = vector3D54.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D54.negate();
        double double59 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D51, vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D60.subtract((double) 'a', vector3D62);
        double double64 = vector3D62.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D69 = vector3D66.subtract((double) 'a', vector3D68);
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D74 = vector3D71.subtract((double) 'a', vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D75 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D68, (double) '4', vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D76 = vector3D62.add(vector3D75);
        org.apache.commons.math.geometry.Vector3D vector3D78 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D81 = vector3D78.subtract((double) 'a', vector3D80);
        double double82 = vector3D80.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D84 = vector3D80.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D85 = vector3D62.subtract((double) 10L, vector3D84);
        org.apache.commons.math.geometry.Vector3D vector3D86 = vector3D54.subtract(vector3D85);
        boolean boolean87 = vector3D10.equals((java.lang.Object) vector3D85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D5 and vector3D15", vector3D5.equals(vector3D15) ? vector3D5.hashCode() == vector3D15.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D4.subtract((double) 'a', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D6, (double) '4', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D11, vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D23, (double) '4', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D31.subtract((double) 'a', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D28, vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.subtract((double) 'a', vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D40, (double) '4', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D48.subtract((double) 'a', vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D45, vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D53 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D18, (double) 100.0f, vector3D31, 10.0d, vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D53.scalarMultiply((double) (byte) 10);
        org.apache.commons.math.geometry.Vector3D vector3D56 = vector3D53.negate();
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D53.scalarMultiply(97.0d);
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D0.add(3.141592653589793d, vector3D53);
        double double60 = vector3D0.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D65 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, (double) 0L, 100.0d);
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D65.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D70 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D71 = new org.apache.commons.math.geometry.Vector3D(174.33839494026037d, vector3D66, 1.4556766474320948d, vector3D70);
        double double72 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D0, vector3D66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D4 and vector3D66", vector3D4.equals(vector3D66) ? vector3D4.hashCode() == vector3D66.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) 0, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D4.subtract((double) 'a', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D6, (double) '4', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D11, vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        double double23 = vector3D21.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D27, (double) '4', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D21.add(vector3D34);
        double double36 = org.apache.commons.math.geometry.Vector3D.distance(vector3D14, vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D2, vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D2.orthogonal();
        double double39 = vector3D38.getDelta();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D37 and vector3D38", vector3D37.equals(vector3D38) ? vector3D37.hashCode() == vector3D38.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        double double6 = vector3D2.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        double double12 = vector3D10.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D23 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D16, (double) '4', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D10.add(vector3D23);
        double double25 = vector3D24.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D28.subtract((double) 'a', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D33.subtract((double) 'a', vector3D35);
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D30, (double) '4', vector3D35);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.subtract((double) 'a', vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D35, vector3D38);
        double double43 = vector3D42.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double46 = vector3D45.getDelta();
        double double47 = vector3D45.getX();
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D52 = new org.apache.commons.math.geometry.Vector3D((double) 1, vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D56 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D60 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D63 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D60.subtract(vector3D63);
        org.apache.commons.math.geometry.Vector3D vector3D65 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D56, (double) (byte) 10, vector3D64);
        double double66 = org.apache.commons.math.geometry.Vector3D.distance(vector3D51, vector3D56);
        double double67 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D45, vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D68 = new org.apache.commons.math.geometry.Vector3D(100.00499987500625d, vector3D2, 0.7977721804575484d, vector3D24, 62.0d, vector3D42, 110.0d, vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D72 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = vector3D72.subtract((double) 'a', vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D76 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D70, (double) 'a', vector3D72);
        double double77 = org.apache.commons.math.geometry.Vector3D.angle(vector3D68, vector3D72);
        org.apache.commons.math.geometry.Vector3D vector3D83 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), (double) (byte) 0, 100.0199980003999d);
        org.apache.commons.math.geometry.Vector3D vector3D84 = new org.apache.commons.math.geometry.Vector3D(51.0d, vector3D83);
        org.apache.commons.math.geometry.Vector3D vector3D88 = new org.apache.commons.math.geometry.Vector3D((-1570.7963267948967d), 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D90 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D92 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D93 = vector3D90.subtract((double) 10L, vector3D92);
        boolean boolean94 = vector3D90.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D95 = vector3D90.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D96 = new org.apache.commons.math.geometry.Vector3D(0.5514266812416906d, vector3D72, 0.7071067811865476d, vector3D84, 2.4674011002723395d, vector3D88, 1.39185723042955d, vector3D95);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D72 and vector3D95", vector3D72.equals(vector3D95) ? vector3D72.hashCode() == vector3D95.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        boolean boolean5 = vector3D4.isNaN();
        java.lang.String str6 = vector3D4.toString();
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((-157.07963267948966d), vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        double double12 = vector3D10.getNorm();
        double double13 = org.apache.commons.math.geometry.Vector3D.angle(vector3D4, vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D4.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D14.scalarMultiply(0.9867228626928289d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D14", vector3D8.equals(vector3D14) ? vector3D8.hashCode() == vector3D14.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D3, (double) '4', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D15.negate();
        java.lang.Class<?> wildcardClass17 = vector3D15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D15 and vector3D16", vector3D15.equals(vector3D16) ? vector3D15.hashCode() == vector3D16.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D4, (double) '4', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D9, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D24.subtract((double) 'a', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D28 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D21, (double) '4', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D26, vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract((double) 'a', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D38, (double) '4', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D43, vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D16, (double) 100.0f, vector3D29, 10.0d, vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D43.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D52.add((-1.0d), vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D59 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D60 = new org.apache.commons.math.geometry.Vector3D((double) 1, vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D64 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        double double65 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D61, vector3D64);
        double double66 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D59, vector3D61);
        double double67 = vector3D59.getZ();
        java.lang.String str68 = vector3D59.toString();
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D55, vector3D59);
        boolean boolean70 = vector3D69.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D16 and vector3D69", vector3D16.equals(vector3D69) ? vector3D16.hashCode() == vector3D69.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 1, 10081.0d, 3721.0d);
        java.lang.String str5 = vector3D4.toString();
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        double double12 = vector3D10.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D23 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D16, (double) '4', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D10.add(vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D28.subtract((double) 'a', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D30.negate();
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D23, (double) 10, vector3D26, 0.0d, vector3D32, (double) 1L, vector3D34);
        double double36 = vector3D34.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.subtract((double) 'a', vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D40, (double) '4', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D34.add(vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D49 = new org.apache.commons.math.geometry.Vector3D(4268742.17151322d, vector3D4, 309.3059693696837d, vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D49.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D55 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, (double) 0L, 100.0d);
        org.apache.commons.math.geometry.Vector3D vector3D56 = vector3D55.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D60 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D61 = new org.apache.commons.math.geometry.Vector3D(174.33839494026037d, vector3D56, 1.4556766474320948d, vector3D60);
        boolean boolean62 = vector3D50.equals((java.lang.Object) vector3D61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D56", vector3D8.equals(vector3D56) ? vector3D8.hashCode() == vector3D56.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D1, (double) 'a', vector3D3);
        double double8 = vector3D7.getNormInf();
        boolean boolean9 = vector3D7.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double12 = vector3D11.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract(vector3D11);
        double double14 = vector3D11.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.subtract((double) 'a', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D17.negate();
        double double20 = vector3D17.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D17.orthogonal();
        double double22 = vector3D21.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D21.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D26.subtract(vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D40 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D43 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D40.subtract(vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D36, (double) (byte) 10, vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D47.subtract((double) 'a', vector3D49);
        double double51 = vector3D49.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D52 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D44, (double) '4', vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double54 = vector3D53.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D44, vector3D53);
        double double56 = vector3D55.getNorm1();
        double double57 = vector3D55.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D29.subtract(63.00793600809346d, vector3D55);
        double double59 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D23, vector3D55);
        double double60 = vector3D23.getAlpha();
        double double61 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D11, vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D62 = vector3D11.orthogonal();
        boolean boolean63 = vector3D11.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D1 and vector3D62", vector3D1.equals(vector3D62) ? vector3D1.hashCode() == vector3D62.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        double double5 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D1, vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        double double10 = vector3D8.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D17.subtract((double) 'a', vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D21 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D14, (double) '4', vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D8.add(vector3D21);
        double double23 = org.apache.commons.math.geometry.Vector3D.distance(vector3D1, vector3D22);
        double double24 = vector3D22.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        double double31 = org.apache.commons.math.geometry.Vector3D.distance(vector3D29, vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D22, 2.4674011002723395d, vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D33.subtract((double) 'a', vector3D35);
        double double37 = vector3D35.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D39.subtract((double) 'a', vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D44.subtract((double) 'a', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D48 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D41, (double) '4', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D35.add(vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        double double55 = vector3D53.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D53.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D35.subtract((double) 10L, vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D63 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D67 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D70 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D67.subtract(vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D72 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D63, (double) (byte) 10, vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D73 = vector3D57.subtract((double) 0, vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D74.subtract((double) 'a', vector3D76);
        org.apache.commons.math.geometry.Vector3D vector3D78 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        double double79 = org.apache.commons.math.geometry.Vector3D.distance(vector3D77, vector3D78);
        boolean boolean80 = vector3D73.equals((java.lang.Object) double79);
        double double81 = vector3D73.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D82 = vector3D73.negate();
        boolean boolean83 = vector3D32.equals((java.lang.Object) vector3D73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D57 and vector3D82", vector3D57.equals(vector3D82) ? vector3D57.hashCode() == vector3D82.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D9 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D12 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D9.subtract(vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D14 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D5, (double) (byte) 10, vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = new org.apache.commons.math.geometry.Vector3D((double) ' ', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D24 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D24.subtract(vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D20, (double) (byte) 10, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D((double) (-1L), vector3D13, (double) 1L, vector3D20);
        double double31 = vector3D13.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.subtract((double) 'a', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D33, (double) 'a', vector3D35);
        double double40 = vector3D39.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D39.orthogonal();
        double double42 = vector3D41.getY();
        double double43 = org.apache.commons.math.geometry.Vector3D.distance(vector3D13, vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D54 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D51.subtract(vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D56 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D47, (double) (byte) 10, vector3D55);
        double double57 = vector3D56.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D59.normalize();
        double double61 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D58, vector3D60);
        boolean boolean62 = vector3D56.equals((java.lang.Object) double61);
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D63.subtract((double) 'a', vector3D65);
        double double67 = vector3D65.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D69 = vector3D65.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D74 = vector3D71.subtract((double) 10L, vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D75 = vector3D65.subtract(10.0d, vector3D71);
        boolean boolean76 = vector3D71.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D77 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D56, vector3D71);
        double double78 = vector3D56.getNormSq();
        org.apache.commons.math.geometry.Vector3D vector3D79 = vector3D56.negate();
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D13, vector3D79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D5 and vector3D79", vector3D5.equals(vector3D79) ? vector3D5.hashCode() == vector3D79.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D1, (double) 'a', vector3D3);
        double double8 = vector3D7.getNormInf();
        boolean boolean9 = vector3D7.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double12 = vector3D11.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract(vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D17.subtract(vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D11, vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        boolean boolean28 = vector3D27.isNaN();
        double double29 = vector3D27.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D11.subtract(vector3D27);
        boolean boolean31 = vector3D11.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D34.subtract((double) 'a', vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D39.subtract((double) 'a', vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D43 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D36, (double) '4', vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D44.subtract((double) 'a', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D41, vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D50.subtract((double) 'a', vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D55.subtract((double) 'a', vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D59 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D52, (double) '4', vector3D57);
        double double60 = vector3D59.getAlpha();
        double double61 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D41, vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D65 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D68 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D69 = vector3D65.subtract(vector3D68);
        double double70 = vector3D65.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D59.subtract(0.0d, vector3D65);
        double double72 = vector3D65.getNorm1();
        double double73 = vector3D65.getDelta();
        double double74 = vector3D65.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D75 = vector3D65.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D76 = vector3D11.add((-0.3796077390275217d), vector3D75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D22 and vector3D48", vector3D22.equals(vector3D48) ? vector3D22.hashCode() == vector3D48.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D(2467402.10027234d, 221.42817312646005d);
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        double double6 = vector3D5.getX();
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D10, (double) '4', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D18.subtract((double) 'a', vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D15, vector3D18);
        boolean boolean23 = vector3D15.isInfinite();
        double double24 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D5, vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D34.subtract((double) 'a', vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D31, (double) '4', vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D39.subtract((double) 'a', vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D36, vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D55 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D48, (double) '4', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D56.subtract((double) 'a', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D53, vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D63.subtract((double) 'a', vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D68.subtract((double) 'a', vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D72 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D65, (double) '4', vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = vector3D73.subtract((double) 'a', vector3D75);
        org.apache.commons.math.geometry.Vector3D vector3D77 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D70, vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D78 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D43, (double) 100.0f, vector3D56, 10.0d, vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D79 = new org.apache.commons.math.geometry.Vector3D((double) (short) 100, vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D80 = new org.apache.commons.math.geometry.Vector3D(1.5707963267948966d, vector3D5, (double) 0.0f, vector3D56);
        double double81 = vector3D80.getNormSq();
        org.apache.commons.math.geometry.Vector3D vector3D82 = vector3D80.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D83 = vector3D2.subtract(0.0d, vector3D82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D82", vector3D8.equals(vector3D82) ? vector3D8.hashCode() == vector3D82.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        double double5 = vector3D3.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D9, (double) '4', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D3.add(vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D23.negate();
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D16, (double) 10, vector3D19, 0.0d, vector3D25, (double) 1L, vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D30, (double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.subtract((double) 'a', vector3D40);
        double double42 = vector3D40.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D44.subtract((double) 'a', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D49.subtract((double) 'a', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D53 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D46, (double) '4', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D40.add(vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D58.subtract((double) 'a', vector3D60);
        org.apache.commons.math.geometry.Vector3D vector3D62 = vector3D60.negate();
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D53, (double) 10, vector3D56, 0.0d, vector3D62, (double) 1L, vector3D64);
        double double66 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D36, vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D62.normalize();
        double double68 = org.apache.commons.math.geometry.Vector3D.angle(vector3D16, vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D69 = vector3D62.orthogonal();
        double double70 = vector3D69.getX();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D30 and vector3D69", vector3D30.equals(vector3D69) ? vector3D30.hashCode() == vector3D69.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D1, (double) 'a', vector3D3);
        double double8 = vector3D7.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D7.orthogonal();
        double double10 = vector3D7.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D11.negate();
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        double double17 = vector3D15.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D23, (double) '4', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D31.subtract((double) 'a', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D28, vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.subtract((double) 'a', vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D40, (double) '4', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D48.subtract((double) 'a', vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D45, vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D55.subtract((double) 'a', vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D60.subtract((double) 'a', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D64 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D57, (double) '4', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D68 = vector3D65.subtract((double) 'a', vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D62, vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D70 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D35, (double) 100.0f, vector3D48, 10.0d, vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D18, vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = vector3D73.subtract((double) 'a', vector3D75);
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D18.add((double) 1L, vector3D73);
        double double78 = org.apache.commons.math.geometry.Vector3D.distance(vector3D12, vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D79 = vector3D73.negate();
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D7, vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D81 = vector3D80.negate();
        double double82 = vector3D81.getAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D35 and vector3D81", vector3D35.equals(vector3D81) ? vector3D35.hashCode() == vector3D81.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D3.negate();
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.negate();
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D11.negate();
        double double14 = vector3D11.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.subtract((double) 'a', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D20.subtract((double) 'a', vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D22, (double) '4', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D27, vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.subtract((double) 'a', vector3D37);
        double double39 = vector3D37.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D50 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D43, (double) '4', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D37.add(vector3D50);
        double double52 = org.apache.commons.math.geometry.Vector3D.distance(vector3D30, vector3D37);
        double double53 = org.apache.commons.math.geometry.Vector3D.distance(vector3D15, vector3D37);
        double double54 = org.apache.commons.math.geometry.Vector3D.distance(vector3D11, vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D56.negate();
        double double58 = vector3D57.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D59 = new org.apache.commons.math.geometry.Vector3D((double) 10, vector3D37, (double) (-1), vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D57.negate();
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D7, vector3D60);
        boolean boolean62 = vector3D7.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D7 and vector3D61", vector3D7.equals(vector3D61) ? vector3D7.hashCode() == vector3D61.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        double double4 = vector3D2.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D8, (double) '4', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D2.add(vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D18.subtract((double) 'a', vector3D20);
        double double22 = vector3D20.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D20.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D2.subtract((double) 10L, vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D34 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D34.subtract(vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D30, (double) (byte) 10, vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D24.subtract((double) 0, vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        double double46 = org.apache.commons.math.geometry.Vector3D.distance(vector3D44, vector3D45);
        boolean boolean47 = vector3D40.equals((java.lang.Object) double46);
        double double48 = vector3D40.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D40.negate();
        boolean boolean50 = vector3D40.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D24 and vector3D49", vector3D24.equals(vector3D49) ? vector3D24.hashCode() == vector3D49.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D4.subtract((double) 'a', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D2, (double) 'a', vector3D4);
        double double9 = vector3D8.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D8.orthogonal();
        double double11 = vector3D8.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D12.negate();
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        double double18 = vector3D16.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D31 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D24, (double) '4', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D29, vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D39.subtract((double) 'a', vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D44.subtract((double) 'a', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D48 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D41, (double) '4', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D49.subtract((double) 'a', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D46, vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D56.subtract((double) 'a', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D61.subtract((double) 'a', vector3D63);
        org.apache.commons.math.geometry.Vector3D vector3D65 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D58, (double) '4', vector3D63);
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D69 = vector3D66.subtract((double) 'a', vector3D68);
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D63, vector3D66);
        org.apache.commons.math.geometry.Vector3D vector3D71 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D36, (double) 100.0f, vector3D49, 10.0d, vector3D63);
        org.apache.commons.math.geometry.Vector3D vector3D72 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D19, vector3D63);
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D74.subtract((double) 'a', vector3D76);
        org.apache.commons.math.geometry.Vector3D vector3D78 = vector3D19.add((double) 1L, vector3D74);
        double double79 = org.apache.commons.math.geometry.Vector3D.distance(vector3D13, vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D80 = vector3D74.negate();
        org.apache.commons.math.geometry.Vector3D vector3D81 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D82 = vector3D81.negate();
        org.apache.commons.math.geometry.Vector3D vector3D83 = new org.apache.commons.math.geometry.Vector3D(1.5607966601082353d, vector3D82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D36 and vector3D82", vector3D36.equals(vector3D82) ? vector3D36.hashCode() == vector3D82.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D2 = vector3D1.negate();
        double double3 = vector3D2.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        double double5 = vector3D4.getX();
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D9, (double) '4', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D17.subtract((double) 'a', vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D14, vector3D17);
        boolean boolean22 = vector3D14.isInfinite();
        double double23 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D4, vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D2, vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D25 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, vector3D24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D21 and vector3D24", vector3D21.equals(vector3D24) ? vector3D21.hashCode() == vector3D24.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D1, (double) 'a', vector3D3);
        double double8 = vector3D7.getNormInf();
        boolean boolean9 = vector3D7.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double12 = vector3D11.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract(vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D17.subtract(vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D11, vector3D22);
        double double24 = vector3D11.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.subtract((double) 'a', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D32, (double) '4', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D37, vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        double double49 = vector3D47.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D56.subtract((double) 'a', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D60 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D53, (double) '4', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D47.add(vector3D60);
        double double62 = org.apache.commons.math.geometry.Vector3D.distance(vector3D40, vector3D47);
        double double63 = org.apache.commons.math.geometry.Vector3D.distance(vector3D25, vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D64.subtract((double) 'a', vector3D66);
        double double68 = vector3D66.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D70 = vector3D66.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D72 = vector3D70.subtract(vector3D71);
        boolean boolean73 = vector3D25.equals((java.lang.Object) vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D77 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D80 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D81 = vector3D77.subtract(vector3D80);
        org.apache.commons.math.geometry.Vector3D vector3D82 = vector3D25.subtract((double) 10L, vector3D77);
        org.apache.commons.math.geometry.Vector3D vector3D83 = vector3D82.negate();
        boolean boolean84 = vector3D83.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D85 = vector3D83.orthogonal();
        double double86 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D11, vector3D85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D22 and vector3D44", vector3D22.equals(vector3D44) ? vector3D22.hashCode() == vector3D44.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D1, (double) 'a', vector3D3);
        double double8 = vector3D7.getNormInf();
        boolean boolean9 = vector3D7.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double12 = vector3D11.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract(vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D17.subtract(vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D11, vector3D22);
        double double24 = vector3D11.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        double double30 = vector3D26.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        double double36 = vector3D34.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.subtract((double) 'a', vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D40, (double) '4', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D34.add(vector3D47);
        double double49 = vector3D48.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D52.subtract((double) 'a', vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D57.subtract((double) 'a', vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D61 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D54, (double) '4', vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = vector3D62.subtract((double) 'a', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D59, vector3D62);
        double double67 = vector3D66.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double70 = vector3D69.getDelta();
        double double71 = vector3D69.getX();
        org.apache.commons.math.geometry.Vector3D vector3D75 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D76 = new org.apache.commons.math.geometry.Vector3D((double) 1, vector3D75);
        org.apache.commons.math.geometry.Vector3D vector3D80 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D84 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D87 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D88 = vector3D84.subtract(vector3D87);
        org.apache.commons.math.geometry.Vector3D vector3D89 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D80, (double) (byte) 10, vector3D88);
        double double90 = org.apache.commons.math.geometry.Vector3D.distance(vector3D75, vector3D80);
        double double91 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D69, vector3D80);
        org.apache.commons.math.geometry.Vector3D vector3D92 = new org.apache.commons.math.geometry.Vector3D(100.00499987500625d, vector3D26, 0.7977721804575484d, vector3D48, 62.0d, vector3D66, 110.0d, vector3D69);
        double double93 = vector3D66.getY();
        double double94 = vector3D66.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D95 = vector3D11.add(vector3D66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D22 and vector3D66", vector3D22.equals(vector3D66) ? vector3D22.hashCode() == vector3D66.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, (double) 0L, 100.0d);
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D4.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D9 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D(174.33839494026037d, vector3D5, 1.4556766474320948d, vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D12, (double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D20.subtract((double) 'a', vector3D22);
        double double24 = vector3D22.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D31.subtract((double) 'a', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D35 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D28, (double) '4', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D22.add(vector3D35);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D42.negate();
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D35, (double) 10, vector3D38, 0.0d, vector3D44, (double) 1L, vector3D46);
        double double48 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D18, vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D44.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D52 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        double double53 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D44, vector3D52);
        double double54 = org.apache.commons.math.geometry.Vector3D.angle(vector3D5, vector3D52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D5 and vector3D14", vector3D5.equals(vector3D14) ? vector3D5.hashCode() == vector3D14.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), 2.7045347671598794d, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D3.normalize();
        double double5 = vector3D3.getDelta();
        double double6 = vector3D3.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D3.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract((double) 'a', vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.subtract((double) 'a', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D12, (double) '4', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D20.subtract((double) 'a', vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D17, vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D29, (double) '4', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.subtract((double) 'a', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D34, vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D44.subtract((double) 'a', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D49.subtract((double) 'a', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D53 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D46, (double) '4', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D54.subtract((double) 'a', vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D51, vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D59 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D24, (double) 100.0f, vector3D37, 10.0d, vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D51.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D60.add((-1.0d), vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D67 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D68 = new org.apache.commons.math.geometry.Vector3D((double) 1, vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D72 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        double double73 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D69, vector3D72);
        double double74 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D67, vector3D69);
        double double75 = vector3D67.getZ();
        java.lang.String str76 = vector3D67.toString();
        org.apache.commons.math.geometry.Vector3D vector3D77 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D63, vector3D67);
        double double78 = org.apache.commons.math.geometry.Vector3D.distance(vector3D7, vector3D63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D24 and vector3D77", vector3D24.equals(vector3D77) ? vector3D24.hashCode() == vector3D77.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D7.subtract(vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D12 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D3, (double) (byte) 10, vector3D11);
        double double13 = vector3D12.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D15.normalize();
        double double17 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D14, vector3D16);
        boolean boolean18 = vector3D12.equals((java.lang.Object) double17);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        double double23 = vector3D21.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D21.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 10L, vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D21.subtract(10.0d, vector3D27);
        boolean boolean32 = vector3D27.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D12, vector3D27);
        double double34 = vector3D12.getNormSq();
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D12.negate();
        double double36 = vector3D12.getNorm1();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D3 and vector3D35", vector3D3.equals(vector3D35) ? vector3D3.hashCode() == vector3D35.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.subtract(vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D6.negate();
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D11, (double) '4', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D26.subtract(vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D31 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D22, (double) (byte) 10, vector3D30);
        boolean boolean32 = vector3D31.isNaN();
        double double33 = org.apache.commons.math.geometry.Vector3D.angle(vector3D16, vector3D31);
        double double34 = vector3D31.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D6.subtract(vector3D31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D7", vector3D6.equals(vector3D7) ? vector3D6.hashCode() == vector3D7.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D3, (double) '4', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        double double20 = vector3D18.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D31 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D24, (double) '4', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D18.add(vector3D31);
        double double33 = org.apache.commons.math.geometry.Vector3D.distance(vector3D11, vector3D18);
        double double34 = vector3D11.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract((double) 'a', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D38, (double) '4', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D43, vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        double double55 = vector3D53.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D57.subtract((double) 'a', vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = vector3D62.subtract((double) 'a', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D66 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D59, (double) '4', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D53.add(vector3D66);
        double double68 = org.apache.commons.math.geometry.Vector3D.distance(vector3D46, vector3D53);
        double double69 = vector3D53.getNorm1();
        double double70 = vector3D53.getNormSq();
        double double71 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D11, vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D72 = vector3D11.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = new org.apache.commons.math.geometry.Vector3D((double) 1, vector3D74);
        double double76 = org.apache.commons.math.geometry.Vector3D.distance(vector3D72, vector3D75);
        org.apache.commons.math.geometry.Vector3D vector3D80 = new org.apache.commons.math.geometry.Vector3D(63.00793600809346d, (double) 100.0f);
        org.apache.commons.math.geometry.Vector3D vector3D84 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D87 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D88 = vector3D84.subtract(vector3D87);
        org.apache.commons.math.geometry.Vector3D vector3D89 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D87);
        boolean boolean90 = vector3D87.isInfinite();
        double double91 = vector3D87.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D92 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D80, vector3D87);
        org.apache.commons.math.geometry.Vector3D vector3D93 = vector3D75.add(1.5514266812416906d, vector3D92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D15 and vector3D89", vector3D15.equals(vector3D89) ? vector3D15.hashCode() == vector3D89.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        double double7 = vector3D5.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D11, (double) '4', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D5.add(vector3D18);
        boolean boolean20 = vector3D5.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D24 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D24.subtract(vector3D27);
        double double29 = vector3D24.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D24.negate();
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D5.subtract(10.0d, vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D((double) (short) 100, (double) 10L, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D((double) 0, vector3D1, 0.0d, vector3D31, (double) (short) -1, vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D36.negate();
        double double39 = vector3D38.getZ();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D37 and vector3D38", vector3D37.equals(vector3D38) ? vector3D37.hashCode() == vector3D38.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D8.subtract(vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D4, (double) (byte) 10, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D14 = new org.apache.commons.math.geometry.Vector3D((double) ' ', vector3D12);
        double double15 = vector3D12.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D12.negate();
        double double17 = vector3D16.getY();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D12 and vector3D16", vector3D12.equals(vector3D16) ? vector3D12.hashCode() == vector3D16.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D2.negate();
        double double5 = vector3D2.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.negate();
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D6.scalarMultiply(96.0d);
        org.apache.commons.math.geometry.Vector3D vector3D12 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D12.orthogonal();
        double double15 = vector3D14.getZ();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D0 and vector3D14", vector3D0.equals(vector3D14) ? vector3D0.hashCode() == vector3D14.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        double double7 = vector3D5.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D11, (double) '4', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D5.add(vector3D18);
        boolean boolean20 = vector3D5.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D24 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D24.subtract(vector3D27);
        double double29 = vector3D24.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D24.negate();
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D5.subtract(10.0d, vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D((double) (short) 100, (double) 10L, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D((double) 0, vector3D1, 0.0d, vector3D31, (double) (short) -1, vector3D36);
        boolean boolean38 = vector3D37.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D37.orthogonal();
        double double40 = vector3D37.getDelta();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D1 and vector3D39", vector3D1.equals(vector3D39) ? vector3D1.hashCode() == vector3D39.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D9 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D12 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D9.subtract(vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D14 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D5, (double) (byte) 10, vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        double double20 = vector3D18.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D21 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D13, (double) '4', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double23 = vector3D22.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D13, vector3D22);
        boolean boolean25 = vector3D13.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D(9409.0d, (double) (-1));
        org.apache.commons.math.geometry.Vector3D vector3D31 = new org.apache.commons.math.geometry.Vector3D((double) '#', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D33.subtract((double) 'a', vector3D35);
        double double37 = vector3D35.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D50 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D43, (double) '4', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D48, vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D58.subtract((double) 'a', vector3D60);
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D63.subtract((double) 'a', vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D67 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D60, (double) '4', vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D68.subtract((double) 'a', vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D72 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D65, vector3D68);
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D77 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D78 = vector3D75.subtract((double) 'a', vector3D77);
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D82 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D83 = vector3D80.subtract((double) 'a', vector3D82);
        org.apache.commons.math.geometry.Vector3D vector3D84 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D77, (double) '4', vector3D82);
        org.apache.commons.math.geometry.Vector3D vector3D85 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D87 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D88 = vector3D85.subtract((double) 'a', vector3D87);
        org.apache.commons.math.geometry.Vector3D vector3D89 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D82, vector3D85);
        org.apache.commons.math.geometry.Vector3D vector3D90 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D55, (double) 100.0f, vector3D68, 10.0d, vector3D82);
        org.apache.commons.math.geometry.Vector3D vector3D91 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D38, vector3D82);
        boolean boolean92 = vector3D38.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D93 = vector3D38.negate();
        org.apache.commons.math.geometry.Vector3D vector3D94 = new org.apache.commons.math.geometry.Vector3D(9.0d, vector3D13, 18.458428449748276d, vector3D31, 2467402.10027234d, vector3D38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D22 and vector3D91", vector3D22.equals(vector3D91) ? vector3D22.hashCode() == vector3D91.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D6 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D3.subtract(vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract((double) 'a', vector3D12);
        double double14 = vector3D12.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D25 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D18, (double) '4', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D12.add(vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D32.negate();
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D25, (double) 10, vector3D28, 0.0d, vector3D34, (double) 1L, vector3D36);
        java.lang.String str38 = vector3D37.toString();
        double double39 = vector3D37.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D50.subtract((double) 'a', vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D54 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D47, (double) '4', vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D55.subtract((double) 'a', vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D52, vector3D55);
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = vector3D62.subtract((double) 'a', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = vector3D67.subtract((double) 'a', vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D71 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D64, (double) '4', vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D72 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = vector3D72.subtract((double) 'a', vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D69, vector3D72);
        org.apache.commons.math.geometry.Vector3D vector3D79 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D81 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D82 = vector3D79.subtract((double) 'a', vector3D81);
        org.apache.commons.math.geometry.Vector3D vector3D84 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D86 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D87 = vector3D84.subtract((double) 'a', vector3D86);
        org.apache.commons.math.geometry.Vector3D vector3D88 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D81, (double) '4', vector3D86);
        org.apache.commons.math.geometry.Vector3D vector3D89 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D91 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D92 = vector3D89.subtract((double) 'a', vector3D91);
        org.apache.commons.math.geometry.Vector3D vector3D93 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D86, vector3D89);
        org.apache.commons.math.geometry.Vector3D vector3D94 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D59, (double) 100.0f, vector3D72, 10.0d, vector3D86);
        org.apache.commons.math.geometry.Vector3D vector3D95 = new org.apache.commons.math.geometry.Vector3D((double) 100, vector3D59);
        double double96 = vector3D95.getAlpha();
        boolean boolean97 = vector3D95.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D98 = vector3D41.subtract(vector3D95);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D41", vector3D8.equals(vector3D41) ? vector3D8.hashCode() == vector3D41.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 1, 10081.0d, 3721.0d);
        double double4 = vector3D3.getY();
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D5.subtract((double) 'a', vector3D7);
        double double9 = vector3D7.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D13, (double) '4', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D7.add(vector3D20);
        boolean boolean22 = vector3D7.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D7.orthogonal();
        double double24 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D3, vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D33 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D27, (double) 'a', vector3D29);
        double double34 = vector3D33.getNormInf();
        boolean boolean35 = vector3D33.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D33.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double38 = vector3D37.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract(vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D3.add(91.90702573174319d, vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D37.orthogonal();
        double double42 = vector3D41.getNormInf();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D27 and vector3D41", vector3D27.equals(vector3D41) ? vector3D27.hashCode() == vector3D41.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        double double6 = vector3D4.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D10, (double) '4', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D4.add(vector3D17);
        boolean boolean19 = vector3D4.isNaN();
        java.lang.String str20 = vector3D4.toString();
        double double21 = vector3D4.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D(1.0d, vector3D4, (double) '#', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.ZERO;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D26, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D(1.4142135623730951d, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D30.negate();
        double double32 = vector3D30.getNorm1();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D28 and vector3D31", vector3D28.equals(vector3D31) ? vector3D28.hashCode() == vector3D31.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.subtract(vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D6.negate();
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.scalarMultiply(11881.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D7", vector3D6.equals(vector3D7) ? vector3D6.hashCode() == vector3D7.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) 0, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D4.subtract((double) 'a', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D6, (double) '4', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D11, vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        double double23 = vector3D21.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D27, (double) '4', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D21.add(vector3D34);
        double double36 = org.apache.commons.math.geometry.Vector3D.distance(vector3D14, vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D2, vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D2.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D2.orthogonal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D37 and vector3D38", vector3D37.equals(vector3D38) ? vector3D37.hashCode() == vector3D38.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, (double) 0L, 100.0d);
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) 1.0f, vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D8.subtract(vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D12, vector3D13);
        double double15 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D4, vector3D14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D12 and vector3D14", vector3D12.equals(vector3D14) ? vector3D12.hashCode() == vector3D14.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D7.subtract(vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D12 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D3, (double) (byte) 10, vector3D11);
        double double13 = vector3D12.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D15.normalize();
        double double17 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D14, vector3D16);
        boolean boolean18 = vector3D12.equals((java.lang.Object) double17);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        double double23 = vector3D21.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D21.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 10L, vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D21.subtract(10.0d, vector3D27);
        boolean boolean32 = vector3D27.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D12, vector3D27);
        double double34 = vector3D12.getNormSq();
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D12.negate();
        double double36 = vector3D12.getNormSq();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D3 and vector3D35", vector3D3.equals(vector3D35) ? vector3D3.hashCode() == vector3D35.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D(3721.0d, (double) '4');
        double double4 = vector3D3.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D9 = new org.apache.commons.math.geometry.Vector3D((double) 0, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D13, (double) '4', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D18, vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        double double30 = vector3D28.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.subtract((double) 'a', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D34, (double) '4', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D28.add(vector3D41);
        double double43 = org.apache.commons.math.geometry.Vector3D.distance(vector3D21, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D9, vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D55 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D48, (double) '4', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D56.subtract((double) 'a', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D53, vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D61.subtract((double) 'a', vector3D63);
        double double65 = vector3D63.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = vector3D67.subtract((double) 'a', vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D72 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = vector3D72.subtract((double) 'a', vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D76 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D69, (double) '4', vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D63.add(vector3D76);
        double double78 = org.apache.commons.math.geometry.Vector3D.distance(vector3D56, vector3D63);
        double double79 = vector3D63.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D82 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D83 = vector3D80.subtract((double) 'a', vector3D82);
        double double84 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D63, vector3D82);
        java.lang.String str85 = vector3D82.toString();
        org.apache.commons.math.geometry.Vector3D vector3D86 = vector3D9.subtract(vector3D82);
        org.apache.commons.math.geometry.Vector3D vector3D87 = new org.apache.commons.math.geometry.Vector3D(0.6319084353331195d, vector3D86);
        org.apache.commons.math.geometry.Vector3D vector3D88 = vector3D3.subtract(1.385650041748201d, vector3D86);
        org.apache.commons.math.geometry.Vector3D vector3D89 = vector3D86.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D90 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D86);
        double double91 = vector3D86.getNorm1();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D25 and vector3D90", vector3D25.equals(vector3D90) ? vector3D25.hashCode() == vector3D90.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        double double4 = vector3D2.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D8, (double) '4', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D2.add(vector3D15);
        boolean boolean17 = vector3D2.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D21 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D24 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D21.subtract(vector3D24);
        double double26 = vector3D21.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D21.negate();
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D2.subtract(10.0d, vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 10L, vector3D32);
        double double34 = vector3D30.getX();
        org.apache.commons.math.geometry.Vector3D vector3D35 = new org.apache.commons.math.geometry.Vector3D((double) 'a', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D27.subtract(vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D30.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D42 = new org.apache.commons.math.geometry.Vector3D(0.9866275920404853d, 3.796077390275217d, 1.7045347671598796d);
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D37.add(2.360997013078151d, vector3D42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D0 and vector3D37", vector3D0.equals(vector3D37) ? vector3D0.hashCode() == vector3D37.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        double double4 = vector3D2.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D6.subtract(vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D23 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D16, (double) '4', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D24.subtract((double) 'a', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D21, vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        double double33 = vector3D31.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.subtract((double) 'a', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D44 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D37, (double) '4', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D45 = vector3D31.add(vector3D44);
        double double46 = org.apache.commons.math.geometry.Vector3D.distance(vector3D24, vector3D31);
        double double47 = org.apache.commons.math.geometry.Vector3D.distance(vector3D9, vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D48.subtract((double) 'a', vector3D50);
        double double52 = vector3D50.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D50.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D56 = vector3D54.subtract(vector3D55);
        boolean boolean57 = vector3D9.equals((java.lang.Object) vector3D55);
        org.apache.commons.math.geometry.Vector3D vector3D61 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D64 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D65 = vector3D61.subtract(vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D9.subtract((double) 10L, vector3D61);
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D66.negate();
        boolean boolean68 = vector3D67.isInfinite();
        double double69 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D6, vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D74 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, (double) 0L, 100.0d);
        org.apache.commons.math.geometry.Vector3D vector3D75 = vector3D74.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D79 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D80 = new org.apache.commons.math.geometry.Vector3D(174.33839494026037d, vector3D75, 1.4556766474320948d, vector3D79);
        double double81 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D67, vector3D75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D0 and vector3D75", vector3D0.equals(vector3D75) ? vector3D0.hashCode() == vector3D75.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D6 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D3.subtract(vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double11 = vector3D10.getDelta();
        double double12 = vector3D10.getX();
        org.apache.commons.math.geometry.Vector3D vector3D16 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D((double) 1, vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D21 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D25 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D28 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D25.subtract(vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D21, (double) (byte) 10, vector3D29);
        double double31 = org.apache.commons.math.geometry.Vector3D.distance(vector3D16, vector3D21);
        double double32 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D10, vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D10.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D33.normalize();
        double double35 = org.apache.commons.math.geometry.Vector3D.angle(vector3D6, vector3D33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D29", vector3D8.equals(vector3D29) ? vector3D8.hashCode() == vector3D29.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D6 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D3.subtract(vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract((double) 'a', vector3D12);
        double double14 = vector3D12.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D12.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D16.subtract(vector3D17);
        double double19 = vector3D18.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D25 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D22.subtract(vector3D25);
        double double27 = vector3D22.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D22.negate();
        double double29 = vector3D22.getZ();
        double double30 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D18, vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        double double33 = vector3D32.getX();
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D18.add(91.90702573174319d, vector3D32);
        boolean boolean35 = vector3D32.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.subtract((double) 'a', vector3D39);
        double double41 = vector3D39.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D48.subtract((double) 'a', vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D52 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D45, (double) '4', vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D39.add(vector3D52);
        double double54 = vector3D53.getNormSq();
        java.lang.String str55 = vector3D53.toString();
        org.apache.commons.math.geometry.Vector3D vector3D56 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D32, 0.23021681993305776d, vector3D53);
        double double57 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D6, vector3D56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D16", vector3D8.equals(vector3D16) ? vector3D8.hashCode() == vector3D16.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D2.negate();
        double double5 = vector3D2.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.negate();
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D6.scalarMultiply(96.0d);
        org.apache.commons.math.geometry.Vector3D vector3D12 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D12.orthogonal();
        double double15 = vector3D14.getNorm1();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D0 and vector3D14", vector3D0.equals(vector3D14) ? vector3D0.hashCode() == vector3D14.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D2.negate();
        double double5 = vector3D2.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.negate();
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract((double) 'a', vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D14 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D8, (double) 'a', vector3D10);
        double double15 = vector3D14.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D14.orthogonal();
        double double17 = vector3D14.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D18.negate();
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D20.subtract((double) 'a', vector3D22);
        double double24 = vector3D22.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D28.subtract((double) 'a', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D33.subtract((double) 'a', vector3D35);
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D30, (double) '4', vector3D35);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.subtract((double) 'a', vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D35, vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D50.subtract((double) 'a', vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D54 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D47, (double) '4', vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D55.subtract((double) 'a', vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D52, vector3D55);
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = vector3D62.subtract((double) 'a', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = vector3D67.subtract((double) 'a', vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D71 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D64, (double) '4', vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D72 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = vector3D72.subtract((double) 'a', vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D69, vector3D72);
        org.apache.commons.math.geometry.Vector3D vector3D77 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D42, (double) 100.0f, vector3D55, 10.0d, vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D78 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D25, vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D82 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D83 = vector3D80.subtract((double) 'a', vector3D82);
        org.apache.commons.math.geometry.Vector3D vector3D84 = vector3D25.add((double) 1L, vector3D80);
        double double85 = org.apache.commons.math.geometry.Vector3D.distance(vector3D19, vector3D80);
        org.apache.commons.math.geometry.Vector3D vector3D86 = vector3D80.negate();
        org.apache.commons.math.geometry.Vector3D vector3D87 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D14, vector3D80);
        org.apache.commons.math.geometry.Vector3D vector3D88 = vector3D87.negate();
        double double89 = org.apache.commons.math.geometry.Vector3D.distance(vector3D6, vector3D88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D42 and vector3D88", vector3D42.equals(vector3D88) ? vector3D42.hashCode() == vector3D88.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        double double6 = org.apache.commons.math.geometry.Vector3D.distance(vector3D4, vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D4.subtract(vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D8.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D15 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        boolean boolean16 = vector3D15.isNaN();
        double double17 = vector3D15.getNorm1();
        double double18 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D11, vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D23 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D27.subtract(vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D23, (double) (byte) 10, vector3D31);
        double double33 = vector3D32.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D35.normalize();
        double double37 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D34, vector3D36);
        boolean boolean38 = vector3D32.equals((java.lang.Object) double37);
        double double39 = vector3D32.getX();
        org.apache.commons.math.geometry.Vector3D vector3D40 = new org.apache.commons.math.geometry.Vector3D(2.154869790896964d, vector3D8, 6200.0d, vector3D11, 96.00520819205592d, vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D44.subtract((double) 'a', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D48 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D42, (double) 'a', vector3D44);
        double double49 = vector3D48.getNormInf();
        boolean boolean50 = vector3D48.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D48.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double53 = vector3D52.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract(vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D58 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D61 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D62 = vector3D58.subtract(vector3D61);
        org.apache.commons.math.geometry.Vector3D vector3D63 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D61);
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D52, vector3D63);
        double double65 = vector3D52.getZ();
        double double66 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D40, vector3D52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D31 and vector3D63", vector3D31.equals(vector3D63) ? vector3D31.hashCode() == vector3D63.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((double) 100L, (double) 10L, (double) 0.0f);
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D3.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D12 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D6, (double) 'a', vector3D8);
        double double13 = vector3D12.getNorm1();
        java.lang.String str14 = vector3D12.toString();
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), 2.7045347671598794d, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D19.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D25 = new org.apache.commons.math.geometry.Vector3D(0.0d, 2.7045347671598794d, (double) 1);
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D19.add((double) 100, vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D12.add(0.0d, vector3D19);
        double double28 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D4, vector3D27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D4 and vector3D6", vector3D4.equals(vector3D6) ? vector3D4.hashCode() == vector3D6.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        double double5 = vector3D3.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D9, (double) '4', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D3.add(vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D23.negate();
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D16, (double) 10, vector3D19, 0.0d, vector3D25, (double) 1L, vector3D27);
        java.lang.String str29 = vector3D28.toString();
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D34.subtract((double) 'a', vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D39.subtract((double) 'a', vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D43 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D36, (double) '4', vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D44.subtract((double) 'a', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D41, vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D56.subtract((double) 'a', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D60 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D53, (double) '4', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D61.subtract((double) 'a', vector3D63);
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D58, vector3D61);
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D68.subtract((double) 'a', vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = vector3D73.subtract((double) 'a', vector3D75);
        org.apache.commons.math.geometry.Vector3D vector3D77 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D70, (double) '4', vector3D75);
        org.apache.commons.math.geometry.Vector3D vector3D78 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D81 = vector3D78.subtract((double) 'a', vector3D80);
        org.apache.commons.math.geometry.Vector3D vector3D82 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D75, vector3D78);
        org.apache.commons.math.geometry.Vector3D vector3D83 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D48, (double) 100.0f, vector3D61, 10.0d, vector3D75);
        org.apache.commons.math.geometry.Vector3D vector3D84 = new org.apache.commons.math.geometry.Vector3D((double) 100, vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D85 = vector3D28.add(2.0d, vector3D84);
        java.lang.String str86 = vector3D84.toString();
        org.apache.commons.math.geometry.Vector3D vector3D87 = vector3D84.negate();
        org.apache.commons.math.geometry.Vector3D vector3D88 = vector3D87.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D48 and vector3D87", vector3D48.equals(vector3D87) ? vector3D48.hashCode() == vector3D87.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D4.subtract((double) 'a', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D2, (double) 'a', vector3D4);
        double double9 = vector3D8.getNormInf();
        boolean boolean10 = vector3D8.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double13 = vector3D12.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract(vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D15 = new org.apache.commons.math.geometry.Vector3D(2.6106277387164094d, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D12.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D18.subtract((double) 'a', vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D23.subtract((double) 'a', vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D20, (double) '4', vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D28.subtract((double) 'a', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D25, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D34.subtract((double) 'a', vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D39.subtract((double) 'a', vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D43 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D36, (double) '4', vector3D41);
        double double44 = vector3D43.getAlpha();
        double double45 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D25, vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D49 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D52 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D49.subtract(vector3D52);
        double double54 = vector3D49.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D43.subtract(0.0d, vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = vector3D59.subtract((double) 'a', vector3D61);
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D64.subtract((double) 'a', vector3D66);
        org.apache.commons.math.geometry.Vector3D vector3D68 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D61, (double) '4', vector3D66);
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D72 = vector3D69.subtract((double) 'a', vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D66, vector3D69);
        boolean boolean74 = vector3D66.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D79 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, (double) (byte) -1, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D80 = vector3D79.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D81 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D66, (-0.8342233605065102d), vector3D79);
        org.apache.commons.math.geometry.Vector3D vector3D82 = new org.apache.commons.math.geometry.Vector3D(1100.0d, vector3D66);
        double double83 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D43, vector3D66);
        double double84 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D12, vector3D66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D2 and vector3D16", vector3D2.equals(vector3D16) ? vector3D2.hashCode() == vector3D16.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D(0.9866275920404853d, 3.796077390275217d, 1.7045347671598796d);
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) 10.0f, vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D7, (double) 'a', vector3D9);
        double double14 = vector3D13.getNorm1();
        java.lang.String str15 = vector3D13.toString();
        double double16 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D5, vector3D13);
        boolean boolean17 = vector3D5.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D20, (double) 'a', vector3D22);
        double double27 = vector3D26.getNormInf();
        boolean boolean28 = vector3D26.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double31 = vector3D30.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract(vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D36.subtract(vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D30, vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D5.subtract(96.00520819205592d, vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D50 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D47.subtract(vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D52 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D54.subtract((double) 'a', vector3D56);
        double double58 = vector3D56.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D60.subtract((double) 'a', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D68 = vector3D65.subtract((double) 'a', vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D69 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D62, (double) '4', vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D70 = vector3D56.add(vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D72 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D74.subtract((double) 'a', vector3D76);
        org.apache.commons.math.geometry.Vector3D vector3D78 = vector3D76.negate();
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D81 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D69, (double) 10, vector3D72, 0.0d, vector3D78, (double) 1L, vector3D80);
        java.lang.String str82 = vector3D81.toString();
        double double83 = vector3D81.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D84 = vector3D81.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D85 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D52, vector3D81);
        double double86 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D5, vector3D52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D41 and vector3D85", vector3D41.equals(vector3D85) ? vector3D41.hashCode() == vector3D85.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D2.negate();
        double double5 = vector3D2.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.orthogonal();
        double double7 = vector3D6.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D6.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D14 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D11.subtract(vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D21 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D25 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D28 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D25.subtract(vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D21, (double) (byte) 10, vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        double double36 = vector3D34.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D29, (double) '4', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double39 = vector3D38.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D29, vector3D38);
        double double41 = vector3D40.getNorm1();
        double double42 = vector3D40.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D14.subtract(63.00793600809346d, vector3D40);
        double double44 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D8, vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D55 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D48, (double) '4', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D56.subtract((double) 'a', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D53, vector3D56);
        double double61 = vector3D60.getNormSq();
        org.apache.commons.math.geometry.Vector3D vector3D62 = vector3D8.add(vector3D60);
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D60.negate();
        org.apache.commons.math.geometry.Vector3D vector3D68 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, 2.4674011002723395d, (double) (byte) 0);
        double double69 = vector3D68.getX();
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D72 = vector3D71.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D76 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D79 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D80 = vector3D76.subtract(vector3D79);
        double double81 = vector3D76.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D83 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D85 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D86 = vector3D83.subtract((double) 'a', vector3D85);
        double double87 = vector3D85.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D89 = vector3D85.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D90 = new org.apache.commons.math.geometry.Vector3D(98.0d, vector3D68, 1.5709551021528867d, vector3D72, 107.31450830677655d, vector3D76, 390649.6821959459d, vector3D85);
        boolean boolean91 = vector3D63.equals((java.lang.Object) 390649.6821959459d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D15 and vector3D63", vector3D15.equals(vector3D63) ? vector3D15.hashCode() == vector3D63.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D12 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D5, (double) '4', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D10, vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D20.subtract((double) 'a', vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D22, (double) '4', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D27, vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.subtract((double) 'a', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = vector3D42.subtract((double) 'a', vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D46 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D39, (double) '4', vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D47.subtract((double) 'a', vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D44, vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D52 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D17, (double) 100.0f, vector3D30, 10.0d, vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D53 = new org.apache.commons.math.geometry.Vector3D((double) 100, vector3D17);
        double double54 = vector3D17.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D17.negate();
        double double56 = vector3D17.getNorm1();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D17 and vector3D55", vector3D17.equals(vector3D55) ? vector3D17.hashCode() == vector3D55.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        double double4 = vector3D2.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 10L, vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D2.subtract(10.0d, vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D23 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D16, (double) '4', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D24.subtract((double) 'a', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D21, vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        double double33 = vector3D31.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.subtract((double) 'a', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D44 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D37, (double) '4', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D45 = vector3D31.add(vector3D44);
        double double46 = org.apache.commons.math.geometry.Vector3D.distance(vector3D24, vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D31.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D54 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D51.subtract(vector3D54);
        double double56 = vector3D51.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D51.negate();
        double double58 = vector3D51.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D59 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D51);
        double double60 = vector3D51.getX();
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D51.normalize();
        double double62 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D47, vector3D51);
        boolean boolean63 = vector3D8.equals((java.lang.Object) vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D8.orthogonal();
        java.lang.Class<?> wildcardClass65 = vector3D64.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D0 and vector3D64", vector3D0.equals(vector3D64) ? vector3D0.hashCode() == vector3D64.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D6 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D3.subtract(vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D6);
        boolean boolean9 = vector3D6.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D6.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D12, (double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D20.subtract((double) 'a', vector3D22);
        double double24 = vector3D22.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D31.subtract((double) 'a', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D35 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D28, (double) '4', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D22.add(vector3D35);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D42.negate();
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D35, (double) 10, vector3D38, 0.0d, vector3D44, (double) 1L, vector3D46);
        double double48 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D18, vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D49.subtract((double) 'a', vector3D51);
        double double53 = vector3D51.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D55.subtract((double) 'a', vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D60.subtract((double) 'a', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D64 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D57, (double) '4', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D65 = vector3D51.add(vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D44, vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D6.add(vector3D64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D66", vector3D8.equals(vector3D66) ? vector3D8.hashCode() == vector3D66.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((-0.5309649148733836d), 5.151226388999179d);
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D(0.7071067811865476d, vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D4.negate();
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        double double11 = vector3D9.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D18.subtract((double) 'a', vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D15, (double) '4', vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D9.add(vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D29.negate();
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D22, (double) 10, vector3D25, 0.0d, vector3D31, (double) 1L, vector3D33);
        java.lang.String str35 = vector3D34.toString();
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D49 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D42, (double) '4', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D50.subtract((double) 'a', vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D47, vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D57.subtract((double) 'a', vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = vector3D62.subtract((double) 'a', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D66 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D59, (double) '4', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = vector3D67.subtract((double) 'a', vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D64, vector3D67);
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D74.subtract((double) 'a', vector3D76);
        org.apache.commons.math.geometry.Vector3D vector3D79 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D81 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D82 = vector3D79.subtract((double) 'a', vector3D81);
        org.apache.commons.math.geometry.Vector3D vector3D83 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D76, (double) '4', vector3D81);
        org.apache.commons.math.geometry.Vector3D vector3D84 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D86 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D87 = vector3D84.subtract((double) 'a', vector3D86);
        org.apache.commons.math.geometry.Vector3D vector3D88 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D81, vector3D84);
        org.apache.commons.math.geometry.Vector3D vector3D89 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D54, (double) 100.0f, vector3D67, 10.0d, vector3D81);
        org.apache.commons.math.geometry.Vector3D vector3D90 = new org.apache.commons.math.geometry.Vector3D((double) 100, vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D91 = vector3D34.add(2.0d, vector3D90);
        java.lang.String str92 = vector3D90.toString();
        org.apache.commons.math.geometry.Vector3D vector3D93 = vector3D90.negate();
        boolean boolean94 = vector3D5.equals((java.lang.Object) vector3D90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D54 and vector3D93", vector3D54.equals(vector3D93) ? vector3D54.hashCode() == vector3D93.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D3, (double) '4', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        double double20 = vector3D18.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D31 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D24, (double) '4', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D18.add(vector3D31);
        double double33 = org.apache.commons.math.geometry.Vector3D.distance(vector3D11, vector3D18);
        double double34 = vector3D11.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract((double) 'a', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D38, (double) '4', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D43, vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        double double55 = vector3D53.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D57.subtract((double) 'a', vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = vector3D62.subtract((double) 'a', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D66 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D59, (double) '4', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D53.add(vector3D66);
        double double68 = org.apache.commons.math.geometry.Vector3D.distance(vector3D46, vector3D53);
        double double69 = vector3D53.getNorm1();
        double double70 = vector3D53.getNormSq();
        double double71 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D11, vector3D53);
        double double72 = vector3D11.getY();
        org.apache.commons.math.geometry.Vector3D vector3D76 = new org.apache.commons.math.geometry.Vector3D(0.7853981633974483d, 100.4987562112089d, (-0.5309649148733836d));
        org.apache.commons.math.geometry.Vector3D vector3D78 = vector3D76.scalarMultiply(0.0d);
        double double79 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D11, vector3D78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D15 and vector3D78", vector3D15.equals(vector3D78) ? vector3D15.hashCode() == vector3D78.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D4, (double) '4', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D9, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D17.subtract((double) 'a', vector3D19);
        double double21 = vector3D19.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D23.subtract((double) 'a', vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D28.subtract((double) 'a', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D25, (double) '4', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D19.add(vector3D32);
        double double34 = org.apache.commons.math.geometry.Vector3D.distance(vector3D12, vector3D19);
        double double35 = vector3D19.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D41 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D38.subtract(vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D19, vector3D38);
        double double44 = vector3D43.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D16 and vector3D45", vector3D16.equals(vector3D45) ? vector3D16.hashCode() == vector3D45.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D4, (double) '4', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D9, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D17.subtract((double) 'a', vector3D19);
        double double21 = vector3D19.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D23.subtract((double) 'a', vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D28.subtract((double) 'a', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D25, (double) '4', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D19.add(vector3D32);
        double double34 = org.apache.commons.math.geometry.Vector3D.distance(vector3D12, vector3D19);
        double double35 = vector3D19.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D41 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D38.subtract(vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D19, vector3D38);
        double double44 = vector3D43.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D43);
        double double46 = vector3D43.getAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D16 and vector3D45", vector3D16.equals(vector3D45) ? vector3D16.hashCode() == vector3D45.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        double double4 = vector3D2.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D8, (double) '4', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D2.add(vector3D15);
        boolean boolean17 = vector3D2.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D21 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D24 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D21.subtract(vector3D24);
        double double26 = vector3D21.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D21.negate();
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D2.subtract(10.0d, vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 10L, vector3D32);
        double double34 = vector3D30.getX();
        org.apache.commons.math.geometry.Vector3D vector3D35 = new org.apache.commons.math.geometry.Vector3D((double) 'a', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D27.subtract(vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D30.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D30.normalize();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D0 and vector3D37", vector3D0.equals(vector3D37) ? vector3D0.hashCode() == vector3D37.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D6 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D3.subtract(vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract((double) 'a', vector3D12);
        double double14 = vector3D12.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D25 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D18, (double) '4', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D12.add(vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D32.negate();
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D25, (double) 10, vector3D28, 0.0d, vector3D34, (double) 1L, vector3D36);
        java.lang.String str38 = vector3D37.toString();
        double double39 = vector3D37.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D37);
        java.lang.String str42 = vector3D37.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D41", vector3D8.equals(vector3D41) ? vector3D8.hashCode() == vector3D41.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        double double4 = vector3D0.getNorm1();
        double double5 = vector3D0.getNormSq();
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D14 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D14.subtract(vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D10, (double) (byte) 10, vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        double double25 = vector3D23.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D18, (double) '4', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double28 = vector3D27.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D18, vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D35 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D42 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D39.subtract(vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D44 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D35, (double) (byte) 10, vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        double double50 = vector3D48.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D43, (double) '4', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double53 = vector3D52.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D43, vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D27.subtract((double) (short) 0, vector3D54);
        java.lang.String str56 = vector3D27.toString();
        double double57 = vector3D27.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D0, vector3D27);
        double double59 = vector3D58.getNorm1();
        double double60 = vector3D58.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D63 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D66 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D63.subtract(vector3D66);
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D67, vector3D68);
        org.apache.commons.math.geometry.Vector3D vector3D70 = vector3D58.subtract(vector3D69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D18 and vector3D69", vector3D18.equals(vector3D69) ? vector3D18.hashCode() == vector3D69.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        double double5 = vector3D3.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D9, (double) '4', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D3.add(vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        double double23 = vector3D21.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D21.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D3.subtract((double) 10L, vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D31 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D35 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D35.subtract(vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D40 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D31, (double) (byte) 10, vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D25.subtract((double) 0, vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = vector3D42.subtract((double) 'a', vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        double double47 = org.apache.commons.math.geometry.Vector3D.distance(vector3D45, vector3D46);
        boolean boolean48 = vector3D41.equals((java.lang.Object) double47);
        double double49 = vector3D41.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D41.negate();
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D(10080.275170898885d, vector3D50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D25 and vector3D50", vector3D25.equals(vector3D50) ? vector3D25.hashCode() == vector3D50.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D(3721.0d, (double) '4');
        double double4 = vector3D3.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D9 = new org.apache.commons.math.geometry.Vector3D((double) 0, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D13, (double) '4', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D18, vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        double double30 = vector3D28.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.subtract((double) 'a', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D34, (double) '4', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D28.add(vector3D41);
        double double43 = org.apache.commons.math.geometry.Vector3D.distance(vector3D21, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D9, vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D55 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D48, (double) '4', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D56.subtract((double) 'a', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D53, vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D61.subtract((double) 'a', vector3D63);
        double double65 = vector3D63.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = vector3D67.subtract((double) 'a', vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D72 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = vector3D72.subtract((double) 'a', vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D76 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D69, (double) '4', vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D63.add(vector3D76);
        double double78 = org.apache.commons.math.geometry.Vector3D.distance(vector3D56, vector3D63);
        double double79 = vector3D63.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D82 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D83 = vector3D80.subtract((double) 'a', vector3D82);
        double double84 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D63, vector3D82);
        java.lang.String str85 = vector3D82.toString();
        org.apache.commons.math.geometry.Vector3D vector3D86 = vector3D9.subtract(vector3D82);
        org.apache.commons.math.geometry.Vector3D vector3D87 = new org.apache.commons.math.geometry.Vector3D(0.6319084353331195d, vector3D86);
        org.apache.commons.math.geometry.Vector3D vector3D88 = vector3D3.subtract(1.385650041748201d, vector3D86);
        org.apache.commons.math.geometry.Vector3D vector3D89 = vector3D86.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D90 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D86);
        org.apache.commons.math.geometry.Vector3D vector3D91 = vector3D86.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D25 and vector3D90", vector3D25.equals(vector3D90) ? vector3D25.hashCode() == vector3D90.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        double double5 = vector3D3.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D9, (double) '4', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D3.add(vector3D16);
        boolean boolean18 = vector3D3.isNaN();
        java.lang.String str19 = vector3D3.toString();
        double double20 = vector3D3.getY();
        double double21 = vector3D3.getX();
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D((double) 1, vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D33 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D30.subtract(vector3D33);
        double double35 = vector3D30.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D30.negate();
        double double37 = vector3D30.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D30.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D27, vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D40 = new org.apache.commons.math.geometry.Vector3D(0.704041030906696d, vector3D3, 3.844E7d, vector3D39);
        double double41 = vector3D40.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D48.subtract((double) 'a', vector3D50);
        double double52 = vector3D50.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D54.subtract((double) 'a', vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = vector3D59.subtract((double) 'a', vector3D61);
        org.apache.commons.math.geometry.Vector3D vector3D63 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D56, (double) '4', vector3D61);
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D50.add(vector3D63);
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D68.subtract((double) 'a', vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D72 = vector3D70.negate();
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D63, (double) 10, vector3D66, 0.0d, vector3D72, (double) 1L, vector3D74);
        double double76 = vector3D74.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D78 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D81 = vector3D78.subtract((double) 'a', vector3D80);
        org.apache.commons.math.geometry.Vector3D vector3D83 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D85 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D86 = vector3D83.subtract((double) 'a', vector3D85);
        org.apache.commons.math.geometry.Vector3D vector3D87 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D80, (double) '4', vector3D85);
        org.apache.commons.math.geometry.Vector3D vector3D88 = vector3D74.add(vector3D87);
        org.apache.commons.math.geometry.Vector3D vector3D89 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D46, vector3D88);
        org.apache.commons.math.geometry.Vector3D vector3D90 = vector3D40.add(1.9762183008101064d, vector3D89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D34 and vector3D89", vector3D34.equals(vector3D89) ? vector3D34.hashCode() == vector3D89.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        double double5 = vector3D3.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D9, (double) '4', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D3.add(vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D23.negate();
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D16, (double) 10, vector3D19, 0.0d, vector3D25, (double) 1L, vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D30, (double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.subtract((double) 'a', vector3D40);
        double double42 = vector3D40.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D44.subtract((double) 'a', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D49.subtract((double) 'a', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D53 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D46, (double) '4', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D40.add(vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D58.subtract((double) 'a', vector3D60);
        org.apache.commons.math.geometry.Vector3D vector3D62 = vector3D60.negate();
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D53, (double) 10, vector3D56, 0.0d, vector3D62, (double) 1L, vector3D64);
        double double66 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D36, vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D62.normalize();
        double double68 = org.apache.commons.math.geometry.Vector3D.angle(vector3D16, vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D69 = vector3D62.orthogonal();
        double double70 = vector3D69.getAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D30 and vector3D69", vector3D30.equals(vector3D69) ? vector3D30.hashCode() == vector3D69.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D2.negate();
        double double5 = vector3D2.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.negate();
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D6.scalarMultiply(96.0d);
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract((double) 'a', vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.subtract((double) 'a', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D12, (double) '4', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D23 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D27.subtract(vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D23, (double) (byte) 10, vector3D31);
        boolean boolean33 = vector3D32.isNaN();
        double double34 = org.apache.commons.math.geometry.Vector3D.angle(vector3D17, vector3D32);
        double double35 = vector3D32.getNormInf();
        double double36 = vector3D32.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D8.add(vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D42 = new org.apache.commons.math.geometry.Vector3D(2.0d, 3721.0d, 9.663847937972736d);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, (double) 0L, 100.0d);
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D47.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D52 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D53 = new org.apache.commons.math.geometry.Vector3D(174.33839494026037d, vector3D48, 1.4556766474320948d, vector3D52);
        double double54 = vector3D52.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D42.subtract(vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D56 = vector3D37.add(2.097166872000692d, vector3D42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D0 and vector3D48", vector3D0.equals(vector3D48) ? vector3D0.hashCode() == vector3D48.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        double double1 = vector3D0.getY();
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D5.subtract((double) 'a', vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract((double) 'a', vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D14 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D7, (double) '4', vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.subtract((double) 'a', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D12, vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D31 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D24, (double) '4', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D29, vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D39.subtract((double) 'a', vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D44.subtract((double) 'a', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D48 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D41, (double) '4', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D49.subtract((double) 'a', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D46, vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D54 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D19, (double) 100.0f, vector3D32, 10.0d, vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D46.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D56 = vector3D46.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        double double58 = vector3D57.getNorm();
        double double59 = org.apache.commons.math.geometry.Vector3D.distance(vector3D46, vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D0.subtract(Double.NaN, vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D0.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D63.subtract((double) 'a', vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D68.subtract((double) 'a', vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D72 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D65, (double) '4', vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = vector3D73.subtract((double) 'a', vector3D75);
        org.apache.commons.math.geometry.Vector3D vector3D77 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D70, vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D78 = vector3D77.negate();
        double double79 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D61, vector3D77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D19 and vector3D78", vector3D19.equals(vector3D78) ? vector3D19.hashCode() == vector3D78.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D1, (double) 'a', vector3D3);
        double double8 = vector3D7.getNormInf();
        boolean boolean9 = vector3D7.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double12 = vector3D11.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract(vector3D11);
        double double14 = vector3D11.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.subtract((double) 'a', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D17.negate();
        double double20 = vector3D17.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D17.orthogonal();
        double double22 = vector3D21.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D21.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D26.subtract(vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D40 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D43 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D40.subtract(vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D36, (double) (byte) 10, vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D47.subtract((double) 'a', vector3D49);
        double double51 = vector3D49.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D52 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D44, (double) '4', vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double54 = vector3D53.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D44, vector3D53);
        double double56 = vector3D55.getNorm1();
        double double57 = vector3D55.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D29.subtract(63.00793600809346d, vector3D55);
        double double59 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D23, vector3D55);
        double double60 = vector3D23.getAlpha();
        double double61 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D11, vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D62 = vector3D11.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D63 = vector3D62.normalize();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D1 and vector3D62", vector3D1.equals(vector3D62) ? vector3D1.hashCode() == vector3D62.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((-0.5309649148733836d), 5.151226388999179d);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D12 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D6, (double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D17.subtract((double) 'a', vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D21 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D15, (double) 'a', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D23.subtract((double) 'a', vector3D25);
        double double27 = vector3D25.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D34.subtract((double) 'a', vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D31, (double) '4', vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D25.add(vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D45.negate();
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D38, (double) 10, vector3D41, 0.0d, vector3D47, (double) 1L, vector3D49);
        double double51 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D21, vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D56 = vector3D53.subtract((double) 'a', vector3D55);
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D58.subtract((double) 'a', vector3D60);
        org.apache.commons.math.geometry.Vector3D vector3D62 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D55, (double) '4', vector3D60);
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D63.subtract((double) 'a', vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D60, vector3D63);
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D72 = vector3D69.subtract((double) 'a', vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D74.subtract((double) 'a', vector3D76);
        org.apache.commons.math.geometry.Vector3D vector3D78 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D71, (double) '4', vector3D76);
        double double79 = vector3D78.getAlpha();
        double double80 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D60, vector3D78);
        double double81 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D47, vector3D60);
        boolean boolean82 = vector3D47.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D83 = new org.apache.commons.math.geometry.Vector3D(1.2900625991958456d, vector3D8, 100.00499987500625d, vector3D47);
        double double84 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D3, vector3D83);
        org.apache.commons.math.geometry.Vector3D vector3D85 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D83);
        org.apache.commons.math.geometry.Vector3D vector3D88 = new org.apache.commons.math.geometry.Vector3D((-0.5543384707620473d), 390649.2032501795d);
        org.apache.commons.math.geometry.Vector3D vector3D89 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D85, vector3D88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D67 and vector3D85", vector3D67.equals(vector3D85) ? vector3D67.hashCode() == vector3D85.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, 2.4674011002723395d, (double) (byte) 0);
        double double5 = vector3D4.getX();
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D7.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D12 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D15 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D12.subtract(vector3D15);
        double double17 = vector3D12.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        double double23 = vector3D21.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D21.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D(98.0d, vector3D4, 1.5709551021528867d, vector3D8, 107.31450830677655d, vector3D12, 390649.6821959459d, vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D(2.0d, 3721.0d, 9.663847937972736d);
        org.apache.commons.math.geometry.Vector3D vector3D35 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, (double) 0L, 100.0d);
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D35.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D40 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D41 = new org.apache.commons.math.geometry.Vector3D(174.33839494026037d, vector3D36, 1.4556766474320948d, vector3D40);
        double double42 = vector3D40.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D30.subtract(vector3D40);
        boolean boolean44 = vector3D12.equals((java.lang.Object) vector3D43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D19 and vector3D36", vector3D19.equals(vector3D36) ? vector3D19.hashCode() == vector3D36.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D8.subtract(vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D4, (double) (byte) 10, vector3D12);
        double double14 = vector3D13.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D16.normalize();
        double double18 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D15, vector3D17);
        boolean boolean19 = vector3D13.equals((java.lang.Object) double18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D20.subtract((double) 'a', vector3D22);
        double double24 = vector3D22.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D22.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D28.subtract((double) 10L, vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D22.subtract(10.0d, vector3D28);
        boolean boolean33 = vector3D28.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D13, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, (double) (byte) -1, 0.0d);
        java.lang.String str40 = vector3D39.toString();
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D44.subtract((double) 'a', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D49.subtract((double) 'a', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D53 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D46, (double) '4', vector3D51);
        double double54 = vector3D53.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D57.normalize();
        double double59 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D56, vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D65 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D69 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D72 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D73 = vector3D69.subtract(vector3D72);
        org.apache.commons.math.geometry.Vector3D vector3D74 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D65, (double) (byte) 10, vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D78 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D79 = vector3D76.subtract((double) 'a', vector3D78);
        double double80 = vector3D78.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D81 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D73, (double) '4', vector3D78);
        org.apache.commons.math.geometry.Vector3D vector3D82 = new org.apache.commons.math.geometry.Vector3D((-0.0d), vector3D53, 1.0d, vector3D58, (double) 10, vector3D78);
        org.apache.commons.math.geometry.Vector3D vector3D83 = vector3D39.subtract(980.0d, vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D87 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D88 = new org.apache.commons.math.geometry.Vector3D((double) 1, vector3D87);
        org.apache.commons.math.geometry.Vector3D vector3D89 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D92 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        double double93 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D89, vector3D92);
        double double94 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D87, vector3D89);
        double double95 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D83, vector3D87);
        org.apache.commons.math.geometry.Vector3D vector3D96 = new org.apache.commons.math.geometry.Vector3D(390749.2032501795d, vector3D28, 0.0d, vector3D87);
        double double97 = vector3D96.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D98 = vector3D96.orthogonal();
        double double99 = vector3D98.getZ();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D20 and vector3D98", vector3D20.equals(vector3D98) ? vector3D20.hashCode() == vector3D98.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double1 = vector3D0.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D5.subtract((double) 'a', vector3D7);
        double double9 = vector3D7.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D13, (double) '4', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D7.add(vector3D20);
        boolean boolean22 = vector3D7.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D26.subtract(vector3D29);
        double double31 = vector3D26.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D26.negate();
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D7.subtract(10.0d, vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D((double) (short) 100, (double) 10L, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) 0, vector3D3, 0.0d, vector3D33, (double) (short) -1, vector3D38);
        double double40 = org.apache.commons.math.geometry.Vector3D.distance(vector3D0, vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.negate();
        double double42 = vector3D38.getAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D39 and vector3D41", vector3D39.equals(vector3D41) ? vector3D39.hashCode() == vector3D41.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D1, (double) 'a', vector3D3);
        double double8 = vector3D7.getNormInf();
        boolean boolean9 = vector3D7.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double12 = vector3D11.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract(vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D17.subtract(vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D11, vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.subtract((double) 'a', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D32, (double) '4', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D37, vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        double double49 = vector3D47.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D56.subtract((double) 'a', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D60 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D53, (double) '4', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D47.add(vector3D60);
        double double62 = org.apache.commons.math.geometry.Vector3D.distance(vector3D40, vector3D47);
        double double63 = org.apache.commons.math.geometry.Vector3D.distance(vector3D25, vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D11.add(0.0d, vector3D47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D22 and vector3D44", vector3D22.equals(vector3D44) ? vector3D22.hashCode() == vector3D44.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D6 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D3.subtract(vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D7, vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        double double12 = vector3D11.getZ();
        double double13 = vector3D11.getZ();
        double double14 = vector3D11.getNormInf();
        double double15 = vector3D11.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D16 = new org.apache.commons.math.geometry.Vector3D(31.352265418681178d, vector3D9, 9.663847937972736d, vector3D11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D7 and vector3D9", vector3D7.equals(vector3D9) ? vector3D7.hashCode() == vector3D9.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        double double4 = vector3D2.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D8, (double) '4', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D2.add(vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D20.subtract((double) 'a', vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D24 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D18, (double) 'a', vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        double double30 = vector3D28.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.subtract((double) 'a', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D34, (double) '4', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D28.add(vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D48.negate();
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D41, (double) 10, vector3D44, 0.0d, vector3D50, (double) 1L, vector3D52);
        double double54 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D24, vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D2, vector3D50);
        double double56 = vector3D55.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D55.scalarMultiply((-0.09950371902099892d));
        boolean boolean59 = vector3D58.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D55 and vector3D58", vector3D55.equals(vector3D58) ? vector3D55.hashCode() == vector3D58.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 1, 10081.0d, 3721.0d);
        double double5 = vector3D4.getY();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        double double10 = vector3D8.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D17.subtract((double) 'a', vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D21 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D14, (double) '4', vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D8.add(vector3D21);
        boolean boolean23 = vector3D8.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D8.orthogonal();
        double double25 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D4, vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D28, (double) 'a', vector3D30);
        double double35 = vector3D34.getNormInf();
        boolean boolean36 = vector3D34.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D34.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double39 = vector3D38.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.subtract(vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D4.add(91.90702573174319d, vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D38.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D43 = new org.apache.commons.math.geometry.Vector3D(37938.75931778749d, vector3D38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D28 and vector3D42", vector3D28.equals(vector3D42) ? vector3D28.hashCode() == vector3D42.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D7.subtract(vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D12 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D3, (double) (byte) 10, vector3D11);
        double double13 = vector3D12.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D15.normalize();
        double double17 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D14, vector3D16);
        boolean boolean18 = vector3D12.equals((java.lang.Object) double17);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        double double23 = vector3D21.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D21.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 10L, vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D21.subtract(10.0d, vector3D27);
        boolean boolean32 = vector3D27.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D12, vector3D27);
        double double34 = vector3D12.getNormSq();
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D12.negate();
        java.lang.Class<?> wildcardClass36 = vector3D35.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D3 and vector3D35", vector3D3.equals(vector3D35) ? vector3D3.hashCode() == vector3D35.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D4, (double) '4', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D9, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D24.subtract((double) 'a', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D28 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D21, (double) '4', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D26, vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract((double) 'a', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D38, (double) '4', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D43, vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D16, (double) 100.0f, vector3D29, 10.0d, vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D43.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D52.add((-1.0d), vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D59 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D60 = new org.apache.commons.math.geometry.Vector3D((double) 1, vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D64 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        double double65 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D61, vector3D64);
        double double66 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D59, vector3D61);
        double double67 = vector3D59.getZ();
        java.lang.String str68 = vector3D59.toString();
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D55, vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D72 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D73 = vector3D70.subtract((double) 10L, vector3D72);
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D75 = vector3D74.negate();
        double double76 = vector3D75.getNormInf();
        double double77 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D70, vector3D75);
        double double78 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D69, vector3D70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D16 and vector3D69", vector3D16.equals(vector3D69) ? vector3D16.hashCode() == vector3D69.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, (double) 0L, 100.0d);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D8, (double) '4', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D13, vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D23.subtract((double) 'a', vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D28.subtract((double) 'a', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D25, (double) '4', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D33.subtract((double) 'a', vector3D35);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D30, vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D49 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D42, (double) '4', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D50.subtract((double) 'a', vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D47, vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D55 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D20, (double) 100.0f, vector3D33, 10.0d, vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D57.subtract((double) 'a', vector3D59);
        double double61 = vector3D59.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D63.subtract((double) 'a', vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D68.subtract((double) 'a', vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D72 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D65, (double) '4', vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D73 = vector3D59.add(vector3D72);
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D77 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D79 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D80 = vector3D77.subtract((double) 'a', vector3D79);
        org.apache.commons.math.geometry.Vector3D vector3D81 = vector3D79.negate();
        org.apache.commons.math.geometry.Vector3D vector3D83 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D84 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D72, (double) 10, vector3D75, 0.0d, vector3D81, (double) 1L, vector3D83);
        double double85 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D47, vector3D81);
        org.apache.commons.math.geometry.Vector3D vector3D86 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        double double87 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D81, vector3D86);
        org.apache.commons.math.geometry.Vector3D vector3D88 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D89 = vector3D88.negate();
        org.apache.commons.math.geometry.Vector3D vector3D90 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D81, vector3D89);
        org.apache.commons.math.geometry.Vector3D vector3D91 = vector3D3.add(vector3D90);
        org.apache.commons.math.geometry.Vector3D vector3D92 = vector3D3.orthogonal();
        double double93 = vector3D3.getNormSq();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D92", vector3D6.equals(vector3D92) ? vector3D6.hashCode() == vector3D92.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((double) 100L, (double) 10L, (double) 0.0f);
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D3.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D9 = new org.apache.commons.math.geometry.Vector3D(91.90702573174319d, 1.3604002971242803d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        double double15 = vector3D13.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.orthogonal();
        double double17 = vector3D16.getNormSq();
        double double18 = vector3D16.getNorm();
        java.lang.String str19 = vector3D16.toString();
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D20.subtract((double) 10L, vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D29, (double) '4', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.subtract((double) 'a', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D34, vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D44.subtract((double) 'a', vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D49.subtract((double) 'a', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D53 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D46, (double) '4', vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D54.subtract((double) 'a', vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D51, vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D61.subtract((double) 'a', vector3D63);
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D69 = vector3D66.subtract((double) 'a', vector3D68);
        org.apache.commons.math.geometry.Vector3D vector3D70 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D63, (double) '4', vector3D68);
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D73 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D74 = vector3D71.subtract((double) 'a', vector3D73);
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D68, vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D76 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D41, (double) 100.0f, vector3D54, 10.0d, vector3D68);
        org.apache.commons.math.geometry.Vector3D vector3D77 = new org.apache.commons.math.geometry.Vector3D((double) (short) 100, vector3D54);
        double double78 = vector3D54.getNorm1();
        boolean boolean79 = vector3D54.isInfinite();
        double double80 = org.apache.commons.math.geometry.Vector3D.angle(vector3D22, vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D81 = vector3D16.add(vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D82 = new org.apache.commons.math.geometry.Vector3D((-3.5464871341284088d), vector3D9, 12851.778377670997d, vector3D16);
        double double83 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D4, vector3D9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D4 and vector3D20", vector3D4.equals(vector3D20) ? vector3D4.hashCode() == vector3D20.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D4.subtract((double) 'a', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D2, (double) 'a', vector3D4);
        double double9 = vector3D8.getNormInf();
        boolean boolean10 = vector3D8.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double13 = vector3D12.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract(vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D15 = new org.apache.commons.math.geometry.Vector3D(2.6106277387164094d, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D12.orthogonal();
        double double17 = vector3D12.getX();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D2 and vector3D16", vector3D2.equals(vector3D16) ? vector3D2.hashCode() == vector3D16.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D1 = vector3D0.negate();
        double double2 = vector3D1.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        double double4 = vector3D3.getX();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D8, (double) '4', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D13, vector3D16);
        boolean boolean21 = vector3D13.isInfinite();
        double double22 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D3, vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D1, vector3D3);
        double double24 = vector3D3.getY();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D20 and vector3D23", vector3D20.equals(vector3D23) ? vector3D20.hashCode() == vector3D23.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D7.subtract((double) 'a', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D4, (double) '4', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D9, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D24.subtract((double) 'a', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D28 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D21, (double) '4', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D26, vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract((double) 'a', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D38, (double) '4', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D43, vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D16, (double) 100.0f, vector3D29, 10.0d, vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D52.subtract((double) 'a', vector3D54);
        double double56 = vector3D54.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D58.subtract((double) 'a', vector3D60);
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D63.subtract((double) 'a', vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D67 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D60, (double) '4', vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D68 = vector3D54.add(vector3D67);
        boolean boolean69 = vector3D54.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D70 = vector3D54.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D72 = vector3D70.scalarMultiply((double) (short) 100);
        boolean boolean73 = vector3D72.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D16, vector3D72);
        double double75 = vector3D16.getZ();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D16 and vector3D74", vector3D16.equals(vector3D74) ? vector3D16.hashCode() == vector3D74.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        double double4 = vector3D2.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D8.negate();
        double double11 = vector3D8.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D17.subtract((double) 'a', vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D19, (double) '4', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D24, vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        double double36 = vector3D34.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D38.subtract((double) 'a', vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract((double) 'a', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D40, (double) '4', vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D34.add(vector3D47);
        double double49 = org.apache.commons.math.geometry.Vector3D.distance(vector3D27, vector3D34);
        double double50 = org.apache.commons.math.geometry.Vector3D.distance(vector3D12, vector3D34);
        double double51 = org.apache.commons.math.geometry.Vector3D.distance(vector3D8, vector3D34);
        double double52 = org.apache.commons.math.geometry.Vector3D.angle(vector3D5, vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D5.orthogonal();
        double double54 = vector3D5.getDelta();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D10 and vector3D53", vector3D10.equals(vector3D53) ? vector3D10.hashCode() == vector3D53.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.subtract(vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D12 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D16 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D16.subtract(vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D21 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D12, (double) (byte) 10, vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D23.subtract((double) 'a', vector3D25);
        double double27 = vector3D25.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D28 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D20, (double) '4', vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double30 = vector3D29.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D20, vector3D29);
        double double32 = vector3D31.getNorm1();
        double double33 = vector3D31.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D5.subtract(63.00793600809346d, vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.subtract((double) 10L, vector3D37);
        boolean boolean39 = vector3D35.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D35.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D5, vector3D35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D23 and vector3D40", vector3D23.equals(vector3D40) ? vector3D23.hashCode() == vector3D40.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        double double6 = vector3D4.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D10, (double) '4', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D4.add(vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D24.negate();
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D17, (double) 10, vector3D20, 0.0d, vector3D26, (double) 1L, vector3D28);
        boolean boolean30 = vector3D26.isInfinite();
        double double31 = vector3D26.getDelta();
        java.lang.String str32 = vector3D26.toString();
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D(0.0d, (-0.0d));
        double double37 = vector3D36.getNormSq();
        org.apache.commons.math.geometry.Vector3D vector3D41 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D42 = new org.apache.commons.math.geometry.Vector3D((double) 1, vector3D41);
        double double43 = vector3D41.getNorm();
        java.lang.String str44 = vector3D41.toString();
        double double45 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D36, vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D36.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D46.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D48 = new org.apache.commons.math.geometry.Vector3D(0.5828452096854925d, vector3D26, 96.00520819205592d, vector3D46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D2 and vector3D47", vector3D2.equals(vector3D47) ? vector3D2.hashCode() == vector3D47.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        boolean boolean6 = vector3D5.isNaN();
        double double7 = vector3D5.getNorm1();
        double double8 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D1, vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        boolean boolean14 = vector3D13.isNaN();
        java.lang.String str15 = vector3D13.toString();
        org.apache.commons.math.geometry.Vector3D vector3D16 = new org.apache.commons.math.geometry.Vector3D((-157.07963267948966d), vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D17.subtract((double) 'a', vector3D19);
        double double21 = vector3D19.getNorm();
        double double22 = org.apache.commons.math.geometry.Vector3D.angle(vector3D13, vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D13.normalize();
        double double24 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D5, vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D5.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D(1.3498151218648435d, vector3D5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D17 and vector3D25", vector3D17.equals(vector3D25) ? vector3D17.hashCode() == vector3D25.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.subtract((double) 'a', vector3D5);
        double double7 = vector3D5.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D11, (double) '4', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D5.add(vector3D18);
        boolean boolean20 = vector3D5.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D24 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D24.subtract(vector3D27);
        double double29 = vector3D24.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D24.negate();
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D5.subtract(10.0d, vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D((double) (short) 100, (double) 10L, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D((double) 0, vector3D1, 0.0d, vector3D31, (double) (short) -1, vector3D36);
        boolean boolean38 = vector3D37.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D37.orthogonal();
        double double40 = vector3D39.getY();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D1 and vector3D39", vector3D1.equals(vector3D39) ? vector3D1.hashCode() == vector3D39.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.subtract(vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D6, vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D12.subtract((double) 'a', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D10, (double) 'a', vector3D12);
        double double17 = vector3D16.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D16.orthogonal();
        double double19 = vector3D16.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D20.negate();
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        double double26 = vector3D24.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D24.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.subtract((double) 'a', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D32, (double) '4', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D37, vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D47.subtract((double) 'a', vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D52.subtract((double) 'a', vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D56 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D49, (double) '4', vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D57.subtract((double) 'a', vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D54, vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D64.subtract((double) 'a', vector3D66);
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D72 = vector3D69.subtract((double) 'a', vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D73 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D66, (double) '4', vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D74.subtract((double) 'a', vector3D76);
        org.apache.commons.math.geometry.Vector3D vector3D78 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D71, vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D79 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D44, (double) 100.0f, vector3D57, 10.0d, vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D27, vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D82 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D84 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D85 = vector3D82.subtract((double) 'a', vector3D84);
        org.apache.commons.math.geometry.Vector3D vector3D86 = vector3D27.add((double) 1L, vector3D82);
        double double87 = org.apache.commons.math.geometry.Vector3D.distance(vector3D21, vector3D82);
        org.apache.commons.math.geometry.Vector3D vector3D88 = vector3D82.negate();
        org.apache.commons.math.geometry.Vector3D vector3D89 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D16, vector3D82);
        double double90 = vector3D89.getX();
        double double91 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D7, vector3D89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D8", vector3D6.equals(vector3D8) ? vector3D6.hashCode() == vector3D8.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((-0.9999999999999998d), 390941.7603722814d);
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D9 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), 2.7045347671598794d, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D9.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D15 = new org.apache.commons.math.geometry.Vector3D(0.0d, 2.7045347671598794d, (double) 1);
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D9.add((double) 100, vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D17.subtract((double) 'a', vector3D19);
        double double21 = vector3D19.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D19.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D23.subtract(vector3D24);
        double double26 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D15, vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D3.subtract((double) 'a', vector3D24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D4 and vector3D23", vector3D4.equals(vector3D23) ? vector3D4.hashCode() == vector3D23.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D6 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D3.subtract(vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D6);
        boolean boolean9 = vector3D6.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), 2.7045347671598794d, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D13.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D(0.0d, 2.7045347671598794d, (double) 1);
        org.apache.commons.math.geometry.Vector3D vector3D20 = vector3D13.add((double) 100, vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        double double25 = vector3D23.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D23.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D27.subtract(vector3D28);
        double double30 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D19, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D34 = new org.apache.commons.math.geometry.Vector3D((double) 100L, (double) 10L, (double) 0.0f);
        boolean boolean35 = vector3D34.isNaN();
        java.lang.String str36 = vector3D34.toString();
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D28.add(vector3D34);
        double double38 = vector3D34.getNormInf();
        double double39 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D6, vector3D34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D27", vector3D8.equals(vector3D27) ? vector3D8.hashCode() == vector3D27.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D(0.9866275920404853d, 3.796077390275217d, 1.7045347671598796d);
        org.apache.commons.math.geometry.Vector3D vector3D6 = new org.apache.commons.math.geometry.Vector3D((double) 10.0f, vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D6.negate();
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) 10.0f, 96.53557993017385d, 7.977721804575484d);
        double double12 = vector3D11.getAlpha();
        boolean boolean13 = vector3D11.isNaN();
        double double14 = vector3D11.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D16.negate();
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D31 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D24, (double) '4', vector3D29);
        double double32 = vector3D31.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D35.normalize();
        double double37 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D34, vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D43 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D50 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D47.subtract(vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D52 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D43, (double) (byte) 10, vector3D51);
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D54.subtract((double) 'a', vector3D56);
        double double58 = vector3D56.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D59 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D51, (double) '4', vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D60 = new org.apache.commons.math.geometry.Vector3D((-0.0d), vector3D31, 1.0d, vector3D36, (double) 10, vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D61 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D63.subtract((double) 'a', vector3D65);
        double double67 = vector3D65.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D69 = vector3D65.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D69.subtract(vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D72 = new org.apache.commons.math.geometry.Vector3D(1.0d, vector3D17, 63.00793600809346d, vector3D61, (double) (short) 0, vector3D69);
        double double73 = vector3D69.getZ();
        double double74 = org.apache.commons.math.geometry.Vector3D.distance(vector3D11, vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D6, vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D81 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, (double) 0L, 100.0d);
        org.apache.commons.math.geometry.Vector3D vector3D82 = vector3D81.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D86 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D87 = new org.apache.commons.math.geometry.Vector3D(174.33839494026037d, vector3D82, 1.4556766474320948d, vector3D86);
        double double88 = vector3D87.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D89 = new org.apache.commons.math.geometry.Vector3D(8.000484360304487d, vector3D69, 1.0832461421566162d, vector3D87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D22 and vector3D82", vector3D22.equals(vector3D82) ? vector3D22.hashCode() == vector3D82.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D(63.00793600809346d, (double) 100.0f);
        org.apache.commons.math.geometry.Vector3D vector3D6 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D9 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D6.subtract(vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D9);
        boolean boolean12 = vector3D9.isInfinite();
        double double13 = vector3D9.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D2, vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D14.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D15.scalarMultiply(9409.0d);
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        boolean boolean23 = vector3D22.isNaN();
        double double24 = vector3D22.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D22.scalarMultiply(1.8324833568180172d);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D(113.0d, 3721.0d, (double) (short) -1);
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D22.add(vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D15.add(1.704041030906696d, vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D34.subtract((double) 'a', vector3D36);
        double double38 = vector3D36.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D49 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D42, (double) '4', vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D36.add(vector3D49);
        boolean boolean51 = vector3D36.isNaN();
        java.lang.String str52 = vector3D36.toString();
        double double53 = vector3D36.getY();
        double double54 = vector3D36.getX();
        org.apache.commons.math.geometry.Vector3D vector3D59 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D60 = new org.apache.commons.math.geometry.Vector3D((double) 1, vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D63 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D66 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D63.subtract(vector3D66);
        double double68 = vector3D63.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D69 = vector3D63.negate();
        double double70 = vector3D63.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D63.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D72 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D60, vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D73 = new org.apache.commons.math.geometry.Vector3D(0.704041030906696d, vector3D36, 3.844E7d, vector3D72);
        double double74 = vector3D73.getNorm();
        double double75 = vector3D73.getZ();
        boolean boolean76 = vector3D15.equals((java.lang.Object) double75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D11 and vector3D67", vector3D11.equals(vector3D67) ? vector3D11.hashCode() == vector3D67.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D(0.9866275920404853d, 3.796077390275217d, 1.7045347671598796d);
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) 10.0f, vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D7, (double) 'a', vector3D9);
        double double14 = vector3D13.getNorm1();
        java.lang.String str15 = vector3D13.toString();
        double double16 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D5, vector3D13);
        boolean boolean17 = vector3D5.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D20, (double) 'a', vector3D22);
        double double27 = vector3D26.getNormInf();
        boolean boolean28 = vector3D26.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double31 = vector3D30.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract(vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D39 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D36.subtract(vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D30, vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D5.subtract(96.00520819205592d, vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        double double45 = vector3D44.getY();
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D48.subtract((double) 'a', vector3D50);
        double double52 = vector3D50.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D54.subtract((double) 'a', vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D62 = vector3D59.subtract((double) 'a', vector3D61);
        org.apache.commons.math.geometry.Vector3D vector3D63 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D56, (double) '4', vector3D61);
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D50.add(vector3D63);
        boolean boolean65 = vector3D50.isNaN();
        java.lang.String str66 = vector3D50.toString();
        double double67 = vector3D50.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D72 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D73 = new org.apache.commons.math.geometry.Vector3D(1.0d, vector3D50, (double) '#', vector3D72);
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.ZERO;
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D72, vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D76 = new org.apache.commons.math.geometry.Vector3D(1.4142135623730951d, vector3D74);
        double double77 = vector3D74.getDelta();
        double double78 = vector3D74.getX();
        double double79 = org.apache.commons.math.geometry.Vector3D.distance(vector3D44, vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D5, vector3D74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D41 and vector3D74", vector3D41.equals(vector3D74) ? vector3D41.hashCode() == vector3D74.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D1 = vector3D0.negate();
        double double2 = vector3D1.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        double double4 = vector3D3.getX();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D8, (double) '4', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D13, vector3D16);
        boolean boolean21 = vector3D13.isInfinite();
        double double22 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D3, vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D1, vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        double double29 = vector3D27.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = vector3D31.subtract((double) 'a', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract((double) 'a', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D40 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D33, (double) '4', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D27.add(vector3D40);
        boolean boolean42 = vector3D27.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D46 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D49 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D46.subtract(vector3D49);
        double double51 = vector3D46.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D52 = vector3D46.negate();
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D27.subtract(10.0d, vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D58 = new org.apache.commons.math.geometry.Vector3D(100.0d, 100.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D63 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D67 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D70 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D67.subtract(vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D72 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D63, (double) (byte) 10, vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D74.subtract((double) 'a', vector3D76);
        double double78 = vector3D76.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D79 = new org.apache.commons.math.geometry.Vector3D((-1.5707963267948966d), vector3D71, (double) '4', vector3D76);
        boolean boolean80 = vector3D79.isNaN();
        double double81 = vector3D79.getNorm1();
        boolean boolean82 = vector3D58.equals((java.lang.Object) double81);
        org.apache.commons.math.geometry.Vector3D vector3D83 = new org.apache.commons.math.geometry.Vector3D(9.0d, vector3D27, 10.505677441735738d, vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D86 = new org.apache.commons.math.geometry.Vector3D(0.995037190209989d, 1.1391888107241956d);
        double double87 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D83, vector3D86);
        org.apache.commons.math.geometry.Vector3D vector3D88 = vector3D23.subtract(vector3D86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D20 and vector3D23", vector3D20.equals(vector3D23) ? vector3D20.hashCode() == vector3D23.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D2.negate();
        double double5 = vector3D2.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.negate();
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D6.scalarMultiply(96.0d);
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D10.subtract((double) 'a', vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.subtract((double) 'a', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D12, (double) '4', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D23 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) (byte) 0);
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D31 = vector3D27.subtract(vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, vector3D23, (double) (byte) 10, vector3D31);
        boolean boolean33 = vector3D32.isNaN();
        double double34 = org.apache.commons.math.geometry.Vector3D.angle(vector3D17, vector3D32);
        double double35 = vector3D32.getNormInf();
        double double36 = vector3D32.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D8.add(vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D40 = new org.apache.commons.math.geometry.Vector3D(63.00793600809346d, (double) 100.0f);
        org.apache.commons.math.geometry.Vector3D vector3D44 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D44.subtract(vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D49 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D47);
        boolean boolean50 = vector3D47.isInfinite();
        double double51 = vector3D47.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D40, vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D52.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D53.scalarMultiply(9409.0d);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D56.subtract((double) 'a', vector3D58);
        double double60 = vector3D58.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = vector3D62.subtract((double) 'a', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = vector3D67.subtract((double) 'a', vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D71 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D64, (double) '4', vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D72 = vector3D58.add(vector3D71);
        boolean boolean73 = vector3D58.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D74 = vector3D58.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D76 = vector3D74.scalarMultiply((double) (short) 100);
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D74.normalize();
        double double78 = vector3D74.getX();
        double double79 = org.apache.commons.math.geometry.Vector3D.angle(vector3D55, vector3D74);
        double double80 = org.apache.commons.math.geometry.Vector3D.angle(vector3D32, vector3D55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D31 and vector3D49", vector3D31.equals(vector3D49) ? vector3D31.hashCode() == vector3D49.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        double double4 = vector3D2.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D10, (double) '4', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D18.subtract((double) 'a', vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D15, vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D27, (double) '4', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.subtract((double) 'a', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D32, vector3D35);
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D45 = vector3D42.subtract((double) 'a', vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D47.subtract((double) 'a', vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D44, (double) '4', vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D52.subtract((double) 'a', vector3D54);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D49, vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D57 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D22, (double) 100.0f, vector3D35, 10.0d, vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D5, vector3D49);
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D49.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D62 = new org.apache.commons.math.geometry.Vector3D((double) 0, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D64.subtract((double) 'a', vector3D66);
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D72 = vector3D69.subtract((double) 'a', vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D73 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D66, (double) '4', vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D74.subtract((double) 'a', vector3D76);
        org.apache.commons.math.geometry.Vector3D vector3D78 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D71, vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D79 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D81 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D82 = vector3D79.subtract((double) 'a', vector3D81);
        double double83 = vector3D81.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D85 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D87 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D88 = vector3D85.subtract((double) 'a', vector3D87);
        org.apache.commons.math.geometry.Vector3D vector3D90 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D92 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D93 = vector3D90.subtract((double) 'a', vector3D92);
        org.apache.commons.math.geometry.Vector3D vector3D94 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D87, (double) '4', vector3D92);
        org.apache.commons.math.geometry.Vector3D vector3D95 = vector3D81.add(vector3D94);
        double double96 = org.apache.commons.math.geometry.Vector3D.distance(vector3D74, vector3D81);
        org.apache.commons.math.geometry.Vector3D vector3D97 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D62, vector3D74);
        java.lang.String str98 = vector3D62.toString();
        org.apache.commons.math.geometry.Vector3D vector3D99 = vector3D59.subtract(vector3D62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D58 and vector3D62", vector3D58.equals(vector3D62) ? vector3D58.hashCode() == vector3D62.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D2.subtract((double) 'a', vector3D4);
        double double6 = vector3D4.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 'a', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D13.subtract((double) 'a', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D10, (double) '4', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D4.add(vector3D17);
        boolean boolean19 = vector3D4.isNaN();
        java.lang.String str20 = vector3D4.toString();
        double double21 = vector3D4.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D(1.0d, vector3D4, (double) '#', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.ZERO;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D26, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = new org.apache.commons.math.geometry.Vector3D(1.4142135623730951d, vector3D28);
        double double31 = vector3D28.getDelta();
        double double32 = vector3D28.getX();
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract((double) 'a', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D40 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D34, (double) 'a', vector3D36);
        double double41 = vector3D40.getNormInf();
        boolean boolean42 = vector3D40.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double45 = vector3D44.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D43.subtract(vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D50 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D53 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D50.subtract(vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D55 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D44, vector3D55);
        java.lang.Class<?> wildcardClass57 = vector3D56.getClass();
        boolean boolean58 = vector3D28.equals((java.lang.Object) vector3D56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D28 and vector3D55", vector3D28.equals(vector3D55) ? vector3D28.hashCode() == vector3D55.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        double double4 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D0, vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D9 = new org.apache.commons.math.geometry.Vector3D((-0.0d), (double) '4', (double) 1);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D13, (double) '4', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D18, vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        double double30 = vector3D28.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.subtract((double) 'a', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D34, (double) '4', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D28.add(vector3D41);
        double double43 = org.apache.commons.math.geometry.Vector3D.distance(vector3D21, vector3D28);
        double double44 = vector3D28.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D45 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D45.subtract((double) 'a', vector3D47);
        double double49 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D28, vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D9, vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D55 = new org.apache.commons.math.geometry.Vector3D(1.4675718095070809d, (-1.0d), 1.5018132113642444d);
        org.apache.commons.math.geometry.Vector3D vector3D56 = new org.apache.commons.math.geometry.Vector3D((-259.8073332613715d), vector3D50, 62.01989520388012d, vector3D55);
        double double57 = org.apache.commons.math.geometry.Vector3D.angle(vector3D0, vector3D56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D0 and vector3D50", vector3D0.equals(vector3D50) ? vector3D0.hashCode() == vector3D50.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.subtract((double) 'a', vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D3, (double) '4', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D8, vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        double double20 = vector3D18.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D22.subtract((double) 'a', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D31 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D24, (double) '4', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D18.add(vector3D31);
        double double33 = org.apache.commons.math.geometry.Vector3D.distance(vector3D11, vector3D18);
        double double34 = vector3D11.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract((double) 'a', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D38, (double) '4', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D43, vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        double double55 = vector3D53.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D57.subtract((double) 'a', vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D65 = vector3D62.subtract((double) 'a', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D66 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D59, (double) '4', vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D67 = vector3D53.add(vector3D66);
        double double68 = org.apache.commons.math.geometry.Vector3D.distance(vector3D46, vector3D53);
        double double69 = vector3D53.getNorm1();
        double double70 = vector3D53.getNormSq();
        double double71 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D11, vector3D53);
        double double72 = vector3D53.getNormSq();
        org.apache.commons.math.geometry.Vector3D vector3D76 = new org.apache.commons.math.geometry.Vector3D(1.0d, (double) 1.0f);
        org.apache.commons.math.geometry.Vector3D vector3D79 = new org.apache.commons.math.geometry.Vector3D((double) 10, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D80 = vector3D76.subtract(vector3D79);
        org.apache.commons.math.geometry.Vector3D vector3D81 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 0, vector3D79);
        boolean boolean82 = vector3D79.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D83 = vector3D79.normalize();
        double double84 = vector3D79.getNormInf();
        double double85 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D53, vector3D79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D15 and vector3D81", vector3D15.equals(vector3D81) ? vector3D15.hashCode() == vector3D81.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 1, 10081.0d, 3721.0d);
        double double4 = vector3D3.getY();
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D5.subtract((double) 'a', vector3D7);
        double double9 = vector3D7.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D13, (double) '4', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D7.add(vector3D20);
        boolean boolean22 = vector3D7.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D23 = vector3D7.orthogonal();
        double double24 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D3, vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D33 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D27, (double) 'a', vector3D29);
        double double34 = vector3D33.getNormInf();
        boolean boolean35 = vector3D33.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D33.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        double double38 = vector3D37.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract(vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D3.add(91.90702573174319d, vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D37.orthogonal();
        double double42 = vector3D37.getNormSq();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D27 and vector3D41", vector3D27.equals(vector3D41) ? vector3D27.hashCode() == vector3D41.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) 0, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D7 = vector3D4.subtract((double) 'a', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D13 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D6, (double) '4', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D11, vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        double double23 = vector3D21.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D25.subtract((double) 'a', vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 'a', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D34 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D27, (double) '4', vector3D32);
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D21.add(vector3D34);
        double double36 = org.apache.commons.math.geometry.Vector3D.distance(vector3D14, vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D2, vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D2.orthogonal();
        boolean boolean39 = vector3D38.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D37 and vector3D38", vector3D37.equals(vector3D38) ? vector3D37.hashCode() == vector3D38.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D(3721.0d, (double) '4');
        double double4 = vector3D3.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D9 = new org.apache.commons.math.geometry.Vector3D((double) 0, (double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.subtract((double) 'a', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D13, (double) '4', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D25 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D18, vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D26.subtract((double) 'a', vector3D28);
        double double30 = vector3D28.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D37.subtract((double) 'a', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D34, (double) '4', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D28.add(vector3D41);
        double double43 = org.apache.commons.math.geometry.Vector3D.distance(vector3D21, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D9, vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D51 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D54 = vector3D51.subtract((double) 'a', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D55 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D48, (double) '4', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D56.subtract((double) 'a', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D60 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D53, vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D61.subtract((double) 'a', vector3D63);
        double double65 = vector3D63.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D70 = vector3D67.subtract((double) 'a', vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D72 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D74 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D75 = vector3D72.subtract((double) 'a', vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D76 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D69, (double) '4', vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D63.add(vector3D76);
        double double78 = org.apache.commons.math.geometry.Vector3D.distance(vector3D56, vector3D63);
        double double79 = vector3D63.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D80 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D82 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D83 = vector3D80.subtract((double) 'a', vector3D82);
        double double84 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D63, vector3D82);
        java.lang.String str85 = vector3D82.toString();
        org.apache.commons.math.geometry.Vector3D vector3D86 = vector3D9.subtract(vector3D82);
        org.apache.commons.math.geometry.Vector3D vector3D87 = new org.apache.commons.math.geometry.Vector3D(0.6319084353331195d, vector3D86);
        org.apache.commons.math.geometry.Vector3D vector3D88 = vector3D3.subtract(1.385650041748201d, vector3D86);
        org.apache.commons.math.geometry.Vector3D vector3D89 = vector3D86.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D90 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D86);
        double double91 = vector3D86.getAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D25 and vector3D90", vector3D25.equals(vector3D90) ? vector3D25.hashCode() == vector3D90.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        double double4 = vector3D2.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.subtract((double) 'a', vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D15 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D8, (double) '4', vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D2.add(vector3D15);
        boolean boolean17 = vector3D2.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D21 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D24 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D21.subtract(vector3D24);
        double double26 = vector3D21.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D21.negate();
        org.apache.commons.math.geometry.Vector3D vector3D28 = vector3D2.subtract(10.0d, vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D30.subtract((double) 10L, vector3D32);
        double double34 = vector3D30.getX();
        org.apache.commons.math.geometry.Vector3D vector3D35 = new org.apache.commons.math.geometry.Vector3D((double) 'a', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D36 = vector3D27.subtract(vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D30.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D37.orthogonal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D0 and vector3D37", vector3D0.equals(vector3D37) ? vector3D0.hashCode() == vector3D37.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.ZERO;
        boolean boolean1 = vector3D0.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D7 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        boolean boolean8 = vector3D7.isNaN();
        java.lang.String str9 = vector3D7.toString();
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((-157.07963267948966d), vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D14 = vector3D11.subtract((double) 'a', vector3D13);
        double double15 = vector3D13.getNorm();
        double double16 = org.apache.commons.math.geometry.Vector3D.angle(vector3D7, vector3D13);
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D(9409.0d, vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D17.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D0, vector3D18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D11 and vector3D18", vector3D11.equals(vector3D18) ? vector3D11.hashCode() == vector3D18.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D2.negate();
        double double5 = vector3D2.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.orthogonal();
        double double7 = vector3D6.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D6.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D9 = vector3D6.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D4 and vector3D8", vector3D4.equals(vector3D8) ? vector3D4.hashCode() == vector3D8.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.commons.math.geometry.Vector3D vector3D2 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D5 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.subtract(vector3D5);
        double double7 = vector3D2.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D8 = vector3D2.negate();
        double double9 = vector3D2.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D2.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D15 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D18 = vector3D15.subtract((double) 'a', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D13, (double) 'a', vector3D15);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D21.subtract((double) 'a', vector3D23);
        double double25 = vector3D23.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D27.subtract((double) 'a', vector3D29);
        org.apache.commons.math.geometry.Vector3D vector3D32 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D35 = vector3D32.subtract((double) 'a', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D29, (double) '4', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D23.add(vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = vector3D43.negate();
        org.apache.commons.math.geometry.Vector3D vector3D47 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = new org.apache.commons.math.geometry.Vector3D((double) (-1.0f), vector3D36, (double) 10, vector3D39, 0.0d, vector3D45, (double) 1L, vector3D47);
        double double49 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D19, vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D50.subtract((double) 'a', vector3D52);
        double double54 = vector3D52.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D59 = vector3D56.subtract((double) 'a', vector3D58);
        org.apache.commons.math.geometry.Vector3D vector3D61 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D61.subtract((double) 'a', vector3D63);
        org.apache.commons.math.geometry.Vector3D vector3D65 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D58, (double) '4', vector3D63);
        org.apache.commons.math.geometry.Vector3D vector3D66 = vector3D52.add(vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D45, vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D68 = new org.apache.commons.math.geometry.Vector3D(1.0d, vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D69 = vector3D10.subtract(vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D70 = vector3D45.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D73 = new org.apache.commons.math.geometry.Vector3D(18.458428449748276d, (-0.38716579922670363d));
        double double74 = org.apache.commons.math.geometry.Vector3D.angle(vector3D45, vector3D73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D13 and vector3D70", vector3D13.equals(vector3D70) ? vector3D13.hashCode() == vector3D70.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D(0.0d, 0.0d, (double) 10.0f);
        boolean boolean4 = vector3D3.isNaN();
        java.lang.String str5 = vector3D3.toString();
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D3.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D11, (double) '4', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D(2.4674011002723395d, (double) 1, (double) (byte) 10);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D22.subtract(vector3D23);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        boolean boolean27 = vector3D26.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D34.subtract((double) 'a', vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D31, (double) '4', vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D39.subtract((double) 'a', vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D36, vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D44.subtract((double) 'a', vector3D46);
        double double48 = vector3D46.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D53 = vector3D50.subtract((double) 'a', vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D58 = vector3D55.subtract((double) 'a', vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D59 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D52, (double) '4', vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D46.add(vector3D59);
        double double61 = org.apache.commons.math.geometry.Vector3D.distance(vector3D39, vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D65 = new org.apache.commons.math.geometry.Vector3D(0.0d, 2.7045347671598794d, (double) 1);
        double double66 = org.apache.commons.math.geometry.Vector3D.distance(vector3D39, vector3D65);
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        double double68 = vector3D67.getY();
        double double69 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D39, vector3D67);
        double double70 = vector3D67.getY();
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D26.add(vector3D67);
        double double72 = vector3D67.getNorm1();
        org.apache.commons.math.geometry.Vector3D vector3D73 = vector3D22.subtract(0.7853981633974483d, vector3D67);
        double double74 = org.apache.commons.math.geometry.Vector3D.angle(vector3D11, vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D75 = vector3D6.subtract(11881.0d, vector3D11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D11", vector3D6.equals(vector3D11) ? vector3D6.hashCode() == vector3D11.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D2 = vector3D1.normalize();
        double double3 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D0, vector3D2);
        org.apache.commons.math.geometry.Vector3D vector3D4 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        boolean boolean5 = vector3D0.equals((java.lang.Object) vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D11 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D9.subtract((double) 'a', vector3D11);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D18 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D11, (double) '4', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D23 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D16, vector3D19);
        boolean boolean24 = vector3D16.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D29 = new org.apache.commons.math.geometry.Vector3D((double) (byte) -1, (double) (byte) -1, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D29.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D31 = new org.apache.commons.math.geometry.Vector3D(0.0d, vector3D16, (-0.8342233605065102d), vector3D29);
        double double32 = vector3D31.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D33 = vector3D31.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D39 = vector3D36.subtract((double) 'a', vector3D38);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D41.subtract((double) 'a', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D38, (double) '4', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D48 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D46.subtract((double) 'a', vector3D48);
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D43, vector3D46);
        double double51 = vector3D50.getAlpha();
        boolean boolean52 = vector3D50.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D53 = new org.apache.commons.math.geometry.Vector3D(101.0d, vector3D31, 52.0d, vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D54 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D0, vector3D50);
        double double55 = vector3D54.getX();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D23 and vector3D54", vector3D23.equals(vector3D54) ? vector3D23.hashCode() == vector3D54.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D0.subtract((double) 'a', vector3D2);
        double double4 = vector3D2.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D6 = vector3D2.scalarMultiply((double) (short) 0);
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D8.subtract((double) 10L, vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D12 = vector3D2.subtract(10.0d, vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D14.subtract((double) 'a', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D19.subtract((double) 'a', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D23 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D16, (double) '4', vector3D21);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D27 = vector3D24.subtract((double) 'a', vector3D26);
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D21, vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D31 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D29.subtract((double) 'a', vector3D31);
        double double33 = vector3D31.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D37 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D38 = vector3D35.subtract((double) 'a', vector3D37);
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D40.subtract((double) 'a', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D44 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D37, (double) '4', vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D45 = vector3D31.add(vector3D44);
        double double46 = org.apache.commons.math.geometry.Vector3D.distance(vector3D24, vector3D31);
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D31.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D51 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D54 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, (double) 'a');
        org.apache.commons.math.geometry.Vector3D vector3D55 = vector3D51.subtract(vector3D54);
        double double56 = vector3D51.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D57 = vector3D51.negate();
        double double58 = vector3D51.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D59 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 10, vector3D51);
        double double60 = vector3D51.getX();
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D51.normalize();
        double double62 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D47, vector3D51);
        boolean boolean63 = vector3D8.equals((java.lang.Object) vector3D47);
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D8.orthogonal();
        boolean boolean65 = vector3D8.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D0 and vector3D64", vector3D0.equals(vector3D64) ? vector3D0.hashCode() == vector3D64.hashCode() : true);
    }
}

