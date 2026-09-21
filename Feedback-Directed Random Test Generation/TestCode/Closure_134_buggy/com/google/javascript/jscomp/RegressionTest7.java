package com.google.javascript.jscomp;

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
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', '4', ' ', '#', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '4', ' ', '#', ' ', '4' });
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', '#', '#', 'a', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '#', '#', 'a', '#', '#' });
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '4', '4', '#', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4', '4', '#', '#', 'a' });
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', 'a', '4', '4', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', 'a', '4', '4', '#', '#' });
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', ' ', 'a', ' ', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', ' ', 'a', ' ', '#', '4' });
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray6 = new char[] { '4', 'a', '4', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties7 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', '4', '#', '4' });
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', 'a', '4', 'a', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a', '4', 'a', '4', ' ' });
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray6 = new char[] { '#', 'a', ' ', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties7 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', 'a', ' ', 'a', 'a' });
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', 'a', ' ', ' ', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a', ' ', ' ', ' ', '#' });
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '#', '4', 'a', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', '4', 'a', 'a', 'a' });
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', ' ', 'a', ' ', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', ' ', 'a', ' ', ' ', '4' });
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', '#', '#', '4', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', '#', '4', 'a', 'a' });
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', 'a', 'a', 'a', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', 'a', 'a', 'a', 'a', ' ' });
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '#', ' ', '#', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#', ' ', '#', 'a', 'a' });
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '4', ' ', '#', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4', ' ', '#', ' ', 'a' });
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', ' ', '4', '#', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', ' ', '4', '#', '4', '#' });
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', ' ', '#', ' ', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ', '#', ' ', '#', '4' });
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', ' ', ' ', 'a', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', ' ', 'a', 'a', ' ' });
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', '#', '#', '#', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '#', '#', '#', ' ', 'a' });
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', ' ', '#', ' ', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', '#', ' ', ' ', '#' });
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', '#', '4', '#', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', '4', '#', 'a', '#' });
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', ' ', 'a', '4', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', ' ', 'a', '4', 'a', '#' });
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray6 = new char[] { '#', '#', 'a', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties7 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', '#', 'a', 'a', 'a' });
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', 'a', '#', 'a', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a', '#', 'a', '4', '4' });
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', ' ', '4', ' ', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ', '4', ' ', 'a', '#' });
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', ' ', '#', 'a', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', '#', 'a', '4', 'a' });
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', 'a', '#', '4', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a', '#', '4', 'a', 'a' });
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', ' ', ' ', ' ', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', ' ', ' ', ' ', '4' });
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', '#', ' ', '4', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '#', ' ', '4', '4', '4' });
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', ' ', '#', '4', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ', '#', '4', '4', ' ' });
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', '4', '4', '#', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '4', '4', '#', '#', ' ' });
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '#', 'a', ' ', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', 'a', ' ', ' ', '4' });
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', 'a', 'a', '4', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', 'a', 'a', '4', ' ', '4' });
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray6 = new char[] { '4', ' ', '#', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties7 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', ' ', '#', '#', ' ' });
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '4', '#', '4', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4', '#', '4', '#', 'a' });
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', ' ', 'a', '4', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', 'a', '4', '4', ' ' });
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', 'a', '#', '#', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', 'a', '#', '#', ' ', '4' });
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '#', '4', 'a', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', '4', 'a', '#', 'a' });
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', 'a', 'a', '4', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', 'a', 'a', '4', '4', '4' });
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', 'a', '4', ' ', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a', '4', ' ', '#', '#' });
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray6 = new char[] { '4', 'a', 'a', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties7 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', 'a', '4', '4' });
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', '#', ' ', '4', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', ' ', '4', ' ', '4' });
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', '4', '#', ' ', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '4', '#', ' ', '#', '#' });
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', 'a', '#', 'a', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', 'a', '#', 'a', ' ', ' ' });
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '#', '#', '#', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', '#', '#', ' ', '4' });
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', '#', ' ', ' ', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '#', ' ', ' ', 'a', 'a' });
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', ' ', 'a', '4', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', ' ', 'a', '4', 'a', 'a' });
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '4', 'a', '#', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4', 'a', '#', '#', 'a' });
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', 'a', 'a', '4', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', 'a', 'a', '4', '4', '4' });
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', ' ', 'a', '#', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', ' ', 'a', '#', 'a', '#' });
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', 'a', ' ', ' ', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', 'a', ' ', ' ', '4', ' ' });
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', 'a', '4', '#', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', 'a', '4', '#', ' ', '4' });
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '#', ' ', ' ', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#', ' ', ' ', '4', '4' });
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', 'a', '4', ' ', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', 'a', '4', ' ', '#', 'a' });
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '#', ' ', '4', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#', ' ', '4', '4', '#' });
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', 'a', '#', '#', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', 'a', '#', '#', '4', '#' });
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '4', '4', ' ', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4', '4', ' ', '#', '#' });
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray6 = new char[] { 'a', 'a', '#', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties7 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', 'a', '#', ' ', 'a' });
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray6 = new char[] { '4', 'a', '4', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties7 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', '4', ' ', ' ' });
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', '#', '4', '#', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', '4', '#', '4', '#' });
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', ' ', ' ', '#', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ', ' ', '#', 'a', ' ' });
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', '4', ' ', '4', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '4', ' ', '4', '4', ' ' });
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray6 = new char[] { ' ', '4', '4', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties7 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', '4', '4', '#', ' ' });
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', 'a', 'a', '4', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', 'a', 'a', '4', '#', 'a' });
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', ' ', ' ', 'a', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', ' ', ' ', 'a', 'a', '4' });
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '#', ' ', '#', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#', ' ', '#', '4', 'a' });
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', ' ', 'a', '4', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ', 'a', '4', '#', '4' });
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', '#', '4', ' ', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '#', '4', ' ', 'a', '4' });
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', '#', '4', 'a', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', '4', 'a', ' ', 'a' });
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', '#', 'a', 'a', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', 'a', 'a', ' ', ' ' });
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', 'a', '4', '4', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a', '4', '4', 'a', 'a' });
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', 'a', '4', '4', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', 'a', '4', '4', ' ', '#' });
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', ' ', '4', '#', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ', '4', '#', '#', 'a' });
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', 'a', '#', ' ', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', 'a', '#', ' ', '4', '#' });
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '#', '4', '#', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', '4', '#', ' ', '#' });
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', '4', '#', '#', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '4', '#', '#', 'a', ' ' });
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '#', '4', 'a', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#', '4', 'a', 'a', '4' });
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', ' ', 'a', '#', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', ' ', 'a', '#', '#', 'a' });
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', ' ', '#', '4', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ', '#', '4', 'a', '4' });
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '#', '4', ' ', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#', '4', ' ', 'a', '#' });
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', 'a', '#', '4', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', 'a', '#', '4', ' ', '4' });
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '#', 'a', ' ', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#', 'a', ' ', 'a', '4' });
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '#', ' ', ' ', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ', ' ', ' ', 'a' });
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '4', ' ', '#', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4', ' ', '#', ' ', '4' });
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', 'a', 'a', '4', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', 'a', 'a', '4', ' ', '4' });
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', '#', ' ', ' ', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', ' ', ' ', '#', 'a' });
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', '4', 'a', '4', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '4', 'a', '4', '#', '4' });
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray6 = new char[] { 'a', '#', '#', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties7 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '#', '#', '#', 'a' });
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', ' ', '4', '#', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', ' ', '4', '#', ' ', 'a' });
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', '#', ' ', '4', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', ' ', '4', '#', '#' });
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '#', '4', '#', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', '4', '#', 'a', '4' });
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '4', '#', '4', '#', ' ' });
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray6 = new char[] { '#', ' ', '#', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties7 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', ' ', '#', '#', ' ' });
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', 'a', '4', 'a', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a', '4', 'a', '#', '4' });
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', ' ', ' ', '4', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', ' ', ' ', '4', '4', '4' });
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '#', 'a', '#', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#', 'a', '#', '4', '4' });
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', 'a', '4', ' ', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', 'a', '4', ' ', ' ', '#' });
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', ' ', ' ', '4', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', ' ', ' ', '4', ' ', 'a' });
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', '#', 'a', '4', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', 'a', '4', ' ', ' ' });
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray6 = new char[] { 'a', 'a', '4', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties7 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', 'a', '4', '4', 'a' });
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', 'a', '#', '4', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a', '#', '4', ' ', '4' });
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', ' ', '#', '4', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', '#', '4', 'a', '4' });
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', '4', '4', '4', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '4', '4', '4', 'a', 'a' });
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', 'a', 'a', '4', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a', 'a', '4', 'a', '#' });
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', 'a', 'a', ' ', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a', 'a', ' ', 'a', 'a' });
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', '4', '#', '4', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '4', '#', '4', '4', '#' });
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '#', '4', '#', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', '4', '#', '4', '4' });
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '4', '#', 'a', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4', '#', 'a', 'a', 'a' });
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', ' ', 'a', '#', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', 'a', '#', 'a', '4' });
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', 'a', '#', ' ', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', 'a', '#', ' ', '#', 'a' });
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', 'a', 'a', '4', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a', 'a', '4', '4', '4' });
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', '#', ' ', '#', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', ' ', '#', '#', '4' });
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '#', '#', 'a', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', '#', 'a', ' ', '#' });
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '#', '#', ' ', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', '#', ' ', ' ', ' ' });
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', ' ', 'a', ' ', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', ' ', 'a', ' ', ' ', '#' });
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', ' ', ' ', ' ', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ', ' ', ' ', '#', ' ' });
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray6 = new char[] { 'a', 'a', ' ', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties7 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', 'a', ' ', ' ', ' ' });
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '4', '4', ' ', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4', '4', ' ', 'a', '4' });
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', ' ', ' ', '4', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', ' ', '4', '#', 'a' });
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray6 = new char[] { '#', '4', ' ', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties7 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', '4', ' ', 'a', '#' });
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', 'a', '4', ' ', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', 'a', '4', ' ', 'a', '4' });
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '#', '4', '#', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#', '4', '#', ' ', 'a' });
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', '#', 'a', ' ', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '#', 'a', ' ', ' ', 'a' });
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '4', ' ', '4', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4', ' ', '4', 'a', '#' });
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '#', ' ', '#', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ', '#', '#', ' ' });
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray6 = new char[] { '4', 'a', ' ', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties7 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', 'a', ' ', '#', ' ' });
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', '4', 'a', '4', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '4', 'a', '4', 'a', 'a' });
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', 'a', 'a', '4', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a', 'a', '4', '4', '#' });
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '4', '#', ' ', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4', '#', ' ', ' ', '4' });
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '#', '#', '4', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', '#', '4', ' ', ' ' });
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', 'a', ' ', '#', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', 'a', ' ', '#', 'a', '#' });
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', 'a', '#', '4', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', 'a', '#', '4', '#', ' ' });
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', 'a', '#', 'a', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a', '#', 'a', '4', '#' });
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { 'a', ' ', '#', 'a', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ', '#', 'a', '4', ' ' });
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '#', '#', ' ', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#', '#', ' ', '#', 'a' });
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', '4', '4', '#', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '4', '4', '#', 'a', 'a' });
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { ' ', '4', ' ', '#', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '4', ' ', '#', ' ', '#' });
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', ' ', '4', '4', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', '4', '4', '4', 'a' });
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '#', '#', '4', 'a', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AmbiguateProperties ambiguateProperties8 = new com.google.javascript.jscomp.AmbiguateProperties(abstractCompiler0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', '4', 'a', ' ', ' ' });
    }
}

