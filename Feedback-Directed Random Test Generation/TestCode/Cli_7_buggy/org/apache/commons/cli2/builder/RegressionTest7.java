package org.apache.commons.cli2.builder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        patternBuilder13.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder13.reset();
        patternBuilder16.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        patternBuilder14.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        patternBuilder15.withPattern("hi!");
        patternBuilder15.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder17.reset();
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
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        patternBuilder15.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder7.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(option8);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option15 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.Option option18 = patternBuilder9.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(option18);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder19.reset();
        org.apache.commons.cli2.Option option21 = patternBuilder20.create();
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
        org.junit.Assert.assertNotNull(option21);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        org.apache.commons.cli2.Option option22 = patternBuilder18.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(option22);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder10.reset();
        patternBuilder20.withPattern("");
        java.lang.Class<?> wildcardClass23 = patternBuilder20.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        java.lang.Class<?> wildcardClass14 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        patternBuilder11.withPattern("hi!");
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option19 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(option19);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
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
        org.apache.commons.cli2.Option option15 = patternBuilder14.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        patternBuilder12.withPattern("hi!");
        java.lang.Class<?> wildcardClass15 = patternBuilder12.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        java.lang.Class<?> wildcardClass14 = patternBuilder12.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        org.apache.commons.cli2.Option option22 = patternBuilder21.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(option22);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder1.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        java.lang.Class<?> wildcardClass11 = patternBuilder5.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        java.lang.Class<?> wildcardClass9 = patternBuilder8.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder1.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder1.reset();
        patternBuilder10.withPattern("hi!");
        java.lang.Class<?> wildcardClass13 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        org.apache.commons.cli2.Option option16 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder23 = patternBuilder22.reset();
        java.lang.Class<?> wildcardClass24 = patternBuilder22.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder22);
        org.junit.Assert.assertNotNull(patternBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        patternBuilder11.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        java.lang.Class<?> wildcardClass18 = patternBuilder17.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.Option option15 = patternBuilder14.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
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
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.Option option16 = patternBuilder8.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        java.lang.Class<?> wildcardClass15 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        patternBuilder13.withPattern("");
        patternBuilder13.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        patternBuilder17.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
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
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        org.apache.commons.cli2.Option option17 = patternBuilder16.create();
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
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        java.lang.Class<?> wildcardClass11 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
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
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.Option option16 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        patternBuilder14.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
        java.lang.Class<?> wildcardClass16 = patternBuilder13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.Option option15 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.Option option11 = patternBuilder8.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder19.reset();
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
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
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
        patternBuilder11.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        java.lang.Class<?> wildcardClass14 = patternBuilder13.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder1.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder11.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
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
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        java.lang.Class<?> wildcardClass16 = patternBuilder15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder20.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder21.reset();
        org.apache.commons.cli2.Option option23 = patternBuilder21.create();
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
        org.junit.Assert.assertNotNull(patternBuilder22);
        org.junit.Assert.assertNotNull(option23);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder1.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.Option option14 = patternBuilder1.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
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
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        java.lang.Class<?> wildcardClass12 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        java.lang.Class<?> wildcardClass15 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder1.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder5.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder6.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(option10);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
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
        org.apache.commons.cli2.Option option16 = patternBuilder8.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(option12);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        patternBuilder13.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder7.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder7.reset();
        patternBuilder11.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
        patternBuilder11.withPattern("");
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder11.reset();
        java.lang.Class<?> wildcardClass18 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        java.lang.Class<?> wildcardClass9 = patternBuilder7.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder17.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder17.reset();
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
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        patternBuilder14.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("");
        // The following exception was thrown during execution in test generation
        try {
            patternBuilder5.withPattern("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder4.reset();
        java.lang.Class<?> wildcardClass20 = patternBuilder19.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder9.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
        org.apache.commons.cli2.Option option15 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder9.reset();
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
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        patternBuilder11.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
        org.apache.commons.cli2.Option option12 = patternBuilder9.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(option12);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
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
        java.lang.Class<?> wildcardClass17 = patternBuilder16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option17 = patternBuilder16.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.Option option15 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        patternBuilder12.withPattern("");
        patternBuilder12.withPattern("hi!");
        patternBuilder12.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder12.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        org.apache.commons.cli2.Option option17 = patternBuilder15.create();
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
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        patternBuilder6.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder8.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
        org.apache.commons.cli2.Option option16 = patternBuilder12.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        patternBuilder17.withPattern("");
        java.lang.Class<?> wildcardClass20 = patternBuilder17.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder17.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        patternBuilder19.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder19.reset();
        java.lang.Class<?> wildcardClass23 = patternBuilder19.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        patternBuilder16.withPattern("hi!");
        patternBuilder16.withPattern("");
        patternBuilder16.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
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
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
        patternBuilder17.withPattern("");
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
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
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
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(option12);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        java.lang.Class<?> wildcardClass18 = patternBuilder15.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        java.lang.Class<?> wildcardClass12 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder19.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder19.reset();
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
        org.junit.Assert.assertNotNull(patternBuilder21);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
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
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder1.reset();
        patternBuilder2.withPattern("");
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder2.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        java.lang.Class<?> wildcardClass12 = patternBuilder8.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder1.reset();
        patternBuilder2.withPattern("");
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        patternBuilder2.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder7);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
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
        org.apache.commons.cli2.Option option18 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option18);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
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
        patternBuilder10.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder7.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(option10);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        java.lang.Class<?> wildcardClass14 = patternBuilder8.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder1.reset();
        patternBuilder7.withPattern("hi!");
        patternBuilder7.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder12.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.Option option15 = patternBuilder5.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        patternBuilder13.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.Option option9 = patternBuilder3.create();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli2.builder.GroupBuilder.reset()\" because \"this.gbuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(option7);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        patternBuilder20.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder21);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
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
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
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
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder14.reset();
        patternBuilder14.withPattern("hi!");
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
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
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
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
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
        java.lang.Class<?> wildcardClass19 = patternBuilder14.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(option12);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder6.reset();
        java.lang.Class<?> wildcardClass12 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder3.reset();
        patternBuilder11.withPattern("");
        patternBuilder11.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        patternBuilder14.withPattern("hi!");
        patternBuilder14.withPattern("hi!");
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
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder19.reset();
        patternBuilder22.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder25 = patternBuilder22.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder26 = patternBuilder25.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder27 = patternBuilder26.reset();
        org.apache.commons.cli2.Option option28 = patternBuilder26.create();
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
        org.junit.Assert.assertNotNull(patternBuilder25);
        org.junit.Assert.assertNotNull(patternBuilder26);
        org.junit.Assert.assertNotNull(patternBuilder27);
        org.junit.Assert.assertNotNull(option28);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder16.reset();
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
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder3.reset();
        patternBuilder7.withPattern("");
        // The following exception was thrown during execution in test generation
        try {
            patternBuilder7.withPattern("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        patternBuilder7.withPattern("hi!");
        patternBuilder7.withPattern("hi!");
        java.lang.Class<?> wildcardClass12 = patternBuilder7.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
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
        patternBuilder13.withPattern("");
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder13.reset();
        java.lang.Class<?> wildcardClass21 = patternBuilder20.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder2.reset();
        patternBuilder2.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder2.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder2.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(option9);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder5.reset();
        patternBuilder12.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder12.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option9 = patternBuilder5.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(option9);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        java.lang.Class<?> wildcardClass12 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder9.reset();
        java.lang.Class<?> wildcardClass16 = patternBuilder15.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder17.reset();
        java.lang.Class<?> wildcardClass19 = patternBuilder17.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
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
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
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
        patternBuilder15.withPattern("");
        java.lang.Class<?> wildcardClass20 = patternBuilder15.getClass();
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
        org.apache.commons.cli2.Option option16 = patternBuilder13.create();
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
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        java.lang.Class<?> wildcardClass12 = patternBuilder11.getClass();
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
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        patternBuilder7.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder7.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
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
        patternBuilder11.withPattern("hi!");
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
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
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
        java.lang.Class<?> wildcardClass18 = patternBuilder17.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
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
        patternBuilder18.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder13.reset();
        org.apache.commons.cli2.Option option18 = patternBuilder13.create();
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
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(option18);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        patternBuilder6.withPattern("");
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder6.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder23 = patternBuilder22.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder24 = patternBuilder23.reset();
        java.lang.Class<?> wildcardClass25 = patternBuilder23.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder22);
        org.junit.Assert.assertNotNull(patternBuilder23);
        org.junit.Assert.assertNotNull(patternBuilder24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        patternBuilder11.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
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
        patternBuilder21.withPattern("");
        patternBuilder21.withPattern("");
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
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        patternBuilder11.withPattern("");
        patternBuilder11.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder23 = patternBuilder22.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder24 = patternBuilder23.reset();
        patternBuilder23.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder22);
        org.junit.Assert.assertNotNull(patternBuilder23);
        org.junit.Assert.assertNotNull(patternBuilder24);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        patternBuilder14.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder9.reset();
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
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        patternBuilder14.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
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
        java.lang.Class<?> wildcardClass12 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
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
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option11 = patternBuilder0.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
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
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
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
        patternBuilder15.withPattern("hi!");
        java.lang.Class<?> wildcardClass20 = patternBuilder15.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        java.lang.Class<?> wildcardClass14 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder1.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        java.lang.Class<?> wildcardClass9 = patternBuilder8.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option16 = patternBuilder8.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder4.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        java.lang.Class<?> wildcardClass18 = patternBuilder15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
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
        patternBuilder13.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
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
        org.apache.commons.cli2.Option option13 = patternBuilder3.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option13);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
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
        patternBuilder11.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        patternBuilder14.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder2.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.Option option13 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option13);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.Option option13 = patternBuilder8.create();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli2.builder.GroupBuilder.reset()\" because \"this.gbuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder6.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder6.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(option12);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        patternBuilder16.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        java.lang.Class<?> wildcardClass10 = patternBuilder9.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
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
        patternBuilder14.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        java.lang.Class<?> wildcardClass20 = patternBuilder19.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        patternBuilder15.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        patternBuilder12.withPattern("");
        java.lang.Class<?> wildcardClass16 = patternBuilder12.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder11.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder1.reset();
        patternBuilder2.withPattern("");
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder2.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        patternBuilder8.withPattern("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.Option option11 = patternBuilder8.create();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli2.builder.GroupBuilder.reset()\" because \"this.gbuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
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
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder3.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        patternBuilder14.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
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
        java.lang.Class<?> wildcardClass15 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
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
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("hi!");
        java.lang.Class<?> wildcardClass14 = patternBuilder9.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
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
        patternBuilder13.withPattern("hi!");
        patternBuilder13.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder1.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        java.lang.Class<?> wildcardClass14 = patternBuilder9.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        java.lang.Class<?> wildcardClass15 = patternBuilder14.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
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
        patternBuilder19.withPattern("");
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
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder9.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
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
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        patternBuilder14.withPattern("");
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
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder3.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
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
        org.apache.commons.cli2.Option option17 = patternBuilder8.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder9.reset();
        patternBuilder20.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder20);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        java.lang.Class<?> wildcardClass16 = patternBuilder14.getClass();
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
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder19.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder19.reset();
        patternBuilder21.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder24 = patternBuilder21.reset();
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
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(patternBuilder24);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        patternBuilder7.withPattern("");
        patternBuilder7.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder7.reset();
        patternBuilder12.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        patternBuilder16.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder16.reset();
        org.apache.commons.cli2.Option option21 = patternBuilder16.create();
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
        org.junit.Assert.assertNotNull(option21);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder1.reset();
        java.lang.Class<?> wildcardClass11 = patternBuilder1.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.Option option11 = patternBuilder10.create();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli2.builder.GroupBuilder.reset()\" because \"this.gbuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.Option option16 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder6.create();
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
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.Option option19 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(option19);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
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
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
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
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder19.reset();
        patternBuilder22.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder25 = patternBuilder22.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder26 = patternBuilder25.reset();
        org.apache.commons.cli2.Option option27 = patternBuilder26.create();
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
        org.junit.Assert.assertNotNull(patternBuilder25);
        org.junit.Assert.assertNotNull(patternBuilder26);
        org.junit.Assert.assertNotNull(option27);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        patternBuilder16.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder16.reset();
        org.apache.commons.cli2.Option option20 = patternBuilder19.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(option20);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
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
        patternBuilder13.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.Option option16 = patternBuilder9.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        patternBuilder4.withPattern("hi!");
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder4.reset();
        patternBuilder11.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.Option option13 = patternBuilder2.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option13);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder17.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder17.reset();
        org.apache.commons.cli2.Option option20 = patternBuilder17.create();
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
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(option20);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        patternBuilder14.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
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
        patternBuilder14.withPattern("");
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
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        java.lang.Class<?> wildcardClass13 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        java.lang.Class<?> wildcardClass16 = patternBuilder8.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        java.lang.Class<?> wildcardClass8 = patternBuilder0.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
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
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        patternBuilder10.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
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
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder7.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
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
        patternBuilder18.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder25 = patternBuilder18.reset();
        java.lang.Class<?> wildcardClass26 = patternBuilder18.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(patternBuilder22);
        org.junit.Assert.assertNotNull(patternBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder3.reset();
        patternBuilder17.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
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
        patternBuilder12.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option23 = patternBuilder22.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(patternBuilder22);
        org.junit.Assert.assertNotNull(option23);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
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
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder10.reset();
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
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder2.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
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
        patternBuilder11.withPattern("");
        patternBuilder11.withPattern("");
        java.lang.Class<?> wildcardClass18 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder16.reset();
        org.apache.commons.cli2.Option option20 = patternBuilder19.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(option20);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
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
        patternBuilder15.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
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
        patternBuilder16.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder16.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
        java.lang.Class<?> wildcardClass16 = patternBuilder15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder16.reset();
        java.lang.Class<?> wildcardClass19 = patternBuilder18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder20.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder21);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
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
        org.apache.commons.cli2.Option option14 = patternBuilder9.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder8.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.apache.commons.cli2.Option option18 = patternBuilder16.create();
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
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(option18);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        patternBuilder15.withPattern("");
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
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        patternBuilder6.withPattern("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.Option option12 = patternBuilder6.create();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli2.builder.GroupBuilder.reset()\" because \"this.gbuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
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
        patternBuilder13.withPattern("hi!");
        java.lang.Class<?> wildcardClass16 = patternBuilder13.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
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
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
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
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
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
        org.apache.commons.cli2.Option option16 = patternBuilder15.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
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
        java.lang.Class<?> wildcardClass15 = patternBuilder9.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
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
        org.apache.commons.cli2.Option option13 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(option13);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
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
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        patternBuilder16.withPattern("");
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
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
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
        patternBuilder14.withPattern("hi!");
        org.apache.commons.cli2.Option option17 = patternBuilder14.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
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
        patternBuilder16.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder16.reset();
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
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("");
        java.lang.Class<?> wildcardClass13 = patternBuilder6.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder17.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder17.reset();
        patternBuilder17.withPattern("hi!");
        patternBuilder17.withPattern("");
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
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        java.lang.Class<?> wildcardClass11 = patternBuilder5.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder4.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.Option option13 = patternBuilder4.create();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli2.builder.GroupBuilder.reset()\" because \"this.gbuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option19 = patternBuilder18.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(option19);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
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
        patternBuilder7.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
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
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option22 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(option22);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        patternBuilder11.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder12.reset();
        patternBuilder12.withPattern("");
        patternBuilder12.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder12.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder19.reset();
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
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder20);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder2.reset();
        patternBuilder2.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder2.reset();
        java.lang.Class<?> wildcardClass10 = patternBuilder2.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        patternBuilder11.withPattern("");
        java.lang.Class<?> wildcardClass14 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
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
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder4.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        patternBuilder12.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
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
        patternBuilder14.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder14.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
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
        patternBuilder12.withPattern("");
        org.apache.commons.cli2.Option option16 = patternBuilder12.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
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
        java.lang.Class<?> wildcardClass16 = patternBuilder14.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        org.apache.commons.cli2.Option option18 = patternBuilder17.create();
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
        org.junit.Assert.assertNotNull(option18);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        patternBuilder4.withPattern("hi!");
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.Option option16 = patternBuilder4.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
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
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        patternBuilder14.withPattern("hi!");
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
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        java.lang.Class<?> wildcardClass7 = patternBuilder0.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
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
        patternBuilder12.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder12.reset();
        org.apache.commons.cli2.Option option17 = patternBuilder12.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.Option option9 = patternBuilder7.create();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli2.builder.GroupBuilder.reset()\" because \"this.gbuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder7.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
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
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option17 = patternBuilder16.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        patternBuilder12.withPattern("");
        patternBuilder12.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        patternBuilder12.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder12.reset();
        org.apache.commons.cli2.Option option16 = patternBuilder12.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option14 = patternBuilder3.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder16.reset();
        patternBuilder18.withPattern("");
        java.lang.Class<?> wildcardClass21 = patternBuilder18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder5.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(option7);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
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
        patternBuilder13.withPattern("");
        patternBuilder13.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder13.reset();
        patternBuilder13.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder20);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder16.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
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
        org.apache.commons.cli2.Option option23 = patternBuilder15.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder22);
        org.junit.Assert.assertNotNull(option23);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        patternBuilder16.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder16.reset();
        org.apache.commons.cli2.Option option20 = patternBuilder16.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(option20);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder6.reset();
        patternBuilder12.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
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
        org.apache.commons.cli2.Option option12 = patternBuilder3.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(option12);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder3.reset();
        java.lang.Class<?> wildcardClass13 = patternBuilder12.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
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
        java.lang.Class<?> wildcardClass16 = patternBuilder13.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
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
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        patternBuilder12.withPattern("hi!");
        patternBuilder12.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder7.reset();
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
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        patternBuilder14.withPattern("hi!");
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
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        java.lang.Class<?> wildcardClass10 = patternBuilder6.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder0.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(option12);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
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
        patternBuilder10.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(option12);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder1.reset();
        java.lang.Class<?> wildcardClass12 = patternBuilder1.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        patternBuilder6.withPattern("hi!");
        java.lang.Class<?> wildcardClass10 = patternBuilder6.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        java.lang.Class<?> wildcardClass12 = patternBuilder8.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
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
        patternBuilder20.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder23 = patternBuilder20.reset();
        org.apache.commons.cli2.Option option24 = patternBuilder23.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder23);
        org.junit.Assert.assertNotNull(option24);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        java.lang.Class<?> wildcardClass10 = patternBuilder9.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        patternBuilder7.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.Option option13 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option13);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
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
        patternBuilder13.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        patternBuilder12.withPattern("hi!");
        patternBuilder12.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder12.reset();
        patternBuilder12.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder12.reset();
        java.lang.Class<?> wildcardClass21 = patternBuilder20.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        java.lang.Class<?> wildcardClass14 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
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
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        patternBuilder2.withPattern("");
        patternBuilder2.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
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
        org.apache.commons.cli2.Option option19 = patternBuilder16.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(option19);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder7.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder7.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder7.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(option9);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
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
        java.lang.Class<?> wildcardClass16 = patternBuilder12.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
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
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder7.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
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
        patternBuilder15.withPattern("");
        patternBuilder15.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder20);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        patternBuilder14.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
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
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option21 = patternBuilder20.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(option21);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.Option option16 = patternBuilder15.create();
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
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        patternBuilder14.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        java.lang.Class<?> wildcardClass10 = patternBuilder9.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        patternBuilder12.withPattern("hi!");
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
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
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
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
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
        java.lang.Class<?> wildcardClass16 = patternBuilder15.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
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
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder0.reset();
        java.lang.Class<?> wildcardClass20 = patternBuilder0.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder0.reset();
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        patternBuilder12.withPattern("");
        patternBuilder12.withPattern("hi!");
        patternBuilder12.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        java.lang.Class<?> wildcardClass15 = patternBuilder14.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        java.lang.Class<?> wildcardClass14 = patternBuilder8.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        java.lang.Class<?> wildcardClass9 = patternBuilder3.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder19.reset();
        patternBuilder19.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder23 = patternBuilder19.reset();
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
        org.junit.Assert.assertNotNull(patternBuilder23);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
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
        java.lang.Class<?> wildcardClass14 = patternBuilder13.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        patternBuilder12.withPattern("hi!");
        patternBuilder12.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder12.reset();
        patternBuilder12.withPattern("hi!");
        java.lang.Class<?> wildcardClass20 = patternBuilder12.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
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
        patternBuilder15.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder9.withPattern("");
        java.lang.Class<?> wildcardClass13 = patternBuilder9.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder8.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        patternBuilder14.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
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
        patternBuilder13.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
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
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder16.reset();
        patternBuilder19.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder19.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder22);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("");
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder6.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
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
        java.lang.Class<?> wildcardClass15 = patternBuilder14.getClass();
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
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
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
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder9.reset();
        patternBuilder20.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder20);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        patternBuilder14.withPattern("hi!");
        org.apache.commons.cli2.Option option17 = patternBuilder14.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        patternBuilder15.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
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
        patternBuilder12.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder12.reset();
        patternBuilder17.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option23 = patternBuilder22.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder22);
        org.junit.Assert.assertNotNull(option23);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
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
        java.lang.Class<?> wildcardClass15 = patternBuilder0.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
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
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        patternBuilder13.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
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
        java.lang.Class<?> wildcardClass18 = patternBuilder15.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
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
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.Option option15 = patternBuilder9.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        patternBuilder14.withPattern("");
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
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
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
        org.apache.commons.cli2.Option option15 = patternBuilder8.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
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
        patternBuilder15.withPattern("hi!");
        java.lang.Class<?> wildcardClass27 = patternBuilder15.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        java.lang.Class<?> wildcardClass10 = patternBuilder8.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
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
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
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
        org.apache.commons.cli2.Option option17 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
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
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder10.reset();
        patternBuilder16.withPattern("hi!");
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
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder11.reset();
        java.lang.Class<?> wildcardClass16 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
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
        patternBuilder8.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder20.reset();
        patternBuilder21.withPattern("");
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
        org.junit.Assert.assertNotNull(patternBuilder21);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        patternBuilder16.withPattern("hi!");
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
        org.junit.Assert.assertNotNull(patternBuilder17);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
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
        java.lang.Class<?> wildcardClass27 = patternBuilder26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        patternBuilder11.withPattern("");
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.Option option17 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
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
        org.apache.commons.cli2.Option option20 = patternBuilder17.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(option20);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder12.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option14);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder16.reset();
        patternBuilder18.withPattern("");
        patternBuilder18.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder12.reset();
        patternBuilder12.withPattern("");
        patternBuilder12.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        patternBuilder13.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder13.reset();
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.Option option15 = patternBuilder14.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder7.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(option8);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder7.reset();
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        patternBuilder12.withPattern("hi!");
        patternBuilder12.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder12.reset();
        patternBuilder17.withPattern("hi!");
        java.lang.Class<?> wildcardClass20 = patternBuilder17.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        patternBuilder11.withPattern("");
        java.lang.Class<?> wildcardClass15 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
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
        java.lang.Class<?> wildcardClass23 = patternBuilder20.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
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
        org.apache.commons.cli2.Option option17 = patternBuilder16.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
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
        patternBuilder11.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder11.reset();
        patternBuilder19.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        patternBuilder5.withPattern("hi!");
        java.lang.Class<?> wildcardClass8 = patternBuilder5.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder20);
        org.junit.Assert.assertNotNull(patternBuilder21);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder11.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(option13);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        patternBuilder10.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        patternBuilder13.withPattern("");
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
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        java.lang.Class<?> wildcardClass6 = patternBuilder0.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        patternBuilder13.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
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
        org.apache.commons.cli2.Option option16 = patternBuilder15.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option10 = patternBuilder0.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(option10);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
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
        patternBuilder14.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder14.reset();
        patternBuilder17.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder17.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder20);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("");
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("");
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.Option option15 = patternBuilder6.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(option15);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        patternBuilder13.withPattern("");
        java.lang.Class<?> wildcardClass17 = patternBuilder13.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.Option option9 = patternBuilder6.create();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli2.builder.GroupBuilder.reset()\" because \"this.gbuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder15.reset();
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
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder17.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder17.reset();
        patternBuilder17.withPattern("hi!");
        java.lang.Class<?> wildcardClass22 = patternBuilder17.getClass();
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
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
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
        patternBuilder14.withPattern("");
        java.lang.Class<?> wildcardClass17 = patternBuilder14.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder7.withPattern("hi!");
        patternBuilder7.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder7.reset();
        patternBuilder7.withPattern("hi!");
        org.apache.commons.cli2.Option option16 = patternBuilder7.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli2.Option option9 = patternBuilder8.create();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli2.builder.GroupBuilder.reset()\" because \"this.gbuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder14.reset();
        patternBuilder14.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder4.reset();
        patternBuilder19.withPattern("");
        java.lang.Class<?> wildcardClass22 = patternBuilder19.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder4.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
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
        patternBuilder13.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder13.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder4.reset();
        java.lang.Class<?> wildcardClass15 = patternBuilder14.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
        java.lang.Class<?> wildcardClass16 = patternBuilder15.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option3 = patternBuilder0.create();
        org.junit.Assert.assertNotNull(option3);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
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
        patternBuilder11.withPattern("");
        patternBuilder11.withPattern("");
        java.lang.Class<?> wildcardClass18 = patternBuilder11.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        java.lang.Class<?> wildcardClass12 = patternBuilder10.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
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
        org.apache.commons.cli2.Option option22 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(option22);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
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
        patternBuilder19.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder22 = patternBuilder19.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder19);
        org.junit.Assert.assertNotNull(patternBuilder22);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        patternBuilder7.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
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
        java.lang.Class<?> wildcardClass19 = patternBuilder18.getClass();
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
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
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
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        java.lang.Class<?> wildcardClass13 = patternBuilder12.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
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
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder13);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder6.reset();
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.Option option17 = patternBuilder6.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(option17);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.Option option9 = patternBuilder2.create();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(option9);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
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
        org.apache.commons.cli2.Option option16 = patternBuilder9.create();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder4.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
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
        java.lang.Class<?> wildcardClass17 = patternBuilder16.getClass();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder13.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder13);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
        patternBuilder15.withPattern("");
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
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        patternBuilder14.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder14);
        org.junit.Assert.assertNotNull(patternBuilder15);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        java.lang.Class<?> wildcardClass18 = patternBuilder17.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.Option option16 = patternBuilder10.create();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(option16);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder10.reset();
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
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
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder7.withPattern("hi!");
        java.lang.Class<?> wildcardClass11 = patternBuilder7.getClass();
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder16.reset();
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
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        patternBuilder9.withPattern("hi!");
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder9);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder18.reset();
        patternBuilder18.withPattern("hi!");
        patternBuilder18.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder18);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
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
        java.lang.Class<?> wildcardClass17 = patternBuilder16.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder15);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        org.apache.commons.cli2.builder.GroupBuilder groupBuilder0 = null;
        org.apache.commons.cli2.builder.DefaultOptionBuilder defaultOptionBuilder1 = null;
        org.apache.commons.cli2.builder.ArgumentBuilder argumentBuilder2 = null;
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = new org.apache.commons.cli2.builder.PatternBuilder(groupBuilder0, defaultOptionBuilder1, argumentBuilder2);
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        java.lang.Class<?> wildcardClass10 = patternBuilder9.getClass();
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(patternBuilder7);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        patternBuilder9.withPattern("hi!");
        patternBuilder9.withPattern("");
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder12);
        org.junit.Assert.assertNotNull(patternBuilder19);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
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
        java.lang.Class<?> wildcardClass22 = patternBuilder21.getClass();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder16);
        org.junit.Assert.assertNotNull(patternBuilder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder11);
        org.junit.Assert.assertNotNull(patternBuilder12);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("hi!");
        java.lang.Class<?> wildcardClass15 = patternBuilder5.getClass();
        org.junit.Assert.assertNotNull(patternBuilder3);
        org.junit.Assert.assertNotNull(patternBuilder4);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.junit.Assert.assertNotNull(patternBuilder1);
        org.junit.Assert.assertNotNull(patternBuilder2);
        org.junit.Assert.assertNotNull(patternBuilder5);
        org.junit.Assert.assertNotNull(patternBuilder8);
        org.junit.Assert.assertNotNull(patternBuilder9);
        org.junit.Assert.assertNotNull(patternBuilder10);
    }
}

