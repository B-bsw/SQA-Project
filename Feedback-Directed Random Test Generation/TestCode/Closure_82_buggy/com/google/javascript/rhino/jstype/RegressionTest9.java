package com.google.javascript.rhino.jstype;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        java.lang.Class<?> wildcardClass17 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
        java.lang.Class<?> wildcardClass24 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeB;
        java.lang.Class<?> wildcardClass24 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = jSType18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        java.lang.Class<?> wildcardClass18 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        java.lang.Class<?> wildcardClass20 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
        java.lang.Class<?> wildcardClass24 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        java.lang.Class<?> wildcardClass19 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = jSType16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = jSType15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = jSType19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        java.lang.Class<?> wildcardClass17 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = jSType22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        java.lang.Class<?> wildcardClass13 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
    }
}

