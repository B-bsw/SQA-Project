package org.apache.commons.cli2.builder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2501");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option4 = patternBuilder3.create();
        org.apache.commons.cli2.Option option5 = patternBuilder3.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2502");
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
        patternBuilder12.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option17 and option17", option17.equals(option17) ? option17.hashCode() == option17.hashCode() : true);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2503");
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
        org.apache.commons.cli2.Option option21 = patternBuilder18.create();
        patternBuilder18.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option21 and option21", option21.equals(option21) ? option21.hashCode() == option21.hashCode() : true);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2504");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder17.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option20 and option20", option20.equals(option20) ? option20.hashCode() == option20.hashCode() : true);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2505");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder2.reset();
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass11 = patternBuilder6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2506");
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
        org.apache.commons.cli2.Option option17 = patternBuilder12.create();
        java.lang.Class<?> wildcardClass18 = patternBuilder12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option17 and option17", option17.equals(option17) ? option17.hashCode() == option17.hashCode() : true);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2507");
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
        org.apache.commons.cli2.Option option19 = patternBuilder18.create();
        patternBuilder18.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option19 and option19", option19.equals(option19) ? option19.hashCode() == option19.hashCode() : true);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2508");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder8.create();
        java.lang.Class<?> wildcardClass10 = patternBuilder8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2509");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder8.create();
        java.lang.Class<?> wildcardClass11 = option10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2510");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option5 = patternBuilder4.create();
        java.lang.Class<?> wildcardClass6 = option5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2511");
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
        org.apache.commons.cli2.Option option19 = patternBuilder15.create();
        patternBuilder15.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option19 and option19", option19.equals(option19) ? option19.hashCode() == option19.hashCode() : true);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2512");
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
        org.apache.commons.cli2.Option option16 = patternBuilder15.create();
        java.lang.Class<?> wildcardClass17 = patternBuilder15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option16 and option16", option16.equals(option16) ? option16.hashCode() == option16.hashCode() : true);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2513");
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
        org.apache.commons.cli2.Option option21 = patternBuilder20.create();
        java.lang.Class<?> wildcardClass22 = option21.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option21 and option21", option21.equals(option21) ? option21.hashCode() == option21.hashCode() : true);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2514");
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
        org.apache.commons.cli2.Option option22 = patternBuilder19.create();
        patternBuilder19.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option22 and option22", option22.equals(option22) ? option22.hashCode() == option22.hashCode() : true);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2515");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.Option option14 = patternBuilder4.create();
        java.lang.Class<?> wildcardClass15 = option14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2516");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder1.create();
        patternBuilder1.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2517");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2518");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder7.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2519");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder9.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2520");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder11.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder11.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2521");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.Option option12 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass13 = patternBuilder9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2522");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        patternBuilder12.withPattern("");
        org.apache.commons.cli2.Option option15 = patternBuilder12.create();
        java.lang.Class<?> wildcardClass16 = patternBuilder12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option15 and option15", option15.equals(option15) ? option15.hashCode() == option15.hashCode() : true);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2523");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.Option option12 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass13 = patternBuilder9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2524");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder7.create();
        java.lang.Class<?> wildcardClass9 = patternBuilder7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2525");
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
        java.lang.Class<?> wildcardClass14 = patternBuilder3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2526");
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
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.Option option16 = patternBuilder9.create();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option16 and option16", option16.equals(option16) ? option16.hashCode() == option16.hashCode() : true);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2527");
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
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        java.lang.Class<?> wildcardClass13 = patternBuilder11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2528");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder16.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option17 and option17", option17.equals(option17) ? option17.hashCode() == option17.hashCode() : true);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2529");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option17 = patternBuilder8.create();
        patternBuilder8.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option17 and option17", option17.equals(option17) ? option17.hashCode() == option17.hashCode() : true);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2530");
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
        java.lang.Class<?> wildcardClass19 = patternBuilder13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option18 and option18", option18.equals(option18) ? option18.hashCode() == option18.hashCode() : true);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2531");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option14 = patternBuilder0.create();
        org.apache.commons.cli2.Option option15 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2532");
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
        org.apache.commons.cli2.Option option16 = patternBuilder15.create();
        org.apache.commons.cli2.Option option17 = patternBuilder15.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option16 and option16", option16.equals(option16) ? option16.hashCode() == option16.hashCode() : true);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2533");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        java.lang.Class<?> wildcardClass15 = option14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2534");
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
        org.apache.commons.cli2.Option option13 = patternBuilder8.create();
        org.apache.commons.cli2.Option option14 = patternBuilder8.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2535");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder13.reset();
        org.apache.commons.cli2.Option option18 = patternBuilder17.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder19 = patternBuilder17.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option18 and option18", option18.equals(option18) ? option18.hashCode() == option18.hashCode() : true);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2536");
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
        patternBuilder16.withPattern("hi!");
        org.apache.commons.cli2.Option option19 = patternBuilder16.create();
        patternBuilder16.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option19 and option19", option19.equals(option19) ? option19.hashCode() == option19.hashCode() : true);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2537");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option19 = patternBuilder10.create();
        org.apache.commons.cli2.Option option20 = patternBuilder10.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option19 and option19", option19.equals(option19) ? option19.hashCode() == option19.hashCode() : true);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2538");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder12.create();
        java.lang.Class<?> wildcardClass14 = patternBuilder12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2539");
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
        org.apache.commons.cli2.Option option13 = patternBuilder3.create();
        patternBuilder3.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2540");
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
        org.apache.commons.cli2.Option option21 = patternBuilder20.create();
        patternBuilder20.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option21 and option21", option21.equals(option21) ? option21.hashCode() == option21.hashCode() : true);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2541");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.Option option9 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass10 = patternBuilder6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2542");
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
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2543");
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
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.Option option21 = patternBuilder8.create();
        patternBuilder8.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option21 and option21", option21.equals(option21) ? option21.hashCode() == option21.hashCode() : true);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2544");
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
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder14.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder14.reset();
        patternBuilder16.withPattern("");
        org.apache.commons.cli2.Option option19 = patternBuilder16.create();
        patternBuilder16.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option19 and option19", option19.equals(option19) ? option19.hashCode() == option19.hashCode() : true);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2545");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.Option option13 = patternBuilder8.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2546");
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
        org.apache.commons.cli2.Option option16 = patternBuilder10.create();
        java.lang.Class<?> wildcardClass17 = patternBuilder10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option16 and option16", option16.equals(option16) ? option16.hashCode() == option16.hashCode() : true);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2547");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option10 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass11 = option10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2548");
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
        patternBuilder7.withPattern("");
        org.apache.commons.cli2.Option option15 = patternBuilder7.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder7.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option15 and option15", option15.equals(option15) ? option15.hashCode() == option15.hashCode() : true);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2549");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.Option option9 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass10 = patternBuilder6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2550");
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
        org.apache.commons.cli2.Option option20 = patternBuilder18.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option19 and option19", option19.equals(option19) ? option19.hashCode() == option19.hashCode() : true);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2551");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        patternBuilder7.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder7.create();
        java.lang.Class<?> wildcardClass11 = option10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2552");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        org.apache.commons.cli2.Option option12 = patternBuilder10.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2553");
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
        java.lang.Class<?> wildcardClass17 = patternBuilder15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option16 and option16", option16.equals(option16) ? option16.hashCode() == option16.hashCode() : true);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2554");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.Option option13 = patternBuilder8.create();
        patternBuilder8.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }
}

