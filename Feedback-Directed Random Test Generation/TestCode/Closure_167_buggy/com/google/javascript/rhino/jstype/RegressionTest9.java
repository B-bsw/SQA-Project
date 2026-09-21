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
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
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
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
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
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType24 = typePair2.typeB;
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
        org.junit.Assert.assertNull(jSType24);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
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
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
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
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
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
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
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
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
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
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
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
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
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
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
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
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = jSType17.getClass();
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
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
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
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
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
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
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
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
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
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
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
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
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
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
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
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
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
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = jSType21.getClass();
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
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
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
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
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
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
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
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
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
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
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
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
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
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
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
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
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
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = jSType14.getClass();
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
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
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
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = jSType12.getClass();
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
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
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
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
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
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
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
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
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
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
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
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jSType11.getClass();
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
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
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
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        java.lang.Class<?> wildcardClass21 = typePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
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
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
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
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = jSType12.getClass();
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
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
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
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
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
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
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
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
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
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
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
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
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
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
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
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
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
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
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
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
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
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        java.lang.Class<?> wildcardClass21 = typePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        java.lang.Class<?> wildcardClass15 = typePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
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
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
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
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
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
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
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
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
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
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
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
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
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
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
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
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
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
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
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
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        java.lang.Class<?> wildcardClass21 = typePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
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
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
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
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
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
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
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
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        java.lang.Class<?> wildcardClass22 = typePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
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
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        java.lang.Class<?> wildcardClass16 = typePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
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
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
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
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
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
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
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
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
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
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
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
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
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
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
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
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
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
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
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
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
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
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
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
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
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
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
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
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
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
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
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
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
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
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = jSType12.getClass();
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
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = jSType14.getClass();
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
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
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
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = jSType17.getClass();
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
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = jSType14.getClass();
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
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
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
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
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
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
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
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = jSType23.getClass();
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
        org.junit.Assert.assertNull(jSType23);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
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
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
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
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
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
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
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
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
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
        java.lang.Class<?> wildcardClass11 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
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
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        java.lang.Class<?> wildcardClass16 = typePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
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
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
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
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
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
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
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
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
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
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
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
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
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
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
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
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
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
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
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
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
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
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
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
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
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
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
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
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
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
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        java.lang.Class<?> wildcardClass15 = typePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = jSType20.getClass();
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
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
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
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = jSType20.getClass();
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
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
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
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
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
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
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
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
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
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
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
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
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
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
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
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
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
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
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
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
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
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
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
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType24 = typePair2.typeA;
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
        org.junit.Assert.assertNull(jSType24);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
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
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = jSType20.getClass();
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
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
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
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
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
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        java.lang.Class<?> wildcardClass21 = typePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        java.lang.Class<?> wildcardClass15 = typePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
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
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
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
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        java.lang.Class<?> wildcardClass14 = typePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
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
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
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
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
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
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
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
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
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
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        java.lang.Class<?> wildcardClass9 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
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
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType24 = typePair2.typeA;
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
        org.junit.Assert.assertNull(jSType24);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        java.lang.Class<?> wildcardClass12 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
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
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
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
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
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
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
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
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
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
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
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
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
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
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
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
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
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
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType24 = typePair2.typeA;
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
        org.junit.Assert.assertNull(jSType24);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType24 = typePair2.typeB;
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
        org.junit.Assert.assertNull(jSType24);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
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
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
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
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
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
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
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
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
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
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
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
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = jSType13.getClass();
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
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
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
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
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
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        java.lang.Class<?> wildcardClass21 = typePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
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
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
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
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        java.lang.Class<?> wildcardClass16 = typePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

