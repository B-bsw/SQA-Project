package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Appendable appendable0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AbstractCommandLineRunner.writeOutput(appendable0, compiler1, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode0 = com.google.javascript.jscomp.CompilerOptions.TracerMode.FAST;
        org.junit.Assert.assertTrue("'" + tracerMode0 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.FAST + "'", tracerMode0.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.FAST));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode0 = com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF;
        org.junit.Assert.assertTrue("'" + tracerMode0 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode0.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException flagUsageException1 = new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException("");
        java.lang.Throwable[] throwableArray2 = flagUsageException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        com.google.javascript.jscomp.CompilerOptions.DevMode devMode0 = com.google.javascript.jscomp.CompilerOptions.DevMode.START_AND_END;
        org.junit.Assert.assertTrue("'" + devMode0 + "' != '" + com.google.javascript.jscomp.CompilerOptions.DevMode.START_AND_END + "'", devMode0.equals(com.google.javascript.jscomp.CompilerOptions.DevMode.START_AND_END));
    }
}

