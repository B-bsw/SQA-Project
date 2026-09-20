package org.apache.commons.cli2.builder;

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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        patternBuilder19.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder19.reset();
        org.apache.commons.cli2.Option option23 = patternBuilder19.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder22);
        org.junit.Assert.assertNotNull(option23);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option16 = patternBuilder8.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        patternBuilder14.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder14.reset();
        org.apache.commons.cli2.Option option18 = patternBuilder17.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(option18);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder15.reset();
        patternBuilder15.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        patternBuilder13.withPattern("");
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder13.reset();
        org.apache.commons.cli2.Option option19 = patternBuilder18.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(option19);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder13.reset();
        org.apache.commons.cli2.Option option20 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(option20);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder5.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder2.reset();
        patternBuilder5.withPattern("");
        java.lang.Class<?> wildcardClass8 = patternBuilder5.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder11.withPattern("");
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        java.lang.Class<?> wildcardClass8 = patternBuilder6.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        patternBuilder13.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder13.reset();
        java.lang.Class<?> wildcardClass18 = patternBuilder17.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        patternBuilder4.withPattern("");
        patternBuilder4.withPattern("hi!");
        java.lang.Class<?> wildcardClass14 = patternBuilder4.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.Option option17 = patternBuilder16.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder7.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(option8);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder17.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder9.reset();
        patternBuilder17.withPattern("hi!");
        org.apache.commons.cli2.Option option20 = patternBuilder17.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(option20);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder3.reset();
        patternBuilder15.withPattern("hi!");
        patternBuilder15.withPattern("");
        patternBuilder15.withPattern("hi!");
        patternBuilder15.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder24 = patternBuilder15.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder24);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option10 = patternBuilder0.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(option10);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option15 = patternBuilder9.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        patternBuilder12.withPattern("");
        patternBuilder12.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder9.reset();
        patternBuilder18.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder17.reset();
        patternBuilder18.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder18.reset();
        patternBuilder18.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder21);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        patternBuilder15.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        patternBuilder12.withPattern("");
        patternBuilder12.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder2.reset();
        patternBuilder2.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder2.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        patternBuilder15.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder15.reset();
        org.apache.commons.cli2.Option option19 = patternBuilder18.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(option19);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        patternBuilder7.withPattern("");
        org.apache.commons.cli2.Option option10 = patternBuilder7.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(option10);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.Option option12 = patternBuilder8.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(option12);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        java.lang.Class<?> wildcardClass12 = patternBuilder9.getClass();
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder19.reset();
        patternBuilder19.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        patternBuilder7.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        patternBuilder13.withPattern("");
        java.lang.Class<?> wildcardClass17 = patternBuilder13.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        java.lang.Class<?> wildcardClass16 = patternBuilder15.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder11.withPattern("");
        patternBuilder11.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option15 = patternBuilder14.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder1.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder3.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(option10);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder8.reset();
        patternBuilder19.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        patternBuilder15.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder15.reset();
        patternBuilder18.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option15 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        patternBuilder13.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        patternBuilder6.withPattern("");
        patternBuilder6.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        patternBuilder16.withPattern("hi!");
        org.apache.commons.cli2.Option option19 = patternBuilder16.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(option19);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        patternBuilder15.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder15.reset();
        patternBuilder18.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder16.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder13.reset();
        patternBuilder16.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder19.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder20.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder20.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(patternBuilder22);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        patternBuilder13.withPattern("hi!");
        org.apache.commons.cli2.Option option16 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder6.reset();
        patternBuilder13.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder13.reset();
        patternBuilder13.withPattern("");
        patternBuilder13.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder13.reset();
        java.lang.Class<?> wildcardClass22 = patternBuilder13.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(option12);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(option6);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        patternBuilder14.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder14.reset();
        patternBuilder14.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder20.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder21);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder0.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(option9);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(option12);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder1.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder1.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        java.lang.Class<?> wildcardClass14 = patternBuilder13.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder8.reset();
        patternBuilder21.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder21);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        patternBuilder18.withPattern("");
        patternBuilder18.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder24 = patternBuilder18.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder25 = patternBuilder18.reset();
        patternBuilder25.withPattern("hi!");
        patternBuilder25.withPattern("");
        patternBuilder25.withPattern("hi!");
        java.lang.Class<?> wildcardClass32 = patternBuilder25.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder24);
        org.junit.Assert.assertNotNull(patternBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder11.withPattern("");
        patternBuilder11.withPattern("hi!");
        patternBuilder11.withPattern("hi!");
        patternBuilder11.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        patternBuilder4.withPattern("hi!");
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder4.reset();
        patternBuilder12.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        patternBuilder13.withPattern("");
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder13.reset();
        patternBuilder13.withPattern("hi!");
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.Option option23 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(option23);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder4.reset();
        java.lang.Class<?> wildcardClass14 = patternBuilder4.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        patternBuilder4.withPattern("");
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option17 = patternBuilder4.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        patternBuilder11.withPattern("hi!");
        java.lang.Class<?> wildcardClass14 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        patternBuilder6.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        patternBuilder14.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder14.reset();
        org.apache.commons.cli2.Option option18 = patternBuilder14.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(option18);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder7.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        java.lang.Class<?> wildcardClass12 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        patternBuilder17.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder17.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder17.reset();
        patternBuilder21.withPattern("");
        patternBuilder21.withPattern("");
        org.apache.commons.cli2.Option option26 = patternBuilder21.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(option26);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        patternBuilder14.withPattern("");
        java.lang.Class<?> wildcardClass17 = patternBuilder14.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder10.reset();
        patternBuilder20.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder20);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder2.reset();
        patternBuilder2.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder2.reset();
        java.lang.Class<?> wildcardClass10 = patternBuilder2.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option15 = patternBuilder8.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        patternBuilder13.withPattern("hi!");
        patternBuilder13.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder14.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(option12);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        patternBuilder12.withPattern("hi!");
        org.apache.commons.cli2.Option option15 = patternBuilder12.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder9.reset();
        java.lang.Class<?> wildcardClass16 = patternBuilder15.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        patternBuilder6.withPattern("hi!");
        java.lang.Class<?> wildcardClass9 = patternBuilder6.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder19.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder19.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder21);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder15.reset();
        patternBuilder19.withPattern("");
        patternBuilder19.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder24 = patternBuilder19.reset();
        patternBuilder24.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder24);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder7.withPattern("hi!");
        patternBuilder7.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        java.lang.Class<?> wildcardClass15 = patternBuilder13.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        patternBuilder12.withPattern("");
        java.lang.Class<?> wildcardClass16 = patternBuilder12.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.Option option16 = patternBuilder14.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        patternBuilder13.withPattern("hi!");
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder13.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder9.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.Option option16 = patternBuilder15.create();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli2.builder.GroupBuilder.reset()\" because \"this.gbuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder20.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder21);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder9.reset();
        patternBuilder16.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder16.reset();
        java.lang.Class<?> wildcardClass20 = patternBuilder16.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder11.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.Option option19 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(option19);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        patternBuilder11.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option20 = patternBuilder8.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(option20);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        patternBuilder11.withPattern("hi!");
        java.lang.Class<?> wildcardClass17 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder11.withPattern("");
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder8.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder17.reset();
        patternBuilder18.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder18.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder21.reset();
        patternBuilder22.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(patternBuilder22);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.Option option15 = patternBuilder8.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        patternBuilder19.withPattern("hi!");
        org.apache.commons.cli2.Option option22 = patternBuilder19.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(option22);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option17 = patternBuilder16.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option13 = patternBuilder5.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(option13);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        java.lang.Class<?> wildcardClass17 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder3.reset();
        patternBuilder15.withPattern("hi!");
        patternBuilder15.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder15.reset();
        patternBuilder15.withPattern("");
        patternBuilder15.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder25 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder26 = patternBuilder25.reset();
        patternBuilder26.withPattern("hi!");
        java.lang.Class<?> wildcardClass29 = patternBuilder26.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder25);
        org.junit.Assert.assertNotNull(patternBuilder26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder13.reset();
        patternBuilder16.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder20.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder20.reset();
        patternBuilder22.withPattern("");
        org.apache.commons.cli2.Option option25 = patternBuilder22.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(patternBuilder22);
        org.junit.Assert.assertNotNull(option25);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder13.reset();
        patternBuilder16.withPattern("");
        patternBuilder16.withPattern("hi!");
        patternBuilder16.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        // The following exception was thrown during execution in test generation
        try {
            patternBuilder7.withPattern("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder19.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder20.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder21);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.Option option12 = patternBuilder9.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(option12);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder19.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        patternBuilder7.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder7.reset();
        patternBuilder7.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        patternBuilder7.withPattern("");
        patternBuilder7.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option14 = patternBuilder3.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        java.lang.Class<?> wildcardClass15 = patternBuilder13.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder5.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        patternBuilder16.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder3.reset();
        patternBuilder17.withPattern("hi!");
        patternBuilder17.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        patternBuilder7.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder7.reset();
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        patternBuilder12.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder12.reset();
        java.lang.Class<?> wildcardClass16 = patternBuilder15.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        java.lang.Class<?> wildcardClass18 = patternBuilder3.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        patternBuilder7.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder7.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(option10);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        patternBuilder8.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("");
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder6.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder12.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(option13);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        patternBuilder14.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder14.reset();
        patternBuilder17.withPattern("hi!");
        patternBuilder17.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder17.reset();
        patternBuilder22.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder22);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        java.lang.Class<?> wildcardClass11 = patternBuilder9.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        patternBuilder12.withPattern("");
        patternBuilder12.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder21.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(patternBuilder22);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder13.reset();
        patternBuilder16.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder20.reset();
        java.lang.Class<?> wildcardClass22 = patternBuilder21.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option17 = patternBuilder3.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder3.reset();
        patternBuilder12.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        patternBuilder2.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        patternBuilder13.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder13.reset();
        patternBuilder13.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder13.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        patternBuilder14.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder14.reset();
        patternBuilder17.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        patternBuilder16.withPattern("hi!");
        patternBuilder16.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder11.withPattern("");
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder11.reset();
        java.lang.Class<?> wildcardClass17 = patternBuilder16.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        patternBuilder13.withPattern("hi!");
        org.apache.commons.cli2.Option option17 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder8.reset();
        patternBuilder17.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder10.reset();
        patternBuilder17.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        java.lang.Class<?> wildcardClass17 = patternBuilder8.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        patternBuilder12.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        patternBuilder12.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder6.reset();
        patternBuilder11.withPattern("");
        java.lang.Class<?> wildcardClass14 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        patternBuilder7.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("");
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder6.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder6.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option19 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(option19);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder17.reset();
        patternBuilder18.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder18.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder21);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder11.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        patternBuilder13.withPattern("");
        patternBuilder13.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        java.lang.Class<?> wildcardClass17 = patternBuilder16.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        patternBuilder11.withPattern("");
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option17 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        java.lang.Class<?> wildcardClass17 = patternBuilder16.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        patternBuilder7.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        patternBuilder15.withPattern("hi!");
        patternBuilder15.withPattern("hi!");
        patternBuilder15.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder15.reset();
        java.lang.Class<?> wildcardClass23 = patternBuilder22.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        patternBuilder15.withPattern("");
        patternBuilder15.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder14.reset();
        patternBuilder14.withPattern("hi!");
        org.apache.commons.cli2.Option option20 = patternBuilder14.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(option20);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        patternBuilder13.withPattern("");
        patternBuilder13.withPattern("");
        java.lang.Class<?> wildcardClass18 = patternBuilder13.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder7.withPattern("hi!");
        patternBuilder7.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder7.reset();
        patternBuilder14.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder17.reset();
        java.lang.Class<?> wildcardClass19 = patternBuilder17.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        patternBuilder7.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.Option option12 = patternBuilder8.create();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli2.builder.GroupBuilder.reset()\" because \"this.gbuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder0.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(option8);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.Option option8 = patternBuilder5.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(option8);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(option7);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder13.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder4.reset();
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        java.lang.Class<?> wildcardClass15 = patternBuilder14.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(option12);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder0.reset();
        patternBuilder15.withPattern("hi!");
        patternBuilder15.withPattern("hi!");
        org.apache.commons.cli2.Option option20 = patternBuilder15.create();
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(option20);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        java.lang.Class<?> wildcardClass10 = patternBuilder4.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder1.reset();
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder1.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(option13);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder5.reset();
        java.lang.Class<?> wildcardClass14 = patternBuilder13.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        java.lang.Class<?> wildcardClass17 = patternBuilder16.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder9.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        patternBuilder7.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder1.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        patternBuilder13.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder17.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder8.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(option9);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        java.lang.Class<?> wildcardClass9 = patternBuilder8.getClass();
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.Option option12 = patternBuilder9.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(option12);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder14.reset();
        patternBuilder14.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder14.reset();
        org.apache.commons.cli2.Option option20 = patternBuilder19.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(option20);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder10.reset();
        patternBuilder18.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder18.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder18.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder23 = patternBuilder22.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(patternBuilder22);
        org.junit.Assert.assertNotNull(patternBuilder23);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder1.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder19.reset();
        org.apache.commons.cli2.Option option21 = patternBuilder20.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(option21);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.Option option16 = patternBuilder15.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder2.reset();
        patternBuilder2.withPattern("");
        org.apache.commons.cli2.Option option9 = patternBuilder2.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(option9);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder9.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(option13);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("hi!");
        java.lang.Class<?> wildcardClass15 = patternBuilder9.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder1.reset();
        org.apache.commons.cli2.Option option3 = patternBuilder1.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(option3);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        patternBuilder4.withPattern("hi!");
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder4.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        java.lang.Class<?> wildcardClass13 = patternBuilder12.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.Option option15 = patternBuilder14.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder7.withPattern("");
        org.apache.commons.cli2.Option option11 = patternBuilder7.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder5.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder12.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        patternBuilder14.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder14.reset();
        patternBuilder14.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder11.reset();
        patternBuilder16.withPattern("");
        patternBuilder16.withPattern("");
        patternBuilder16.withPattern("");
        patternBuilder16.withPattern("");
        java.lang.Class<?> wildcardClass25 = patternBuilder16.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        java.lang.Class<?> wildcardClass14 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.apache.commons.cli2.Option option18 = patternBuilder17.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(option18);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option18 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(option18);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder10.reset();
        patternBuilder18.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder18.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder18.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder23 = patternBuilder18.reset();
        patternBuilder23.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(patternBuilder22);
        org.junit.Assert.assertNotNull(patternBuilder23);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        java.lang.Class<?> wildcardClass16 = patternBuilder15.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option17 = patternBuilder0.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        java.lang.Class<?> wildcardClass13 = patternBuilder9.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        patternBuilder11.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        patternBuilder7.withPattern("");
        patternBuilder7.withPattern("hi!");
        patternBuilder7.withPattern("");
        patternBuilder7.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        patternBuilder16.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option16 = patternBuilder15.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder9.reset();
        patternBuilder15.withPattern("hi!");
        patternBuilder15.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder15.reset();
        patternBuilder15.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder20);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        patternBuilder14.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        patternBuilder16.withPattern("");
        patternBuilder16.withPattern("");
        org.apache.commons.cli2.Option option21 = patternBuilder16.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(option21);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder8.reset();
        java.lang.Class<?> wildcardClass18 = patternBuilder8.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("");
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        patternBuilder11.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        patternBuilder12.withPattern("hi!");
        org.apache.commons.cli2.Option option15 = patternBuilder12.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder21);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        java.lang.Class<?> wildcardClass8 = patternBuilder7.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        patternBuilder13.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder2.reset();
        patternBuilder2.withPattern("");
        patternBuilder2.withPattern("");
        patternBuilder2.withPattern("");
        patternBuilder2.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder7.withPattern("");
        patternBuilder7.withPattern("");
        patternBuilder7.withPattern("hi!");
        org.apache.commons.cli2.Option option15 = patternBuilder7.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder12.reset();
        patternBuilder14.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder0.reset();
        patternBuilder14.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder14.reset();
        patternBuilder14.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder10.reset();
        patternBuilder18.withPattern("");
        java.lang.Class<?> wildcardClass21 = patternBuilder18.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder15.reset();
        java.lang.Class<?> wildcardClass19 = patternBuilder15.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        patternBuilder15.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder15.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        patternBuilder7.withPattern("");
        patternBuilder7.withPattern("");
        java.lang.Class<?> wildcardClass12 = patternBuilder7.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder4.reset();
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        java.lang.Class<?> wildcardClass15 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        java.lang.Class<?> wildcardClass10 = patternBuilder5.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder4.reset();
        patternBuilder17.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder17.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder20);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.Option option16 = patternBuilder15.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        patternBuilder13.withPattern("hi!");
        patternBuilder13.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        patternBuilder7.withPattern("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.Option option10 = patternBuilder7.create();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli2.builder.GroupBuilder.reset()\" because \"this.gbuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        java.lang.Class<?> wildcardClass11 = patternBuilder9.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder17.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder17.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        patternBuilder7.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        patternBuilder7.withPattern("hi!");
        patternBuilder7.withPattern("hi!");
        patternBuilder7.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option18 = patternBuilder7.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(option18);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        patternBuilder13.withPattern("");
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.Option option18 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option18);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        patternBuilder15.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder15.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        patternBuilder13.withPattern("");
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder13.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        patternBuilder9.withPattern("hi!");
        java.lang.Class<?> wildcardClass12 = patternBuilder9.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        java.lang.Class<?> wildcardClass16 = patternBuilder14.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        patternBuilder6.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        patternBuilder12.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder0.reset();
        patternBuilder15.withPattern("");
        java.lang.Class<?> wildcardClass18 = patternBuilder15.getClass();
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder17.reset();
        patternBuilder18.withPattern("");
        java.lang.Class<?> wildcardClass21 = patternBuilder18.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder7.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(option8);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder3.reset();
        java.lang.Class<?> wildcardClass22 = patternBuilder3.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder8.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder1.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder1.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(option6);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.Option option11 = patternBuilder6.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder17.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder17.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.Option option17 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        patternBuilder15.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        patternBuilder7.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(option10);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        java.lang.Class<?> wildcardClass15 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder3.reset();
        patternBuilder15.withPattern("hi!");
        patternBuilder15.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder15.reset();
        patternBuilder15.withPattern("");
        patternBuilder15.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder25 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder26 = patternBuilder25.reset();
        org.apache.commons.cli2.Option option27 = patternBuilder26.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder25);
        org.junit.Assert.assertNotNull(patternBuilder26);
        org.junit.Assert.assertNotNull(option27);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        patternBuilder14.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder6.reset();
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder6.reset();
        org.apache.commons.cli2.Option option15 = patternBuilder14.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        patternBuilder16.withPattern("hi!");
        java.lang.Class<?> wildcardClass19 = patternBuilder16.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.Option option15 = patternBuilder8.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder11.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder11.reset();
        patternBuilder11.withPattern("");
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder24 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder24);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        java.lang.Class<?> wildcardClass11 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        java.lang.Class<?> wildcardClass14 = patternBuilder12.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.Option option9 = patternBuilder4.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(option9);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder3.reset();
        patternBuilder17.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder17.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder20);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        patternBuilder15.withPattern("hi!");
        patternBuilder15.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder15.reset();
        patternBuilder20.withPattern("");
        patternBuilder20.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder20);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        java.lang.Class<?> wildcardClass16 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder12.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(option13);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        patternBuilder14.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        java.lang.Class<?> wildcardClass10 = patternBuilder5.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        patternBuilder7.withPattern("hi!");
        patternBuilder7.withPattern("hi!");
        patternBuilder7.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder1.reset();
        patternBuilder2.withPattern("");
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder2.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder2.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        java.lang.Class<?> wildcardClass15 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        patternBuilder13.withPattern("hi!");
        org.apache.commons.cli2.Option option16 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        patternBuilder7.withPattern("hi!");
        patternBuilder7.withPattern("hi!");
        org.apache.commons.cli2.Option option15 = patternBuilder7.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        patternBuilder18.withPattern("");
        patternBuilder18.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder24 = patternBuilder18.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder25 = patternBuilder18.reset();
        patternBuilder25.withPattern("hi!");
        org.apache.commons.cli2.Option option28 = patternBuilder25.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder24);
        org.junit.Assert.assertNotNull(patternBuilder25);
        org.junit.Assert.assertNotNull(option28);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        patternBuilder7.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder11.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder16.reset();
        patternBuilder18.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option15 = patternBuilder14.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(option12);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        java.lang.Class<?> wildcardClass14 = patternBuilder9.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        patternBuilder15.withPattern("hi!");
        patternBuilder15.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        java.lang.Class<?> wildcardClass13 = patternBuilder9.getClass();
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder3.reset();
        patternBuilder15.withPattern("hi!");
        patternBuilder15.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder15.reset();
        patternBuilder15.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder23 = patternBuilder15.reset();
        patternBuilder15.withPattern("");
        java.lang.Class<?> wildcardClass26 = patternBuilder15.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder12.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder4.reset();
        patternBuilder11.withPattern("hi!");
        patternBuilder11.withPattern("hi!");
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder11.reset();
        patternBuilder18.withPattern("");
        org.apache.commons.cli2.Option option21 = patternBuilder18.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(option21);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        patternBuilder7.withPattern("");
        patternBuilder7.withPattern("hi!");
        patternBuilder7.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder7.reset();
        patternBuilder7.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder19.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder20.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder21.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder23 = patternBuilder21.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(patternBuilder22);
        org.junit.Assert.assertNotNull(patternBuilder23);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        java.lang.Class<?> wildcardClass13 = patternBuilder12.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("");
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        java.lang.Class<?> wildcardClass14 = patternBuilder13.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        patternBuilder12.withPattern("hi!");
        java.lang.Class<?> wildcardClass16 = patternBuilder12.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option15 = patternBuilder14.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder13.reset();
        patternBuilder16.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder20.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder21.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(patternBuilder22);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        java.lang.Class<?> wildcardClass14 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("hi!");
        java.lang.Class<?> wildcardClass14 = patternBuilder6.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        java.lang.Class<?> wildcardClass14 = patternBuilder13.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder0.reset();
        patternBuilder16.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder8.reset();
        patternBuilder17.withPattern("");
        org.apache.commons.cli2.Option option20 = patternBuilder17.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(option20);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder9.reset();
        patternBuilder15.withPattern("hi!");
        patternBuilder15.withPattern("hi!");
        patternBuilder15.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder15.reset();
        patternBuilder15.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder22);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        patternBuilder11.withPattern("hi!");
        patternBuilder11.withPattern("");
        java.lang.Class<?> wildcardClass16 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

